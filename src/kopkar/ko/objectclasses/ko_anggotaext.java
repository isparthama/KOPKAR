/*
 * To change this ko_anggota, choose Tools | ko_anggotas
 * and open the ko_anggota in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_anggotacls;
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
public class ko_anggotaext extends ko_anggotacls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private ko_departemenext deptinfo=new ko_departemenext();
    private ko_jabatanext jbtinfo=new ko_jabatanext();
    ko_pendidikanext pddkinfo=new ko_pendidikanext();
    private String bagian="";
    private String nama_jabatan="";
    private String nama_pendidikan="";
    private String masakerja="";
    private Double simpanan_wajib_awal=new Double(0);
    private Double simpanan_pokok_awal = new Double(0);
    private Double simpanan_sukarela_awal = new Double(0);
    private Double simpanan_khusus_awal = new Double(0);
    private String bank_name;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.settanggal_masuk(GlobalUtils.formatDate(this.gettanggal_masuk(), "yyyy-MM-dd"));
        this.setregister_date(GlobalUtils.formatDate(this.getregister_date(), "yyyy-MM-dd"));
        this.setmember_name(this.getmember_name().replace("'", "\'"));
        if (insertsts){
            squery="call sp_ko_anggota_insert( "
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
                    + "'"+this.getkode_pendidikan()+"', "
                    + "'"+this.getregister_number()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.gethp()+"', "
                    + "'"+this.getmember_sts()+"', "
                    + "'"+this.getbank_code()+"', "
                    + "'"+this.getbank_branch()+"', "
                    + "'"+this.getbank_account()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_anggota_update( "
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
                    + "'"+this.getkode_pendidikan()+"', "
                    + "'"+this.getregister_number()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.gethp()+"', "
                    + "'"+this.getmember_sts()+"', "
                    + "'"+this.getbank_code()+"', "
                    + "'"+this.getbank_branch()+"', "
                    + "'"+this.getbank_account()+"', "
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
        squery="call sp_ko_anggota_delete( "
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
                    + "'"+this.getregister_number()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.gethp()+"', "
                    + "'"+this.getmember_sts()+"', "
                    + "'"+this.getbank_code()+"', "
                    + "'"+this.getbank_branch()+"', "
                    + "'"+this.getbank_account()+"', "
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
        squery="select * from ko_anggota where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggotaext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String member_number) throws CodeException {
        squery="CALL sp_ko_anggota_get('"+member_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggotaext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setmember_number(rs.getString("member_number"));
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
        this.setkode_pendidikan(rs.getString("kode_pendidikan"));
        this.setregister_number(rs.getString("register_number"));
        this.setregister_date(rs.getString("register_date"));
        this.sethp(rs.getString("hp"));
        this.setmember_sts(rs.getString("member_sts"));

        this.setbank_code(rs.getString("bank_code"));
        this.setbank_branch(rs.getString("bank_branch"));
        this.setbank_account(rs.getString("bank_account"));

        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.deptinfo=new ko_departemenext();
        this.deptinfo.setnama_departemen(rs.getString("department_name"));

        this.jbtinfo=new ko_jabatanext();
        this.jbtinfo.setnama_jabatan(rs.getString("position_name"));

        this.pddkinfo=new ko_pendidikanext();
        this.pddkinfo.setnama_pendidikan(rs.getString("pendidikan_name"));

        this.bank_name=rs.getString("bank_name");

        this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));

        this.setreference_number(rs.getString("reference_number"));
        this.setlast_update(rs.getString("last_update"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_anggota_get('"+this.getmember_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggotaext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_anggota_get('"+this.getmember_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggotaext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_anggota_get('"+this.getmember_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggotaext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_anggota_get('"+this.getmember_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggotaext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getmember_number())){
            return true;
        }
        return false;
    }

    public ko_departemenext getdepinfo() {
        return this.deptinfo;
    }

    public ko_jabatanext getjbtinfo() {
        return this.jbtinfo;
    }

    public ko_pendidikanext getpddkinfo() {
        return this.pddkinfo;
    }

    /**
     * @return the simpanan_wajib
     */

    public boolean initdata_mohon(String member_number) {
        squery="CALL sp_ko_transaksi_mohon_get_anggota_info('"+member_number+"')";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme_mohon(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggotaext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean fillme_mohon(ResultSet rs) throws SQLException {
         this.setmember_number(rs.getString("member_number"));
         this.setmember_name(rs.getString("member_name"));
         this.setemployee_number(rs.getString("employee_number"));
         this.setemployee_sts(rs.getString("employee_sts"));
         this.settanggal_masuk(rs.getString("tanggal_masuk"));
         this.setbagian(rs.getString("bagian"));
         this.deptinfo=new ko_departemenext();
         this.deptinfo.setnama_departemen(this.getbagian());
         this.setnama_jabatan(rs.getString("nama_jabatan"));
         this.jbtinfo=new ko_jabatanext();
         this.jbtinfo.setnama_jabatan(this.getnama_jabatan());
         this.setmasakerja(rs.getString("masakerja"));
         this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
         this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
         this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
         this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));

         this.setSimpanan_wajib_awal(rs.getDouble("simpanan_wajib_awal"));
         this.setSimpanan_pokok_awal(rs.getDouble("simpanan_pokok_awal"));
         this.setSimpanan_sukarela_awal(rs.getDouble("simpanan_sukarela_awal"));
         this.setSimpanan_khusus_awal(rs.getDouble("simpanan_khusus_awal"));
         return true;
    }

    public void setbagian(String bagian) {
        this.bagian=bagian;
    }

    public void setnama_jabatan(String nama_jabatan) {
        this.nama_jabatan=nama_jabatan;
    }

    public void setmasakerja(String masakerja) {
        this.masakerja=masakerja;
    }

    public String getbagian() {
        return this.bagian;
    }

    public String getnama_jabatan() {
        return this.nama_jabatan;
    }

    public String getnama_pendidikan() {
        return this.nama_pendidikan;
    }

    public String getmasakerja() {
        return this.masakerja;
    }

    /**
     * @return the simpanan_wajib_awal
     */
    public Double getSimpanan_wajib_awal() {
        return simpanan_wajib_awal;
    }

    /**
     * @param simpanan_wajib_awal the simpanan_wajib_awal to set
     */
    public void setSimpanan_wajib_awal(Double simpanan_wajib_awal) {
        this.simpanan_wajib_awal = simpanan_wajib_awal;
    }

    /**
     * @return the simpanan_pokok_awal
     */
    public Double getSimpanan_pokok_awal() {
        return simpanan_pokok_awal;
    }

    /**
     * @param simpanan_pokok_awal the simpanan_pokok_awal to set
     */
    public void setSimpanan_pokok_awal(Double simpanan_pokok_awal) {
        this.simpanan_pokok_awal = simpanan_pokok_awal;
    }

    /**
     * @return the simpanan_sukarela_awal
     */
    public Double getSimpanan_sukarela_awal() {
        return simpanan_sukarela_awal;
    }

    /**
     * @param simpanan_sukarela_awal the simpanan_sukarela_awal to set
     */
    public void setSimpanan_sukarela_awal(Double simpanan_sukarela_awal) {
        this.simpanan_sukarela_awal = simpanan_sukarela_awal;
    }

    /**
     * @return the simpanan_khusus_awal
     */
    public Double getSimpanan_khusus_awal() {
        return simpanan_khusus_awal;
    }

    /**
     * @param simpanan_khusus_awal the simpanan_khusus_awal to set
     */
    public void setSimpanan_khusus_awal(Double simpanan_khusus_awal) {
        this.simpanan_khusus_awal = simpanan_khusus_awal;
    }

    public String getbank_name() {
        return this.bank_name;
    }


}
