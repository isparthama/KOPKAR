/*
 * To change this in_measure, choose Tools | Templates
 * and open the in_measure in the editor.
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
public class in_measureextcol extends ArrayList<in_measureext> {
    in_measureext data=new in_measureext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_measureext();
    }
    public in_measureextcol(Integer id){
        this.id=id;
    }

    public in_measureext getData() {
        return data;
    }

    public void setData(in_measureext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setuom_code(rs.getString("uom_code"));
        data.setuom_desc(rs.getString("uom_desc"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_measure where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_measureext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer uom_code){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getuom_code().equals(uom_code)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_measureext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_measureextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
