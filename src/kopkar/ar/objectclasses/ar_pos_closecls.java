/*
 * To change this ar_pos_close, choose Tools | Templates
 * and open the ar_pos_close in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ar_pos_closecls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private String reference_number;
    private String chasier_code;
    private String counter_number;
    private String dscription;
    private Double cash_register_modal=new Double(0);
    private Double sales_amount=new Double(0);
    private Double return_amount=new Double(0);
    private Double net_sales_plus_modal=new Double(0);
    private Double payment_discount=new Double(0);
    private Double payment_voucher=new Double(0);
    private Double payment_cash=new Double(0);
    private Double payment_salary=new Double(0);
    private Double payment_credit_card=new Double(0);
    private Double payment_debit_card=new Double(0);
    private Double cash_register=new Double(0);
    private Double balance_amount=new Double(0);
    private String close_status="N";
    private Integer close_number=0;
    private String close_date;
    private String close_user;
    private Integer baseentry=0;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private Double payment_pos_return=new Double(0);

    public ar_pos_closecls() {
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

    public String getreference_number() {
        return reference_number;
    }
    public void setreference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public String getchasier_code() {
        return chasier_code;
    }
    public void setchasier_code(String chasier_code) {
        this.chasier_code = chasier_code;
    }

    public String getcounter_number() {
        return counter_number;
    }
    public void setcounter_number(String counter_number) {
        this.counter_number = counter_number;
    }

    public String getdscription() {
        return dscription;
    }
    public void setdscription(String dscription) {
        this.dscription = dscription;
    }

    public Double getcash_register_modal() {
        return cash_register_modal;
    }
    public void setcash_register_modal(Double cash_register_modal) {
        this.cash_register_modal = cash_register_modal;
    }

    public Double getsales_amount() {
        return sales_amount;
    }
    public void setsales_amount(Double sales_amount) {
        this.sales_amount = sales_amount;
    }

    public Double getreturn_amount() {
        return return_amount;
    }
    public void setreturn_amount(Double return_amount) {
        this.return_amount = return_amount;
    }

    public Double getnet_sales_plus_modal() {
        return net_sales_plus_modal;
    }
    public void setnet_sales_plus_modal(Double net_sales_plus_modal) {
        this.net_sales_plus_modal = net_sales_plus_modal;
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

    public Double getcash_register() {
        return cash_register;
    }
    public void setcash_register(Double cash_register) {
        this.cash_register = cash_register;
    }

    public Double getbalance_amount() {
        return balance_amount;
    }
    public void setbalance_amount(Double balance_amount) {
        this.balance_amount = balance_amount;
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

    public Integer getbaseentry() {
        return baseentry;
    }
    public void setbaseentry(Integer baseentry) {
        this.baseentry = baseentry;
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

    public String getaudituser() {
        return audituser;
    }
    public void setaudituser(String audituser) {
        this.audituser = audituser;
    }

    public Double getpayment_pos_return() {
        return payment_pos_return;
    }
    public void setpayment_pos_return(Double payment_pos_return) {
        this.payment_pos_return = payment_pos_return;
    }

}
