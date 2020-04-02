/*
 * To change this ko_anggota_potongan_by_periode, choose Tools | Templates
 * and open the ko_anggota_potongan_by_periode in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ko_anggota_potongan_by_periodecls implements Serializable {

    private Integer id;
    private Integer yop;
    private Integer mop;
    private String member_number;
    private Double simpanan_wajib;
    private Double simpanan_pokok;
    private Double simpanan_sukarela;
    private Double simpanan_khusus;
    private Double pinjaman;
    private Double toko;
    private Double sisa_tagihan_bln_seb;
    private Integer monthly_no;
    private String monthly_auditdate;
    private String monthly_audituser;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private Double total_tagihan;
    private Double bayar_simpanan;
    private Double bayar_pinjaman;
    private Double bayar_toko;
    private Double bayar_tagihan_sebelum;
    private Double total_bayar;
    private Double sisa_simpanan;
    private Double sisa_pinjaman;
    private Double sisa_toko;
    private Double sisa_tagihan_sebelum;
    private Double sisa_tagihan;
    private String tagihan_sts;
    private Double pendapatan_bunga;
    private Double pendapatan_toko;
    private String monthly_sts;

    public ko_anggota_potongan_by_periodecls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
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

    public Double getpinjaman() {
        return pinjaman;
    }
    public void setpinjaman(Double pinjaman) {
        this.pinjaman = pinjaman;
    }

    public Double gettoko() {
        return toko;
    }
    public void settoko(Double toko) {
        this.toko = toko;
    }

    public Double getsisa_tagihan_bln_seb() {
        return sisa_tagihan_bln_seb;
    }
    public void setsisa_tagihan_bln_seb(Double sisa_tagihan_bln_seb) {
        this.sisa_tagihan_bln_seb = sisa_tagihan_bln_seb;
    }

    public Integer getmonthly_no() {
        return monthly_no;
    }
    public void setmonthly_no(Integer monthly_no) {
        this.monthly_no = monthly_no;
    }

    public String getmonthly_auditdate() {
        return monthly_auditdate;
    }
    public void setmonthly_auditdate(String monthly_auditdate) {
        this.monthly_auditdate = monthly_auditdate;
    }

    public String getmonthly_audituser() {
        return monthly_audituser;
    }
    public void setmonthly_audituser(String monthly_audituser) {
        this.monthly_audituser = monthly_audituser;
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

    public Double gettotal_tagihan() {
        return total_tagihan;
    }
    public void settotal_tagihan(Double total_tagihan) {
        this.total_tagihan = total_tagihan;
    }

    public Double getbayar_simpanan() {
        return bayar_simpanan;
    }
    public void setbayar_simpanan(Double bayar_simpanan) {
        this.bayar_simpanan = bayar_simpanan;
    }

    public Double getbayar_pinjaman() {
        return bayar_pinjaman;
    }
    public void setbayar_pinjaman(Double bayar_pinjaman) {
        this.bayar_pinjaman = bayar_pinjaman;
    }

    public Double getbayar_toko() {
        return bayar_toko;
    }
    public void setbayar_toko(Double bayar_toko) {
        this.bayar_toko = bayar_toko;
    }

    public Double getbayar_tagihan_sebelum() {
        return bayar_tagihan_sebelum;
    }
    public void setbayar_tagihan_sebelum(Double bayar_tagihan_sebelum) {
        this.bayar_tagihan_sebelum = bayar_tagihan_sebelum;
    }

    public Double gettotal_bayar() {
        return total_bayar;
    }
    public void settotal_bayar(Double total_bayar) {
        this.total_bayar = total_bayar;
    }

    public Double getsisa_simpanan() {
        return sisa_simpanan;
    }
    public void setsisa_simpanan(Double sisa_simpanan) {
        this.sisa_simpanan = sisa_simpanan;
    }

    public Double getsisa_pinjaman() {
        return sisa_pinjaman;
    }
    public void setsisa_pinjaman(Double sisa_pinjaman) {
        this.sisa_pinjaman = sisa_pinjaman;
    }

    public Double getsisa_toko() {
        return sisa_toko;
    }
    public void setsisa_toko(Double sisa_toko) {
        this.sisa_toko = sisa_toko;
    }

    public Double getsisa_tagihan_sebelum() {
        return sisa_tagihan_sebelum;
    }
    public void setsisa_tagihan_sebelum(Double sisa_tagihan_sebelum) {
        this.sisa_tagihan_sebelum = sisa_tagihan_sebelum;
    }

    public Double getsisa_tagihan() {
        return sisa_tagihan;
    }
    public void setsisa_tagihan(Double sisa_tagihan) {
        this.sisa_tagihan = sisa_tagihan;
    }

    public String gettagihan_sts() {
        return tagihan_sts;
    }
    public void settagihan_sts(String tagihan_sts) {
        this.tagihan_sts = tagihan_sts;
    }

    public Double getpendapatan_bunga() {
        return pendapatan_bunga;
    }
    public void setpendapatan_bunga(Double pendapatan_bunga) {
        this.pendapatan_bunga = pendapatan_bunga;
    }

    public Double getpendapatan_toko() {
        return pendapatan_toko;
    }
    public void setpendapatan_toko(Double pendapatan_toko) {
        this.pendapatan_toko = pendapatan_toko;
    }

    public String getmonthly_sts() {
        return monthly_sts;
    }
    public void setmonthly_sts(String monthly_sts) {
        this.monthly_sts = monthly_sts;
    }


}
