/*
 * To change this in_price, choose Tools | Templates
 * and open the in_price in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_pricecls implements Serializable {

    private Integer id;
    private String price_code;
    private String price_desc;
    private Double price;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_pricecls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getprice_code() {
        return price_code;
    }
    public void setprice_code(String price_code) {
        this.price_code = price_code;
    }

    public String getprice_desc() {
        return price_desc;
    }
    public void setprice_desc(String price_desc) {
        this.price_desc = price_desc;
    }

    public Double getprice() {
        return price;
    }
    public void setprice(Double price) {
        this.price = price;
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
