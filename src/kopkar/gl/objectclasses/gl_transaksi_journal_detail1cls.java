/*
 * To change this gl_transaksi_journal_detail1, choose Tools | Templates
 * and open the gl_transaksi_journal_detail1 in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_transaksi_journal_detail1cls implements Serializable {

    private Integer docentry=0;
    private Integer linenum=0;
    private String kode_akun;
    private Double jumdebet=new Double(0);
    private Double jumkredit=new Double(0);
    private String referensi;
    private String keterangan;
    private String proses="N";
    private String basenoslip;
    private Integer baseentry=0;
    private Integer baseline=0;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_transaksi_journal_detail1cls() {
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

    public String getkode_akun() {
        return kode_akun;
    }
    public void setkode_akun(String kode_akun) {
        this.kode_akun = kode_akun;
    }

    public Double getjumdebet() {
        return jumdebet;
    }
    public void setjumdebet(Double jumdebet) {
        this.jumdebet = jumdebet;
    }

    public Double getjumkredit() {
        return jumkredit;
    }
    public void setjumkredit(Double jumkredit) {
        this.jumkredit = jumkredit;
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

    public String getproses() {
        return proses;
    }
    public void setproses(String proses) {
        this.proses = proses;
    }

    public String getbasenoslip() {
        return basenoslip;
    }
    public void setbasenoslip(String basenoslip) {
        this.basenoslip = basenoslip;
    }

    public Integer getbaseentry() {
        return baseentry;
    }
    public void setbaseentry(Integer baseentry) {
        this.baseentry = baseentry;
    }

    public Integer getbaseline() {
        return baseline;
    }
    public void setbaseline(Integer baseline) {
        this.baseline = baseline;
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
