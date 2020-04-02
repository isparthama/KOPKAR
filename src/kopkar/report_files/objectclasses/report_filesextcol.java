/*
 * To change this report_files, choose Tools | Templates
 * and open the report_files in the editor.
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
public class report_filesextcol extends ArrayList<report_filesext> {
    report_filesext data=new report_filesext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new report_filesext();
    }
    public report_filesextcol(Integer id){
        this.id=id;
    }

    public report_filesext getData() {
        return data;
    }

    public void setData(report_filesext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setreport_code(rs.getString("report_code"));
        data.setreport_desc(rs.getString("report_desc"));
        data.setreport_category_code(rs.getInt("report_category_code"));
        data.setreport_file(rs.getString("report_file"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata(Integer report_category_code) throws SQLException{
        squery="select * from report_files where report_category_code="+report_category_code;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new report_filesext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer id){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getid().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        report_filesext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(report_filesextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
