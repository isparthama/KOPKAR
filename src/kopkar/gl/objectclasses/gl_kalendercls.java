/*
 * To change this gl_kalender, choose Tools | Templates
 * and open the gl_kalender in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_kalendercls implements Serializable {

    private Integer id=0;
    private Integer yop=0;
    private String aktif="Y";
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_kalendercls() {
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
