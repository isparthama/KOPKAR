/*
 * To change this gl_group, choose Tools | Templates
 * and open the gl_group in the editor.
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
public class gl_groupextcol extends ArrayList<gl_groupext> {
    gl_groupext data=new gl_groupext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new gl_groupext();
    }
    public gl_groupextcol(Integer id){
        this.id=id;
    }

    public gl_groupext getData() {
        return data;
    }

    public void setData(gl_groupext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setkode_group(rs.getString("kode_group"));
        data.setnama_group(rs.getString("nama_group"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from gl_group where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_groupext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_group){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_group().equals(kode_group)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        gl_groupext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_groupextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
