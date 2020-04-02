/*
 * To change this in_product_price_detail, choose Tools | in_product_price_details
 * and open the in_product_price_detail in the editor.
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
public class in_product_price_detailext extends in_product_price_detailcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String uom_code="";
    private Integer status=0;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_in_product_price_detail_insert( "

                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom_id()+"', "
                    + "'"+this.getprice_code()+"', "
                    + "'"+this.getprice()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_in_product_price_detail_update( "

                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom_id()+"', "
                    + "'"+this.getprice_code()+"', "
                    + "'"+this.getprice()+"', "



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
        squery="call sp_in_product_price_detail_delete( "

                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom_id()+"', "
                    + "'"+this.getprice_code()+"', "
                    + "'"+this.getprice()+"', "



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
        squery="select * from in_product_price_detail where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_price_detailext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String product_code) throws CodeException {
        squery="CALL sp_in_product_price_detail_get('"+product_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_price_detailext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setproduct_code(rs.getString("product_code"));
        this.setuom_id(rs.getString("uom_id"));
        this.setprice_code(rs.getString("price_code"));
        this.setprice(rs.getDouble("price"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_product_price_detail_get('"+this.getproduct_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_price_detailext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_product_price_detail_get('"+this.getproduct_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_price_detailext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_product_price_detail_get('"+this.getproduct_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_price_detailext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_product_price_detail_get('"+this.getproduct_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_price_detailext.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getuom_id_desc() {
        if (this.getuom_id().equalsIgnoreCase("1")){
            return "Pieces";
        } else if (this.getuom_id().equalsIgnoreCase("2")){
            return "Inner";
        } else {
            return "Box";
        }

    }

    public String getuom_code() {
        return this.uom_code;
    }

    void setuom_code(String uom_code) {
        this.uom_code=uom_code;
    }

    public void setstatus(Integer status) {
        this.status=status;
    }

    public Integer getstatus() {
       return this.status;
    }

}
