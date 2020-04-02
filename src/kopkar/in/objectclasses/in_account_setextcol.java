/*
 * To change this in_account_set, choose Tools | Templates
 * and open the in_account_set in the editor.
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
public class in_account_setextcol extends ArrayList<in_account_setext> {
    in_account_setext data=new in_account_setext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_account_setext();
    }
    public in_account_setextcol(Integer id){
        this.id=id;
    }

    public in_account_setext getData() {
        return data;
    }

    public void setData(in_account_setext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setaccset_kode(rs.getString("accset_kode"));
        data.setaccset_desc(rs.getString("accset_desc"));
        data.setsls_account_code(rs.getString("sls_account_code"));
        data.setinv_account_code(rs.getString("inv_account_code"));
        data.sethpp_account_code(rs.getString("hpp_account_code"));
        data.setpot_account_code(rs.getString("pot_account_code"));
        data.setactive_sts(rs.getString("active_sts"));
        data.setentry_date(rs.getString("entry_date"));
        data.setaudit_date(rs.getString("audit_date"));
        data.setaudit_user(rs.getString("audit_user"));
        data.setinc_account_code(rs.getString("inc_account_code"));
        data.setoug_account_code(rs.getString("oug_account_code"));
        data.settrn_account_code(rs.getString("trn_account_code"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_account_set where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_account_setext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer accset_kode){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getaccset_kode().equals(accset_kode)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_account_setext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_account_setextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
