/*
 * To change this in_warehouse, choose Tools | Templates
 * and open the in_warehouse in the editor.
 */

package kopkar.in.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class in_warehouseextcol extends ArrayList<in_warehouseext> {
    in_warehouseext data=new in_warehouseext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public in_warehouseextcol() {
        
    }

    public void insert(){
        data= new in_warehouseext();
    }
    public in_warehouseextcol(Integer id){
        this.id=id;
    }

    public in_warehouseext getData() {
        return data;
    }

    public void setData(in_warehouseext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setwarehouse_name(rs.getString("warehouse_name"));
        data.setcheck_oh(rs.getString("check_oh"));
        data.setaddress1(rs.getString("address1"));
        data.setaddress2(rs.getString("address2"));
        data.setcity(rs.getString("city"));
        data.setstate(rs.getString("state"));
        data.setzipcode(rs.getString("zipcode"));
        data.setphone(rs.getString("phone"));
        data.setfaximale(rs.getString("faximale"));
        data.setemail(rs.getString("email"));
        data.setpic(rs.getString("pic"));
        data.setwarehouse_type(rs.getString("warehouse_type"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_warehouse where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_warehouseext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer warehouse_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getwarehouse_code().equals(warehouse_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_warehouseext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_warehouseextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean initdataall() {
        try {
            ResultSet rs = db.executeQuery("call sp_in_proses_bulanan_get()");
            while (rs.next()){
                data=new in_warehouseext();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_warehouseextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean run_sp_in_product_price_history_process(Integer syop, Integer smop) {
        try {
            squery="call sp_in_product_price_history_process("+syop+","+smop+",'"+GlobalUtils.audituser+"')";
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(in_warehouseext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
