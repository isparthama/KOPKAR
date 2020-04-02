/*
 * To change this in_product, choose Tools | in_products
 * and open the in_product in the editor.
 */

package kopkar.in.objectclasses;

import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class in_productext extends in_productcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    in_product_barcodeextcol product_barcode=new in_product_barcodeextcol(0);
    private in_product_inventoryextcol product_inventory=new in_product_inventoryextcol(0);
    private String accset_desc="";
    private String Brand_name="";
    private String Category_name = "";
    private String Function_name = "";
    private String Uom_desc1 = "";
    private String Uom_desc2 = "";
    private String Uom_desc3 = "";
    private String parent_code_desc="";

    public in_productext() {
        this.setparent_code("");
        this.setproduct_type_code("D");
    }


    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        in_product_barcodeext o;
        try {
            if (insertsts){
                squery="call sp_in_product_insert( "
                        + "'"+this.getproduct_code()+"', "
                        + "'"+this.getproduct_name()+"', "
                        + "'"+this.getproduct_short_name()+"', "
                        + "'"+this.getactive_sts()+"', "
                        + "'"+this.getbarcode()+"', "
                        + "'"+this.getbrand_code()+"', "
                        + "'"+this.getcategory_code()+"', "
                        + "'"+this.getfunction_code()+"', "
                        + "'"+this.getuom1()+"', "
                        + "'"+this.getuom2()+"', "
                        + "'"+this.getuom3()+"', "
                        + "'"+this.getuom1_code()+"', "
                        + "'"+this.getuom2_code()+"', "
                        + "'"+this.getuom3_code()+"', "
                        + "'"+this.getregister_date()+"', "
                        + "'"+this.getaccset_code()+"', "
                        + "'"+this.getproduct_type_code()+"', "
                        + "'"+this.getparent_code()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);

                for (int i=0;i<product_barcode.size();i++){
                    o=product_barcode.get(i);
                    if (o.getstatus().equals(o.Status_Insert)){
                        o.setproduct_code(this.getproduct_code());
                    }
                    if (o.getstatus().equals(o.Status_Insert)||o.getstatus().equals(o.Status_update)){
                        o.update();
                    }
                    if (o.getstatus().equals(o.Status_delete)){
                        o.delete();
                    }
                }
            } else {
                squery="call sp_in_product_update( "
                        + "'"+this.getproduct_code()+"', "
                        + "'"+this.getproduct_name()+"', "
                        + "'"+this.getproduct_short_name()+"', "
                        + "'"+this.getactive_sts()+"', "
                        + "'"+this.getbarcode()+"', "
                        + "'"+this.getbrand_code()+"', "
                        + "'"+this.getcategory_code()+"', "
                        + "'"+this.getfunction_code()+"', "
                        + "'"+this.getuom1()+"', "
                        + "'"+this.getuom2()+"', "
                        + "'"+this.getuom3()+"', "
                        + "'"+this.getuom1_code()+"', "
                        + "'"+this.getuom2_code()+"', "
                        + "'"+this.getuom3_code()+"', "
                        + "'"+this.getregister_date()+"', "
                        + "'"+this.getaccset_code()+"', "
                        + "'"+this.getproduct_type_code()+"', "
                        + "'"+this.getparent_code()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
                for (int i=0;i<product_barcode.size();i++){
                    o=product_barcode.get(i);
                    if (o.getstatus().equals(o.Status_Insert)){
                        o.setproduct_code(this.getproduct_code());
                    }
                    if (o.getstatus().equals(o.Status_Insert)||o.getstatus().equals(o.Status_update)){
                        o.update();
                    }
                    if (o.getstatus().equals(o.Status_delete)){
                        o.delete();
                    }
                }
            }
        
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_in_product_delete( "

                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getproduct_name()+"', "
                    + "'"+this.getproduct_short_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getbarcode()+"', "
                    + "'"+this.getbrand_code()+"', "
                    + "'"+this.getcategory_code()+"', "
                    + "'"+this.getfunction_code()+"', "
                    + "'"+this.getuom1()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
                    + "'"+this.getuom1_code()+"', "
                    + "'"+this.getuom2_code()+"', "
                    + "'"+this.getuom3_code()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getaccset_code()+"', "
                    + "'"+this.getproduct_type_code()+"', "
                    + "'"+this.getparent_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        try {
            db.execute(squery);
            insertsts=false;
            throw new CodeException("Data deleted");
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from in_product where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_productext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String product_code) throws CodeException {
        squery="CALL sp_in_product_get('"+product_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_productext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setproduct_code(rs.getString("product_code"));
        this.setproduct_name(rs.getString("product_name"));
        this.setproduct_short_name(rs.getString("product_short_name"));
        this.setactive_sts(rs.getString("active_sts"));
        this.setbarcode(rs.getString("barcode"));
        this.setbrand_code(rs.getString("brand_code"));
        this.setcategory_code(rs.getString("category_code"));
        this.setfunction_code(rs.getString("function_code"));
        this.setuom1(rs.getDouble("uom1"));
        this.setuom2(rs.getDouble("uom2"));
        this.setuom3(rs.getDouble("uom3"));
        this.setuom1_code(rs.getString("uom1_code"));
        this.setuom2_code(rs.getString("uom2_code"));
        this.setuom3_code(rs.getString("uom3_code"));
        this.setBrand_name(rs.getString("brand_name"));
        this.setCategory_name(rs.getString("category_name"));
        this.setFunction_name(rs.getString("function_name"));
        this.setUom_desc1(rs.getString("uom_desc1"));
        this.setUom_desc2(rs.getString("uom_desc2"));
        this.setUom_desc3(rs.getString("uom_desc3"));
        this.setregister_date(rs.getString("register_date"));

        this.setaccset_code(rs.getString("accset_code"));
        this.setaccset_desc(rs.getString("accset_desc"));

        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        product_barcode=new in_product_barcodeextcol(this.getproduct_code());
        product_barcode.initdata();

        product_inventory=new in_product_inventoryextcol(this.getproduct_code());
        product_inventory.initdata();

        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_product_get('"+this.getproduct_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_productext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_product_get('"+this.getproduct_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_productext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_product_get('"+this.getproduct_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_productext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_product_get('"+this.getproduct_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_productext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getClassName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean refresh() throws CodeException {
        if (this.initdata(this.getproduct_code())){
            return true;
        }
        return false;
    }

    public in_product_barcodeextcol getproduct_barcode() {
        return this.product_barcode;
    }

    public in_product_inventoryextcol getproduct_inventory() {
        return this.product_inventory;
    }

    public String getaccset_desc() { return accset_desc;}
    public void setaccset_desc(String accset_desc) { this.accset_desc = accset_desc;}

    /**
     * @return the Brand_name
     */
    public String getBrand_name() {
        return Brand_name;
    }

    /**
     * @param Brand_name the Brand_name to set
     */
    public void setBrand_name(String Brand_name) {
        this.Brand_name = Brand_name;
    }

    /**
     * @return the Category_name
     */
    public String getCategory_name() {
        return Category_name;
    }

    /**
     * @param Category_name the Category_name to set
     */
    public void setCategory_name(String Category_name) {
        this.Category_name = Category_name;
    }

    /**
     * @return the Function_name
     */
    public String getFunction_name() {
        return Function_name;
    }

    /**
     * @param Function_name the Function_name to set
     */
    public void setFunction_name(String Function_name) {
        this.Function_name = Function_name;
    }

    /**
     * @return the Uom_desc1
     */
    public String getUom_desc1() {
        return Uom_desc1;
    }

    /**
     * @param Uom_desc1 the Uom_desc1 to set
     */
    public void setUom_desc1(String Uom_desc1) {
        this.Uom_desc1 = Uom_desc1;
    }

    /**
     * @return the Uom_desc2
     */
    public String getUom_desc2() {
        return Uom_desc2;
    }

    /**
     * @param Uom_desc2 the Uom_desc2 to set
     */
    public void setUom_desc2(String Uom_desc2) {
        this.Uom_desc2 = Uom_desc2;
    }

    /**
     * @return the Uom_desc3
     */
    public String getUom_desc3() {
        return Uom_desc3;
    }

    /**
     * @param Uom_desc3 the Uom_desc3 to set
     */
    public void setUom_desc3(String Uom_desc3) {
        this.Uom_desc3 = Uom_desc3;
    }

    public String getparent_code_desc() {
        return this.parent_code_desc;
    }
}
