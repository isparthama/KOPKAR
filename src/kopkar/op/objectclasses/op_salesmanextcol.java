/*
 * To change this op_salesman, choose Tools | Templates
 * and open the op_salesman in the editor.
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
public class op_salesmanextcol extends ArrayList<op_salesmanext> {
    op_salesmanext data=new op_salesmanext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new op_salesmanext();
    }
    public op_salesmanextcol(Integer id){
        this.id=id;
    }

    public op_salesmanext getData() {
        return data;
    }

    public void setData(op_salesmanext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setsalesman_code(rs.getString("salesman_code"));
        data.setsalesman_name(rs.getString("salesman_name"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from op_salesman where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new op_salesmanext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer salesman_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getsalesman_code().equals(salesman_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        op_salesmanext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(op_salesmanextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
