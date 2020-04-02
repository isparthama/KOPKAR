/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.ko.objectclasses;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author aryadanaraya
 */
public class ko_recalculate_simpanan_pinjaman {
    DbBean db=appsettinghandler.db;

    public Boolean process(Integer yop,Integer mop, String update){
        try {
            String squery="call sp_recalculate_ko_anggota_simpanan_by_periode ("+yop+","+mop+",'"+update+"','"+GlobalUtils.userid+"')";
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_recalculate_simpanan_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
