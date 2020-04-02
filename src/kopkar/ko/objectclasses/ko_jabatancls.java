/*
 * To change this ko_jabatan, choose Tools | Templates
 * and open the ko_jabatan in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_jabatancls implements Serializable {

    private Integer id;
    private String kode_jabatan;
    private String nama_jabatan;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_jabatancls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getkode_jabatan() {
        return kode_jabatan;
    }
    public void setkode_jabatan(String kode_jabatan) {
        this.kode_jabatan = kode_jabatan;
    }

    public String getnama_jabatan() {
        return nama_jabatan;
    }
    public void setnama_jabatan(String nama_jabatan) {
        this.nama_jabatan = nama_jabatan;
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
