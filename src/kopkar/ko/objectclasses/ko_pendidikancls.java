/*
 * To change this ko_pendidikan, choose Tools | Templates
 * and open the ko_pendidikan in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_pendidikancls implements Serializable {

    private Integer id;
    private String kode_pendidikan;
    private String nama_pendidikan;
    private Integer sort_no;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_pendidikancls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getkode_pendidikan() {
        return kode_pendidikan;
    }
    public void setkode_pendidikan(String kode_pendidikan) {
        this.kode_pendidikan = kode_pendidikan;
    }

    public String getnama_pendidikan() {
        return nama_pendidikan;
    }
    public void setnama_pendidikan(String nama_pendidikan) {
        this.nama_pendidikan = nama_pendidikan;
    }

    public Integer getsort_no() {
        return sort_no;
    }
    public void setsort_no(Integer sort_no) {
        this.sort_no = sort_no;
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
