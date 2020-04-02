/*
 * To change this report_category, choose Tools | Templates
 * and open the report_category in the editor.
 */

package kopkar.report_files.objectclasses;

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
public class report_categoryextcol extends ArrayList<report_categoryext> {
    report_categoryext data=new report_categoryext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new report_categoryext();
    }
    public report_categoryextcol(Integer id){
        this.id=id;
    }

    public report_categoryext getData() {
        return data;
    }

    public void setData(report_categoryext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setreport_category_id(rs.getInt("report_category_id"));
        data.setreport_category_code(rs.getString("report_category_code"));
        data.setreport_category_desc(rs.getString("report_category_desc"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from report_category where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new report_categoryext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer report_category_id){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getreport_category_id().equals(report_category_id)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        report_categoryext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(report_categoryextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
