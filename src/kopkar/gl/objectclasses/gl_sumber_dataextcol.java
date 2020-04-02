/*
 * To change this gl_sumber_data, choose Tools | Templates
 * and open the gl_sumber_data in the editor.
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
public class gl_sumber_dataextcol extends ArrayList<gl_sumber_dataext> {
    gl_sumber_dataext data=new gl_sumber_dataext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new gl_sumber_dataext();
    }
    public gl_sumber_dataextcol(Integer id){
        this.id=id;
    }

    public gl_sumber_dataext getData() {
        return data;
    }

    public void setData(gl_sumber_dataext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setkode_data_entry(rs.getString("kode_data_entry"));
        data.setnama_data_entry(rs.getString("nama_data_entry"));
        data.setdayseqno(rs.getInt("dayseqno"));
        data.setcoa_debet(rs.getString("coa_debet"));
        data.setcoa_kredit(rs.getString("coa_kredit"));
        data.setkode_gde(rs.getString("kode_gde"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from gl_sumber_data where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_sumber_dataext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_data_entry){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_data_entry().equals(kode_data_entry)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        gl_sumber_dataext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_sumber_dataextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
