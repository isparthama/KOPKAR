/*
 * To change this in_product_barcode, choose Tools | Templates
 * and open the in_product_barcode in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_product_barcodecls implements Serializable {

    private Integer id;
    private String product_code;
    private String uom_id;
    private String barcode;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_product_barcodecls() {
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

    public String getbarcode() {
        return barcode;
    }
    public void setbarcode(String barcode) {
        this.barcode = barcode;
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
