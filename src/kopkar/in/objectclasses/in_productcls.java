/*
 * To change this in_product, choose Tools | Templates
 * and open the in_product in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class in_productcls implements Serializable {

    private Integer id;
    private String product_code;
    private String product_name;
    private String product_short_name;
    private String active_sts="Y";
    private String barcode;
    private String brand_code;
    private String category_code;
    private String function_code;
    private Double uom1;
    private Double uom2;
    private Double uom3;
    private String uom1_code;
    private String uom2_code;
    private String uom3_code;
    private String register_date;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String accset_code;
    private String product_type_code;
    private String parent_code;

    public in_productcls() {
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

    public String getproduct_name() {
        return product_name;
    }
    public void setproduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getproduct_short_name() {
        return product_short_name;
    }
    public void setproduct_short_name(String product_short_name) {
        this.product_short_name = product_short_name;
    }

    public String getactive_sts() {
        return active_sts;
    }
    public void setactive_sts(String active_sts) {
        this.active_sts = active_sts;
    }

    public String getbarcode() {
        return barcode;
    }
    public void setbarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getbrand_code() {
        return brand_code;
    }
    public void setbrand_code(String brand_code) {
        this.brand_code = brand_code;
    }

    public String getcategory_code() {
        return category_code;
    }
    public void setcategory_code(String category_code) {
        this.category_code = category_code;
    }

    public String getfunction_code() {
        return function_code;
    }
    public void setfunction_code(String function_code) {
        this.function_code = function_code;
    }

    public Double getuom1() {
        return uom1;
    }
    public void setuom1(Double uom1) {
        this.uom1 = uom1;
    }

    public Double getuom2() {
        return uom2;
    }
    public void setuom2(Double uom2) {
        this.uom2 = uom2;
    }

    public Double getuom3() {
        return uom3;
    }
    public void setuom3(Double uom3) {
        this.uom3 = uom3;
    }

    public String getuom1_code() {
        return uom1_code;
    }
    public void setuom1_code(String uom1_code) {
        this.uom1_code = uom1_code;
    }

    public String getuom2_code() {
        return uom2_code;
    }
    public void setuom2_code(String uom2_code) {
        this.uom2_code = uom2_code;
    }

    public String getuom3_code() {
        return uom3_code;
    }
    public void setuom3_code(String uom3_code) {
        this.uom3_code = uom3_code;
    }

    public String getregister_date() {
        return register_date;
    }
    public void setregister_date(String register_date) {
        this.register_date = register_date;
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

    public String getaccset_code() {
        return accset_code;
    }
    public void setaccset_code(String accset_code) {
        this.accset_code = accset_code;
    }

    public String getproduct_type_code() {
        return product_type_code;
    }
    public void setproduct_type_code(String product_type_code) {
        this.product_type_code = product_type_code;
    }

    public String getparent_code() {
        return parent_code;
    }
    public void setparent_code(String parent_code) {
        this.parent_code = parent_code;
    }


}
