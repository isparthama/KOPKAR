/*
 * To change this ar_sales_order_detail1, choose Tools | Templates
 * and open the ar_sales_order_detail1 in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ar_sales_order_detail1cls implements Serializable {

    private Integer docentry;
    private Integer line_number=0;
    private String line_status;
    private String product_code;
    private Integer uom_id;
    private Double quantity;
    private Double cost;
    private Double price;
    private Double discount_percent;
    private Double discount_amount;
    private Double total_gross;
    private Double total_after_discount;
    private Double uom2=new Double(0);
    private Double uom3=new Double(0);
    private Double quantity_pcs;
    private Double cost_pcs;
    private Double price_pcs;
    private Double quantity_open;
    private Double quantity_pcs_open;
    private Integer base_objtype=0;
    private Integer base_docentry=0;
    private Integer base_line_number=0;
    private String price_code;
    private String warehouse_code;
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;

    public ar_sales_order_detail1cls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public Integer getline_number() {
        return line_number;
    }
    public void setline_number(Integer line_number) {
        this.line_number = line_number;
    }

    public String getline_status() {
        return line_status;
    }
    public void setline_status(String line_status) {
        this.line_status = line_status;
    }

    public String getproduct_code() {
        return product_code;
    }
    public void setproduct_code(String product_code) {
        this.product_code = product_code;
    }

    public Integer getuom_id() {
        return uom_id;
    }
    public void setuom_id(Integer uom_id) {
        this.uom_id = uom_id;
    }

    public Double getquantity() {
        return quantity;
    }
    public void setquantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getcost() {
        return cost;
    }
    public void setcost(Double cost) {
        this.cost = cost;
    }

    public Double getprice() {
        return price;
    }
    public void setprice(Double price) {
        this.price = price;
    }

    public Double getdiscount_percent() {
        return discount_percent;
    }
    public void setdiscount_percent(Double discount_percent) {
        this.discount_percent = discount_percent;
    }

    public Double getdiscount_amount() {
        return discount_amount;
    }
    public void setdiscount_amount(Double discount_amount) {
        this.discount_amount = discount_amount;
    }

    public Double gettotal_gross() {
        return total_gross;
    }
    public void settotal_gross(Double total_gross) {
        this.total_gross = total_gross;
    }

    public Double gettotal_after_discount() {
        return total_after_discount;
    }
    public void settotal_after_discount(Double total_after_discount) {
        this.total_after_discount = total_after_discount;
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

    public Double getquantity_pcs() {
        return quantity_pcs;
    }
    public void setquantity_pcs(Double quantity_pcs) {
        this.quantity_pcs = quantity_pcs;
    }

    public Double getcost_pcs() {
        return cost_pcs;
    }
    public void setcost_pcs(Double cost_pcs) {
        this.cost_pcs = cost_pcs;
    }

    public Double getprice_pcs() {
        return price_pcs;
    }
    public void setprice_pcs(Double price_pcs) {
        this.price_pcs = price_pcs;
    }

    public Double getquantity_open() {
        return quantity_open;
    }
    public void setquantity_open(Double quantity_open) {
        this.quantity_open = quantity_open;
    }

    public Double getquantity_pcs_open() {
        return quantity_pcs_open;
    }
    public void setquantity_pcs_open(Double quantity_pcs_open) {
        this.quantity_pcs_open = quantity_pcs_open;
    }

    public Integer getbase_objtype() {
        return base_objtype;
    }
    public void setbase_objtype(Integer base_objtype) {
        this.base_objtype = base_objtype;
    }

    public Integer getbase_docentry() {
        return base_docentry;
    }
    public void setbase_docentry(Integer base_docentry) {
        this.base_docentry = base_docentry;
    }

    public Integer getbase_line_number() {
        return base_line_number;
    }
    public void setbase_line_number(Integer base_line_number) {
        this.base_line_number = base_line_number;
    }

    public String getprice_code() {
        return price_code;
    }
    public void setprice_code(String price_code) {
        this.price_code = price_code;
    }

    public String getwarehouse_code() {
        return warehouse_code;
    }
    public void setwarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
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

    public Integer getobjtype() {
        return objtype;
    }
    public void setobjtype(Integer objtype) {
        this.objtype = objtype;
    }

    public String getaudituser() {
        return audituser;
    }
    public void setaudituser(String audituser) {
        this.audituser = audituser;
    }


}
