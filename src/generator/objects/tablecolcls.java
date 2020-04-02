/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generator.objects;

import jdbc.DbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.GlobalUtils;

/**
 *
 * @author solution
 */
public class tablecolcls extends ArrayList<tablecls>{
    DbBean db;
    private tablecls data;

    public tablecolcls(DbBean db){
        this.db=db;
    }

    public Boolean initdata(){
        String squery="show tables";
        ResultSet rs;
        try {
            rs = db.executeQuery(squery);
            while (rs.next()){
                data=new tablecls(this.db);
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(tablecolcls.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean fillme(ResultSet rs) throws SQLException {
        this.data.setTablename(rs.getString("Tables_in_"+db.getDbname()));
        return true;
    }


}
