/*
 * To change this in_warehouse_type, choose Tools | Templates
 * and open the in_warehouse_type in the editor.
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
public class in_warehouse_typeextcol extends ArrayList<in_warehouse_typeext> {
    in_warehouse_typeext data=new in_warehouse_typeext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_warehouse_typeext();
    }
    public in_warehouse_typeextcol(Integer id){
        this.id=id;
    }

    public in_warehouse_typeext getData() {
        return data;
    }

    public void setData(in_warehouse_typeext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setwarehouse_type(rs.getString("warehouse_type"));
        data.setwarehouse_type_desc(rs.getString("warehouse_type_desc"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_warehouse_type where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_warehouse_typeext();
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
        in_warehouse_typeext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_warehouse_typeextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
