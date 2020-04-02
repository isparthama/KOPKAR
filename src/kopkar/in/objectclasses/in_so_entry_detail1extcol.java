/*
 * To change this in_so_entry_detail1, choose Tools | Templates
 * and open the in_so_entry_detail1 in the editor.
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
public class in_so_entry_detail1extcol extends ArrayList<in_so_entry_detail1ext> {
    in_so_entry_detail1ext data=new in_so_entry_detail1ext(0);
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_so_entry_detail1ext(this.id);
    }
    public in_so_entry_detail1extcol(Integer id){
        this.id=id;
    }

    public in_so_entry_detail1ext getData() {
        return data;
    }

    public void setData(in_so_entry_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setline_number(rs.getInt("line_number"));
        data.setline_status(rs.getString("line_status"));
        data.setproduct_code(rs.getString("product_code"));
        data.setuom2(rs.getDouble("uom2"));
        data.setuom3(rs.getDouble("uom3"));
        data.setbase_total_pcs(rs.getDouble("base_total_pcs"));
        data.setuom2_qty(rs.getDouble("uom2_qty"));
        data.setuom3_qty(rs.getDouble("uom3_qty"));
        data.setpcs_qty(rs.getDouble("pcs_qty"));
        data.settotal_pcs(rs.getDouble("total_pcs"));
        data.setvariant(rs.getDouble("varqty"));

        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setobjtype(rs.getInt("objtype"));
        data.setaudituser(rs.getString("audituser"));

        
        data.setproduct_name(rs.getString("product_name"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_in_so_entry_detail1_get("+this.id+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_so_entry_detail1ext(this.id);
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer docentry){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocentry().equals(docentry)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_so_entry_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_so_entry_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean retrievedata(String sbrand_code_fr, String sbrand_code_to, String swarehouse_code) throws SQLException {
        squery="call sp_in_so_entry_detail1_get_new('"+sbrand_code_fr+"','"+sbrand_code_to+"','"+swarehouse_code+"')";
        ResultSet rs = db.executeQuery(squery);
        while (rs.next()){
            data=new in_so_entry_detail1ext(this.id);
            if (fillmeretrieve(rs)){
                data.setpilih(rs.getInt("pilih"));
                this.add(data);
            }
        }
        if (this.size()>0){
            return true;
        }
        return false;
    }

    private boolean fillmeretrieve(ResultSet rs) throws SQLException {
        data.setstatus(data.Status_Insert);
        data.setpilih(1);
        data.setproduct_code(rs.getString("product_code"));
        data.setproduct_name(rs.getString("product_name"));
        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setuom2(rs.getDouble("uom2"));
        data.setuom3(rs.getDouble("uom3"));
        data.setbase_total_pcs(rs.getDouble("onhand"));
        return true;
    }
}
