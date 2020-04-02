/*
 * To change this ko_transaksi_mohon, choose Tools | Templates
 * and open the ko_transaksi_mohon in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_mohoncls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private Integer yop=0;
    private Integer mop=0;
    private String tgl_cair;
    private Integer dop_tagih=0;
    private String reference;
    private String dscription;
    private String member_number;
    private String masa_kerja;
    private String kode_pinjaman;
    private Double jumlah_pinjaman;
    private Double suku_bunga;
    private String hitung_bunga;
    private Integer jangka_waktu;
    private String satuan_waktu;
    private Double jumlah_angsuran;
    private Integer yop_start;
    private Integer mop_start;
    private String auto_sts;
    private Double simpanan_wajib;
    private Double simpanan_pokok;
    private Double simpanan_sukarela;
    private Double simpanan_khusus;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_mohoncls() {
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

    /**
     * @return the tgl_cair
     */
    public String gettgl_cair() {
        return tgl_cair;
    }

    /**
     * @param tgl_cair the tgl_cair to set
     */
    public void settgl_cair(String tgl_cair) {
        this.tgl_cair = tgl_cair;
    }


}
