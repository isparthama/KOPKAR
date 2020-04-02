/*
 * To change this in_so_entry, choose Tools | Templates
 * and open the in_so_entry in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_so_entrycls implements Serializable {

    private Integer docentry;
    private String document_number;
    private String document_status;
    private String complete_status;
    private String document_date;
    private String reference_number;
    private String brand_code_fr;
    private String brand_code_to;
    private String category_code_fr;
    private String category_code_to;
    private String warehouse_code;
    private String employee;
    private String reference;
    private String dscription;
    private Integer total_so_qty;
    private Integer total_adm_qty;
    private Integer adjustment_no;
    private String adjustment_date;
    private String adjustment_user;
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;

    public in_so_entrycls() {
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

    public String getbrand_code_fr() {
        return brand_code_fr;
    }
    public void setbrand_code_fr(String brand_code_fr) {
        this.brand_code_fr = brand_code_fr;
    }

    public String getbrand_code_to() {
        return brand_code_to;
    }
    public void setbrand_code_to(String brand_code_to) {
        this.brand_code_to = brand_code_to;
    }

    public String getcategory_code_fr() {
        return category_code_fr;
    }
    public void setcategory_code_fr(String category_code_fr) {
        this.category_code_fr = category_code_fr;
    }

    public String getcategory_code_to() {
        return category_code_to;
    }
    public void setcategory_code_to(String category_code_to) {
        this.category_code_to = category_code_to;
    }

    public String getwarehouse_code() {
        return warehouse_code;
    }
    public void setwarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public String getemployee() {
        return employee;
    }
    public void setemployee(String employee) {
        this.employee = employee;
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

    public Integer gettotal_so_qty() {
        return total_so_qty;
    }
    public void settotal_so_qty(Integer total_so_qty) {
        this.total_so_qty = total_so_qty;
    }

    public Integer gettotal_adm_qty() {
        return total_adm_qty;
    }
    public void settotal_adm_qty(Integer total_adm_qty) {
        this.total_adm_qty = total_adm_qty;
    }

    public Integer getadjustment_no() {
        return adjustment_no;
    }
    public void setadjustment_no(Integer adjustment_no) {
        this.adjustment_no = adjustment_no;
    }

    public String getadjustment_date() {
        return adjustment_date;
    }
    public void setadjustment_date(String adjustment_date) {
        this.adjustment_date = adjustment_date;
    }

    public String getadjustment_user() {
        return adjustment_user;
    }
    public void setadjustment_user(String adjustment_user) {
        this.adjustment_user = adjustment_user;
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
