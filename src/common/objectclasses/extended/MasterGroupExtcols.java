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
public class MasterGroupExtcols extends ArrayList<MasterGroupExt>{

    MasterGroupExt data;
    
    public Boolean fillme(ResultSet rs) throws SQLException{
        data.setId(rs.getInt("id"));
        data.setKodeGroup(rs.getString("KodeGroup"));
        data.setKeterangan(rs.getString("Keterangan"));

        data.setTanggalEntry(rs.getDate("TanggalEntry"));
        data.setTanggalUpdate(rs.getDate("TanggalUpdate"));
        data.setUserId(rs.getString("UserId"));
        return true;
    }
    public Boolean initdata(){
        DbBean db=appsettinghandler.dbcom;
        try {
            ResultSet rs = db.executeQuery("select * from mastergroup");
            while (rs.next()){
                data=new MasterGroupExt();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterGroupExtcols.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public Boolean initdata(String userid){
        DbBean db=appsettinghandler.dbcom;
        try {
            ResultSet rs = db.executeQuery("call sp_mastergroup_get_all('"+userid+"')");
            while (rs.next()){
                data=new MasterGroupExt();
                if (fillme(rs)){
                    data.setselected(rs.getInt("selected"));
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterGroupExtcols.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
