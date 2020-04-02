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
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class databasecolcls extends ArrayList<databasecls>{
    DbBean db=appsettinghandler.db;
    private databasecls data;

    public Boolean initdata(){
        String squery="show databases";
        ResultSet rs;
        try {
            rs = db.executeQuery(squery);
            while (rs.next()){
                data=new databasecls();
                if (fillme(rs)){
                    if (!data.getDatabase_name().equalsIgnoreCase("information_schema")){
                    this.add(data);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(databasecolcls.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean fillme(ResultSet rs) throws SQLException {
        this.data.setDatabase_name(rs.getString("Database"));
        return true;
    }


}
