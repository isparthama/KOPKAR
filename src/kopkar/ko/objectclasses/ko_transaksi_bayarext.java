/*
 * To change this ko_transaksi_bayar, choose Tools | ko_transaksi_bayars
 * and open the ko_transaksi_bayar in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_transaksi_bayarcls;
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
public class ko_transaksi_bayarext extends ko_transaksi_bayarcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private String member_name="";
    private String employee_number = "";
    private String tanggal_masuk = "";
    private String nama_departemen = "";
    private String nama_jabatan = "";
    private String nama_pinjaman="";

    public ko_transaksi_bayarext() {
        this.setdocument_date(GlobalUtils.sessiondate);
        this.setmop(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "MM")));
        this.setyop(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "yyyy")));
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        ResultSet rs;
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_bayar_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_status()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getdop_tagih()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_angsuranke()+"', "
                        + "'"+this.getpelunasan()+"', "
                        + "'"+this.getauto_sts()+"', "
                        + "'"+this.getcash_sts()+"', "
                        + "'"+this.getbayar_angsuran()+"', "
                        + "'"+this.getbayar_potongan()+"', "
                        + "'"+this.getangsuranke()+"', "
                        + "'"+this.getsisa_angsuranke()+"', "
                        + "'"+this.getsaldo_pokok_bunga_awal()+"', "
                        + "'"+this.getsaldo_pokok_awal()+"', "
                        + "'"+this.getsaldo_bunga_awal()+"', "
                        + "'"+this.getangsuran_pokok_bunga()+"', "
                        + "'"+this.getangsuran_pokok()+"', "
                        + "'"+this.getangsuran_bunga()+"', "
                        + "'"+this.getsaldo_pokok_bunga_akhir()+"', "
                        + "'"+this.getsaldo_pokok_akhir()+"', "
                        + "'"+this.getsaldo_bunga_akhir()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocument_number(rs.getString("document_number"));
                }

            } else {
                squery="call sp_ko_transaksi_bayar_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getdocument_status()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getdop_tagih()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_angsuranke()+"', "
                        + "'"+this.getpelunasan()+"', "
                        + "'"+this.getauto_sts()+"', "
                        + "'"+this.getcash_sts()+"', "
                        + "'"+this.getbayar_angsuran()+"', "
                        + "'"+this.getbayar_potongan()+"', "
                        + "'"+this.getangsuranke()+"', "
                        + "'"+this.getsisa_angsuranke()+"', "
                        + "'"+this.getsaldo_pokok_bunga_awal()+"', "
                        + "'"+this.getsaldo_pokok_awal()+"', "
                        + "'"+this.getsaldo_bunga_awal()+"', "
                        + "'"+this.getangsuran_pokok_bunga()+"', "
                        + "'"+this.getangsuran_pokok()+"', "
                        + "'"+this.getangsuran_bunga()+"', "
                        + "'"+this.getsaldo_pokok_bunga_akhir()+"', "
                        + "'"+this.getsaldo_pokok_akhir()+"', "
                        + "'"+this.getsaldo_bunga_akhir()+"', "
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
        squery="call sp_ko_transaksi_bayar_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdocument_status()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getdop_tagih()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getreference_number()+"', "
                    + "'"+this.getkode_pinjaman()+"', "
                    + "'"+this.getjumlah_angsuranke()+"', "
                    + "'"+this.getpelunasan()+"', "
                    + "'"+this.getauto_sts()+"', "
                    + "'"+this.getcash_sts()+"', "
                    + "'"+this.getbayar_angsuran()+"', "
                    + "'"+this.getbayar_potongan()+"', "
                    + "'"+this.getangsuranke()+"', "
                    + "'"+this.getsisa_angsuranke()+"', "
                    + "'"+this.getsaldo_pokok_bunga_awal()+"', "
                    + "'"+this.getsaldo_pokok_awal()+"', "
                    + "'"+this.getsaldo_bunga_awal()+"', "
                    + "'"+this.getangsuran_pokok_bunga()+"', "
                    + "'"+this.getangsuran_pokok()+"', "
                    + "'"+this.getangsuran_bunga()+"', "
                    + "'"+this.getsaldo_pokok_bunga_akhir()+"', "
                    + "'"+this.getsaldo_pokok_akhir()+"', "
                    + "'"+this.getsaldo_bunga_akhir()+"', "
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
        squery="select * from ko_transaksi_bayar where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayarext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayarext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setdop_tagih(rs.getInt("dop_tagih"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setmember_number(rs.getString("member_number"));
        this.setreference_number(rs.getString("reference_number"));
        this.setkode_pinjaman(rs.getString("kode_pinjaman"));
        this.setjumlah_angsuranke(rs.getDouble("jumlah_angsuranke"));
        this.setpelunasan(rs.getString("pelunasan"));
        this.setauto_sts(rs.getString("auto_sts"));
        this.setcash_sts(rs.getString("cash_sts"));
        this.setbayar_angsuran(rs.getDouble("bayar_angsuran"));
        this.setbayar_potongan(rs.getDouble("bayar_potongan"));
        this.setangsuranke(rs.getInt("angsuranke"));
        this.setsisa_angsuranke(rs.getInt("sisa_angsuranke"));
        this.setsaldo_pokok_bunga_awal(rs.getDouble("saldo_pokok_bunga_awal"));
        this.setsaldo_pokok_awal(rs.getDouble("saldo_pokok_awal"));
        this.setsaldo_bunga_awal(rs.getDouble("saldo_bunga_awal"));
        this.setangsuran_pokok_bunga(rs.getDouble("angsuran_pokok_bunga"));
        this.setangsuran_pokok(rs.getDouble("angsuran_pokok"));
        this.setangsuran_bunga(rs.getDouble("angsuran_bunga"));
        this.setsaldo_pokok_bunga_akhir(rs.getDouble("saldo_pokok_bunga_akhir"));
        this.setsaldo_pokok_akhir(rs.getDouble("saldo_pokok_akhir"));
        this.setsaldo_bunga_akhir(rs.getDouble("saldo_bunga_akhir"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setMember_name(rs.getString("Member_name"));
        this.setEmployee_number(rs.getString("Employee_number"));
        this.setNama_departemen(rs.getString("Nama_departemen"));
        this.setNama_jabatan(rs.getString("Nama_jabatan"));
        this.setNama_pinjaman(rs.getString("Nama_pinjaman"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayarext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayarext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayarext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayarext.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getdocument_status_description() {
        if (this.getdocument_status().equalsIgnoreCase("C")){
            return "Close";
        }
        return "Open";
    }

    /**
     * @return the member_name
     */
    public String getMember_name() {
        return member_name;
    }

    /**
     * @param member_name the member_name to set
     */
    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    /**
     * @return the employee_number
     */
    public String getEmployee_number() {
        return employee_number;
    }

    /**
     * @param employee_number the employee_number to set
     */
    public void setEmployee_number(String employee_number) {
        this.employee_number = employee_number;
    }

    /**
     * @return the tanggal_masuk
     */
    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    /**
     * @param tanggal_masuk the tanggal_masuk to set
     */
    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    /**
     * @return the nama_departemen
     */
    public String getNama_departemen() {
        return nama_departemen;
    }

    /**
     * @param nama_departemen the nama_departemen to set
     */
    public void setNama_departemen(String nama_departemen) {
        this.nama_departemen = nama_departemen;
    }

    /**
     * @return the nama_jabatan
     */
    public String getNama_jabatan() {
        return nama_jabatan;
    }

    /**
     * @param nama_jabatan the nama_jabatan to set
     */
    public void setNama_jabatan(String nama_jabatan) {
        this.nama_jabatan = nama_jabatan;
    }

    /**
     * @return the nama_pinjaman
     */

    public boolean run_sp_ko_transaksi_bayar_auto_process(String tahun, String bulan) {
        try {
            db.execute("call sp_ko_transaksi_bayar_auto_process('"+tahun+"','"+bulan+"','"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.audituser+"')");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void setNama_pinjaman(String nama_pinjaman) {
        this.nama_pinjaman=nama_pinjaman;
    }

    public String getNama_pinjaman() {
        return this.nama_pinjaman;
    }
}
