/*
 * To change this setting_financial_rpt_detail2, choose Tools | Templates
 * and open the setting_financial_rpt_detail2 in the editor.
 */

package kopkar.gl.objectclasses;

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
public class setting_financial_rpt_detail2extcol extends ArrayList<setting_financial_rpt_detail2ext> {
    setting_financial_rpt_detail2ext data=new setting_financial_rpt_detail2ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new setting_financial_rpt_detail2ext();
    }
    public setting_financial_rpt_detail2extcol(Integer id){
        this.id=id;
    }

    public setting_financial_rpt_detail2ext getData() {
        return data;
    }

    public void setData(setting_financial_rpt_detail2ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setlineno(rs.getInt("lineno"));
        data.setlinenodetail(rs.getInt("linenodetail"));
        data.settextformulation(rs.getString("textformulation"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from setting_financial_rpt_detail2 where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new setting_financial_rpt_detail2ext();
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
        setting_financial_rpt_detail2ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(setting_financial_rpt_detail2extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
