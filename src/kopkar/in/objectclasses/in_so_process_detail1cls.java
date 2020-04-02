/*
 * To change this in_so_process_detail1, choose Tools | Templates
 * and open the in_so_process_detail1 in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_so_process_detail1cls implements Serializable {

    private Integer docentry;
    private Integer line_number;
    private String document_number;
    private String document_date;
    private String reference;
    private String dscription;
    private Integer total_so_qty;
    private Integer total_adm_qty;
    private String adjustment_no;
    private String adjustment_status;
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;

    public in_so_process_detail1cls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public Integer getline_number() {
        return line_number;
    }
    public void setline_number(Integer line_number) {
        this.line_number = line_number;
    }

    public String getdocument_number() {
        return document_number;
    }
    public void setdocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getdocument_date() {
        return document_date;
    }
    public void setdocument_date(String document_date) {
        this.document_date = document_date;
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

    public String getadjustment_no() {
        return adjustment_no;
    }
    public void setadjustment_no(String adjustment_no) {
        this.adjustment_no = adjustment_no;
    }

    public String getadjustment_status() {
        return adjustment_status;
    }
    public void setadjustment_status(String adjustment_status) {
        this.adjustment_status = adjustment_status;
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
