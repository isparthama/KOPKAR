/*
 * To change this in_function, choose Tools | Templates
 * and open the in_function in the editor.
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
public class in_functionextcol extends ArrayList<in_functionext> {
    in_functionext data=new in_functionext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_functionext();
    }
    public in_functionextcol(Integer id){
        this.id=id;
    }

    public in_functionext getData() {
        return data;
    }

    public void setData(in_functionext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setfunction_code(rs.getString("function_code"));
        data.setfunction_name(rs.getString("function_name"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_function where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_functionext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer id){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getid().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_functionext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_functionextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
