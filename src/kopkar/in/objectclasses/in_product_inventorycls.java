/*
 * To change this in_product_inventory, choose Tools | Templates
 * and open the in_product_inventory in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_product_inventorycls implements Serializable {

    private Integer id;
    private String product_code;
    private String warehouse_code;
    private Double onhand;
    private Double comitted;
    private Double consign;
    private Double isorder;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_product_inventorycls() {
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

    public String getwarehouse_code() {
        return warehouse_code;
    }
    public void setwarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public Double getonhand() {
        return onhand;
    }
    public void setonhand(Double onhand) {
        this.onhand = onhand;
    }

    public Double getcomitted() {
        return comitted;
    }
    public void setcomitted(Double comitted) {
        this.comitted = comitted;
    }

    public Double getconsign() {
        return consign;
    }
    public void setconsign(Double consign) {
        this.consign = consign;
    }

    public Double getisorder() {
        return isorder;
    }
    public void setisorder(Double isorder) {
        this.isorder = isorder;
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
