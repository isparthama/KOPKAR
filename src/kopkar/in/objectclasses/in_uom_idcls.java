/*
 * To change this in_uom_id, choose Tools | Templates
 * and open the in_uom_id in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class in_uom_idcls implements Serializable {

    private Integer id;
    private String uom_id;
    private String uom_desc;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_uom_idcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getuom_id() {
        return uom_id;
    }
    public void setuom_id(String uom_id) {
        this.uom_id = uom_id;
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
