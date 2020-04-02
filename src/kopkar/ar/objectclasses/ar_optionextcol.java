/*
 * To change this ar_option, choose Tools | Templates
 * and open the ar_option in the editor.
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
public class ar_optionextcol extends ArrayList<ar_optionext> {
    ar_optionext data=new ar_optionext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ar_optionext();
    }
    public ar_optionextcol(Integer id){
        this.id=id;
    }

    public ar_optionext getData() {
        return data;
    }

    public void setData(ar_optionext data) {
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
        data.setterm_code(rs.getString("term_code"));
        data.setsalesman_code(rs.getString("salesman_code"));
        data.setcost_price_code(rs.getString("cost_price_code"));
        data.setsales_price_code(rs.getString("sales_price_code"));
        data.setdiscount_code(rs.getString("discount_code"));
        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setcounter_number(rs.getString("counter_number"));
        data.settextnotapos(rs.getString("textnotapos"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setaccset_code(rs.getString("accset_code"));
        data.setcash_account(rs.getString("cash_account"));
        data.settrns_account(rs.getString("trns_account"));
        data.setcrdt_account(rs.getString("crdt_account"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ar_option where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ar_optionext();
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
        ar_optionext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ar_optionextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
