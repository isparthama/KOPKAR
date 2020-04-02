/*
 * To change this ar_pos_open, choose Tools | Templates
 * and open the ar_pos_open in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ar_pos_opencls implements Serializable {

    private Integer docentry;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private String dscription;
    private String counter_number;
    private String chasier_code;
    private Double cash_register_modal;
    private Integer baseentry;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String process_sts;
    private String process_date;
    private String process_user;
    private Integer dayseqno;

    public ar_pos_opencls() {
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

    public String getdscription() {
        return dscription;
    }
    public void setdscription(String dscription) {
        this.dscription = dscription;
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

    public Double getcash_register_modal() {
        return cash_register_modal;
    }
    public void setcash_register_modal(Double cash_register_modal) {
        this.cash_register_modal = cash_register_modal;
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
