/*
 * To change this ko_transaksi_bayar_toko, choose Tools | Templates
 * and open the ko_transaksi_bayar_toko in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_bayar_tokocls implements Serializable {

    private Integer docentry;
    private String document_number;
    private String document_status;
    private String complete_status;
    private String document_date;
    private Integer yop;
    private Integer mop;
    private String member_number;
    private String reference;
    private String dscription;
    private Double total_tagihan;
    private Double terima_bayar;
    private Double total_bayar;
    private Double sisa_tagihan;
    private Double sisa_bayar;
    private String monthly_sts;
    private Integer monthly_no;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String process_sts;
    private String process_date;
    private String process_user;
    private Integer dayseqno;
    private String cash_sts;

    public ko_transaksi_bayar_tokocls() {
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

    public String getmember_number() {
        return member_number;
    }
    public void setmember_number(String member_number) {
        this.member_number = member_number;
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

    public Double gettotal_tagihan() {
        return total_tagihan;
    }
    public void settotal_tagihan(Double total_tagihan) {
        this.total_tagihan = total_tagihan;
    }

    public Double getterima_bayar() {
        return terima_bayar;
    }
    public void setterima_bayar(Double terima_bayar) {
        this.terima_bayar = terima_bayar;
    }

    public Double gettotal_bayar() {
        return total_bayar;
    }
    public void settotal_bayar(Double total_bayar) {
        this.total_bayar = total_bayar;
    }

    public Double getsisa_tagihan() {
        return sisa_tagihan;
    }
    public void setsisa_tagihan(Double sisa_tagihan) {
        this.sisa_tagihan = sisa_tagihan;
    }

    public Double getsisa_bayar() {
        return sisa_bayar;
    }
    public void setsisa_bayar(Double sisa_bayar) {
        this.sisa_bayar = sisa_bayar;
    }

    public String getmonthly_sts() {
        return monthly_sts;
    }
    public void setmonthly_sts(String monthly_sts) {
        this.monthly_sts = monthly_sts;
    }

    public Integer getmonthly_no() {
        return monthly_no;
    }
    public void setmonthly_no(Integer monthly_no) {
        this.monthly_no = monthly_no;
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

    public String getcash_sts() {
        return cash_sts;
    }
    public void setcash_sts(String cash_sts) {
        this.cash_sts = cash_sts;
    }


}
