/*
 * To change this ar_pos_return, choose Tools | Templates
 * and open the ar_pos_return in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ar_pos_returncls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private String document_duedate;
    private String customer_code;
    private String reference_number;
    private String term_code;
    private String discount_code;
    private String price_code;
    private String warehouse_code;
    private String salesman_code;
    private String reference;
    private String dscription;
    private Double total_bfr_discount=new Double(0);
    private Double total_discount=new Double(0);
    private Double total_aft_discount=new Double(0);
    private String payment_salary_status="N";
    private Double payment_discount=new Double(0);
    private Double payment_voucher=new Double(0);
    private Double payment_cash=new Double(0);
    private Double payment_salary=new Double(0);
    private Double payment_credit_card=new Double(0);
    private Double payment_debit_card=new Double(0);
    private Double total_net_sales=new Double(0);
    private Double payment_receipt=new Double(0);
    private String voucher_name;
    private String credit_card_name;
    private String credit_card_number;
    private String debit_card_name;
    private String debit_card_number;
    private String counter_number;
    private String chasier_code;
    private String close_status="N";
    private Integer close_number;
    private String close_date;
    private String close_user;
    private String entrydate;
    private String auditdate;
    private Integer objtype=0;
    private String audituser;

    public ar_pos_returncls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public String getdocument_number() {
        return document_number;
    }
    public void setdocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getdocument_status() {
        return document_status;
    }
    public void setdocument_status(String document_status) {
        this.document_status = document_status;
    }

    public String getcomplete_status() {
        return complete_status;
    }
    public void setcomplete_status(String complete_status) {
        this.complete_status = complete_status;
    }

    public String getdocument_date() {
        return document_date;
    }
    public void setdocument_date(String document_date) {
        this.document_date = document_date;
    }

    public String getdocument_duedate() {
        return document_duedate;
    }
    public void setdocument_duedate(String document_duedate) {
        this.document_duedate = document_duedate;
    }

    public String getcustomer_code() {
        return customer_code;
    }
    public void setcustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    public String getreference_number() {
        return reference_number;
    }
    public void setreference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public String getterm_code() {
        return term_code;
    }
    public void setterm_code(String term_code) {
        this.term_code = term_code;
    }

    public String getdiscount_code() {
        return discount_code;
    }
    public void setdiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public String getprice_code() {
        return price_code;
    }
    public void setprice_code(String price_code) {
        this.price_code = price_code;
    }

    public String getwarehouse_code() {
        return warehouse_code;
    }
    public void setwarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public String getsalesman_code() {
        return salesman_code;
    }
    public void setsalesman_code(String salesman_code) {
        this.salesman_code = salesman_code;
    }

    public String getreference() {
        return reference;
    }
    public void setreference(String reference) {
        this.reference = reference;
    }

    public String getdscription() {
        return dscription;
    }
    public void setdscription(String dscription) {
        this.dscription = dscription;
    }

    public Double gettotal_bfr_discount() {
        return total_bfr_discount;
    }
    public void settotal_bfr_discount(Double total_bfr_discount) {
        this.total_bfr_discount = total_bfr_discount;
    }

    public Double gettotal_discount() {
        return total_discount;
    }
    public void settotal_discount(Double total_discount) {
        this.total_discount = total_discount;
    }

    public Double gettotal_aft_discount() {
        return total_aft_discount;
    }
    public void settotal_aft_discount(Double total_aft_discount) {
        this.total_aft_discount = total_aft_discount;
    }

    public String getpayment_salary_status() {
        return payment_salary_status;
    }
    public void setpayment_salary_status(String payment_salary_status) {
        this.payment_salary_status = payment_salary_status;
    }

    public Double getpayment_discount() {
        return payment_discount;
    }
    public void setpayment_discount(Double payment_discount) {
        this.payment_discount = payment_discount;
    }

    public Double getpayment_voucher() {
        return payment_voucher;
    }
    public void setpayment_voucher(Double payment_voucher) {
        this.payment_voucher = payment_voucher;
    }

    public Double getpayment_cash() {
        return payment_cash;
    }
    public void setpayment_cash(Double payment_cash) {
        this.payment_cash = payment_cash;
    }

    public Double getpayment_salary() {
        return payment_salary;
    }
    public void setpayment_salary(Double payment_salary) {
        this.payment_salary = payment_salary;
    }

    public Double getpayment_credit_card() {
        return payment_credit_card;
    }
    public void setpayment_credit_card(Double payment_credit_card) {
        this.payment_credit_card = payment_credit_card;
    }

    public Double getpayment_debit_card() {
        return payment_debit_card;
    }
    public void setpayment_debit_card(Double payment_debit_card) {
        this.payment_debit_card = payment_debit_card;
    }

    public Double gettotal_net_sales() {
        return total_net_sales;
    }
    public void settotal_net_sales(Double total_net_sales) {
        this.total_net_sales = total_net_sales;
    }

    public Double getpayment_receipt() {
        return payment_receipt;
    }
    public void setpayment_receipt(Double payment_receipt) {
        this.payment_receipt = payment_receipt;
    }

    public String getvoucher_name() {
        return voucher_name;
    }
    public void setvoucher_name(String voucher_name) {
        this.voucher_name = voucher_name;
    }

    public String getcredit_card_name() {
        return credit_card_name;
    }
    public void setcredit_card_name(String credit_card_name) {
        this.credit_card_name = credit_card_name;
    }

    public String getcredit_card_number() {
        return credit_card_number;
    }
    public void setcredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public String getdebit_card_name() {
        return debit_card_name;
    }
    public void setdebit_card_name(String debit_card_name) {
        this.debit_card_name = debit_card_name;
    }

    public String getdebit_card_number() {
        return debit_card_number;
    }
    public void setdebit_card_number(String debit_card_number) {
        this.debit_card_number = debit_card_number;
    }

    public String getcounter_number() {
        return counter_number;
    }
    public void setcounter_number(String counter_number) {
        this.counter_number = counter_number;
    }

    public String getchasier_code() {
        return chasier_code;
    }
    public void setchasier_code(String chasier_code) {
        this.chasier_code = chasier_code;
    }

    public String getclose_status() {
        return close_status;
    }
    public void setclose_status(String close_status) {
        this.close_status = close_status;
    }

    public Integer getclose_number() {
        return close_number;
    }
    public void setclose_number(Integer close_number) {
        this.close_number = close_number;
    }

    public String getclose_date() {
        return close_date;
    }
    public void setclose_date(String close_date) {
        this.close_date = close_date;
    }

    public String getclose_user() {
        return close_user;
    }
    public void setclose_user(String close_user) {
        this.close_user = close_user;
    }

    public String getentrydate() {
        return entrydate;
    }
    public void setentrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getauditdate() {
        return auditdate;
    }
    public void setauditdate(String auditdate) {
        this.auditdate = auditdate;
    }

    public Integer getobjtype() {
        return objtype;
    }
    public void setobjtype(Integer objtype) {
        this.objtype = objtype;
    }

    public String getaudituser() {
        return audituser;
    }
    public void setaudituser(String audituser) {
        this.audituser = audituser;
    }


}
