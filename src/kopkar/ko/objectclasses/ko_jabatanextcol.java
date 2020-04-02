/*
 * To change this ko_jabatan, choose Tools | Templates
 * and open the ko_jabatan in the editor.
 */

package kopkar.ko.objectclasses;

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
public class ko_jabatanextcol extends ArrayList<ko_jabatanext> {
    ko_jabatanext data=new ko_jabatanext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_jabatanext();
    }
    public ko_jabatanextcol(Integer id){
        this.id=id;
    }

    public ko_jabatanext getData() {
        return data;
    }

    public void setData(ko_jabatanext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setkode_jabatan(rs.getString("kode_jabatan"));
        data.setnama_jabatan(rs.getString("nama_jabatan"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_jabatan where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_jabatanext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_jabatan){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_jabatan().equals(kode_jabatan)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_jabatanext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_jabatanextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
