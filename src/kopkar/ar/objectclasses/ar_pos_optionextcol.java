/*
 * To change this ar_pos_option, choose Tools | Templates
 * and open the ar_pos_option in the editor.
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
public class ar_pos_optionextcol extends ArrayList<ar_pos_optionext> {
    ar_pos_optionext data=new ar_pos_optionext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ar_pos_optionext();
    }
    public ar_pos_optionextcol(Integer id){
        this.id=id;
    }

    public ar_pos_optionext getData() {
        return data;
    }

    public void setData(ar_pos_optionext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setcompany_id(rs.getString("company_id"));
        data.setcompany_name(rs.getString("company_name"));
        data.setactive_sts(rs.getString("active_sts"));
        data.setaddress1(rs.getString("address1"));
        data.setaddress2(rs.getString("address2"));
        data.setcity(rs.getString("city"));
        data.setstate(rs.getString("state"));
        data.setzipcode(rs.getString("zipcode"));
        data.setphone(rs.getString("phone"));
        data.setfaximale(rs.getString("faximale"));
        data.setemail(rs.getString("email"));
        data.setpic(rs.getString("pic"));
        data.setregister_date(rs.getString("register_date"));
        data.setcounter_number(rs.getString("counter_number"));
        data.settextnotapos(rs.getString("textnotapos"));
        data.settextnotapossts(rs.getString("textnotapossts"));
        data.setcustomer_code(rs.getString("customer_code"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setpetty_cash_account(rs.getString("petty_cash_account"));
        data.setcash_register_account(rs.getString("cash_register_account"));
        data.settemp_account(rs.getString("temp_account"));
        data.setdiscount_account(rs.getString("discount_account"));
        data.setvoucher_account(rs.getString("voucher_account"));
        data.setcash_account(rs.getString("cash_account"));
        data.setpayment_salary_account(rs.getString("payment_salary_account"));
        data.setdebit_card_account(rs.getString("debit_card_account"));
        data.setcredit_card_acount(rs.getString("credit_card_acount"));
        data.setreturn_account(rs.getString("return_account"));
        data.setbalance_account(rs.getString("balance_account"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ar_pos_option where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ar_pos_optionext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer company_id){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getcompany_id().equals(company_id)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ar_pos_optionext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ar_pos_optionextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
