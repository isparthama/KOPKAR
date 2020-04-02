/*
 * To change this setting_common_rpt_detail1, choose Tools | Templates
 * and open the setting_common_rpt_detail1 in the editor.
 */

package common.objectclasses.extended;

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
public class setting_common_rpt_detail1extcol extends ArrayList<setting_common_rpt_detail1ext> {
    setting_common_rpt_detail1ext data=new setting_common_rpt_detail1ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new setting_common_rpt_detail1ext();
    }
    public setting_common_rpt_detail1extcol(Integer id){
        this.id=id;
    }

    public setting_common_rpt_detail1ext getData() {
        return data;
    }

    public void setData(setting_common_rpt_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setdocentry(rs.getInt("docentry"));
        data.setlineno(rs.getInt("lineno"));
        data.setrowno(rs.getInt("rowno"));
        data.setcolumntype(rs.getString("columntype"));
        data.setlevelno(rs.getInt("levelno"));
        data.settextheader(rs.getString("textheader"));
        data.setallowformulation(rs.getString("allowformulation"));
        data.setsummary(rs.getString("summary"));
        data.settextformulation(rs.getString("textformulation"));
        data.setvisorder(rs.getInt("visorder"));
        data.setshowdata(rs.getString("showdata"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_setting_common_rpt_detail1_get("+this.id+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new setting_common_rpt_detail1ext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer docentry){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocentry().equals(docentry)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        setting_common_rpt_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(setting_common_rpt_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
