/*
 * To change this op_payment_term, choose Tools | Templates
 * and open the op_payment_term in the editor.
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
public class op_payment_termextcol extends ArrayList<op_payment_termext> {
    op_payment_termext data=new op_payment_termext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new op_payment_termext();
    }
    public op_payment_termextcol(Integer id){
        this.id=id;
    }

    public op_payment_termext getData() {
        return data;
    }

    public void setData(op_payment_termext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setterm_code(rs.getString("term_code"));
        data.setterm_desc(rs.getString("term_desc"));
        data.setdays(rs.getInt("days"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from op_payment_term where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new op_payment_termext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer term_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getterm_code().equals(term_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        op_payment_termext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(op_payment_termextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
