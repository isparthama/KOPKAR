/*
 * To change this gl_transaksi_journal, choose Tools | gl_transaksi_journals
 * and open the gl_transaksi_journal in the editor.
 */

package kopkar.gl.objectclasses;

import kopkar.ap.objectclasses.ap_supplierext;
import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import kopkar.gl.objectclasses.gl_transaksi_journalcls;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class gl_transaksi_journalext extends gl_transaksi_journalcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String document_status_desc="Open";
    ap_supplierext osupplier=new ap_supplierext();
    private String nama_gde;

    public gl_transaksi_journalext() {
        this.setdocument_date(GlobalUtils.sessiondate);
        this.setdocument_number("");
    }

    public gl_transaksi_journal_detail1extcol getDetail1() {
        return detail1;
    }

    public void setDetail1(gl_transaksi_journal_detail1extcol detail1) {
        this.detail1 = detail1;
    }
    private gl_transaksi_journal_detail1extcol detail1=new gl_transaksi_journal_detail1extcol(null);

    public ap_supplierext getOsupplier() {
        return osupplier;
    }

    public String getDocument_status_desc() {
        return document_status_desc;
    }

    public void setDocument_status_desc(String document_status_desc) {
        this.document_status_desc = document_status_desc;
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        gl_transaksi_journal_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_gl_transaksi_journal_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getkode_gde()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getdebit_amount()+"', "
                        + "'"+this.getcredit_amount()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+GlobalUtils.userid+"' "
                        + ")";

                        this.calculatetotal();
                        ResultSet rs=db.executeQuery(squery);
                        if (rs.next()){
                            this.setdocentry(rs.getInt("docentry"));
                            this.setdocument_number(rs.getString("document_number"));
                        }
                        
                        int i=0;
                        for (i=0;i<this.detail1.size();i++){
                            o=this.detail1.get(i);
                            if (o.getstatus()==gl_transaksi_journal_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                            }
                            o.update();
                        }

                        

            } else {
                squery="call sp_gl_transaksi_journal_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getkode_gde()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getdebit_amount()+"', "
                        + "'"+this.getcredit_amount()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+GlobalUtils.userid+"' "
                        + ")";

                        int i=0;
                        for (i=0;i<this.detail1.size();i++){
                            o=this.detail1.get(i);
                            if (o.getstatus()==gl_transaksi_journal_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                            }
                            o.update();
                        }

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
        squery="call sp_gl_transaksi_journal_delete( "
                    + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getkode_gde()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getdebit_amount()+"', "
                        + "'"+this.getcredit_amount()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+GlobalUtils.userid+"' "
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
        squery="select * from gl_transaksi_journal where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journalext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_gl_transaksi_journal_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journalext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setkode_gde(rs.getString("kode_gde"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setdebit_amount(rs.getDouble("debit_amount"));
        this.setcredit_amount(rs.getDouble("credit_amount"));
        this.setprocess_sts(rs.getString("process_sts"));
        this.setprocess_date(rs.getString("process_date"));
        this.setprocess_user(rs.getString("process_user"));
        this.setdayseqno(rs.getInt("dayseqno"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));

        this.setnama_gde(rs.getString("nama_gde"));
//        this.setDocument_status_desc(rs.getString("document_status_desc"));

        
        detail1=new gl_transaksi_journal_detail1extcol(this.getdocentry());
        detail1.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journalext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journalext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journalext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_gl_transaksi_journal_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(gl_transaksi_journalext.class.getName()).log(Level.SEVERE, null, ex);
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
        int i=0;
        double jumtotdebet = 0;
        double jumtotkredit=0;
        
        for (i=0;i<this.detail1.size();i++){
            gl_transaksi_journal_detail1ext o = this.detail1.get(i);
            if (!o.getstatus().equals(gl_transaksi_journal_detail1ext.Status_delete)){
            jumtotdebet+=o.getjumdebet();
            jumtotkredit+=o.getjumkredit();
            }
        }
        this.setdebit_amount(jumtotdebet);
        this.setcredit_amount(jumtotkredit);
        
    }

    public String getnama_gde() {
        return this.nama_gde;
    }

    private void setnama_gde(String nama_gde) {
        this.nama_gde=nama_gde;
    }



}
