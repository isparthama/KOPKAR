/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bmtapp.objectclasses.bmtapp.extended;

import bmtapp.jdbc.DbBean;
import bmtapp.utils.CodeException;
import bmtapp.utils.appsettinghandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author solution
 */
public class templateextcol extends ArrayList<templateext> {
    templateext data=new templateext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new templateext();
    }
    public templateextcol(Integer id){
        this.id=id;
    }

    public templateext getData() {
        return data;
    }

    public void setData(templateext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        //getfillmecol
        data.setId(rs.getInt("id"));
        data.setid(0);
        data.setLineno(rs.getInt("lineno"));
        data.setRowno(rs.getInt("rowno"));
        data.setColumntype(rs.getString("columntype"));
        data.setLevelno(rs.getInt("levelno"));
        data.setTextheader(rs.getString("textheader"));
        data.setAllowformulation(rs.getString("allowformulation"));
        data.setSummary(rs.getString("summary"));
        data.setTextformulation(rs.getString("textformulation"));
        data.setVisorder(rs.getInt("visorder"));
        data.setShowdata(rs.getString("showdata"));
        //getfillmecolend

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from template where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new templateext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer KEY){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getKEY().equals(KEY)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        templateext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(templateextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
