/*
 * To change this ko_pinjaman_tipe, choose Tools | Templates
 * and open the ko_pinjaman_tipe in the editor.
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
public class ko_pinjaman_tipeextcol extends ArrayList<ko_pinjaman_tipeext> {
    ko_pinjaman_tipeext data=new ko_pinjaman_tipeext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_pinjaman_tipeext();
    }
    public ko_pinjaman_tipeextcol(Integer id){
        this.id=id;
    }

    public ko_pinjaman_tipeext getData() {
        return data;
    }

    public void setData(ko_pinjaman_tipeext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setkode_pinjaman_tipe(rs.getString("kode_pinjaman_tipe"));
        data.setnama_pinjaman_tipe(rs.getString("nama_pinjaman_tipe"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_pinjaman_tipe where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_pinjaman_tipeext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_pinjaman_tipe){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_pinjaman_tipe().equals(kode_pinjaman_tipe)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_pinjaman_tipeext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_pinjaman_tipeextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
