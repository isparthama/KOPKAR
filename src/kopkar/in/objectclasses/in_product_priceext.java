/*
 * To change this in_product_price, choose Tools | in_product_prices
 * and open the in_product_price in the editor.
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
public class in_product_priceext extends in_product_pricecls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    String product_code="";
    private String price_desc="";
    private Integer status=0;

    public in_product_priceext(String product_code){
        this.product_code=product_code;
    }
    private in_product_price_detailextcol product_price_detail;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        try {
            if (insertsts){
                squery="call sp_in_product_price_insert( "
                        + "'"+this.getproduct_code()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getprice()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
            } else {
                squery="call sp_in_product_price_update( "
                        + "'"+this.getproduct_code()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getprice()+"', "
                    + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
                for (int i=0;i<product_price_detail.size();i++){
                    in_product_price_detailext o = product_price_detail.get(i);
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
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_in_product_price_delete( "
                    + "'"+this.getproduct_code()+"', "
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

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from in_product_price where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_priceext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata() throws CodeException {
        squery="CALL sp_in_product_price_get('"+this.product_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_priceext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setproduct_code(rs.getString("product_code"));
        this.setprice_code(rs.getString("price_code"));
        this.setprice(rs.getDouble("price"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        product_price_detail=new in_product_price_detailextcol(this.product_code,this.getprice_code());
        product_price_detail.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_product_price_get('"+this.getproduct_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_priceext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_product_price_get('"+this.getproduct_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_priceext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_product_price_get('"+this.getproduct_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_priceext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_product_price_get('"+this.getproduct_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_priceext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata()){
            return true;
        }
        return false;
    }

    public in_product_price_detailextcol getproduct_price_detail() {
        return product_price_detail;
    }

    public String getprice_desc() {
        return this.price_desc;
    }

    void setprice_desc(String price_desc) {
        this.price_desc=price_desc;
    }

    public void retrieveproduct_price_detail() {
        try {
            product_price_detail=new in_product_price_detailextcol(this.product_code,this.getprice_code());
            this.product_price_detail.initdata();
        } catch (SQLException ex) {
            Logger.getLogger(in_product_priceext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setstatus(Integer status) {
        this.status=status;
    }

    public Object getstatus() {
        return this.status;
    }

    public void setproduct_price_detail(in_product_price_detailextcol product_price_detail) {
        this.product_price_detail=product_price_detail;
    }

}
