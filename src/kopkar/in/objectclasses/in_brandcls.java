/*
 * To change this in_brand, choose Tools | Templates
 * and open the in_brand in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_brandcls implements Serializable {

    private Integer id;
    private String brand_code;
    private String brand_name;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_brandcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getbrand_code() {
        return brand_code;
    }
    public void setbrand_code(String brand_code) {
        this.brand_code = brand_code;
    }

    public String getbrand_name() {
        return brand_name;
    }
    public void setbrand_name(String brand_name) {
        this.brand_name = brand_name;
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
