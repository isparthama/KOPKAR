/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.in.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class in_product_findcls {
    private String product_code;
    private String product_name;
    private Integer qty;
    private Integer uom_id;
    private String uom_code;
    private Double cost;
    private Double price;
    private Integer uom;

    public Boolean initdata(String sproduct_code,String suom_id,String scost_price_code,String ssales_price_code){
        DbBean db=appsettinghandler.db;
        try {
            ResultSet rs = db.executeQuery("call sp_in_product_find('" + sproduct_code + "','" + suom_id + "','" + scost_price_code + "','" + ssales_price_code + "')");
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_product_findcls.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    /**
     * @return the product_code
     */
    public String getProduct_code() {
        return product_code;
    }

    /**
     * @param product_code the product_code to set
     */
    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * @param product_name the product_name to set
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the uom_id
     */
    public Integer getUom_id() {
        return uom_id;
    }

    /**
     * @param uom_id the uom_id to set
     */
    public void setUom_id(Integer uom_id) {
        this.uom_id = uom_id;
    }

    /**
     * @return the uom_code
     */
    public String getUom_code() {
        return uom_code;
    }

    /**
     * @param uom_code the uom_code to set
     */
    public void setUom_code(String uom_code) {
        this.uom_code = uom_code;
    }

    /**
     * @return the cost
     */
    public Double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(Double cost) {
        this.cost = cost;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the uom
     */
    public Integer getUom() {
        return uom;
    }

    /**
     * @param uom the uom to set
     */
    public void setUom(Integer uom) {
        this.uom = uom;
    }

    private boolean fillme(ResultSet rs) throws SQLException {
        this.product_code=rs.getString("product_code");
        this.product_name=rs.getString("product_name");
        this.qty=rs.getInt("qty");
        this.uom_id=rs.getInt("uom_id");
        this.uom_code=rs.getString("uom_code");
        this.cost=rs.getDouble("cost");
        this.price=rs.getDouble("price");
        this.uom=rs.getInt("uom");
        return true;
    }
}
