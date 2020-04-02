/*
 * To change this master_brand, choose Tools | Templates
 * and open the master_brand in the editor.
 */

package ikan.in.objectclasses;


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
public class master_brandextcol extends ArrayList<master_brandext> {
    master_brandext data=new master_brandext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new master_brandext();
    }
    public master_brandextcol(Integer id){
        this.id=id;
    }

    public master_brandext getData() {
        return data;
    }

    public void setData(master_brandext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setkodebrand(rs.getString("kodebrand"));
        data.setnamabrand(rs.getString("namabrand"));
        data.setobjtype(rs.getInt("objtype"));
        data.setaudituser(rs.getString("audituser"));
        data.setauditdate(rs.getString("auditdate"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from master_brand where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new master_brandext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kodebrand){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkodebrand().equals(kodebrand)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        master_brandext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(master_brandextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
