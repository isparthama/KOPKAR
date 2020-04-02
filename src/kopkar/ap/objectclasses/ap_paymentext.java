/*
 * To change this ap_payment, choose Tools | ap_payments
 * and open the ap_payment in the editor.
 */

package kopkar.ap.objectclasses;

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
public class ap_paymentext extends ap_paymentcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private ap_payment_detail1ext objd1;
    private Double total_payment_tmp=new Double(0);
    private Double total_entry_tmp=new Double(0);
    private double total_entry_real=new Double(0);
    private double total_payment_real=new Double(0);

    public ap_paymentext(){
        insertsts=true;
        this.setdocument_date(GlobalUtils.sessiondate);
        this.objd1=new ap_payment_detail1ext(this);
    }
    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        try {
            if (insertsts){
                squery="call sp_ap_payment_insert( "
                        + "'"+this.getbatchentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_entry()+"', "
                        + "'"+this.gettotal_payment()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                ResultSet rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setbatchentry(rs.getInt("batchentry"));
                    this.setdocument_number(rs.getString("document_number"));
                }
            } else {
                squery="call sp_ap_payment_update( "
                        + "'"+this.getbatchentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_entry()+"', "
                        + "'"+this.gettotal_payment()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
            }
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ap_payment_delete( "
                    + "'"+this.getbatchentry()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_status()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_entry()+"', "
                    + "'"+this.gettotal_payment()+"', "


                    + "'"+this.getobjtype()+"', "

                    + "'"+this.getprocess_sts()+"', "
                    + "'"+this.getprocess_date()+"', "
                    + "'"+this.getprocess_user()+"', "
                    + "'"+this.getdayseqno()+"', "
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
        squery="select * from ap_payment where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_paymentext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ap_payment_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_paymentext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException, CodeException{
        this.setbatchentry(rs.getInt("batchentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_entry(rs.getDouble("total_entry"));
        this.settotal_payment(rs.getDouble("total_payment"));

        this.settotal_entry_real(rs.getDouble("total_entry"));
        this.settotal_payment_real(rs.getDouble("total_payment"));


        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));
        this.setprocess_sts(rs.getString("process_sts"));
        this.setprocess_date(rs.getString("process_date"));
        this.setprocess_user(rs.getString("process_user"));
        this.setdayseqno(rs.getInt("dayseqno"));

        this.objd1=new ap_payment_detail1ext(this);
        this.objd1.moveFirst();

        this.total_payment_tmp=this.gettotal_payment()-objd1.getpayment_total();
        this.total_entry_tmp=this.gettotal_entry()-1;

        insertsts=false;
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ap_payment_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_paymentext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ap_payment_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_paymentext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ap_payment_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_paymentext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ap_payment_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_paymentext.class.getName()).log(Level.SEVERE, null, ex);
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

    /**
     * @return the objd1s
     */
    public ap_payment_detail1ext getObjd1() {
        return objd1;
    }

    /**
     * @param objd1s the objd1s to set
     */
    public void setObjd1(ap_payment_detail1ext objd1) {
        this.objd1 = objd1;
    }

    public void calculatetotal() {
        
    }

    public void settotal_payment_tmp(Double total_payment) {
        this.total_payment_tmp=total_payment;
    }

    public Double gettotal_payment_tmp(){
        return this.total_payment_tmp;
    }

    public void settotal_entry_tmp(Double total_entry) {
        this.total_entry_tmp=total_entry;
    }

    public Double gettotal_entry_tmp() {
        return this.total_payment_tmp;
    }

    private void settotal_entry_real(double total_entry_real) {
        this.total_entry_real=total_entry_real;
    }

    private void settotal_payment_real(double total_payment_real) {
        this.total_payment_real=total_payment_real;
    }

    public double gettotal_payment_real() {
        return this.total_payment_real;
    }

    public double gettotal_entry_real() {
        return this.total_entry_real;
    }
}
