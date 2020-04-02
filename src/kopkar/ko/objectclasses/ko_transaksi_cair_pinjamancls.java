/*
 * To change this ko_transaksi_cair_pinjaman, choose Tools | Templates
 * and open the ko_transaksi_cair_pinjaman in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_cair_pinjamancls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private Integer yop=0;
    private Integer mop=0;
    private String reference;
    private String dscription;
    private String member_number;
    private String reference_number;
    private String kode_pinjaman;
    private Double jumlah_pinjaman=new Double(0);
    private Double jumlah_cair=new Double(0);
    private String cara_bayar="1";
    private String bank_code;
    private String bank_branch;
    private String bank_account;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_cair_pinjamancls() {
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

    public String getmember_number() {
        return member_number;
    }
    public void setmember_number(String member_number) {
        this.member_number = member_number;
    }

    public String getreference_number() {
        return reference_number;
    }
    public void setreference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public String getkode_pinjaman() {
        return kode_pinjaman;
    }
    public void setkode_pinjaman(String kode_pinjaman) {
        this.kode_pinjaman = kode_pinjaman;
    }

    public Double getjumlah_pinjaman() {
        return jumlah_pinjaman;
    }
    public void setjumlah_pinjaman(Double jumlah_pinjaman) {
        this.jumlah_pinjaman = jumlah_pinjaman;
    }

    public Double getjumlah_cair() {
        return jumlah_cair;
    }
    public void setjumlah_cair(Double jumlah_cair) {
        this.jumlah_cair = jumlah_cair;
    }

    public String getcara_bayar() {
        return cara_bayar;
    }
    public void setcara_bayar(String cara_bayar) {
        this.cara_bayar = cara_bayar;
    }

    public String getbank_code() {
        return bank_code;
    }
    public void setbank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getbank_branch() {
        return bank_branch;
    }
    public void setbank_branch(String bank_branch) {
        this.bank_branch = bank_branch;
    }

    public String getbank_account() {
        return bank_account;
    }
    public void setbank_account(String bank_account) {
        this.bank_account = bank_account;
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


}
