/*
 * To change this in_discount, choose Tools | Templates
 * and open the in_discount in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_discountcls implements Serializable {

    private Integer id;
    private String discount_code;
    private String discount_desc;
    private Double discount;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_discountcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getdiscount_code() {
        return discount_code;
    }
    public void setdiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public String getdiscount_desc() {
        return discount_desc;
    }
    public void setdiscount_desc(String discount_desc) {
        this.discount_desc = discount_desc;
    }

    public Double getdiscount() {
        return discount;
    }
    public void setdiscount(Double discount) {
        this.discount = discount;
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
