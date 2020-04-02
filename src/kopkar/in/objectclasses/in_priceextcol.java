/*
 * To change this in_price, choose Tools | Templates
 * and open the in_price in the editor.
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
public class in_priceextcol extends ArrayList<in_priceext> {
    in_priceext data=new in_priceext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_priceext();
    }
    public in_priceextcol(Integer id){
        this.id=id;
    }

    public in_priceext getData() {
        return data;
    }

    public void setData(in_priceext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setprice_code(rs.getString("price_code"));
        data.setprice_desc(rs.getString("price_desc"));
        data.setprice(rs.getDouble("price"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_price where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_priceext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer price_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getprice_code().equals(price_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_priceext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_priceextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
