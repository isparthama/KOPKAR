/*
 * To change this ap_payment_detail3, choose Tools | Templates
 * and open the ap_payment_detail3 in the editor.
 */

package kopkar.ap.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ap_payment_detail3cls implements Serializable {

    private Integer batchentry;
    private Integer docentry;
    private Integer linenum;
    private String document_number;
    private String document_status;
    private String complete_status;
    private String document_date;
    private String document_duedate;
    private String supplier_code;
    private Double total_aft_tax;
    private Double jumlah_bayar;
    private Double jumlah_cash;
    private Double jumlah_transfer;
    private Double jumlah_dncn;
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;
    private String process_sts;
    private String process_date;
    private String process_user;
    private Integer dayseqno;

    public ap_payment_detail3cls() {
    }
    
    public Integer getbatchentry() {
        return batchentry;
    }
    public void setbatchentry(Integer batchentry) {
        this.batchentry = batchentry;
    }

    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public Integer getlinenum() {
        return linenum;
    }
    public void setlinenum(Integer linenum) {
        this.linenum = linenum;
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

    public String getsupplier_code() {
        return supplier_code;
    }
    public void setsupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public Double gettotal_aft_tax() {
        return total_aft_tax;
    }
    public void settotal_aft_tax(Double total_aft_tax) {
        this.total_aft_tax = total_aft_tax;
    }

    public Double getjumlah_bayar() {
        return jumlah_bayar;
    }
    public void setjumlah_bayar(Double jumlah_bayar) {
        this.jumlah_bayar = jumlah_bayar;
    }

    public Double getjumlah_cash() {
        return jumlah_cash;
    }
    public void setjumlah_cash(Double jumlah_cash) {
        this.jumlah_cash = jumlah_cash;
    }

    public Double getjumlah_transfer() {
        return jumlah_transfer;
    }
    public void setjumlah_transfer(Double jumlah_transfer) {
        this.jumlah_transfer = jumlah_transfer;
    }

    public Double getjumlah_dncn() {
        return jumlah_dncn;
    }
    public void setjumlah_dncn(Double jumlah_dncn) {
        this.jumlah_dncn = jumlah_dncn;
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
