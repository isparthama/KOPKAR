/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.gl.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.DbBean;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class posting_journal_entryext extends proses_day_end_to_glcls {
    DbBean db=appsettinghandler.db;
    String squery="";

    public Boolean run_process(String syop, String smop) throws SQLException{
        switch (this.getTrxno()){
            case 1:
                squery="call sp_proses_posting_JE("+syop+","+smop+",'"+GlobalUtils.userid+"');";
                break;
        }
        ResultSet rs=db.executeQuery(squery);
        if (rs.next()){
            this.setNo_Process(rs.getInt("dayseqno"));
            this.setStatus(rs.getString("txtpesan"));
            return true;
        }

        return false;
    }
}
