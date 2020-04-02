/*
 * To change this setting_financial_rpt, choose Tools | Templates
 * and open the setting_financial_rpt in the editor.
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
public class setting_financial_rptextcol extends ArrayList<setting_financial_rptext> {
    setting_financial_rptext data=new setting_financial_rptext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new setting_financial_rptext();
    }
    public setting_financial_rptextcol(Integer id){
        this.id=id;
    }

    public setting_financial_rptext getData() {
        return data;
    }

    public void setData(setting_financial_rptext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setdocentry(rs.getInt("docentry"));
        data.setreportname(rs.getString("reportname"));
        data.setreportdesc(rs.getString("reportdesc"));
        data.setreprocess(rs.getString("reprocess"));
        data.setlastyop(rs.getInt("lastyop"));
        data.setlastmop(rs.getInt("lastmop"));
        data.setcratedate(rs.getString("cratedate"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setobjtype(rs.getInt("objtype"));
        data.setcmpnyid(rs.getString("cmpnyid"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from setting_financial_rpt where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new setting_financial_rptext();
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
        setting_financial_rptext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(setting_financial_rptextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
