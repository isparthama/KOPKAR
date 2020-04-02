/*
 * To change this ko_transaksi_mohon_detail1, choose Tools | Templates
 * and open the ko_transaksi_mohon_detail1 in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_mohon_detail1cls implements Serializable {

    private Integer docentry;
    private Integer line_number;
    private String kode_pinjaman_tipe;
    private Double jumlah_pinjaman;
    private Double sisa_pinjaman;
    private Double jumlah_angsuran;
    private Integer sisa_angsuran;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_mohon_detail1cls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public Integer getline_number() {
        return line_number;
    }
    public void setline_number(Integer line_number) {
        this.line_number = line_number;
    }

    public String getkode_pinjaman_tipe() {
        return kode_pinjaman_tipe;
    }
    public void setkode_pinjaman_tipe(String kode_pinjaman_tipe) {
        this.kode_pinjaman_tipe = kode_pinjaman_tipe;
    }

    public Double getjumlah_pinjaman() {
        return jumlah_pinjaman;
    }
    public void setjumlah_pinjaman(Double jumlah_pinjaman) {
        this.jumlah_pinjaman = jumlah_pinjaman;
    }

    public Double getsisa_pinjaman() {
        return sisa_pinjaman;
    }
    public void setsisa_pinjaman(Double sisa_pinjaman) {
        this.sisa_pinjaman = sisa_pinjaman;
    }

    public Double getjumlah_angsuran() {
        return jumlah_angsuran;
    }
    public void setjumlah_angsuran(Double jumlah_angsuran) {
        this.jumlah_angsuran = jumlah_angsuran;
    }

    public Integer getsisa_angsuran() {
        return sisa_angsuran;
    }
    public void setsisa_angsuran(Integer sisa_angsuran) {
        this.sisa_angsuran = sisa_angsuran;
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
