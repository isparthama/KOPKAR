/*
 * To change this ko_pendidikan, choose Tools | Templates
 * and open the ko_pendidikan in the editor.
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
public class ko_pendidikanextcol extends ArrayList<ko_pendidikanext> {
    ko_pendidikanext data=new ko_pendidikanext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_pendidikanext();
    }
    public ko_pendidikanextcol(Integer id){
        this.id=id;
    }

    public ko_pendidikanext getData() {
        return data;
    }

    public void setData(ko_pendidikanext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setkode_pendidikan(rs.getString("kode_pendidikan"));
        data.setnama_pendidikan(rs.getString("nama_pendidikan"));
        data.setsort_no(rs.getInt("sort_no"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_pendidikan where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_pendidikanext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_pendidikan){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_pendidikan().equals(kode_pendidikan)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_pendidikanext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_pendidikanextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
