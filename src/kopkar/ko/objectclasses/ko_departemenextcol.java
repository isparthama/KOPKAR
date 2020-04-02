/*
 * To change this ko_departemen, choose Tools | Templates
 * and open the ko_departemen in the editor.
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
public class ko_departemenextcol extends ArrayList<ko_departemenext> {
    ko_departemenext data=new ko_departemenext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_departemenext();
    }
    public ko_departemenextcol(Integer id){
        this.id=id;
    }

    public ko_departemenext getData() {
        return data;
    }

    public void setData(ko_departemenext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setkode_departemen(rs.getString("kode_departemen"));
        data.setnama_departemen(rs.getString("nama_departemen"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_departemen where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_departemenext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_departemen){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_departemen().equals(kode_departemen)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_departemenext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_departemenextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
