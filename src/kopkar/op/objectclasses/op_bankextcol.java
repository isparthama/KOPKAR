/*
 * To change this op_bank, choose Tools | Templates
 * and open the op_bank in the editor.
 */

package kopkar.op.objectclasses;

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
public class op_bankextcol extends ArrayList<op_bankext> {
    op_bankext data=new op_bankext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new op_bankext();
    }
    public op_bankextcol(Integer id){
        this.id=id;
    }

    public op_bankext getData() {
        return data;
    }

    public void setData(op_bankext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setbank_code(rs.getString("bank_code"));
        data.setbank_desc(rs.getString("bank_desc"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from op_bank where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new op_bankext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer bank_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getbank_code().equals(bank_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        op_bankext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(op_bankextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
