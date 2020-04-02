/*
 * To change this ko_transaksi_cair_pinjaman, choose Tools | ko_transaksi_cair_pinjamans
 * and open the ko_transaksi_cair_pinjaman in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_transaksi_cair_pinjamancls;
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
public class ko_transaksi_cair_pinjamanext extends ko_transaksi_cair_pinjamancls implements NavigatorObjectInt{
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
    private String bank_name;


    public ko_transaksi_cair_pinjamanext() {
        this.setdocument_date(GlobalUtils.sessiondate);
        this.setyop(GlobalUtils.toInt(GlobalUtils.getCurrentYear()));
        this.setmop(GlobalUtils.toInt(GlobalUtils.getCurrentMonth()));

    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        ResultSet rs;
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_cair_pinjaman_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_pinjaman()+"', "
                        + "'"+this.getjumlah_cair()+"', "
                        + "'"+this.getcara_bayar()+"', "
                        + "'"+this.getbank_code()+"', "
                        + "'"+this.getbank_branch()+"', "
                        + "'"+this.getbank_account()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocument_number(rs.getString("document_number"));
                }
            } else {
                squery="call sp_ko_transaksi_cair_pinjaman_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_pinjaman()+"', "
                        + "'"+this.getjumlah_cair()+"', "
                        + "'"+this.getcara_bayar()+"', "
                        + "'"+this.getbank_code()+"', "
                        + "'"+this.getbank_branch()+"', "
                        + "'"+this.getbank_account()+"', "
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
        squery="call sp_ko_transaksi_cair_pinjaman_delete( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getkode_pinjaman()+"', "
                        + "'"+this.getjumlah_pinjaman()+"', "
                        + "'"+this.getjumlah_cair()+"', "
                        + "'"+this.getcara_bayar()+"', "
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
        squery="select * from ko_transaksi_cair_pinjaman where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_cair_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_cair_pinjaman_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_cair_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
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
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setmember_number(rs.getString("member_number"));
        this.setreference_number(rs.getString("reference_number"));
        this.setkode_pinjaman(rs.getString("kode_pinjaman"));
        this.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        this.setjumlah_cair(rs.getDouble("jumlah_cair"));
        this.setcara_bayar(rs.getString("cara_bayar"));
        this.setbank_code(rs.getString("bank_code"));
        this.setbank_branch(rs.getString("bank_branch"));
        this.setbank_account(rs.getString("bank_account"));

        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setMember_name(rs.getString("Member_name"));
//        this.setEmployee_number(rs.getString("Employee_number"));
//        this.setTanggal_masuk(rs.getString("Tanggal_masuk"));
        this.setNama_departemen(rs.getString("Nama_departemen"));
        this.setNama_jabatan(rs.getString("Nama_jabatan"));
        this.setNama_pinjaman(rs.getString("Nama_pinjaman"));
        this.bank_name=rs.getString("bank_name");
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_cair_pinjaman_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_cair_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_cair_pinjaman_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_cair_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_cair_pinjaman_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_cair_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_cair_pinjaman_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_cair_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
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

    public boolean runsp_ko_transaksi_cair_pinjaman_get_rincian_pinjaman(Double jumlahpinjaman, Double sukubunga, Double jangkawaktu, Integer modelhitung) {
        squery="call sp_ko_transaksi_setuju_get_rincian_pinjaman ("+
                jumlahpinjaman+","+
                sukubunga+","+
                jangkawaktu+","+
                modelhitung+")";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                this.setjumlah_pinjaman(rs.getDouble("pinjaman"));
                this.setpotongan(rs.getDouble("potongan"));
                this.setsisa_angsuran(rs.getDouble("sisaangsuran"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_cair_pinjamanext.class.getName()).log(Level.SEVERE, null, ex);
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
                    "'"+GlobalUtils.audituser+"')";
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_mohonext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getbank_name() {
        return this.bank_name;
    }
}
