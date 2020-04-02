/*
 * To change this ar_pos_return_detail1, choose Tools | Templates
 * and open the ar_pos_return_detail1 in the editor.
 */

package kopkar.ar.objectclasses;

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
public class ar_pos_return_detail1extcol extends ArrayList<ar_pos_return_detail1ext> {
    ar_pos_return_detail1ext data=new ar_pos_return_detail1ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer docentry;

    public void insert(){
        data= new ar_pos_return_detail1ext();
    }
    public ar_pos_return_detail1extcol(Integer docentry){
        this.docentry=docentry;
    }

    public ar_pos_return_detail1ext getData() {
        return data;
    }

    public void setData(ar_pos_return_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setline_number(rs.getInt("line_number"));
        data.setline_status(rs.getString("line_status"));
        data.setproduct_code(rs.getString("product_code"));
        data.setuom_id(rs.getInt("uom_id"));
        data.setquantity(rs.getDouble("quantity"));
        data.setcost(rs.getDouble("cost"));
        data.setprice(rs.getDouble("price"));
        data.setdiscount_percent(rs.getDouble("discount_percent"));
        data.setdiscount_amount(rs.getDouble("discount_amount"));
        data.settotal_gross(rs.getDouble("total_gross"));
        data.settotal_after_discount(rs.getDouble("total_after_discount"));
        data.setuom2(rs.getDouble("uom2"));
        data.setuom3(rs.getDouble("uom3"));
        data.setquantity_pcs(rs.getDouble("quantity_pcs"));
        data.setcost_pcs(rs.getDouble("cost_pcs"));
        data.setprice_pcs(rs.getDouble("price_pcs"));
        data.setquantity_open(rs.getDouble("quantity_open"));
        data.setquantity_pcs_open(rs.getDouble("quantity_pcs_open"));
        data.setbase_objtype(rs.getInt("base_objtype"));
        data.setbase_docentry(rs.getInt("base_docentry"));
        data.setbase_line_number(rs.getInt("base_line_number"));
        data.setprice_code(rs.getString("price_code"));
        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setobjtype(rs.getInt("objtype"));
        data.setaudituser(rs.getString("audituser"));

        data.setproduct_name(rs.getString("product_name"));
        data.setuom_code(rs.getString("uom_code"));
        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_ar_pos_return_detail1_get("+this.docentry+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ar_pos_return_detail1ext();
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
        ar_pos_return_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ar_pos_return_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
