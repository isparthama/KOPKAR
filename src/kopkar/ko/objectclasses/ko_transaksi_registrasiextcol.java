/*
 * To change this ko_transaksi_registrasi, choose Tools | Templates
 * and open the ko_transaksi_registrasi in the editor.
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
public class ko_transaksi_registrasiextcol extends ArrayList<ko_transaksi_registrasiext> {
    ko_transaksi_registrasiext data=new ko_transaksi_registrasiext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_transaksi_registrasiext();
    }
    public ko_transaksi_registrasiextcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_registrasiext getData() {
        return data;
    }

    public void setData(ko_transaksi_registrasiext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
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
        data.setregister_date(rs.getString("register_date"));
        data.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        data.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        data.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        data.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        data.sethp(rs.getString("hp"));
        data.setmember_sts(rs.getString("member_sts"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_transaksi_registrasi where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_registrasiext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer document_number){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocument_number().equals(document_number)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_transaksi_registrasiext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_registrasiextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
