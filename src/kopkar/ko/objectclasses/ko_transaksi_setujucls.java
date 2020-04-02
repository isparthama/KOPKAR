/*
 * To change this ko_transaksi_setuju, choose Tools | Templates
 * and open the ko_transaksi_setuju in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;
import utils.GlobalUtils;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_setujucls implements Serializable {

    private Integer docentry;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private Integer yop;
    private Integer mop=0;
    private Integer dop_tagih=0;
    private String tgl_cair=GlobalUtils.formatDate(GlobalUtils.getCurrentDate(),"yyyy-MM-dd");
    private String reference;
    private String dscription;
    private String member_number;
    private String reference_number;
    private String last_payment_number;
    private String masa_kerja;
    private String kode_pinjaman;
    private Double jumlah_pinjaman;
    private Double jumlah_bunga;
    private Double jumlah_pokok_bunga;
    private Double suku_bunga;
    private String hitung_bunga="1";
    private Integer jangka_waktu;
    private String satuan_waktu="1";
    private Double jumlah_angsuran;
    private Integer yop_start;
    private Integer mop_start=0;
    private String auto_sts="N";
    private Integer angsuranke;
    private Integer sisa_angsuranke;
    private Double total_angsuran=new Double(0);
    private Double total_pokok=new Double(0);
    private Double total_bunga=new Double(0);
    private Double total_potongan=new Double(0);
    private Double total_pokok_bunga_akhir=new Double(0);
    private Double total_pokok_akhir=new Double(0);
    private Double total_bunga_akhir=new Double(0);
    private String angsur_sts;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_setujucls() {
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

    public String getlast_payment_number() {
        return last_payment_number;
    }
    public void setlast_payment_number(String last_payment_number) {
        this.last_payment_number = last_payment_number;
    }

    public String getmasa_kerja() {
        return masa_kerja;
    }
    public void setmasa_kerja(String masa_kerja) {
        this.masa_kerja = masa_kerja;
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

    public Double getjumlah_bunga() {
        return jumlah_bunga;
    }
    public void setjumlah_bunga(Double jumlah_bunga) {
        this.jumlah_bunga = jumlah_bunga;
    }

    public Double getjumlah_pokok_bunga() {
        return jumlah_pokok_bunga;
    }
    public void setjumlah_pokok_bunga(Double jumlah_pokok_bunga) {
        this.jumlah_pokok_bunga = jumlah_pokok_bunga;
    }

    public Double getsuku_bunga() {
        return suku_bunga;
    }
    public void setsuku_bunga(Double suku_bunga) {
        this.suku_bunga = suku_bunga;
    }

    public String gethitung_bunga() {
        return hitung_bunga;
    }
    public void sethitung_bunga(String hitung_bunga) {
        this.hitung_bunga = hitung_bunga;
    }

    public Integer getjangka_waktu() {
        return jangka_waktu;
    }
    public void setjangka_waktu(Integer jangka_waktu) {
        this.jangka_waktu = jangka_waktu;
    }

    public String getsatuan_waktu() {
        return satuan_waktu;
    }
    public void setsatuan_waktu(String satuan_waktu) {
        this.satuan_waktu = satuan_waktu;
    }

    public Double getjumlah_angsuran() {
        return jumlah_angsuran;
    }
    public void setjumlah_angsuran(Double jumlah_angsuran) {
        this.jumlah_angsuran = jumlah_angsuran;
    }

    public Integer getyop_start() {
        return yop_start;
    }
    public void setyop_start(Integer yop_start) {
        this.yop_start = yop_start;
    }

    public Integer getmop_start() {
        return mop_start;
    }
    public void setmop_start(Integer mop_start) {
        this.mop_start = mop_start;
    }

    public String getauto_sts() {
        return auto_sts;
    }
    public void setauto_sts(String auto_sts) {
        this.auto_sts = auto_sts;
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

    public Double gettotal_angsuran() {
        return total_angsuran;
    }
    public void settotal_angsuran(Double total_angsuran) {
        this.total_angsuran = total_angsuran;
    }

    public Double gettotal_pokok() {
        return total_pokok;
    }
    public void settotal_pokok(Double total_pokok) {
        this.total_pokok = total_pokok;
    }

    public Double gettotal_bunga() {
        return total_bunga;
    }
    public void settotal_bunga(Double total_bunga) {
        this.total_bunga = total_bunga;
    }

    public Double gettotal_potongan() {
        return total_potongan;
    }
    public void settotal_potongan(Double total_potongan) {
        this.total_potongan = total_potongan;
    }

    public Double gettotal_pokok_bunga_akhir() {
        return total_pokok_bunga_akhir;
    }
    public void settotal_pokok_bunga_akhir(Double total_pokok_bunga_akhir) {
        this.total_pokok_bunga_akhir = total_pokok_bunga_akhir;
    }

    public Double gettotal_pokok_akhir() {
        return total_pokok_akhir;
    }
    public void settotal_pokok_akhir(Double total_pokok_akhir) {
        this.total_pokok_akhir = total_pokok_akhir;
    }

    public Double gettotal_bunga_akhir() {
        return total_bunga_akhir;
    }
    public void settotal_bunga_akhir(Double total_bunga_akhir) {
        this.total_bunga_akhir = total_bunga_akhir;
    }

    public String getangsur_sts() {
        return angsur_sts;
    }
    public void setangsur_sts(String angsur_sts) {
        this.angsur_sts = angsur_sts;
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

    public String gettgl_cair() {
        return tgl_cair;
    }

    public void settgl_cair(String tgl_cair) {
        this.tgl_cair = tgl_cair;
    }


}
