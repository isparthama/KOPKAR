/*
 * To change this gl_rab, choose Tools | Templates
 * and open the gl_rab in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_rabcls implements Serializable {

    private String kode_rab="";
    private String nama_rab;
    private String rab_debet;
    private String rab_kredit;
    private String aktif="Y";
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_rabcls() {
    }
    
    public String getkode_rab() {
        return kode_rab;
    }
    public void setkode_rab(String kode_rab) {
        this.kode_rab = kode_rab;
    }

    public String getnama_rab() {
        return nama_rab;
    }
    public void setnama_rab(String nama_rab) {
        this.nama_rab = nama_rab;
    }

    public String getrab_debet() {
        return rab_debet;
    }
    public void setrab_debet(String rab_debet) {
        this.rab_debet = rab_debet;
    }

    public String getrab_kredit() {
        return rab_kredit;
    }
    public void setrab_kredit(String rab_kredit) {
        this.rab_kredit = rab_kredit;
    }

    public String getaktif() {
        return aktif;
    }
    public void setaktif(String aktif) {
        this.aktif = aktif;
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
