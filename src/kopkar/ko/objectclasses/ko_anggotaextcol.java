/*
 * To change this ko_anggota, choose Tools | Templates
 * and open the ko_anggota in the editor.
 */

package kopkar.ko.objectclasses;

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
public class ko_anggotaextcol extends ArrayList<ko_anggotaext> {
    ko_anggotaext data=new ko_anggotaext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_anggotaext();
    }
    public ko_anggotaextcol(Integer id){
        this.id=id;
    }

    public ko_anggotaext getData() {
        return data;
    }

    public void setData(ko_anggotaext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setmember_number(rs.getString("member_number"));
        data.setmember_name(rs.getString("member_name"));
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
        data.setemployee_sts(rs.getString("employee_sts"));
        data.setemployee_number(rs.getString("employee_number"));
        data.settanggal_masuk(rs.getString("tanggal_masuk"));
        data.setsex(rs.getString("sex"));
        data.setreligion(rs.getString("religion"));
        data.setdepartment_code(rs.getString("department_code"));
        data.setposition_code(rs.getString("position_code"));
        data.setregister_number(rs.getString("register_number"));
        data.setregister_date(rs.getString("register_date"));
        data.sethp(rs.getString("hp"));
        data.setmember_sts(rs.getString("member_sts"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_anggota where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_anggotaext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer member_number){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getmember_number().equals(member_number)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_anggotaext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_anggotaextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
