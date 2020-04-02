/*
 * To change this ko_option, choose Tools | ko_options
 * and open the ko_option in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class ko_optionext extends ko_optioncls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String term_code_desc="";
    String simpanan_wajib_kode_akun_desc="";
    String simpanan_pokok_kode_akun_desc="";
    String simpanan_sukarela_kode_akun_desc="";
    String simpanan_khusus_kode_akun_desc="";
    String tunai_kode_akun_desc="";
    String transfer_kode_akun_desc="";
    String tunai_penampung_kode_akun_desc="";
    String transfer_penampung_kode_akun_desc="";


    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_option_insert( "
                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getsimpanan_wajib_kode_akun()+"', "
                    + "'"+this.getsimpanan_pokok_kode_akun()+"', "
                    + "'"+this.getsimpanan_sukarela_kode_akun()+"', "
                    + "'"+this.getsimpanan_khusus_kode_akun()+"', "
                    + "'"+this.gettunai_kode_akun()+"', "
                    + "'"+this.gettransfer_kode_akun()+"', "
                    + "'"+this.gettunai_penampung_kode_akun()+"', "
                    + "'"+this.gettransfer_penampung_kode_akun()+"', "
                    + "'"+this.getcut_off_day()+"', "
                    + "'"+this.getupdate_option_info()+"', "
                    + "'"+this.getdop_tagih()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_option_update( "
                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getsimpanan_wajib_kode_akun()+"', "
                    + "'"+this.getsimpanan_pokok_kode_akun()+"', "
                    + "'"+this.getsimpanan_sukarela_kode_akun()+"', "
                    + "'"+this.getsimpanan_khusus_kode_akun()+"', "
                    + "'"+this.gettunai_kode_akun()+"', "
                    + "'"+this.gettransfer_kode_akun()+"', "
                    + "'"+this.gettunai_penampung_kode_akun()+"', "
                    + "'"+this.gettransfer_penampung_kode_akun()+"', "
                    + "'"+this.getcut_off_day()+"', "
                    + "'"+this.getupdate_option_info()+"', "
                    + "'"+this.getdop_tagih()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_option_delete( "
                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getsimpanan_wajib_kode_akun()+"', "
                    + "'"+this.getsimpanan_pokok_kode_akun()+"', "
                    + "'"+this.getsimpanan_sukarela_kode_akun()+"', "
                    + "'"+this.getsimpanan_khusus_kode_akun()+"', "
                    + "'"+this.gettunai_kode_akun()+"', "
                    + "'"+this.gettransfer_kode_akun()+"', "
                    + "'"+this.gettunai_penampung_kode_akun()+"', "
                    + "'"+this.gettransfer_penampung_kode_akun()+"', "
                    + "'"+this.getcut_off_day()+"', "
                    + "'"+this.getupdate_option_info()+"', "
                    + "'"+this.getdop_tagih()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        try {
            db.execute(squery);
            insertsts=false;
            throw new CodeException("Data deleted");
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from ko_option where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String company_id) throws CodeException {
        squery="CALL sp_ko_option_get()";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setcompany_id(rs.getString("company_id"));
        this.setcompany_name(rs.getString("company_name"));
        this.setactive_sts(rs.getString("active_sts"));
        this.setaddress1(rs.getString("address1"));
        this.setaddress2(rs.getString("address2"));
        this.setcity(rs.getString("city"));
        this.setstate(rs.getString("state"));
        this.setzipcode(rs.getString("zipcode"));
        this.setphone(rs.getString("phone"));
        this.setfaximale(rs.getString("faximale"));
        this.setemail(rs.getString("email"));
        this.setpic(rs.getString("pic"));
        this.setregister_date(rs.getString("register_date"));
        this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        this.setterm_code(rs.getString("term_code"));
        this.setmonthly_no(rs.getInt("monthly_no"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        this.setsimpanan_wajib_kode_akun(rs.getString("simpanan_wajib_kode_akun"));
        this.setsimpanan_pokok_kode_akun(rs.getString("simpanan_pokok_kode_akun"));
        this.setsimpanan_sukarela_kode_akun(rs.getString("simpanan_sukarela_kode_akun"));
        this.setsimpanan_khusus_kode_akun(rs.getString("simpanan_khusus_kode_akun"));
        this.settunai_kode_akun(rs.getString("tunai_kode_akun"));
        this.settransfer_kode_akun(rs.getString("transfer_kode_akun"));
        this.settunai_penampung_kode_akun(rs.getString("tunai_penampung_kode_akun"));
        this.settransfer_penampung_kode_akun(rs.getString("transfer_penampung_kode_akun"));

        this.setcut_off_day(rs.getInt("cut_off_day"));
        this.setupdate_option_info(rs.getString("update_option_info"));
        this.setdop_tagih(rs.getInt("dop_tagih"));

        this.setterm_code_desc(rs.getString("term_desc"));
        this.setsimpanan_wajib_kode_akun_desc(rs.getString("simpanan_wajib_akun_desc"));
        this.setsimpanan_pokok_kode_akun_desc(rs.getString("simpanan_pokok_akun_desc"));
        this.setsimpanan_sukarela_kode_akun_desc(rs.getString("simpanan_sukarela_akun_desc"));
        this.setsimpanan_khusus_kode_akun_desc(rs.getString("simpanan_khusus_akun_desc"));
        this.settunai_kode_akun_desc(rs.getString("tunai_akun_desc"));
        this.settransfer_kode_akun_desc(rs.getString("transfer_akun_desc"));
        this.settunai_penampung_kode_akun_desc(rs.getString("tunai_penampung_akun_desc"));
        this.settransfer_penampung_kode_akun_desc(rs.getString("transfer_penampung_akun_desc"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_option_get()";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_option_get()";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_option_get()";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_option_get()";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getClassName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean refresh() throws CodeException {
        if (this.initdata(this.getcompany_id())){
            return true;
        }
        return false;
    }

    public String getterm_code_desc() { return term_code_desc;}
    public String getsimpanan_wajib_kode_akun_desc() { return simpanan_wajib_kode_akun_desc;}
    public String getsimpanan_pokok_kode_akun_desc() { return simpanan_pokok_kode_akun_desc;}
    public String getsimpanan_sukarela_kode_akun_desc() { return simpanan_sukarela_kode_akun_desc;}
    public String getsimpanan_khusus_kode_akun_desc() { return simpanan_khusus_kode_akun_desc;}
    public String gettunai_kode_akun_desc() { return tunai_kode_akun_desc;}
    public String gettransfer_kode_akun_desc() { return transfer_kode_akun_desc;}
    public String gettunai_penampung_kode_akun_desc() { return tunai_penampung_kode_akun_desc;}
    public String gettransfer_penampung_kode_akun_desc() { return transfer_penampung_kode_akun_desc;}

    public void setsimpanan_wajib_kode_akun_desc(String simpanan_wajib_kode_akun_desc) { this.simpanan_wajib_kode_akun_desc = simpanan_wajib_kode_akun_desc;}
    public void setsimpanan_pokok_kode_akun_desc(String simpanan_pokok_kode_akun_desc) { this.simpanan_pokok_kode_akun_desc = simpanan_pokok_kode_akun_desc;}
    public void setsimpanan_sukarela_kode_akun_desc(String simpanan_sukarela_kode_akun_desc) { this.simpanan_sukarela_kode_akun_desc = simpanan_sukarela_kode_akun_desc;}
    public void setsimpanan_khusus_kode_akun_desc(String simpanan_khusus_kode_akun_desc) { this.simpanan_khusus_kode_akun_desc = simpanan_khusus_kode_akun_desc;}
    public void settunai_kode_akun_desc(String tunai_kode_akun_desc) { this.tunai_kode_akun_desc = tunai_kode_akun_desc;}
    public void settransfer_kode_akun_desc(String transfer_kode_akun_desc) { this.transfer_kode_akun_desc = transfer_kode_akun_desc;}
    public void settunai_penampung_kode_akun_desc(String tunai_penampung_kode_akun_desc) { this.tunai_penampung_kode_akun_desc = tunai_penampung_kode_akun_desc;}
    public void settransfer_penampung_kode_akun_desc(String transfer_penampung_kode_akun_desc) { this.transfer_penampung_kode_akun_desc = transfer_penampung_kode_akun_desc;}
    public void setterm_code_desc(String term_code_desc) { this.term_code_desc = term_code_desc;}



}
