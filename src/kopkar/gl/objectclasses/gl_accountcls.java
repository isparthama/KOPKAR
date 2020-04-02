/*
 * To change this gl_account, choose Tools | Templates
 * and open the gl_account in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_accountcls implements Serializable {

    private String kode_akun;
    private String nama_akun;
    private String tipe_rek;
    private String group_rek;
    private String status;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_accountcls() {
    }
    
    public String getkode_akun() {
        return kode_akun;
    }
    public void setkode_akun(String kode_akun) {
        this.kode_akun = kode_akun;
    }

    public String getnama_akun() {
        return nama_akun;
    }
    public void setnama_akun(String nama_akun) {
        this.nama_akun = nama_akun;
    }

    public String gettipe_rek() {
        return tipe_rek;
    }
    public void settipe_rek(String tipe_rek) {
        this.tipe_rek = tipe_rek;
    }

    public String getgroup_rek() {
        return group_rek;
    }
    public void setgroup_rek(String group_rek) {
        this.group_rek = group_rek;
    }

    public String getstatus() {
        return status;
    }
    public void setstatus(String status) {
        this.status = status;
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
