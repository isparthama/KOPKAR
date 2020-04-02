/*
 * To change this gl_kalender_detail1, choose Tools | Templates
 * and open the gl_kalender_detail1 in the editor.
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
public class gl_kalender_detail1extcol extends ArrayList<gl_kalender_detail1ext> {
    gl_kalender_detail1ext data=new gl_kalender_detail1ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;
    private Integer yop;

    public void insert(){
        data= new gl_kalender_detail1ext();
    }
    public gl_kalender_detail1extcol(Integer yop){
        this.yop=yop;
    }

    public gl_kalender_detail1ext getData() {
        return data;
    }

    public void setData(gl_kalender_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setyop(rs.getInt("yop"));
        data.setmop(rs.getInt("mop"));
        data.setaktif(rs.getString("aktif"));
        data.setrekalkulasi(rs.getString("rekalkulasi"));
        data.setclosedate(rs.getString("closedate"));
        data.setcloseuser(rs.getString("closeuser"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_gl_kalender_detail1_get("+this.yop+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_kalender_detail1ext();
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
        gl_kalender_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_kalender_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
