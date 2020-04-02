/*
 * To change this in_product_price_detail, choose Tools | Templates
 * and open the in_product_price_detail in the editor.
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
public class in_product_price_detailextcol extends ArrayList<in_product_price_detailext> {
    in_product_price_detailext data=new in_product_price_detailext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;
    private String product_code="";
    private String price_code="";

    in_product_price_detailextcol(String product_code) {
        this.product_code=product_code;
    }

    in_product_price_detailextcol(String product_code, String price_code) {
        this.product_code=product_code;
        this.price_code=price_code;
    }

    public void insert(){
        data= new in_product_price_detailext();
    }
    public in_product_price_detailextcol(Integer id){
        this.id=id;
    }

    public in_product_price_detailext getData() {
        return data;
    }

    public void setData(in_product_price_detailext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setproduct_code(rs.getString("product_code"));
        data.setuom_id(rs.getString("uom_id"));
        data.setprice_code(rs.getString("price_code"));
        data.setprice(rs.getDouble("price"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setuom_code(rs.getString("uom_code"));
        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_in_product_price_detail_get('"+this.product_code+"','"+this.price_code+"')";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_product_price_detailext();
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
        in_product_price_detailext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_product_price_detailextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
