/*
 * To change this in_product_inventory, choose Tools | Templates
 * and open the in_product_inventory in the editor.
 */

package kopkar.in.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class in_product_inventoryextcol extends ArrayList<in_product_inventoryext> {
    in_product_inventoryext data=new in_product_inventoryext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;
    private String product_code="";

    in_product_inventoryextcol(String product_code) {
        this.product_code=product_code;
    }

    public void insert(){
        data= new in_product_inventoryext();
    }
    public in_product_inventoryextcol(Integer id){
        this.id=id;
    }

    public in_product_inventoryext getData() {
        return data;
    }

    public void setData(in_product_inventoryext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setproduct_code(rs.getString("product_code"));
        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setonhand(rs.getDouble("onhand"));
        data.setcomitted(rs.getDouble("comitted"));
        data.setconsign(rs.getDouble("consign"));
        data.setisorder(rs.getDouble("isorder"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setwarehouse_name(rs.getString("warehouse_name"));
        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_in_product_inventory_get('"+this.product_code+"')";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_product_inventoryext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer product_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getproduct_code().equals(product_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_product_inventoryext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_product_inventoryextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
