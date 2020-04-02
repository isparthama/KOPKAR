/*
 * To change this in_so_process, choose Tools | in_so_processs
 * and open the in_so_process in the editor.
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
public class in_so_processext extends in_so_processcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private in_so_process_detail1extcol detail;

    public in_so_processext() {
        this.setdocentry(0);
        this.setdocument_date(GlobalUtils.sessiondate);
        this.setdocument_date_fr(GlobalUtils.sessiondate);
        this.setdocument_date_to(GlobalUtils.sessiondate);
        detail=new in_so_process_detail1extcol(this.getdocentry());
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        this.setdocument_date_fr(GlobalUtils.formatDate(this.getdocument_date_fr(), "yyyy-MM-dd"));
        this.setdocument_date_to(GlobalUtils.formatDate(this.getdocument_date_to(), "yyyy-MM-dd"));
        ResultSet rs;
        in_so_process_detail1ext o;

        try {
            if (insertsts){
                squery="call sp_in_so_process_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getdocument_date_fr()+"', "
                        + "'"+this.getdocument_date_to()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getemployee()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_so_qty()+"', "
                        + "'"+this.gettotal_adm_qty()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocument_number(rs.getString("document_number"));
                    this.setdocentry(rs.getInt("docentry"));
                    for (int i=0;i<detail.size();i++){
                        o=detail.get(i);
                        if (o.getstatus().equals(o.Status_Insert)){
                            o.setdocentry(this.getdocentry());
                        }
                        o.setstatus(o.Status_Insert);
                        o.update();
                    }
                }
            } else {
                squery="call sp_in_so_process_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getdocument_date_fr()+"', "
                        + "'"+this.getdocument_date_to()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getemployee()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_so_qty()+"', "
                        + "'"+this.gettotal_adm_qty()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                    db.execute(squery);
                    for (int i=0;i<detail.size();i++){
                        o=detail.get(i);
                        if (o.getstatus().equals(o.Status_Insert)){
                            o.setdocentry(this.getdocentry());
                        }
                        o.setstatus(o.Status_update);
                        o.update();
                    }
            }
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_in_so_process_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_status()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getreference_number()+"', "
                    + "'"+this.getdocument_date_fr()+"', "
                    + "'"+this.getdocument_date_to()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getemployee()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_so_qty()+"', "
                    + "'"+this.gettotal_adm_qty()+"', "
                    + "'"+this.getadjustment_no()+"', "
                    + "'"+this.getadjustment_date()+"', "
                    + "'"+this.getadjustment_user()+"', "


                    + "'"+this.getobjtype()+"', "

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
        squery="select * from in_so_process where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_in_so_process_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setreference_number(rs.getString("reference_number"));
        this.setdocument_date_fr(rs.getString("document_date_fr"));
        this.setdocument_date_to(rs.getString("document_date_to"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setemployee(rs.getString("employee"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_so_qty(rs.getInt("total_so_qty"));
        this.settotal_adm_qty(rs.getInt("total_adm_qty"));
        this.setadjustment_no(rs.getInt("adjustment_no"));
        this.setadjustment_date(rs.getString("adjustment_date"));
        this.setadjustment_user(rs.getString("adjustment_user"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));

        this.detail=new in_so_process_detail1extcol(this.getdocentry());
        this.detail.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_so_process_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_so_process_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_so_process_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_so_process_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
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

    public void calculatetotal() {
        Integer total_adm_qty=0;
        Integer total_so_qty=0;
        for (int i=0;i<detail.size();i++){
            in_so_process_detail1ext o = detail.get(i);
            total_adm_qty+=o.gettotal_adm_qty();
            total_so_qty+=o.gettotal_so_qty();
        }
        this.settotal_adm_qty(total_adm_qty);
        this.settotal_so_qty(total_so_qty);
    }

    public in_so_process_detail1extcol getdetail() {
        return this.detail;
    }

    public String getdocument_status_desc() {
        if (this.getdocument_status().equalsIgnoreCase("O")){
            return "Open";
        } else {
            return "Close";
        }
    }

    public boolean retrievedata(String datefr, String dateto) {
        try {
            this.detail=new in_so_process_detail1extcol(this.getdocentry());
            return this.detail.retrievedata(datefr, dateto);
        } catch (CodeException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean run_sp_in_so_process_process() {
        try {
            db.execute("call sp_in_so_process_process('"+this.getdocument_number()+"','"+GlobalUtils.userid+"')");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(in_so_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
