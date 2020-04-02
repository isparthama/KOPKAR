/*
 * To change this ko_loan, choose Tools | Templates
 * and open the ko_loan in the editor.
 */

package kopkar.ko.objectclasses;

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
public class ko_loanextcol extends ArrayList<ko_loanext> {
    ko_loanext data=new ko_loanext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_loanext();
    }
    public ko_loanextcol(Integer id){
        this.id=id;
    }

    public ko_loanext getData() {
        return data;
    }

    public void setData(ko_loanext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setloan_code(rs.getString("loan_code"));
        data.setloan_name(rs.getString("loan_name"));
        data.setactive_sts(rs.getString("active_sts"));
        data.setrate(rs.getDouble("rate"));
        data.setmode(rs.getString("mode"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_loan where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_loanext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer loan_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getloan_code().equals(loan_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_loanext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_loanextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
