/*
 * To change this ko_pinjaman_tipe, choose Tools | Templates
 * and open the ko_pinjaman_tipe in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_pinjaman_tipecls implements Serializable {

    private Integer id;
    private String kode_pinjaman_tipe;
    private String nama_pinjaman_tipe;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_pinjaman_tipecls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getkode_pinjaman_tipe() {
        return kode_pinjaman_tipe;
    }
    public void setkode_pinjaman_tipe(String kode_pinjaman_tipe) {
        this.kode_pinjaman_tipe = kode_pinjaman_tipe;
    }

    public String getnama_pinjaman_tipe() {
        return nama_pinjaman_tipe;
    }
    public void setnama_pinjaman_tipe(String nama_pinjaman_tipe) {
        this.nama_pinjaman_tipe = nama_pinjaman_tipe;
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
