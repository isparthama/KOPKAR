/*
 * To change this in_so_sheet_detail1, choose Tools | Templates
 * and open the in_so_sheet_detail1 in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_so_sheet_detail1cls implements Serializable {

    private Integer docentry;
    private Integer line_number;
    private String line_status;
    private String product_code;
    private Double uom2;
    private Double uom3;
    private Double base_total_pcs;
    private String warehouse_code;
    private String entrydate;
    private String auditdate;
    private Integer objtype;
    private String audituser;

    public in_so_sheet_detail1cls() {
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

    public Double getbase_total_pcs() {
        return base_total_pcs;
    }
    public void setbase_total_pcs(Double base_total_pcs) {
        this.base_total_pcs = base_total_pcs;
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
