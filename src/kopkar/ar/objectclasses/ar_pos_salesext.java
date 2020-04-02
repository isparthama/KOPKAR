/*
 * To change this ar_pos_sales, choose Tools | ar_pos_saless
 * and open the ar_pos_sales in the editor.
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
public class ar_pos_salesext extends ar_pos_salescls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String document_status_desc="Open";
    ar_customerext ocustomer=new ar_customerext();
    private Integer total_quantity=0;
    private double kembalian;
    private String chasier_name="";
    private ar_customerext obj_cust=new ar_customerext();
    private String model_struk="1";
    private String print_to_printer="Y";

    public ar_pos_salesext(){
        this.setdocentry(0);
        this.setdocument_date(GlobalUtils.sessiondate);
        this.setdocument_status("O");
        this.setcomplete_status("Y");
        this.settotal_bfr_discount(new Double(0));
        this.settotal_discount(new Double(0));
        this.settotal_aft_discount(new Double(0));
        this.setpayment_salary_status("N");
        this.setpayment_discount(new Double(0));
        this.setpayment_voucher(new Double(0));
        this.setpayment_cash(new Double(0));
        this.setpayment_salary(new Double(0));
        this.setpayment_credit_card(new Double(0));
        this.setpayment_debit_card(new Double(0));
        this.settotal_net_sales(new Double(0));
        this.setpayment_receipt(new Double(0));
        this.setpayment_pos_return(new Double(0));
        this.setjumlah_tempo_angsuran(1);

    }
    public ar_pos_sales_detail1extcol getDetail1() {
        return detail1;
    }

    public void setDetail1(ar_pos_sales_detail1extcol detail1) {
        this.detail1 = detail1;
    }
    private ar_pos_sales_detail1extcol detail1=new ar_pos_sales_detail1extcol(null);

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
        ar_pos_sales_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_ar_pos_sales_insert( "
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

                        + "'"+this.getreffno_pos_return()+"', "
                        + "'"+this.getpayment_pos_return()+"', "
                        + "'"+this.getjumlah_tempo_angsuran()+"', "

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
                            if (o.getstatus()==ar_pos_sales_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                                o.setline_number(i+1);
                            }
                            o.setwarehouse_code(this.getwarehouse_code());
                            o.setprice_code(this.getprice_code());
                            o.update();
                        }

                        

            } else {
                squery="call sp_ar_pos_sales_update( "
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

                        + "'"+this.getreffno_pos_return()+"', "
                        + "'"+this.getpayment_pos_return()+"', "
                        + "'"+this.getjumlah_tempo_angsuran()+"', "
                        
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                        db.execute(squery);

                        int i=0;
                        for (i=0;i<this.detail1.size();i++){
                            o=this.detail1.get(i);
                            if (o.getstatus()==ar_pos_sales_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                            }
                            o.setwarehouse_code(this.getwarehouse_code());
                            o.setprice_code(this.getprice_code());
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
        squery="call sp_ar_pos_sales_delete( "
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

                        + "'"+this.getreffno_pos_return()+"', "
                        + "'"+this.getpayment_pos_return()+"', "
                        + "'"+this.getjumlah_tempo_angsuran()+"', "

                        + "'"+GlobalUtils.userid+"'"
                        + ")";
        ar_pos_sales_detail1ext o;
        try {
            db.execute(squery);

            int i=0;
            for (i=0;i<this.detail1.size();i++){
                o=this.detail1.get(i);
                o.setstatus(ar_pos_sales_detail1ext.Status_delete);
                o.setwarehouse_code(this.getwarehouse_code());
                o.setprice_code(this.getprice_code());
                o.update();
            }

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
        squery="select * from ar_pos_sales where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_salesext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ar_pos_sales_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_salesext.class.getName()).log(Level.SEVERE, null, ex);
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

        this.setreffno_pos_return(rs.getString("reffno_pos_return"));
        this.setpayment_pos_return(rs.getDouble("payment_pos_return"));
        this.setjumlah_tempo_angsuran(rs.getInt("jumlah_tempo_angsuran"));

        this.chasier_name=rs.getString("chasier_name");


        this.setDocument_status_desc(rs.getString("document_status_desc"));
        ocustomer=new ar_customerext();
        ocustomer.setcustomer_name(rs.getString("customer_name"));
        ocustomer.setaddress1(rs.getString("address"));

        detail1=new ar_pos_sales_detail1extcol(this.getdocentry());
        detail1.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_pos_sales_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_salesext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_pos_sales_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_salesext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_pos_sales_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_salesext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_pos_sales_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_pos_salesext.class.getName()).log(Level.SEVERE, null, ex);
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
            ar_pos_sales_detail1ext o = this.detail1.get(i);
            if (!o.getstatus().equals(ar_pos_sales_detail1ext.Status_delete)){
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
                ar_pos_sales_detail1ext pod=new ar_pos_sales_detail1ext();

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

    public String getchasier_name() {
        return this.chasier_name;
    }

    public void setcustomer_info(ar_customerext oar_customer) {
        this.obj_cust=oar_customer;
    }

    public ar_customerext getcustomer_info() {
        return this.obj_cust;
    }

    public void setmodel_struk(String model_struk) {
        this.model_struk=model_struk;
    }

    public String getmodel_struk() {
        return this.model_struk;
    }

    public void setprint_to_printer(String print_to_printer) {
        this.print_to_printer=print_to_printer;
    }

    public String getprint_to_printer() {
        return this.print_to_printer;
    }


}
