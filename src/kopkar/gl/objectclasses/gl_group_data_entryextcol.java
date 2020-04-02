/*
 * To change this gl_group_data_entry, choose Tools | Templates
 * and open the gl_group_data_entry in the editor.
 */

package kopkar.gl.objectclasses;

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
public class gl_group_data_entryextcol extends ArrayList<gl_group_data_entryext> {
    gl_group_data_entryext data=new gl_group_data_entryext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new gl_group_data_entryext();
    }
    public gl_group_data_entryextcol(Integer id){
        this.id=id;
    }

    public gl_group_data_entryext getData() {
        return data;
    }

    public void setData(gl_group_data_entryext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setkode_gde(rs.getString("kode_gde"));
        data.setnama_gde(rs.getString("nama_gde"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from gl_group_data_entry where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_group_data_entryext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_gde){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_gde().equals(kode_gde)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        gl_group_data_entryext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_group_data_entryextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
