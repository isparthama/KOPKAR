/*
 * To change this ar_pos_chasier, choose Tools | Templates
 * and open the ar_pos_chasier in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ar_pos_chasiercls implements Serializable {

    private Integer id;
    private String chasier_code;
    private String chasier_name;
    private String user_code;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ar_pos_chasiercls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getchasier_code() {
        return chasier_code;
    }
    public void setchasier_code(String chasier_code) {
        this.chasier_code = chasier_code;
    }

    public String getchasier_name() {
        return chasier_name;
    }
    public void setchasier_name(String chasier_name) {
        this.chasier_name = chasier_name;
    }

    public String getuser_code() {
        return user_code;
    }
    public void setuser_code(String user_code) {
        this.user_code = user_code;
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
