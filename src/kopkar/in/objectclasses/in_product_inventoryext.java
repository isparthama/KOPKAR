/*
 * To change this in_product_inventory, choose Tools | in_product_inventorys
 * and open the in_product_inventory in the editor.
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
public class in_product_inventoryext extends in_product_inventorycls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String warehouse_name;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_in_product_inventory_insert( "

                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getonhand()+"', "
                    + "'"+this.getcomitted()+"', "
                    + "'"+this.getconsign()+"', "
                    + "'"+this.getisorder()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_in_product_inventory_update( "

                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getonhand()+"', "
                    + "'"+this.getcomitted()+"', "
                    + "'"+this.getconsign()+"', "
                    + "'"+this.getisorder()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_in_product_inventory_delete( "

                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getonhand()+"', "
                    + "'"+this.getcomitted()+"', "
                    + "'"+this.getconsign()+"', "
                    + "'"+this.getisorder()+"', "



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
        squery="select * from in_product_inventory where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_inventoryext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String product_code) throws CodeException {
        squery="CALL sp_in_product_inventory_get('"+product_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_inventoryext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setproduct_code(rs.getString("product_code"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setonhand(rs.getDouble("onhand"));
        this.setcomitted(rs.getDouble("comitted"));
        this.setconsign(rs.getDouble("consign"));
        this.setisorder(rs.getDouble("isorder"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.warehouse_name=rs.getString("warehouse_name");
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_product_inventory_get('"+this.getproduct_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_inventoryext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_product_inventory_get('"+this.getproduct_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_inventoryext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_product_inventory_get('"+this.getproduct_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_inventoryext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_product_inventory_get('"+this.getproduct_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_inventoryext.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getwarehouse_name() {
        return this.warehouse_name;
    }

    void setwarehouse_name(String warehouse_name) {
        this.warehouse_name=warehouse_name;
    }

}
