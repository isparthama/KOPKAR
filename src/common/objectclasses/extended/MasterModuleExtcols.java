/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses.extended;

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
public class MasterModuleExtcols extends ArrayList<MasterModuleExt>{

    MasterModuleExt data;
    
    public Boolean fillme(ResultSet rs) throws SQLException{
        data.setModule(rs.getString("module"));
        data.setDescription(rs.getString("Description"));
        data.setTanggalEntry(rs.getDate("tanggalentry"));
        data.setTanggalUpdate(rs.getDate("tanggalupdate"));
        data.setUserId(rs.getString("userid"));
        return true;
    }
    public Boolean initdata(){
        DbBean db=appsettinghandler.dbcom;
        try {
            ResultSet rs = db.executeQuery("select * from mastermodule");
            while (rs.next()){
                data=new MasterModuleExt();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterModuleExtcols.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
