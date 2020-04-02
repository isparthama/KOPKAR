/*
 * To change this in_so_process_detail1, choose Tools | in_so_process_detail1s
 * and open the in_so_process_detail1 in the editor.
 */

package kopkar.in.objectclasses;

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
public class in_so_process_detail1ext extends in_so_process_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private Integer pilih;
    private Integer Status=Status_normal;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (this.Status==this.Status_Insert){
            squery="call sp_in_so_process_detail1_insert( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_so_qty()+"', "
                    + "'"+this.gettotal_adm_qty()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_in_so_process_detail1_update( "
                     + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_so_qty()+"', "
                    + "'"+this.gettotal_adm_qty()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_in_so_process_detail1_delete( "
                     + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_so_qty()+"', "
                    + "'"+this.gettotal_adm_qty()+"', "
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

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_in_so_process_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_process_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setline_number(rs.getInt("line_number"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_date(rs.getString("document_date"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_so_qty(rs.getInt("total_so_qty"));
        this.settotal_adm_qty(rs.getInt("total_adm_qty"));
        this.setadjustment_no(rs.getString("adjustment_no"));
        this.setadjustment_status(rs.getString("adjustment_status"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_so_process_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_process_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_so_process_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_process_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_so_process_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_process_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_so_process_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_process_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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

    public Integer getpilih() {
        return this.pilih;
    }

    public void setpilih(int pilih) {
        this.pilih=pilih;
    }

    public void setstatus(Integer Status) {
        this.Status=Status;
    }

    public Integer getstatus() {
        return this.Status;
    }

}
