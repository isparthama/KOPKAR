/*
 * To change this ar_pos_counter, choose Tools | Templates
 * and open the ar_pos_counter in the editor.
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
public class ar_pos_counterextcol extends ArrayList<ar_pos_counterext> {
    ar_pos_counterext data=new ar_pos_counterext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ar_pos_counterext();
    }
    public ar_pos_counterextcol(Integer id){
        this.id=id;
    }

    public ar_pos_counterext getData() {
        return data;
    }

    public void setData(ar_pos_counterext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setcounter_number(rs.getString("counter_number"));
        data.setcounter_name(rs.getString("counter_name"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ar_pos_counter where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ar_pos_counterext();
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
        ar_pos_counterext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ar_pos_counterextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
