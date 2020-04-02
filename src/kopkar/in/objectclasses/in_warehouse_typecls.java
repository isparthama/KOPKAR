/*
 * To change this in_warehouse_type, choose Tools | Templates
 * and open the in_warehouse_type in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_warehouse_typecls implements Serializable {

    private Integer id;
    private String warehouse_type="";
    private String warehouse_type_desc;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_warehouse_typecls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getwarehouse_type() {
        return warehouse_type;
    }
    public void setwarehouse_type(String warehouse_type) {
        this.warehouse_type = warehouse_type;
    }

    public String getwarehouse_type_desc() {
        return warehouse_type_desc;
    }
    public void setwarehouse_type_desc(String warehouse_type_desc) {
        this.warehouse_type_desc = warehouse_type_desc;
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
