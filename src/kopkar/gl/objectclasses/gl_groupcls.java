/*
 * To change this gl_group, choose Tools | Templates
 * and open the gl_group in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_groupcls implements Serializable {

    private Integer id;
    private String kode_group="";
    private String nama_group;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_groupcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getkode_group() {
        return kode_group;
    }
    public void setkode_group(String kode_group) {
        this.kode_group = kode_group;
    }

    public String getnama_group() {
        return nama_group;
    }
    public void setnama_group(String nama_group) {
        this.nama_group = nama_group;
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
