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
 * @author solution
 */
public class ko_monthly_processext {
    DbBean db=appsettinghandler.db;
    private String squery;

    public boolean run_sp_ko_monthly_process(String tahun, String bulan) {
        try {
            squery="call sp_ko_monthly_process("+tahun+","+bulan+",'"+GlobalUtils.audituser+"')";
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_monthly_processext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
