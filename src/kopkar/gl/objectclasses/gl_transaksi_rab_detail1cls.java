/*
 * To change this gl_transaksi_rab_detail1, choose Tools | Templates
 * and open the gl_transaksi_rab_detail1 in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;


/**
 *
 * @author mtgmis30
 */
public class gl_transaksi_rab_detail1cls implements Serializable {

    private Integer docentry=0;
    private Integer linenum=0;
    private String kode_rab;
    private Double jumlah=new Double(0);
    private String coa_debet;
    private String coa_kredit;
    private String referensi;
    private String keterangan;
    private String closed="N";
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_transaksi_rab_detail1cls() {
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

    public String getkode_rab() {
        return kode_rab;
    }
    public void setkode_rab(String kode_rab) {
        this.kode_rab = kode_rab;
    }

    public Double getjumlah() {
        return jumlah;
    }
    public void setjumlah(Double jumlah) {
        this.jumlah = jumlah;
    }

    public String getcoa_debet() {
        return coa_debet;
    }
    public void setcoa_debet(String coa_debet) {
        this.coa_debet = coa_debet;
    }

    public String getcoa_kredit() {
        return coa_kredit;
    }
    public void setcoa_kredit(String coa_kredit) {
        this.coa_kredit = coa_kredit;
    }

    public String getreferensi() {
        return referensi;
    }
    public void setreferensi(String referensi) {
        this.referensi = referensi;
    }

    public String getketerangan() {
        return keterangan;
    }
    public void setketerangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getclosed() {
        return closed;
    }
    public void setclosed(String closed) {
        this.closed = closed;
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
