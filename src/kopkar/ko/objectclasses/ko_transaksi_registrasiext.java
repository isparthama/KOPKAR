/*
 * To change this ko_transaksi_registrasi, choose Tools | ko_transaksi_registrasis
 * and open the ko_transaksi_registrasi in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_transaksi_registrasicls;
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
public class ko_transaksi_registrasiext extends ko_transaksi_registrasicls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private ko_departemenext dept_info=new ko_departemenext();
    private ko_jabatanext jabt_info = new ko_jabatanext();

    public ko_transaksi_registrasiext() {
        this.setdocument_date(GlobalUtils.sessiondate);
        this.setmember_number("");
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        this.setregister_date(GlobalUtils.formatDate(this.getregister_date(), "yyyy-MM-dd"));
        this.settanggal_masuk(GlobalUtils.formatDate(this.gettanggal_masuk(), "yyyy-MM-dd"));
        ResultSet rs;
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_registrasi_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getmember_name()+"', "
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
                        + "'"+this.getemployee_sts()+"', "
                        + "'"+this.getemployee_number()+"', "
                        + "'"+this.gettanggal_masuk()+"', "
                        + "'"+this.getsex()+"', "
                        + "'"+this.getreligion()+"', "
                        + "'"+this.getdepartment_code()+"', "
                        + "'"+this.getposition_code()+"', "
                        + "'"+this.getregister_date()+"', "
                        + "'"+this.getsimpanan_wajib()+"', "
                        + "'"+this.getsimpanan_pokok()+"', "
                        + "'"+this.getsimpanan_sukarela()+"', "
                        + "'"+this.getsimpanan_khusus()+"', "
                        + "'"+this.gethp()+"', "
                        + "'"+this.getmember_sts()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocument_number(rs.getString("document_number"));
                }

            } else {
                squery="call sp_ko_transaksi_registrasi_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getmember_name()+"', "
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
                        + "'"+this.getemployee_sts()+"', "
                        + "'"+this.getemployee_number()+"', "
                        + "'"+this.gettanggal_masuk()+"', "
                        + "'"+this.getsex()+"', "
                        + "'"+this.getreligion()+"', "
                        + "'"+this.getdepartment_code()+"', "
                        + "'"+this.getposition_code()+"', "
                        + "'"+this.getregister_date()+"', "
                        + "'"+this.getsimpanan_wajib()+"', "
                        + "'"+this.getsimpanan_pokok()+"', "
                        + "'"+this.getsimpanan_sukarela()+"', "
                        + "'"+this.getsimpanan_khusus()+"', "
                        + "'"+this.gethp()+"', "
                        + "'"+this.getmember_sts()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
            }
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_registrasi_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getmember_name()+"', "
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
                    + "'"+this.getemployee_sts()+"', "
                    + "'"+this.getemployee_number()+"', "
                    + "'"+this.gettanggal_masuk()+"', "
                    + "'"+this.getsex()+"', "
                    + "'"+this.getreligion()+"', "
                    + "'"+this.getdepartment_code()+"', "
                    + "'"+this.getposition_code()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.gethp()+"', "
                    + "'"+this.getmember_sts()+"', "
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
        squery="select * from ko_transaksi_registrasi where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_registrasiext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_registrasi_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_registrasiext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setmember_number(GlobalUtils.churuf(rs.getString("member_number")));
        this.setmember_name(rs.getString("member_name"));
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
        this.setemployee_sts(rs.getString("employee_sts"));
        this.setemployee_number(rs.getString("employee_number"));
        this.settanggal_masuk(rs.getString("tanggal_masuk"));
        this.setsex(rs.getString("sex"));
        this.setreligion(rs.getString("religion"));
        this.setdepartment_code(rs.getString("department_code"));
        this.setposition_code(rs.getString("position_code"));
        this.setregister_date(rs.getString("register_date"));

        this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));

        this.sethp(rs.getString("hp"));
        this.setmember_sts(rs.getString("member_sts"));

        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.dept_info.setnama_departemen(rs.getString("department_name"));
        this.jabt_info.setnama_jabatan(rs.getString("position_name"));

        
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_registrasi_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_registrasiext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_registrasi_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_registrasiext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_registrasi_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_registrasiext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_registrasi_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_registrasiext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getdocument_number())){
            return true;
        }
        return false;
    }

    /**
     * @return the dept_info
     */
    public ko_departemenext getDept_info() {
        return dept_info;
    }

    /**
     * @param dept_info the dept_info to set
     */
    public void setDept_info(ko_departemenext dept_info) {
        this.dept_info = dept_info;
    }

    /**
     * @return the jabt_info
     */
    public ko_jabatanext getJabt_info() {
        return jabt_info;
    }

    /**
     * @param jabt_info the jabt_info to set
     */
    public void setJabt_info(ko_jabatanext jabt_info) {
        this.jabt_info = jabt_info;
    }

    public String getdocument_status_desc() {
        return GlobalUtils.getdocument_status_desc(this.getdocument_status());
    }

}
