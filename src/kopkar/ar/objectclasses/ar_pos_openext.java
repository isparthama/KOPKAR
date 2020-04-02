/*
 * To change this ar_pos_open, choose Tools | ar_pos_opens
 * and open the ar_pos_open in the editor.
 */

package kopkar.ar.objectclasses;

import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class ar_pos_openext extends ar_pos_opencls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String counter_name;
    private String chasier_name;

    public ar_pos_openext() {
        this.setdocument_date(GlobalUtils.sessiondate);
        this.setcash_register_modal(new Double(0));
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        ResultSet rs;
        try {
            if (insertsts){
                squery="call sp_ar_pos_open_insert( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getcounter_number()+"', "
                        + "'"+this.getchasier_code()+"', "
                        + "'"+this.getcash_register_modal()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocentry(rs.getInt("docentry"));
                    this.setdocument_number(rs.getString("document_number"));
                }
            } else {
                squery="call sp_ar_pos_open_update( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getcounter_number()+"', "
                        + "'"+this.getchasier_code()+"', "
                        + "'"+this.getcash_register_modal()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
            }
        
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ar_pos_open_delete( "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.getchasier_code()+"', "
                    + "'"+this.getcash_register_modal()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        try {
            db.execute(squery);
            insertsts=false;
            throw new CodeException("Data deleted");
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from ar_pos_open where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_openext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ar_pos_open_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_openext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata_reff(String document_number) throws CodeException {
        squery="CALL sp_ar_pos_reff_open_sales_get('"+document_number+"')";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_openext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setdscription(rs.getString("dscription"));
        this.setcounter_number(rs.getString("counter_number"));
        this.setchasier_code(rs.getString("chasier_code"));
        this.setcash_register_modal(rs.getDouble("cash_register_modal"));
        this.setbaseentry(rs.getInt("baseentry"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setcounter_name(rs.getString("counter_name"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_pos_open_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_openext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_pos_open_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_openext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_pos_open_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_openext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_pos_open_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_openext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getClassName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean refresh() throws CodeException {
        if (this.initdata(this.getdocument_number())){
            return true;
        }
        return false;
    }

    public String getcounter_name() {
        return this.counter_name;
    }

    private void setcounter_name(String counter_name) {
        this.counter_name=counter_name;
    }

    public String getchasier_name() {
        return this.chasier_name;
    }

   
}
