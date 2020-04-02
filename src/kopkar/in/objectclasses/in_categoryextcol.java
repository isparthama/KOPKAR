/*
 * To change this in_category, choose Tools | Templates
 * and open the in_category in the editor.
 */

package kopkar.in.objectclasses;

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
public class in_categoryextcol extends ArrayList<in_categoryext> {
    in_categoryext data=new in_categoryext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_categoryext();
    }
    public in_categoryextcol(Integer id){
        this.id=id;
    }

    public in_categoryext getData() {
        return data;
    }

    public void setData(in_categoryext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setcategory_code(rs.getString("category_code"));
        data.setcategory_name(rs.getString("category_name"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_category where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_categoryext();
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
        in_categoryext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_categoryextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
