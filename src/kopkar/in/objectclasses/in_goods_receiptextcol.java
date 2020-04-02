/*
 * To change this in_goods_receipt, choose Tools | Templates
 * and open the in_goods_receipt in the editor.
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
public class in_goods_receiptextcol extends ArrayList<in_goods_receiptext> {
    in_goods_receiptext data=new in_goods_receiptext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_goods_receiptext();
    }
    public in_goods_receiptextcol(Integer id){
        this.id=id;
    }

    public in_goods_receiptext getData() {
        return data;
    }

    public void setData(in_goods_receiptext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setdocument_duedate(rs.getString("document_duedate"));
        data.setsupplier_code(rs.getString("supplier_code"));
        data.setreference_number(rs.getString("reference_number"));
        data.setterm_code(rs.getString("term_code"));
        data.setdiscount_code(rs.getString("discount_code"));
        data.setprice_code(rs.getString("price_code"));
        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setsalesman_code(rs.getString("salesman_code"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
        data.setinclude_tax(rs.getString("include_tax"));
        data.settax_percent(rs.getDouble("tax_percent"));
        data.settotal_bfr_discount(rs.getDouble("total_bfr_discount"));
        data.settotal_discount(rs.getDouble("total_discount"));
        data.settotal_aft_discount(rs.getDouble("total_aft_discount"));
        data.settax_amount(rs.getDouble("tax_amount"));
        data.settotal_aft_tax(rs.getDouble("total_aft_tax"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setobjtype(rs.getInt("objtype"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_goods_receipt where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_goods_receiptext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer document_number){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocument_number().equals(document_number)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_goods_receiptext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_goods_receiptextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
