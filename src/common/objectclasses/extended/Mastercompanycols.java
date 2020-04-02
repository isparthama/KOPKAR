/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses.extended;

import common.objectclasses.Mastercompany;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class Mastercompanycols extends ArrayList<Mastercompany>{

    Mastercompany data;
    
    public Boolean fillme(ResultSet rs) throws SQLException{
        data.setCompany(rs.getString("company"));
        data.setDatabase(rs.getString("database"));
        data.setDescription(rs.getString("description"));
        data.setSelected(rs.getInt("selected"));
        return true;
    }
    public Boolean initdata(){
        DbBean db=appsettinghandler.dbcom;
        try {
            ResultSet rs = db.executeQuery("select * from mastercompany");
            while (rs.next()){
                data=new Mastercompany();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mastercompanycols.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
