/*
 * To change this gl_rab, choose Tools | Templates
 * and open the gl_rab in the editor.
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
public class gl_rabextcol extends ArrayList<gl_rabext> {
    gl_rabext data=new gl_rabext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new gl_rabext();
    }
    public gl_rabextcol(Integer id){
        this.id=id;
    }

    public gl_rabext getData() {
        return data;
    }

    public void setData(gl_rabext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setkode_rab(rs.getString("kode_rab"));
        data.setnama_rab(rs.getString("nama_rab"));
        data.setrab_debet(rs.getString("rab_debet"));
        data.setrab_kredit(rs.getString("rab_kredit"));
        data.setaktif(rs.getString("aktif"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from gl_rab where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_rabext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_rab){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_rab().equals(kode_rab)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        gl_rabext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_rabextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
