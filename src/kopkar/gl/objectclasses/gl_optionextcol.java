/*
 * To change this gl_option, choose Tools | Templates
 * and open the gl_option in the editor.
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
public class gl_optionextcol extends ArrayList<gl_optionext> {
    gl_optionext data=new gl_optionext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new gl_optionext();
    }
    public gl_optionextcol(Integer id){
        this.id=id;
    }

    public gl_optionext getData() {
        return data;
    }

    public void setData(gl_optionext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setcompany_id(rs.getString("company_id"));
        data.setcompany_name(rs.getString("company_name"));
        data.setactive_sts(rs.getString("active_sts"));
        data.setaddress1(rs.getString("address1"));
        data.setaddress2(rs.getString("address2"));
        data.setcity(rs.getString("city"));
        data.setstate(rs.getString("state"));
        data.setzipcode(rs.getString("zipcode"));
        data.setphone(rs.getString("phone"));
        data.setfaximale(rs.getString("faximale"));
        data.setemail(rs.getString("email"));
        data.setpic(rs.getString("pic"));
        data.setregister_date(rs.getString("register_date"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from gl_option where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_optionext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer key){
        
        return -1;
    }

    public Boolean delete(int row) {
        gl_optionext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_optionextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
