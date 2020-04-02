/*
 * To change this in_product, choose Tools | Templates
 * and open the in_product in the editor.
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
public class in_productextcol extends ArrayList<in_productext> {
    in_productext data=new in_productext();
    String squery="";
    DbBean db=appsettinghandler.db;

    public void insert(){
        data= new in_productext();
    }
    public in_productextcol(){
    }

    public in_productext getData() {
        return data;
    }

    public void setData(in_productext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setproduct_code(rs.getString("product_code"));
        data.setproduct_name(rs.getString("product_name"));
        data.setproduct_short_name(rs.getString("product_short_name"));
        data.setactive_sts(rs.getString("active_sts"));
        data.setbarcode(rs.getString("barcode"));
        data.setbrand_code(rs.getString("brand_code"));
        data.setcategory_code(rs.getString("category_code"));
        data.setfunction_code(rs.getString("function_code"));
        data.setuom1(rs.getDouble("uom1"));
        data.setuom2(rs.getDouble("uom2"));
        data.setuom3(rs.getDouble("uom3"));
        data.setuom1_code(rs.getString("uom1_code"));
        data.setuom2_code(rs.getString("uom2_code"));
        data.setuom3_code(rs.getString("uom3_code"));
        data.setregister_date(rs.getString("register_date"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setaccset_code(rs.getString("accset_code"));
        data.setproduct_type_code(rs.getString("product_type_code"));
        data.setparent_code(rs.getString("parent_code"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_product where id=";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_productext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public void initdata_by_parent_code(String parent_code) throws SQLException{
        squery="select * from in_product where parent_code='"+parent_code+"'";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_productext();
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
        in_productext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_productextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean initdata(String sproduct_codefr, String sproduct_codeto) throws SQLException {
        squery="call sp_in_product_get_all('"+sproduct_codefr+"','"+sproduct_codeto+"')";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_productext();
            if (fillme(rs)){
                this.add(data);
            }
        }
        if (this.size()>0){
            return true;
        }
        return false;
    }
}
