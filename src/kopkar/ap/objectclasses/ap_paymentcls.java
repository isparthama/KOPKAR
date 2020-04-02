/*
 * To change this ap_payment, choose Tools | Templates
 * and open the ap_payment in the editor.
 */

package kopkar.ap.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ap_paymentcls implements Serializable {

    private Integer batchentry=0;
    private String document_number="";
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private String reference;
    private String dscription;
    private Double total_entry=new Double(0);
    private Double total_payment=new Double(0);
    private String entrydate;
    private String auditdate;
    private Integer objtype=0;
    private String audituser;
    private String process_sts;
    private String process_date;
    private String process_user;
    private Integer dayseqno=0;

    public ap_paymentcls() {
    }
    
    public Integer getbatchentry() {
        return batchentry;
    }
    public void setbatchentry(Integer batchentry) {
        this.batchentry = batchentry;
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

    public Double gettotal_entry() {
        return total_entry;
    }
    public void settotal_entry(Double total_entry) {
        this.total_entry = total_entry;
    }

    public Double gettotal_payment() {
        return total_payment;
    }
    public void settotal_payment(Double total_payment) {
        this.total_payment = total_payment;
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

    public String getprocess_sts() {
        return process_sts;
    }
    public void setprocess_sts(String process_sts) {
        this.process_sts = process_sts;
    }

    public String getprocess_date() {
        return process_date;
    }
    public void setprocess_date(String process_date) {
        this.process_date = process_date;
    }

    public String getprocess_user() {
        return process_user;
    }
    public void setprocess_user(String process_user) {
        this.process_user = process_user;
    }

    public Integer getdayseqno() {
        return dayseqno;
    }
    public void setdayseqno(Integer dayseqno) {
        this.dayseqno = dayseqno;
    }


}
