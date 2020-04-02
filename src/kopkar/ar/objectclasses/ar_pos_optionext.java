/*
 * To change this ar_pos_option, choose Tools | ar_pos_options
 * and open the ar_pos_option in the editor.
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
public class ar_pos_optionext extends ar_pos_optioncls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private String customer_code_desc;
    private String petty_cash_account_desc;
    private String cash_register_account_desc;
    private String temp_account_desc;
    private String discount_account_desc;
    private String voucher_account_desc;
    private String cash_account_desc;
    private String payment_salary_account_desc;
    private String debit_card_account_desc;
    private String credit_card_acount_desc;
    private String return_account_desc;
    private String balance_account_desc;
    private String chasier_name;
    private String cost_price_desc;
    private String sales_price_desc;
    private String warehouse_name;
    private String payment_return_account_desc;


    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ar_pos_option_insert( "

                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.gettextnotapos()+"', "
                    + "'"+this.gettextnotapossts()+"', "
                    + "'"+this.getcustomer_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
                    + "'"+this.getsales_price_code()+"', "


                    + "'"+this.getpetty_cash_account()+"', "
                    + "'"+this.getcash_register_account()+"', "
                    + "'"+this.gettemp_account()+"', "
                    + "'"+this.getdiscount_account()+"', "
                    + "'"+this.getvoucher_account()+"', "
                    + "'"+this.getcash_account()+"', "
                    + "'"+this.getpayment_salary_account()+"', "
                    + "'"+this.getdebit_card_account()+"', "
                    + "'"+this.getcredit_card_acount()+"', "
                    + "'"+this.getreturn_account()+"', "
                    + "'"+this.getbalance_account()+"', "
                    + "'"+this.getpayment_return_account()+"', "

                    + "'"+this.getmodel_struk()+"', "
                    + "'"+this.getprint_to_printer()+"', "
                    
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ar_pos_option_update( "
                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getchasier_code()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.gettextnotapos()+"', "
                    + "'"+this.gettextnotapossts()+"', "
                    + "'"+this.getcustomer_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
                    + "'"+this.getsales_price_code()+"', "
                    + "'"+this.getpetty_cash_account()+"', "
                    + "'"+this.getcash_register_account()+"', "
                    + "'"+this.gettemp_account()+"', "
                    + "'"+this.getdiscount_account()+"', "
                    + "'"+this.getvoucher_account()+"', "
                    + "'"+this.getcash_account()+"', "
                    + "'"+this.getpayment_salary_account()+"', "
                    + "'"+this.getdebit_card_account()+"', "
                    + "'"+this.getcredit_card_acount()+"', "
                    + "'"+this.getreturn_account()+"', "
                    + "'"+this.getbalance_account()+"', "
                    + "'"+this.getpayment_return_account()+"', "

                    + "'"+this.getmodel_struk()+"', "
                    + "'"+this.getprint_to_printer()+"', "

                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ar_pos_option_delete( "

                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.gettextnotapos()+"', "
                    + "'"+this.gettextnotapossts()+"', "
                    + "'"+this.getcustomer_code()+"', "



                    + "'"+this.getpetty_cash_account()+"', "
                    + "'"+this.getcash_register_account()+"', "
                    + "'"+this.gettemp_account()+"', "
                    + "'"+this.getdiscount_account()+"', "
                    + "'"+this.getvoucher_account()+"', "
                    + "'"+this.getcash_account()+"', "
                    + "'"+this.getpayment_salary_account()+"', "
                    + "'"+this.getdebit_card_account()+"', "
                    + "'"+this.getcredit_card_acount()+"', "
                    + "'"+this.getreturn_account()+"', "
                    + "'"+this.getbalance_account()+"', "

                    + "'"+this.getmodel_struk()+"', "
                    + "'"+this.getprint_to_printer()+"', "
                    
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
        squery="select * from ar_pos_option where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String company_id) throws CodeException {
        squery="CALL sp_ar_pos_option_get('"+company_id+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setcompany_id(rs.getString("company_id"));
        this.setcompany_name(rs.getString("company_name"));
        this.setactive_sts(rs.getString("active_sts"));
        this.setaddress1(rs.getString("address1"));
        this.setaddress2(rs.getString("address2"));
        this.setcity(rs.getString("city"));
        this.setstate(rs.getString("state"));
        this.setzipcode(rs.getString("zipcode"));
        this.setphone(rs.getString("phone"));
        this.setfaximale(rs.getString("faximale"));
        this.setemail(rs.getString("email"));
        this.setpic(rs.getString("pic"));
        this.setregister_date(rs.getString("register_date"));
        this.setchasier_code(rs.getString("chasier_code"));
        this.setcounter_number(rs.getString("counter_number"));
        this.settextnotapos(rs.getString("textnotapos"));
        this.settextnotapossts(rs.getString("textnotapossts"));
        this.setcustomer_code(rs.getString("customer_code"));
        this.setcost_price_code(rs.getString("cost_price_code"));
        this.setsales_price_code(rs.getString("sales_price_code"));

        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        this.setpetty_cash_account(rs.getString("petty_cash_account"));
        this.setcash_register_account(rs.getString("cash_register_account"));
        this.settemp_account(rs.getString("temp_account"));
        this.setdiscount_account(rs.getString("discount_account"));
        this.setvoucher_account(rs.getString("voucher_account"));
        this.setcash_account(rs.getString("cash_account"));
        this.setpayment_salary_account(rs.getString("payment_salary_account"));
        this.setdebit_card_account(rs.getString("debit_card_account"));
        this.setcredit_card_acount(rs.getString("credit_card_acount"));
        this.setreturn_account(rs.getString("return_account"));
        this.setbalance_account(rs.getString("balance_account"));
        this.setpayment_return_account(rs.getString("payment_return_account"));

        this.setmodel_struk(rs.getString("model_struk"));
        this.setprint_to_printer(rs.getString("print_to_printer"));
        
        this.chasier_name=rs.getString("chasier_name");
        this.customer_code_desc=rs.getString("customer_name");
        this.warehouse_name=rs.getString("warehouse_name");
        this.cost_price_desc=rs.getString("cost_price_desc");
        this.sales_price_desc=rs.getString("sales_price_desc");

        this.petty_cash_account_desc=rs.getString("petty_cash_account_desc");
        this.cash_register_account_desc=rs.getString("cash_register_account_desc");
        this.temp_account_desc=rs.getString("temp_account_desc");
        this.discount_account_desc=rs.getString("discount_account_desc");
        this.voucher_account_desc=rs.getString("voucher_account_desc");
        this.cash_account_desc=rs.getString("cash_account_desc");
        this.payment_salary_account_desc=rs.getString("payment_salary_account_desc");
        this.debit_card_account_desc=rs.getString("debit_card_account_desc");
        this.credit_card_acount_desc=rs.getString("credit_card_acount_desc");
        this.return_account_desc=rs.getString("return_account_desc");
        this.balance_account_desc=rs.getString("balance_account_desc");
        this.payment_return_account_desc=rs.getString("payment_return_account_desc");
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_pos_option_get('"+this.getcompany_id()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_pos_option_get('"+this.getcompany_id()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_pos_option_get('"+this.getcompany_id()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_pos_option_get('"+this.getcompany_id()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_optionext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getcompany_id())){
            return true;
        }
        return false;
    }

    public String getcustomer_code_desc() { return this.customer_code_desc; }
    public String getpetty_cash_account_desc() { return this.petty_cash_account_desc; }
    public String getcash_register_account_desc() { return this.cash_register_account_desc; }
    public String gettemp_account_desc() { return this.temp_account_desc; }
    public String getdiscount_account_desc() { return this.discount_account_desc; }
    public String getvoucher_account_desc() { return this.voucher_account_desc; }
    public String getcash_account_desc() { return this.cash_account_desc; }
    public String getpayment_salary_account_desc() { return this.payment_salary_account_desc; }
    public String getdebit_card_account_desc() { return this.debit_card_account_desc; }
    public String getcredit_card_acount_desc() { return this.credit_card_acount_desc; }
    public String getreturn_account_desc() { return this.return_account_desc; }
    public String getbalance_account_desc() { return this.balance_account_desc; }

    public String getchasier_name() {
        return this.chasier_name;
    }

    public String getcost_price_code_desc() {
        return this.cost_price_desc;
    }

    public String getsales_price_code_desc() {
        return this.sales_price_desc;
    }

    public String getwarehouse_name() {
        return this.warehouse_name;
    }

    public String getpayment_return_account_desc(){
        return payment_return_account_desc;
    }

}
