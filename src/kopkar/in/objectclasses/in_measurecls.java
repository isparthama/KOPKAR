/*
 * To change this in_measure, choose Tools | Templates
 * and open the in_measure in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_measurecls implements Serializable {

    private Integer id;
    private String uom_code;
    private String uom_desc;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_measurecls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getuom_code() {
        return uom_code;
    }
    public void setuom_code(String uom_code) {
        this.uom_code = uom_code;
    }

    public String getuom_desc() {
        return uom_desc;
    }
    public void setuom_desc(String uom_desc) {
        this.uom_desc = uom_desc;
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
