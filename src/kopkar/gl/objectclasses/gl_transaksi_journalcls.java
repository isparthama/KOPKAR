/*
 * To change this gl_transaksi_journal, choose Tools | Templates
 * and open the gl_transaksi_journal in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_transaksi_journalcls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String document_date;
    private String complete_status="N";
    private Integer yop=0;
    private Integer mop=0;
    private String kode_gde;
    private String reference;
    private String dscription;
    private Double debit_amount=new Double(0);
    private Double credit_amount=new Double(0);
    private String process_sts="N";
    private String process_date;
    private String process_user;
    private Integer dayseqno=0;
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;

    public gl_transaksi_journalcls() {
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

    public String getdocument_date() {
        return document_date;
    }
    public void setdocument_date(String document_date) {
        this.document_date = document_date;
    }

    public String getcomplete_status() {
        return complete_status;
    }
    public void setcomplete_status(String complete_status) {
        this.complete_status = complete_status;
    }

    public Integer getyop() {
        return yop;
    }
    public void setyop(Integer yop) {
        this.yop = yop;
    }

    public Integer getmop() {
        return mop;
    }
    public void setmop(Integer mop) {
        this.mop = mop;
    }

    public String getkode_gde() {
        return kode_gde;
    }
    public void setkode_gde(String kode_gde) {
        this.kode_gde = kode_gde;
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

    public Double getdebit_amount() {
        return debit_amount;
    }
    public void setdebit_amount(Double debit_amount) {
        this.debit_amount = debit_amount;
    }

    public Double getcredit_amount() {
        return credit_amount;
    }
    public void setcredit_amount(Double credit_amount) {
        this.credit_amount = credit_amount;
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
