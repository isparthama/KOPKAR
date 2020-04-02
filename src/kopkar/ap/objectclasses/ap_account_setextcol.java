/*
 * To change this ap_account_set, choose Tools | Templates
 * and open the ap_account_set in the editor.
 */

package kopkar.ap.objectclasses;

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
public class ap_account_setextcol extends ArrayList<ap_account_setext> {
    ap_account_setext data=new ap_account_setext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ap_account_setext();
    }
    public ap_account_setextcol(Integer id){
        this.id=id;
    }

    public ap_account_setext getData() {
        return data;
    }

    public void setData(ap_account_setext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setaccset_kode(rs.getString("accset_kode"));
        data.setaccset_desc(rs.getString("accset_desc"));
        data.setap_account_code(rs.getString("ap_account_code"));
        data.setdisc_account_code(rs.getString("disc_account_code"));
        data.setppay_account_code(rs.getString("ppay_account_code"));
        data.setactive_sts(rs.getString("active_sts"));
        data.setentry_date(rs.getString("entry_date"));
        data.setaudit_date(rs.getString("audit_date"));
        data.setaudit_user(rs.getString("audit_user"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ap_account_set where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ap_account_setext();
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
        ap_account_setext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ap_account_setextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
