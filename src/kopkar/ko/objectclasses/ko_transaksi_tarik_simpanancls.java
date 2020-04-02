/*
 * To change this ko_transaksi_tarik_simpanan, choose Tools | Templates
 * and open the ko_transaksi_tarik_simpanan in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_tarik_simpanancls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private String member_number;
    private String reference;
    private String dscription;
    private Double simpanan_wajib_awal=new Double(0);
    private Double simpanan_pokok_awal=new Double(0);
    private Double simpanan_sukarela_awal=new Double(0);
    private Double simpanan_wajib=new Double(0);
    private Double simpanan_pokok=new Double(0);
    private Double simpanan_sukarela=new Double(0);
    private Double simpanan_khusus=new Double(0);
    private Double simpanan_wajib_akhir=new Double(0);
    private Double simpanan_pokok_akhir=new Double(0);
    private Double simpanan_sukarela_akhir=new Double(0);
    private Double simpanan_khusus_akhir=new Double(0);
    private Double simpanan_khusus_awal=new Double(0);
    private String manual_sts="Y";
    private String registrasi_sts="Y";
    private String tunai_sts="Y";
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_tarik_simpanancls() {
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

    public Double getsimpanan_wajib_awal() {
        return simpanan_wajib_awal;
    }
    public void setsimpanan_wajib_awal(Double simpanan_wajib_awal) {
        this.simpanan_wajib_awal = simpanan_wajib_awal;
    }

    public Double getsimpanan_pokok_awal() {
        return simpanan_pokok_awal;
    }
    public void setsimpanan_pokok_awal(Double simpanan_pokok_awal) {
        this.simpanan_pokok_awal = simpanan_pokok_awal;
    }

    public Double getsimpanan_sukarela_awal() {
        return simpanan_sukarela_awal;
    }
    public void setsimpanan_sukarela_awal(Double simpanan_sukarela_awal) {
        this.simpanan_sukarela_awal = simpanan_sukarela_awal;
    }

    public Double getsimpanan_wajib() {
        return simpanan_wajib;
    }
    public void setsimpanan_wajib(Double simpanan_wajib) {
        this.simpanan_wajib = simpanan_wajib;
    }

    public Double getsimpanan_pokok() {
        return simpanan_pokok;
    }
    public void setsimpanan_pokok(Double simpanan_pokok) {
        this.simpanan_pokok = simpanan_pokok;
    }

    public Double getsimpanan_sukarela() {
        return simpanan_sukarela;
    }
    public void setsimpanan_sukarela(Double simpanan_sukarela) {
        this.simpanan_sukarela = simpanan_sukarela;
    }

    public Double getsimpanan_khusus() {
        return simpanan_khusus;
    }
    public void setsimpanan_khusus(Double simpanan_khusus) {
        this.simpanan_khusus = simpanan_khusus;
    }

    public Double getsimpanan_wajib_akhir() {
        return simpanan_wajib_akhir;
    }
    public void setsimpanan_wajib_akhir(Double simpanan_wajib_akhir) {
        this.simpanan_wajib_akhir = simpanan_wajib_akhir;
    }

    public Double getsimpanan_pokok_akhir() {
        return simpanan_pokok_akhir;
    }
    public void setsimpanan_pokok_akhir(Double simpanan_pokok_akhir) {
        this.simpanan_pokok_akhir = simpanan_pokok_akhir;
    }

    public Double getsimpanan_sukarela_akhir() {
        return simpanan_sukarela_akhir;
    }
    public void setsimpanan_sukarela_akhir(Double simpanan_sukarela_akhir) {
        this.simpanan_sukarela_akhir = simpanan_sukarela_akhir;
    }

    public Double getsimpanan_khusus_akhir() {
        return simpanan_khusus_akhir;
    }
    public void setsimpanan_khusus_akhir(Double simpanan_khusus_akhir) {
        this.simpanan_khusus_akhir = simpanan_khusus_akhir;
    }

    public Double getsimpanan_khusus_awal() {
        return simpanan_khusus_awal;
    }
    public void setsimpanan_khusus_awal(Double simpanan_khusus_awal) {
        this.simpanan_khusus_awal = simpanan_khusus_awal;
    }

    public String getmanual_sts() {
        return manual_sts;
    }
    public void setmanual_sts(String manual_sts) {
        this.manual_sts = manual_sts;
    }

    public String getregistrasi_sts() {
        return registrasi_sts;
    }
    public void setregistrasi_sts(String registrasi_sts) {
        this.registrasi_sts = registrasi_sts;
    }

    public String gettunai_sts() {
        return tunai_sts;
    }
    public void settunai_sts(String tunai_sts) {
        this.tunai_sts = tunai_sts;
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
