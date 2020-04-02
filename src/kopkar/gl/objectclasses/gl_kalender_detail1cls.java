/*
 * To change this gl_kalender_detail1, choose Tools | Templates
 * and open the gl_kalender_detail1 in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_kalender_detail1cls implements Serializable {

    private Integer id;
    private Integer yop;
    private Integer mop;
    private String aktif;
    private String rekalkulasi;
    private String closedate;
    private String closeuser;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_kalender_detail1cls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public Integer getyop() {
        return yop;
    }
    public void setyop(Integer yop) {
        this.yop = yop;
    }

    public Integer getmop() {
        return mop;
    }
    public void setmop(Integer mop) {
        this.mop = mop;
    }

    public String getaktif() {
        return aktif;
    }
    public void setaktif(String aktif) {
        this.aktif = aktif;
    }

    public String getrekalkulasi() {
        return rekalkulasi;
    }
    public void setrekalkulasi(String rekalkulasi) {
        this.rekalkulasi = rekalkulasi;
    }

    public String getclosedate() {
        return closedate;
    }
    public void setclosedate(String closedate) {
        this.closedate = closedate;
    }

    public String getcloseuser() {
        return closeuser;
    }
    public void setcloseuser(String closeuser) {
        this.closeuser = closeuser;
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
