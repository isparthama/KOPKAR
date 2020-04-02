/*
 * To change this ko_transaksi_setuju, choose Tools | ko_transaksi_setujus
 * and open the ko_transaksi_setuju in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_transaksi_setujucls;
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
public class ko_transaksi_setujuext extends ko_transaksi_setujucls implements NavigatorObjectInt{
    Boolean insertsts=false;
    public DbBean db=appsettinghandler.db;
    public String squery="";
    private String member_name="";
    private String employee_number = "";
    private String tanggal_masuk = "";
    private String nama_departemen = "";
    private String nama_jabatan = "";
    private String nama_pinjaman = "";
    private double potongan=0;
    private double sisa_angsuran=0;

    public ko_transaksi_setujuext() {
        this.setdocument_date(GlobalUtils.sessiondate);
        this.settgl_cair(GlobalUtils.sessiondate);
        this.setmop(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "MM")));
        this.setyop(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "yyyy")));
        this.setmop_start(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "MM")));
        this.setyop_start(GlobalUtils.toInt(GlobalUtils.formatDate(GlobalUtils.sessiondate, "yyyy")));

        this.sethitung_bunga("1");
        this.setsatuan_waktu("3");

        this.setauto_sts("Y");
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        ResultSet rs;
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        this.settgl_cair(GlobalUtils.formatDate(this.gettgl_cair(), "yyyy-MM-dd"));
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_setuju_insert( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getmasa_kerja()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_pinjaman()+"', "
                        + "'"+this.getjumlah_bunga()+"', "
                        + "'"+this.getjumlah_pokok_bunga()+"', "
                        + "'"+this.getsuku_bunga()+"', "
                        + "'"+this.gethitung_bunga()+"', "
                        + "'"+this.getjangka_waktu()+"', "
                        + "'"+this.getsatuan_waktu()+"', "
                        + "'"+this.getjumlah_angsuran()+"', "
                        + "'"+this.getyop_start()+"', "
                        + "'"+this.getmop_start()+"', "
                        + "'"+this.gettgl_cair()+"', "
                        + "'"+this.getdop_tagih()+"', "
                        + "'"+this.getauto_sts()+"', "
                        + "'"+this.getangsuranke()+"', "
                        + "'"+this.getsisa_angsuranke()+"', "
                        + "'"+this.gettotal_angsuran()+"', "
                        + "'"+this.gettotal_pokok()+"', "
                        + "'"+this.gettotal_bunga()+"', "
                        + "'"+this.gettotal_potongan()+"', "
                        + "'"+this.gettotal_pokok_bunga_akhir()+"', "
                        + "'"+this.gettotal_pokok_akhir()+"', "
                        + "'"+this.gettotal_bunga_akhir()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocument_number(rs.getString("document_number"));
                }
            } else {
                squery="call sp_ko_transaksi_setuju_update( "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getmasa_kerja()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_pinjaman()+"', "
                        + "'"+this.getjumlah_bunga()+"', "
                        + "'"+this.getjumlah_pokok_bunga()+"', "
                        + "'"+this.getsuku_bunga()+"', "
                        + "'"+this.gethitung_bunga()+"', "
                        + "'"+this.getjangka_waktu()+"', "
                        + "'"+this.getsatuan_waktu()+"', "
                        + "'"+this.getjumlah_angsuran()+"', "
                        + "'"+this.getyop_start()+"', "
                        + "'"+this.getmop_start()+"', "
                        + "'"+this.gettgl_cair()+"', "
                        + "'"+this.getdop_tagih()+"', "
                        + "'"+this.getauto_sts()+"', "
                        + "'"+this.getangsuranke()+"', "
                        + "'"+this.getsisa_angsuranke()+"', "
                        + "'"+this.gettotal_angsuran()+"', "
                        + "'"+this.gettotal_pokok()+"', "
                        + "'"+this.gettotal_bunga()+"', "
                        + "'"+this.gettotal_potongan()+"', "
                        + "'"+this.gettotal_pokok_bunga_akhir()+"', "
                        + "'"+this.gettotal_pokok_akhir()+"', "
                        + "'"+this.gettotal_bunga_akhir()+"', "
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
        squery="call sp_ko_transaksi_setuju_delete( "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getreference_number()+"', "
                    + "'"+this.getmasa_kerja()+"', "
                    + "'"+this.getkode_pinjaman()+"', "
                    + "'"+this.getjumlah_pinjaman()+"', "
                    + "'"+this.getjumlah_bunga()+"', "
                    + "'"+this.getjumlah_pokok_bunga()+"', "
                    + "'"+this.getsuku_bunga()+"', "
                    + "'"+this.gethitung_bunga()+"', "
                    + "'"+this.getjangka_waktu()+"', "
                    + "'"+this.getsatuan_waktu()+"', "
                    + "'"+this.getjumlah_angsuran()+"', "
                    + "'"+this.getyop_start()+"', "
                    + "'"+this.getmop_start()+"', "
                    + "'"+this.gettgl_cair()+"', "
                    + "'"+this.getdop_tagih()+"', "
                    + "'"+this.getauto_sts()+"', "
                    + "'"+this.getangsuranke()+"', "
                    + "'"+this.getsisa_angsuranke()+"', "
                    + "'"+this.gettotal_angsuran()+"', "
                    + "'"+this.gettotal_pokok()+"', "
                    + "'"+this.gettotal_bunga()+"', "
                    + "'"+this.gettotal_potongan()+"', "
                    + "'"+this.gettotal_pokok_bunga_akhir()+"', "
                    + "'"+this.gettotal_pokok_akhir()+"', "
                    + "'"+this.gettotal_bunga_akhir()+"', "
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
        squery="select * from ko_transaksi_setuju where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_setuju_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
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
        this.settgl_cair(rs.getString("tgl_cair"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setmember_number(rs.getString("member_number"));
        this.setreference_number(rs.getString("reference_number"));
        this.setlast_payment_number(rs.getString("last_payment_number"));
        this.setmasa_kerja(rs.getString("masa_kerja"));
        this.setkode_pinjaman(rs.getString("kode_pinjaman"));
        this.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        this.setjumlah_bunga(rs.getDouble("jumlah_bunga"));
        this.setjumlah_pokok_bunga(rs.getDouble("jumlah_pokok_bunga"));
        this.setsuku_bunga(rs.getDouble("suku_bunga"));
        this.sethitung_bunga(rs.getString("hitung_bunga"));
        this.setjangka_waktu(rs.getInt("jangka_waktu"));
        this.setsatuan_waktu(rs.getString("satuan_waktu"));
        this.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        this.setyop_start(rs.getInt("yop_start"));
        this.setmop_start(rs.getInt("mop_start"));
        this.setauto_sts(rs.getString("auto_sts"));
        this.setangsuranke(rs.getInt("angsuranke"));
        this.setsisa_angsuranke(rs.getInt("sisa_angsuranke"));
        this.settotal_angsuran(rs.getDouble("total_angsuran"));
        this.settotal_pokok(rs.getDouble("total_pokok"));
        this.settotal_bunga(rs.getDouble("total_bunga"));
        this.settotal_potongan(rs.getDouble("total_potongan"));
        this.settotal_pokok_bunga_akhir(rs.getDouble("total_pokok_bunga_akhir"));
        this.settotal_pokok_akhir(rs.getDouble("total_pokok_akhir"));
        this.settotal_bunga_akhir(rs.getDouble("total_bunga_akhir"));
        this.setangsur_sts(rs.getString("angsur_sts"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setMember_name(rs.getString("Member_name"));
        this.setEmployee_number(rs.getString("Employee_number"));
        this.setTanggal_masuk(rs.getString("Tanggal_masuk"));
        this.setNama_departemen(rs.getString("Nama_departemen"));
        this.setNama_jabatan(rs.getString("Nama_jabatan"));
        this.setNama_pinjaman(rs.getString("nama_pinjaman"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_setuju_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_setuju_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_setuju_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_setuju_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
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
    public String getNama_pinjaman() {
        return nama_pinjaman;
    }

    /**
     * @param nama_pinjaman the nama_pinjaman to set
     */
    public void setNama_pinjaman(String nama_pinjaman) {
        this.nama_pinjaman = nama_pinjaman;
    }

    public String getnama_pinjaman() {
        return this.nama_pinjaman;
    }

    public boolean runsp_ko_transaksi_setuju_get_rincian_pinjaman(Double jumlahpinjaman, Double sukubunga, Double jangkawaktu, Integer modelhitung) {
        squery="call sp_ko_transaksi_setuju_get_rincian_pinjaman ("+
                jumlahpinjaman+","+
                sukubunga+","+
                jangkawaktu+","+
                modelhitung+")";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                this.setjumlah_angsuran(rs.getDouble("jumlahangsuran"));
                this.setjumlah_pinjaman(rs.getDouble("pinjaman"));
                this.setjumlah_bunga(rs.getDouble("bunga"));
                this.setjumlah_pokok_bunga(rs.getDouble("pinjamanplusbunga"));
                this.setangsuranke(rs.getInt("angsuranke"));
                this.setsisa_angsuranke(rs.getInt("sisaangsuranke"));
                this.settotal_angsuran(rs.getDouble("totalangsuran"));
                this.setpotongan(rs.getDouble("potongan"));
                this.setsisa_angsuran(rs.getDouble("sisaangsuran"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setujuext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void setpotongan(double potongan) {
        this.potongan=potongan;
    }

    private void setsisa_angsuran(double sisa_angsuran) {
        this.sisa_angsuran=sisa_angsuran;
    }

    public Object getpotongan() {
        return this.potongan;
    }

    public Object getsisa_angsuran() {
        return this.sisa_angsuran;
    }

    public boolean run_sp_ko_pinjaman_calculate() {
        try {
            squery="call sp_ko_pinjaman_calculate ("+
                    "'"+this.getdocument_number()+"',"+
                    "'"+this.getjumlah_pinjaman()+"',"+
                    "'"+this.getsuku_bunga()+"',"+
                    "'"+this.getjangka_waktu()+"',"+
                    "'"+this.gethitung_bunga()+"',"+
                    "'"+GlobalUtils.audituser+"')";
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean update_tgl_penagihan() {
        try {
            squery="call sp_ko_transaksi_setuju_update_tgl_tagih ("
                   + "'"+this.getdocument_number()+"', "
                    + "'"+this.getdop_tagih()+"', "
                    + "'"+this.getauto_sts()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


}
