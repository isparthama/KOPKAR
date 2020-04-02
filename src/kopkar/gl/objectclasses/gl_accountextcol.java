/*
 * To change this gl_account, choose Tools | Templates
 * and open the gl_account in the editor.
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
public class gl_accountextcol extends ArrayList<gl_accountext> {
    gl_accountext data=new gl_accountext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new gl_accountext();
    }
    public gl_accountextcol(Integer id){
        this.id=id;
    }

    public gl_accountext getData() {
        return data;
    }

    public void setData(gl_accountext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setkode_akun(rs.getString("kode_akun"));
        data.setnama_akun(rs.getString("nama_akun"));
        data.settipe_rek(rs.getString("tipe_rek"));
        data.setgroup_rek(rs.getString("group_rek"));
        data.setstatus(rs.getString("status"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from gl_account where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_accountext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_akun){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_akun().equals(kode_akun)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        gl_accountext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_accountextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
