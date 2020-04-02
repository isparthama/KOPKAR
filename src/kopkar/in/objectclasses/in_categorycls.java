/*
 * To change this in_category, choose Tools | Templates
 * and open the in_category in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_categorycls implements Serializable {

    private Integer id;
    private String category_code;
    private String category_name;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_categorycls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getcategory_code() {
        return category_code;
    }
    public void setcategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getcategory_name() {
        return category_name;
    }
    public void setcategory_name(String category_name) {
        this.category_name = category_name;
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
