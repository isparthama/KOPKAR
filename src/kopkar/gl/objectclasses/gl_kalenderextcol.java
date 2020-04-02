/*
 * To change this gl_kalender, choose Tools | Templates
 * and open the gl_kalender in the editor.
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
public class gl_kalenderextcol extends ArrayList<gl_kalenderext> {
    gl_kalenderext data=new gl_kalenderext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new gl_kalenderext();
    }
    public gl_kalenderextcol(){
        
    }

    public gl_kalenderext getData() {
        return data;
    }

    public void setData(gl_kalenderext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setyop(rs.getInt("yop"));
        data.setaktif(rs.getString("aktif"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from gl_kalender order by yop";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_kalenderext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer yop){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getyop().equals(yop)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        gl_kalenderext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_kalenderextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
