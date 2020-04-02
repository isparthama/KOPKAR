/*
 * To change this ar_pos_close, choose Tools | ar_pos_closes
 * and open the ar_pos_close in the editor.
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
public class ar_pos_closeext extends ar_pos_closecls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String counter_name;
    private String chasier_name;
    private double net_sales=new Double(0);
    private double payment_total=new Double(0);

    public ar_pos_closeext() {
        this.setdocument_date(GlobalUtils.sessiondate);
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        try {
            if (insertsts){
                squery="call sp_ar_pos_close_insert( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getchasier_code()+"', "
                        + "'"+this.getcounter_number()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getcash_register_modal()+"', "
                        + "'"+this.getsales_amount()+"', "
                        + "'"+this.getreturn_amount()+"', "
                        + "'"+this.getnet_sales_plus_modal()+"', "
                        + "'"+this.getpayment_discount()+"', "
                        + "'"+this.getpayment_voucher()+"', "
                        + "'"+this.getpayment_cash()+"', "
                        + "'"+this.getpayment_salary()+"', "
                        + "'"+this.getpayment_credit_card()+"', "
                        + "'"+this.getpayment_debit_card()+"', "
                        + "'"+this.getcash_register()+"', "
                        + "'"+this.getbalance_amount()+"', "
                        + "'"+this.getpayment_pos_return()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                ResultSet rs = db.executeQuery(squery);
                if (rs.next()){
                    this.setdocentry(rs.getInt("docentry"));
                    this.setdocument_number(rs.getString("document_number"));
                }

            } else {
                squery="call sp_ar_pos_close_update( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getchasier_code()+"', "
                        + "'"+this.getcounter_number()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getcash_register_modal()+"', "
                        + "'"+this.getsales_amount()+"', "
                        + "'"+this.getreturn_amount()+"', "
                        + "'"+this.getnet_sales_plus_modal()+"', "
                        + "'"+this.getpayment_discount()+"', "
                        + "'"+this.getpayment_voucher()+"', "
                        + "'"+this.getpayment_cash()+"', "
                        + "'"+this.getpayment_salary()+"', "
                        + "'"+this.getpayment_credit_card()+"', "
                        + "'"+this.getpayment_debit_card()+"', "
                        + "'"+this.getcash_register()+"', "
                        + "'"+this.getbalance_amount()+"', "
                        + "'"+this.getpayment_pos_return()+"', "
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
        squery="call sp_ar_pos_close_delete( "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getreference_number()+"', "
                    + "'"+this.getchasier_code()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.getcash_register_modal()+"', "
                    + "'"+this.getsales_amount()+"', "
                    + "'"+this.getreturn_amount()+"', "
                    + "'"+this.getnet_sales_plus_modal()+"', "
                    + "'"+this.getpayment_discount()+"', "
                    + "'"+this.getpayment_voucher()+"', "
                    + "'"+this.getpayment_cash()+"', "
                    + "'"+this.getpayment_salary()+"', "
                    + "'"+this.getpayment_credit_card()+"', "
                    + "'"+this.getpayment_debit_card()+"', "
                    + "'"+this.getcash_register()+"', "
                    + "'"+this.getbalance_amount()+"', "
                    + "'"+this.getpayment_pos_return()+"', "
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
        squery="select * from ar_pos_close where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_closeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_ar_pos_close_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_closeext.class.getName()).log(Level.SEVERE, null, ex);
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
        this.setchasier_code(rs.getString("chasier_code"));
        this.setchasier_name(rs.getString("chasier_name"));
        this.setcounter_number(rs.getString("counter_number"));
        this.setcounter_name(   rs.getString("counter_name"));
        this.setdscription(rs.getString("dscription"));
        this.setcash_register_modal(rs.getDouble("cash_register_modal"));
        this.setsales_amount(rs.getDouble("sales_amount"));
        this.setreturn_amount(rs.getDouble("return_amount"));
        this.setnet_sales_plus_modal(rs.getDouble("net_sales_plus_modal"));
        this.setpayment_discount(rs.getDouble("payment_discount"));
        this.setpayment_voucher(rs.getDouble("payment_voucher"));
        this.setpayment_cash(rs.getDouble("payment_cash"));
        this.setpayment_salary(rs.getDouble("payment_salary"));
        this.setpayment_credit_card(rs.getDouble("payment_credit_card"));
        this.setpayment_debit_card(rs.getDouble("payment_debit_card"));
        this.setcash_register(rs.getDouble("cash_register"));
        this.setbalance_amount(rs.getDouble("balance_amount"));
        this.setclose_status(rs.getString("close_status"));
        this.setclose_number(rs.getInt("close_number"));
        this.setclose_date(rs.getString("close_date"));
        this.setclose_user(rs.getString("close_user"));
        this.setbaseentry(rs.getInt("baseentry"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_pos_close_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_closeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_pos_close_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_closeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_pos_close_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_closeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_pos_close_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_closeext.class.getName()).log(Level.SEVERE, null, ex);
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

    @Override
    public void setcash_register(Double cash_register) {
        super.setcash_register(cash_register);

        this.setbalance_amount(this.getcash_register()-(this.getcash_register_modal()+this.getpayment_cash()));
    }

    public String getcounter_name() {
        return this.counter_name;
    }

    public String getchasier_name() {
        return this.chasier_name;
    }


    public boolean initdata_reff(String document_number) throws CodeException {
        squery="CALL sp_ar_pos_reff_open_sales_get('"+document_number+"')";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme_reff(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_closeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean fillme_reff(ResultSet rs) throws SQLException {
        this.setchasier_code(rs.getString("kasir"));
        this.setchasier_name(rs.getString("nama_kasir"));
        this.setcounter_number(rs.getString("loket"));
        this.setcounter_name(rs.getString("nama_loket"));
        this.setcash_register_modal(rs.getDouble("uang_modal"));
        this.setsales_amount(rs.getDouble("gross_sls"));
        this.setreturn_amount(rs.getDouble("gross_rtr"));
        this.setnet_sales_plus_modal(this.getsales_amount()-this.getreturn_amount()+this.getcash_register_modal());
        this.setpayment_discount(rs.getDouble("potongan"));
        this.setpayment_voucher(rs.getDouble("voucher"));
        this.setpayment_pos_return(rs.getDouble("rtr"));
        this.setpayment_cash(rs.getDouble("tunai"));
        this.setpayment_salary(rs.getDouble("pot_gaji"));
        this.setpayment_credit_card(rs.getDouble("crd_card"));
        this.setpayment_debit_card(rs.getDouble("dbt_card"));
        this.setnet_sales(rs.getDouble("net_sales"));
        this.setpayment_total(rs.getDouble("jml_bayar"));
        this.setbalance_amount(rs.getDouble("net_sls_modal"));


        return true;
    }

    private void setchasier_name(String chasier_name) {
        this.chasier_name=chasier_name;
    }

    private void setcounter_name(String counter_name) {
        this.counter_name=counter_name;
    }

    private void setnet_sales(double net_sales) {
        this.net_sales=net_sales;
    }

    private void setpayment_total(double payment_total) {
        this.payment_total=payment_total;
    }

    public Object getpayment_total() {
        return this.payment_total;
    }



}
