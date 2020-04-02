/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.in.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.CodeException;

/**
 *
 * @author solution
 */
public class in_product_price_infoext extends in_productext{
    private in_product_discountextcol product_discount;
    private in_product_priceextcol product_price;

    @Override
    public Boolean update() throws CodeException {
        update_price();
        update_discount();
        return true;
    }
    private Boolean update_price() throws CodeException{
        for (int i=0;i<product_price.size();i++){
            in_product_priceext o = product_price.get(i);
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
        return true;
    }
    private Boolean update_discount() throws CodeException{
        for (int i=0;i<product_discount.size();i++){
            in_product_discountext o = product_discount.get(i);
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
        return true;
    }

    
    public in_product_discountextcol getproduct_discount() {
        return product_discount;
    }

    

    public in_product_priceextcol getproduct_price() {
        return product_price;
    }

    @Override
    public Boolean fillme(ResultSet rs) throws SQLException {
        this.setproduct_code(rs.getString("product_code"));
        this.setproduct_name(rs.getString("product_name"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        product_discount=new in_product_discountextcol(this.getproduct_code());
        product_discount.initdata();

        product_price=new in_product_priceextcol(this.getproduct_code());
        product_price.initdata();

        return true;
    }

    public in_product_price_detailextcol getproduct_price_detail(int i) {
        return product_price.get(i).getproduct_price_detail();
    }



}
