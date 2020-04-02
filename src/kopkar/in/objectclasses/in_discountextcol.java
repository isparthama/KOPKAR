/*
 * To change this in_discount, choose Tools | Templates
 * and open the in_discount in the editor.
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
public class in_discountextcol extends ArrayList<in_discountext> {
    in_discountext data=new in_discountext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_discountext();
    }
    public in_discountextcol(Integer id){
        this.id=id;
    }

    public in_discountext getData() {
        return data;
    }

    public void setData(in_discountext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setdiscount_code(rs.getString("discount_code"));
        data.setdiscount_desc(rs.getString("discount_desc"));
        data.setdiscount(rs.getDouble("discount"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_discount where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_discountext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer discount_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdiscount_code().equals(discount_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_discountext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_discountextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
