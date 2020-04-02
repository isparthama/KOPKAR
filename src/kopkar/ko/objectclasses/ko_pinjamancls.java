/*
 * To change this ko_pinjaman, choose Tools | Templates
 * and open the ko_pinjaman in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_pinjamancls implements Serializable {

    private Integer id;
    private String kode_pinjaman;
    private String nama_pinjaman;
    private String aktif_sts;
    private Double bunga;
    private String tipe_bunga;
    private Integer jumlah_cicilan;
    private String cara_bayar;
    private String kode_pinjaman_tipe;
    private String entrydate;
    private String auditdate;
    private String audituser;

    String accset_code="";

    public ko_pinjamancls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getkode_pinjaman() {
        return kode_pinjaman;
    }
    public void setkode_pinjaman(String kode_pinjaman) {
        this.kode_pinjaman = kode_pinjaman;
    }

    public String getnama_pinjaman() {
        return nama_pinjaman;
    }
    public void setnama_pinjaman(String nama_pinjaman) {
        this.nama_pinjaman = nama_pinjaman;
    }

    public String getaktif_sts() {
        return aktif_sts;
    }
    public void setaktif_sts(String aktif_sts) {
        this.aktif_sts = aktif_sts;
    }

    public Double getbunga() {
        return bunga;
    }
    public void setbunga(Double bunga) {
        this.bunga = bunga;
    }

    public String gettipe_bunga() {
        return tipe_bunga;
    }
    public void settipe_bunga(String tipe_bunga) {
        this.tipe_bunga = tipe_bunga;
    }

    public Integer getjumlah_cicilan() {
        return jumlah_cicilan;
    }
    public void setjumlah_cicilan(Integer jumlah_cicilan) {
        this.jumlah_cicilan = jumlah_cicilan;
    }

    public String getcara_bayar() {
        return cara_bayar;
    }
    public void setcara_bayar(String cara_bayar) {
        this.cara_bayar = cara_bayar;
    }

    public String getkode_pinjaman_tipe() {
        return kode_pinjaman_tipe;
    }
    public void setkode_pinjaman_tipe(String kode_pinjaman_tipe) {
        this.kode_pinjaman_tipe = kode_pinjaman_tipe;
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

    public String getaccset_code() { return accset_code;}
    public void setaccset_code(String accset_code) { this.accset_code = accset_code;}

    
}
