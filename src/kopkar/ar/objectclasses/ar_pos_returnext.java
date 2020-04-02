/*
 * To change this ar_pos_return, choose Tools | ar_pos_returns
 * and open the ar_pos_return in the editor.
 */

package kopkar.ar.objectclasses;

import kopkar.ap.objectclasses.ap_purchase_order_detail1ext;
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
public class ar_pos_returnext extends ar_pos_returncls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String document_status_desc="Open";
    ar_customerext ocustomer=new ar_customerext();
    private Integer total_quantity=0;
    private double kembalian;

    public ar_pos_returnext() {
        this.setdocument_date(GlobalUtils.sessiondate);
    }

    public ar_pos_return_detail1extcol getDetail1() {
        return detail1;
    }

    public void setDetail1(ar_pos_return_detail1extcol detail1) {
        this.detail1 = detail1;
    }
    private ar_pos_return_detail1extcol detail1=new ar_pos_return_detail1extcol(null);

    public ar_customerext getOCustomer() {
        return ocustomer;
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
        this.setdocument_duedate(GlobalUtils.formatDate(this.getdocument_duedate(), "yyyy-MM-dd"));
        ar_pos_return_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_ar_pos_return_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getcustomer_code()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getterm_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getpayment_discount()+"', "
                        + "'"+this.getpayment_voucher()+"', "
                        + "'"+this.getpayment_cash()+"', "
                        + "'"+this.getpayment_salary()+"', "
                        + "'"+this.getpayment_credit_card()+"', "
                        + "'"+this.getpayment_debit_card()+"', "
                        + "'"+this.gettotal_net_sales()+"', "
                        + "'"+this.getpayment_receipt()+"', "
                        + "'"+this.getvoucher_name()+"', "
                        + "'"+this.getcredit_card_name()+"', "
                        + "'"+this.getcredit_card_number()+"', "
                        + "'"+this.getdebit_card_name()+"', "
                        + "'"+this.getdebit_card_number()+"', "
                        + "'"+this.getcounter_number()+"', "
                        + "'"+this.getchasier_code()+"', "
                        + "'"+GlobalUtils.userid+"'"
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
                            if (o.getstatus()==ar_pos_return_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                                o.setline_number(i);
                            }
                            o.setwarehouse_code(this.getwarehouse_code());
                            o.setprice_code(this.getprice_code());
                            o.update();
                        }

                        

            } else {
                squery="call sp_ar_pos_return_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getcustomer_code()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getterm_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getsalesman_code()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.gettotal_bfr_discount()+"', "
                        + "'"+this.gettotal_discount()+"', "
                        + "'"+this.gettotal_aft_discount()+"', "
                        + "'"+this.getpayment_salary_status()+"', "
                        + "'"+this.getpayment_discount()+"', "
                        + "'"+this.getpayment_voucher()+"', "
                        + "'"+this.getpayment_cash()+"', "
                        + "'"+this.getpayment_salary()+"', "
                        + "'"+this.getpayment_credit_card()+"', "
                        + "'"+this.getpayment_debit_card()+"', "
                        + "'"+this.gettotal_net_sales()+"', "
                        + "'"+this.getpayment_receipt()+"', "
                        + "'"+this.getvoucher_name()+"', "
                        + "'"+this.getcredit_card_name()+"', "
                        + "'"+this.getcredit_card_number()+"', "
                        + "'"+this.getdebit_card_name()+"', "
                        + "'"+this.getdebit_card_number()+"', "
                        + "'"+this.getcounter_number()+"', "
                        + "'"+this.getchasier_code()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                        

                        int i=0;
                        for (i=0;i<this.detail1.size();i++){
                            o=this.detail1.get(i);
                            if (o.getstatus()==ar_pos_return_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                            }
                            o.setwarehouse_code(this.getwarehouse_code());
                            o.setprice_code(this.getprice_code());
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
        squery="call sp_ar_pos_return_delete( "
                    + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getcustomer_code()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getterm_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getsalesman_code()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.gettotal_bfr_discount()+"', "
                        + "'"+this.gettotal_discount()+"', "
                        + "'"+this.gettotal_aft_discount()+"', "
                        + "'"+this.getpayment_salary_status()+"', "
                        + "'"+this.getpayment_discount()+"', "
                        + "'"+this.getpayment_voucher()+"', "
                        + "'"+this.getpayment_cash()+"', "
                        + "'"+this.getpayment_salary()+"', "
                        + "'"+this.getpayment_credit_card()+"', "
                        + "'"+this.getpayment_debit_card()+"', "
                        + "'"+this.gettotal_net_sales()+"', "
                        + "'"+this.getpayment_receipt()+"', "
                        + "'"+this.getvoucher_name()+"', "
                        + "'"+this.getcredit_card_name()+"', "
                        + "'"+this.getcredit_card_number()+"', "
                        + "'"+this.getdebit_card_name()+"', "
                        + "'"+this.getdebit_card_number()+"', "
                        + "'"+this.getcounter_number()+"', "
                        + "'"+this.getchasier_code()+"', "
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
        squery="select * from ar_pos_return where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_returnext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ar_pos_return_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_returnext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setdocument_duedate(rs.getString("document_duedate"));
        this.setcustomer_code(rs.getString("customer_code"));
        this.setreference_number(rs.getString("reference_number"));
        this.setterm_code(rs.getString("term_code"));
        this.setdiscount_code(rs.getString("discount_code"));
        this.setprice_code(rs.getString("price_code"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setsalesman_code(rs.getString("salesman_code"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_bfr_discount(rs.getDouble("total_bfr_discount"));
        this.settotal_discount(rs.getDouble("total_discount"));
        this.settotal_aft_discount(rs.getDouble("total_aft_discount"));
        this.setpayment_salary_status(rs.getString("payment_salary_status"));
        this.setpayment_discount(rs.getDouble("payment_discount"));
        this.setpayment_voucher(rs.getDouble("payment_voucher"));
        this.setpayment_cash(rs.getDouble("payment_cash"));
        this.setpayment_salary(rs.getDouble("payment_salary"));
        this.setpayment_credit_card(rs.getDouble("payment_credit_card"));
        this.setpayment_debit_card(rs.getDouble("payment_debit_card"));
        this.settotal_net_sales(rs.getDouble("total_net_sales"));
        this.setpayment_receipt(rs.getDouble("payment_receipt"));
        this.setvoucher_name(rs.getString("voucher_name"));
        this.setcredit_card_name(rs.getString("credit_card_name"));
        this.setcredit_card_number(rs.getString("credit_card_number"));
        this.setdebit_card_name(rs.getString("debit_card_name"));
        this.setdebit_card_number(rs.getString("debit_card_number"));
        this.setcounter_number(rs.getString("counter_number"));
        this.setchasier_code(rs.getString("chasier_code"));
        this.setclose_status(rs.getString("close_status"));
        this.setclose_number(rs.getInt("close_number"));
        this.setclose_date(rs.getString("close_date"));
        this.setclose_user(rs.getString("close_user"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));


        this.setDocument_status_desc(rs.getString("document_status_desc"));
        ocustomer=new ar_customerext();
        ocustomer.setcustomer_name(rs.getString("customer_name"));
        ocustomer.setaddress1(rs.getString("address"));

        detail1=new ar_pos_return_detail1extcol(this.getdocentry());
        detail1.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_pos_return_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_returnext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_pos_return_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_returnext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_pos_return_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_returnext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_pos_return_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_returnext.class.getName()).log(Level.SEVERE, null, ex);
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
        double total_gross = 0;
        double total_after_discount=0;
        double total_discount=0;
        int total_quantity=0;
        for (i=0;i<this.detail1.size();i++){
            ar_pos_return_detail1ext o = this.detail1.get(i);
            if (!o.getstatus().equals(ar_pos_return_detail1ext.Status_delete)){
            total_gross+=o.gettotal_gross();
            total_after_discount+=o.gettotal_after_discount();
            total_discount+=o.getdiscount_amount();
            total_quantity+=o.getquantity();
            }
        }
        this.settotal_quantity(total_quantity);
        this.settotal_bfr_discount(total_gross);
        this.settotal_aft_discount(total_after_discount);
        this.settotal_discount(total_discount);
    }

    public void retrieve(ar_sales_returnext objref) {
        int i=0;

        this.setcustomer_code(objref.getcustomer_code());
        this.getOCustomer().setaddress1(objref.getOCustomer().getaddress1());
        this.setreference_number(objref.getdocument_number());
        this.setwarehouse_code(objref.getwarehouse_code());
        this.setterm_code(objref.getterm_code());
        this.setdiscount_code(objref.getdiscount_code());
        this.setprice_code(objref.getprice_code());
        this.setdscription("Base On Sls. Ret No:"+objref.getdocument_number());
        for (i=0;i<objref.getDetail1().size();i++){
            ar_sales_return_detail1ext o = objref.getDetail1().get(i);
            if (o.isSelected()){
                ar_pos_return_detail1ext pod=new ar_pos_return_detail1ext();

                pod.setproduct_code(o.getproduct_code());
                pod.setproduct_name(o.getProduct_name());
                pod.setuom_id(o.getuom_id());
                pod.setuom_code(o.getUom_code());
                pod.setquantity(o.getquantity_open());
                pod.setquantity_pcs(o.getquantity_pcs());
                pod.setprice(o.getprice());
                pod.settotal_gross(pod.getquantity()*pod.getprice());

                pod.setdiscount_percent(o.getdiscount_percent());
                pod.setdiscount_amount((pod.getquantity()*pod.getprice())*(pod.getdiscount_percent()/100));
                pod.settotal_after_discount((pod.getquantity()*pod.getprice())-((pod.getquantity()*pod.getprice())*(pod.getdiscount_percent()/100)));

                pod.setbase_docentry(o.getdocentry());
                pod.setbase_line_number(o.getline_number());
                pod.setbase_objtype(objref.getobjtype());

                pod.setstatus(ap_purchase_order_detail1ext.Status_Insert);
                this.detail1.add(pod);
            }
        }
        this.calculatetotal();
    }

    public Integer gettotal_quantity() {
        return this.total_quantity;
    }

    private void settotal_quantity(Integer total_quantity) {
        this.total_quantity=total_quantity;
    }

    public void setkembalian(double kembalian) {
        this.kembalian=kembalian;
    }

    public Double getkembalian() {
        return this.kembalian;
    }

    public boolean getrefdata(ar_pos_salesext objsales) throws CodeException {

        this.setreference_number(objsales.getdocument_number());

        this.setdocument_date(objsales.getdocument_date());
        this.setdocument_duedate(objsales.getdocument_duedate());
        this.setcustomer_code(objsales.getcustomer_code());

        this.setterm_code(objsales.getterm_code());
        this.setdiscount_code(objsales.getdiscount_code());
        this.setprice_code(objsales.getprice_code());
        this.setwarehouse_code(objsales.getwarehouse_code());
        this.setsalesman_code(objsales.getsalesman_code());
        this.setreference(objsales.getreference());
        this.setdscription(objsales.getdscription());
        this.settotal_bfr_discount(objsales.gettotal_bfr_discount());
        this.settotal_discount(objsales.gettotal_discount());
        this.settotal_aft_discount(objsales.gettotal_aft_discount());
        this.setpayment_salary_status(objsales.getpayment_salary_status());
        this.setpayment_discount(objsales.getpayment_discount());
        this.setpayment_voucher(objsales.getpayment_voucher());
        this.setpayment_cash(objsales.getpayment_cash());
        this.setpayment_salary(objsales.getpayment_salary());
        this.setpayment_credit_card(objsales.getpayment_credit_card());
        this.setpayment_debit_card(objsales.getpayment_debit_card());
        this.settotal_net_sales(objsales.gettotal_net_sales());
        this.setpayment_receipt(objsales.getpayment_receipt());
        this.setvoucher_name(objsales.getvoucher_name());
        this.setcredit_card_name(objsales.getcredit_card_name());
        this.setcredit_card_number(objsales.getcredit_card_number());
        this.setdebit_card_name(objsales.getdebit_card_name());
        this.setdebit_card_number(objsales.getdebit_card_number());
        this.setcounter_number(objsales.getcounter_number());
        this.setchasier_code(objsales.getchasier_code());

        ar_pos_sales_detail1extcol details = objsales.getDetail1();
        for (int i=0;i<details.size();i++){
            ar_pos_sales_detail1ext o = details.get(i);
            ar_pos_return_detail1ext od = new ar_pos_return_detail1ext();

            od.setstatus(od.Status_Insert);
            od.setline_number(o.getline_number());
            od.setproduct_code(o.getproduct_code());
            od.setuom_id(o.getuom_id());
            od.setquantity(o.getquantity());
            od.setcost(o.getcost());
            od.setprice(o.getprice());
            od.setdiscount_percent(o.getdiscount_percent());
            od.setdiscount_amount(o.getdiscount_amount());
            od.settotal_gross(o.gettotal_gross());
            od.settotal_after_discount(o.gettotal_after_discount());
            od.setuom2(o.getuom2());
            od.setuom3(o.getuom3());
            od.setquantity_pcs(o.getquantity_pcs());
            od.setcost_pcs(o.getcost_pcs());
            od.setprice_pcs(o.getprice_pcs());
            od.setquantity_open(o.getquantity_open());
            od.setquantity_pcs_open(o.getquantity_pcs_open());
            od.setbase_objtype(objsales.getobjtype());
            od.setbase_docentry(o.getdocentry());
            od.setbase_line_number(o.getline_number());
            od.setprice_code(o.getprice_code());
            od.setwarehouse_code(o.getwarehouse_code());

            od.setproduct_name(o.getProduct_name());
            od.setuom_code(o.getUom_code());

            detail1.add(od);

        }
        return true;
    }



}
