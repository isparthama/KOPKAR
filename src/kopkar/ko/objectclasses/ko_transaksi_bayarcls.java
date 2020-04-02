/*
 * To change this ko_transaksi_bayar, choose Tools | Templates
 * and open the ko_transaksi_bayar in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_bayarcls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private Integer yop=0;
    private Integer mop=0;
    private Integer dop_tagih=0;
    private String reference;
    private String dscription;
    private String member_number;
    private String reference_number;
    private String kode_pinjaman;
    private Double jumlah_angsuranke=new Double(0);
    private String pelunasan="N";
    private String auto_sts="N";
    private String cash_sts="Y";
    private Double bayar_angsuran=new Double(0);
    private Double bayar_potongan=new Double(0);
    private Integer angsuranke;
    private Integer sisa_angsuranke;
    private Double saldo_pokok_bunga_awal=new Double(0);
    private Double saldo_pokok_awal=new Double(0);
    private Double saldo_bunga_awal=new Double(0);
    private Double angsuran_pokok_bunga=new Double(0);
    private Double angsuran_pokok=new Double(0);
    private Double angsuran_bunga=new Double(0);
    private Double saldo_pokok_bunga_akhir=new Double(0);
    private Double saldo_pokok_akhir=new Double(0);
    private Double saldo_bunga_akhir=new Double(0);
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_bayarcls() {
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

    public Double getjumlah_angsuranke() {
        return jumlah_angsuranke;
    }
    public void setjumlah_angsuranke(Double jumlah_angsuranke) {
        this.jumlah_angsuranke = jumlah_angsuranke;
    }

    public String getpelunasan() {
        return pelunasan;
    }
    public void setpelunasan(String pelunasan) {
        this.pelunasan = pelunasan;
    }

    public String getauto_sts() {
        return auto_sts;
    }
    public void setauto_sts(String auto_sts) {
        this.auto_sts = auto_sts;
    }

    public String getcash_sts() {
        return cash_sts;
    }
    public void setcash_sts(String cash_sts) {
        this.cash_sts = cash_sts;
    }

    public Double getbayar_angsuran() {
        return bayar_angsuran;
    }
    public void setbayar_angsuran(Double bayar_angsuran) {
        this.bayar_angsuran = bayar_angsuran;
    }

    public Double getbayar_potongan() {
        return bayar_potongan;
    }
    public void setbayar_potongan(Double bayar_potongan) {
        this.bayar_potongan = bayar_potongan;
    }

    public Integer getangsuranke() {
        return angsuranke;
    }
    public void setangsuranke(Integer angsuranke) {
        this.angsuranke = angsuranke;
    }

    public Integer getsisa_angsuranke() {
        return sisa_angsuranke;
    }
    public void setsisa_angsuranke(Integer sisa_angsuranke) {
        this.sisa_angsuranke = sisa_angsuranke;
    }

    public Double getsaldo_pokok_bunga_awal() {
        return saldo_pokok_bunga_awal;
    }
    public void setsaldo_pokok_bunga_awal(Double saldo_pokok_bunga_awal) {
        this.saldo_pokok_bunga_awal = saldo_pokok_bunga_awal;
    }

    public Double getsaldo_pokok_awal() {
        return saldo_pokok_awal;
    }
    public void setsaldo_pokok_awal(Double saldo_pokok_awal) {
        this.saldo_pokok_awal = saldo_pokok_awal;
    }

    public Double getsaldo_bunga_awal() {
        return saldo_bunga_awal;
    }
    public void setsaldo_bunga_awal(Double saldo_bunga_awal) {
        this.saldo_bunga_awal = saldo_bunga_awal;
    }

    public Double getangsuran_pokok_bunga() {
        return angsuran_pokok_bunga;
    }
    public void setangsuran_pokok_bunga(Double angsuran_pokok_bunga) {
        this.angsuran_pokok_bunga = angsuran_pokok_bunga;
    }

    public Double getangsuran_pokok() {
        return angsuran_pokok;
    }
    public void setangsuran_pokok(Double angsuran_pokok) {
        this.angsuran_pokok = angsuran_pokok;
    }

    public Double getangsuran_bunga() {
        return angsuran_bunga;
    }
    public void setangsuran_bunga(Double angsuran_bunga) {
        this.angsuran_bunga = angsuran_bunga;
    }

    public Double getsaldo_pokok_bunga_akhir() {
        return saldo_pokok_bunga_akhir;
    }
    public void setsaldo_pokok_bunga_akhir(Double saldo_pokok_bunga_akhir) {
        this.saldo_pokok_bunga_akhir = saldo_pokok_bunga_akhir;
    }

    public Double getsaldo_pokok_akhir() {
        return saldo_pokok_akhir;
    }
    public void setsaldo_pokok_akhir(Double saldo_pokok_akhir) {
        this.saldo_pokok_akhir = saldo_pokok_akhir;
    }

    public Double getsaldo_bunga_akhir() {
        return saldo_bunga_akhir;
    }
    public void setsaldo_bunga_akhir(Double saldo_bunga_akhir) {
        this.saldo_bunga_akhir = saldo_bunga_akhir;
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

    public Integer getdop_tagih() {
        return dop_tagih;
    }

    public void setdop_tagih(Integer dop_tagih) {
        this.dop_tagih = dop_tagih;
    }


}
