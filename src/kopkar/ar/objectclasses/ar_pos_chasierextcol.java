/*
 * To change this ar_pos_chasier, choose Tools | Templates
 * and open the ar_pos_chasier in the editor.
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
public class ar_pos_chasierextcol extends ArrayList<ar_pos_chasierext> {
    ar_pos_chasierext data=new ar_pos_chasierext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ar_pos_chasierext();
    }
    public ar_pos_chasierextcol(Integer id){
        this.id=id;
    }

    public ar_pos_chasierext getData() {
        return data;
    }

    public void setData(ar_pos_chasierext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setchasier_code(rs.getString("chasier_code"));
        data.setchasier_name(rs.getString("chasier_name"));
        data.setuser_code(rs.getString("user_code"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ar_pos_chasier where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ar_pos_chasierext();
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
        ar_pos_chasierext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ar_pos_chasierextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
