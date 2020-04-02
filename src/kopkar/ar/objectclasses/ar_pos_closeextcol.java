/*
 * To change this ar_pos_close, choose Tools | Templates
 * and open the ar_pos_close in the editor.
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
public class ar_pos_closeextcol extends ArrayList<ar_pos_closeext> {
    ar_pos_closeext data=new ar_pos_closeext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ar_pos_closeext();
    }
    public ar_pos_closeextcol(Integer id){
        this.id=id;
    }

    public ar_pos_closeext getData() {
        return data;
    }

    public void setData(ar_pos_closeext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setreference_number(rs.getString("reference_number"));
        data.setchasier_code(rs.getString("chasier_code"));
        data.setcounter_number(rs.getString("counter_number"));
        data.setdscription(rs.getString("dscription"));
        data.setcash_register_modal(rs.getDouble("cash_register_modal"));
        data.setsales_amount(rs.getDouble("sales_amount"));
        data.setreturn_amount(rs.getDouble("return_amount"));
        data.setnet_sales_plus_modal(rs.getDouble("net_sales_plus_modal"));
        data.setpayment_discount(rs.getDouble("payment_discount"));
        data.setpayment_voucher(rs.getDouble("payment_voucher"));
        data.setpayment_cash(rs.getDouble("payment_cash"));
        data.setpayment_salary(rs.getDouble("payment_salary"));
        data.setpayment_credit_card(rs.getDouble("payment_credit_card"));
        data.setpayment_debit_card(rs.getDouble("payment_debit_card"));
        data.setcash_register(rs.getDouble("cash_register"));
        data.setbalance_amount(rs.getDouble("balance_amount"));
        data.setclose_status(rs.getString("close_status"));
        data.setclose_number(rs.getInt("close_number"));
        data.setclose_date(rs.getString("close_date"));
        data.setclose_user(rs.getString("close_user"));
        data.setbaseentry(rs.getInt("baseentry"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ar_pos_close where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ar_pos_closeext();
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
        ar_pos_closeext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ar_pos_closeextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
