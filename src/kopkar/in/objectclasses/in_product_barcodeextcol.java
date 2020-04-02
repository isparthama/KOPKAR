/*
 * To change this in_product_barcode, choose Tools | Templates
 * and open the in_product_barcode in the editor.
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
public class in_product_barcodeextcol extends ArrayList<in_product_barcodeext> {
    in_product_barcodeext data=new in_product_barcodeext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;
    private String product_code="";

    in_product_barcodeextcol(String product_code) {
        this.product_code=product_code;
    }

    public void insert(){
        data= new in_product_barcodeext();
    }
    public in_product_barcodeextcol(Integer id){
        this.id=id;
    }

    public in_product_barcodeext getData() {
        return data;
    }

    public void setData(in_product_barcodeext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setproduct_code(rs.getString("product_code"));
        data.setuom_id(rs.getString("uom_id"));
        data.setbarcode(rs.getString("barcode"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setuom_desc(rs.getString("uom_desc"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_in_product_barcode_get('"+this.product_code+"')";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_product_barcodeext();
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
        in_product_barcodeext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_product_barcodeextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
