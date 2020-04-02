/*
 * To change this ko_departemen, choose Tools | Templates
 * and open the ko_departemen in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_departemencls implements Serializable {

    private Integer id;
    private String kode_departemen;
    private String nama_departemen;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_departemencls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getkode_departemen() {
        return kode_departemen;
    }
    public void setkode_departemen(String kode_departemen) {
        this.kode_departemen = kode_departemen;
    }

    public String getnama_departemen() {
        return nama_departemen;
    }
    public void setnama_departemen(String nama_departemen) {
        this.nama_departemen = nama_departemen;
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
