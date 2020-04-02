/*
 * To change this in_product_price_detail, choose Tools | Templates
 * and open the in_product_price_detail in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_product_price_detailcls implements Serializable {

    private Integer id;
    private String product_code;
    private String uom_id;
    private String price_code;
    private Double price;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_product_price_detailcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getproduct_code() {
        return product_code;
    }
    public void setproduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getuom_id() {
        return uom_id;
    }
    public void setuom_id(String uom_id) {
        this.uom_id = uom_id;
    }

    public String getprice_code() {
        return price_code;
    }
    public void setprice_code(String price_code) {
        this.price_code = price_code;
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
