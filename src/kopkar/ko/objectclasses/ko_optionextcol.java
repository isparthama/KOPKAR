/*
 * To change this ko_option, choose Tools | Templates
 * and open the ko_option in the editor.
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
public class ko_optionextcol extends ArrayList<ko_optionext> {
    ko_optionext data=new ko_optionext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_optionext();
    }
    public ko_optionextcol(Integer id){
        this.id=id;
    }

    public ko_optionext getData() {
        return data;
    }

    public void setData(ko_optionext data) {
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
        data.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        data.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        data.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        data.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        data.setterm_code(rs.getString("term_code"));
        data.setmonthly_no(rs.getInt("monthly_no"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setsimpanan_wajib_kode_akun(rs.getString("simpanan_wajib_kode_akun"));
        data.setsimpanan_pokok_kode_akun(rs.getString("simpanan_pokok_kode_akun"));
        data.setsimpanan_sukarela_kode_akun(rs.getString("simpanan_sukarela_kode_akun"));
        data.setsimpanan_khusus_kode_akun(rs.getString("simpanan_khusus_kode_akun"));
        data.settunai_kode_akun(rs.getString("tunai_kode_akun"));
        data.settransfer_kode_akun(rs.getString("transfer_kode_akun"));
        data.settunai_penampung_kode_akun(rs.getString("tunai_penampung_kode_akun"));
        data.settransfer_penampung_kode_akun(rs.getString("transfer_penampung_kode_akun"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_option where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_optionext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer company_id){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getcompany_id().equals(company_id)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_optionext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_optionextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
