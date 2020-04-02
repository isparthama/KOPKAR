/*
 * To change this ar_sales_invoice, choose Tools | Templates
 * and open the ar_sales_invoice in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ar_sales_invoicecls implements Serializable {

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
    private String salesman_code="";
    private String reference;
    private String dscription;
    private String include_tax="Y";
    private Double tax_percent;
    private Double total_bfr_discount;
    private Double total_discount;
    private Double total_aft_discount;
    private Double tax_amount;
    private Double total_aft_tax;
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;

    public ar_sales_invoicecls() {
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

    public String getinclude_tax() {
        return include_tax;
    }
    public void setinclude_tax(String include_tax) {
        this.include_tax = include_tax;
    }

    public Double gettax_percent() {
        return tax_percent;
    }
    public void settax_percent(Double tax_percent) {
        this.tax_percent = tax_percent;
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

    public Double gettax_amount() {
        return tax_amount;
    }
    public void settax_amount(Double tax_amount) {
        this.tax_amount = tax_amount;
    }

    public Double gettotal_aft_tax() {
        return total_aft_tax;
    }
    public void settotal_aft_tax(Double total_aft_tax) {
        this.total_aft_tax = total_aft_tax;
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
