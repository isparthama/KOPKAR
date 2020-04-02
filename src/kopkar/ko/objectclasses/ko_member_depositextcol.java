/*
 * To change this ko_member_deposit, choose Tools | Templates
 * and open the ko_member_deposit in the editor.
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
public class ko_member_depositextcol extends ArrayList<ko_member_depositext> {
    ko_member_depositext data=new ko_member_depositext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_member_depositext();
    }
    public ko_member_depositextcol(Integer id){
        this.id=id;
    }

    public ko_member_depositext getData() {
        return data;
    }

    public void setData(ko_member_depositext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setmember_number(rs.getString("member_number"));
        data.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        data.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        data.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        data.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        data.setpinjaman(rs.getDouble("pinjaman"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_member_deposit where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_member_depositext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer id){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getid().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_member_depositext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_member_depositextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
