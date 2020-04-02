/*
 * To change this ko_anggota_potongan_by_periode, choose Tools | ko_anggota_potongan_by_periodes
 * and open the ko_anggota_potongan_by_periode in the editor.
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
public class ko_anggota_potongan_by_periodeext extends ko_anggota_potongan_by_periodecls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_anggota_potongan_by_periode_insert( "

                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getpinjaman()+"', "
                    + "'"+this.gettoko()+"', "
                    + "'"+this.getsisa_tagihan_bln_seb()+"', "
                    + "'"+this.getmonthly_no()+"', "
                    + "'"+this.getmonthly_auditdate()+"', "
                    + "'"+this.getmonthly_audituser()+"', "



                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.getbayar_simpanan()+"', "
                    + "'"+this.getbayar_pinjaman()+"', "
                    + "'"+this.getbayar_toko()+"', "
                    + "'"+this.getbayar_tagihan_sebelum()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_simpanan()+"', "
                    + "'"+this.getsisa_pinjaman()+"', "
                    + "'"+this.getsisa_toko()+"', "
                    + "'"+this.getsisa_tagihan_sebelum()+"', "
                    + "'"+this.getsisa_tagihan()+"', "
                    + "'"+this.gettagihan_sts()+"', "
                    + "'"+this.getpendapatan_bunga()+"', "
                    + "'"+this.getpendapatan_toko()+"', "
                    + "'"+this.getmonthly_sts()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_anggota_potongan_by_periode_update( "

                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getpinjaman()+"', "
                    + "'"+this.gettoko()+"', "
                    + "'"+this.getsisa_tagihan_bln_seb()+"', "
                    + "'"+this.getmonthly_no()+"', "
                    + "'"+this.getmonthly_auditdate()+"', "
                    + "'"+this.getmonthly_audituser()+"', "



                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.getbayar_simpanan()+"', "
                    + "'"+this.getbayar_pinjaman()+"', "
                    + "'"+this.getbayar_toko()+"', "
                    + "'"+this.getbayar_tagihan_sebelum()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_simpanan()+"', "
                    + "'"+this.getsisa_pinjaman()+"', "
                    + "'"+this.getsisa_toko()+"', "
                    + "'"+this.getsisa_tagihan_sebelum()+"', "
                    + "'"+this.getsisa_tagihan()+"', "
                    + "'"+this.gettagihan_sts()+"', "
                    + "'"+this.getpendapatan_bunga()+"', "
                    + "'"+this.getpendapatan_toko()+"', "
                    + "'"+this.getmonthly_sts()+"', "
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
        squery="call sp_ko_anggota_potongan_by_periode_delete( "

                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getpinjaman()+"', "
                    + "'"+this.gettoko()+"', "
                    + "'"+this.getsisa_tagihan_bln_seb()+"', "
                    + "'"+this.getmonthly_no()+"', "
                    + "'"+this.getmonthly_auditdate()+"', "
                    + "'"+this.getmonthly_audituser()+"', "



                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.getbayar_simpanan()+"', "
                    + "'"+this.getbayar_pinjaman()+"', "
                    + "'"+this.getbayar_toko()+"', "
                    + "'"+this.getbayar_tagihan_sebelum()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_simpanan()+"', "
                    + "'"+this.getsisa_pinjaman()+"', "
                    + "'"+this.getsisa_toko()+"', "
                    + "'"+this.getsisa_tagihan_sebelum()+"', "
                    + "'"+this.getsisa_tagihan()+"', "
                    + "'"+this.gettagihan_sts()+"', "
                    + "'"+this.getpendapatan_bunga()+"', "
                    + "'"+this.getpendapatan_toko()+"', "
                    + "'"+this.getmonthly_sts()+"', "
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
        squery="select * from ko_anggota_potongan_by_periode where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String id) throws CodeException {
        squery="CALL sp_ko_anggota_potongan_by_periode_get('"+id+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setmember_number(rs.getString("member_number"));
        this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        this.setpinjaman(rs.getDouble("pinjaman"));
        this.settoko(rs.getDouble("toko"));
        this.setsisa_tagihan_bln_seb(rs.getDouble("sisa_tagihan_bln_seb"));
        this.setmonthly_no(rs.getInt("monthly_no"));
        this.setmonthly_auditdate(rs.getString("monthly_auditdate"));
        this.setmonthly_audituser(rs.getString("monthly_audituser"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        this.settotal_tagihan(rs.getDouble("total_tagihan"));
        this.setbayar_simpanan(rs.getDouble("bayar_simpanan"));
        this.setbayar_pinjaman(rs.getDouble("bayar_pinjaman"));
        this.setbayar_toko(rs.getDouble("bayar_toko"));
        this.setbayar_tagihan_sebelum(rs.getDouble("bayar_tagihan_sebelum"));
        this.settotal_bayar(rs.getDouble("total_bayar"));
        this.setsisa_simpanan(rs.getDouble("sisa_simpanan"));
        this.setsisa_pinjaman(rs.getDouble("sisa_pinjaman"));
        this.setsisa_toko(rs.getDouble("sisa_toko"));
        this.setsisa_tagihan_sebelum(rs.getDouble("sisa_tagihan_sebelum"));
        this.setsisa_tagihan(rs.getDouble("sisa_tagihan"));
        this.settagihan_sts(rs.getString("tagihan_sts"));
        this.setpendapatan_bunga(rs.getDouble("pendapatan_bunga"));
        this.setpendapatan_toko(rs.getDouble("pendapatan_toko"));
        this.setmonthly_sts(rs.getString("monthly_sts"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_anggota_potongan_by_periode_get('"+this.getid()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_anggota_potongan_by_periode_get('"+this.getid()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_anggota_potongan_by_periode_get('"+this.getid()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_anggota_potongan_by_periode_get('"+this.getid()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getid())){
            return true;
        }
        return false;
    }

        public void update_toko(int yop, int mop, String member_number, double toko, double sisa_tagihan_bln_seb) {
        try {
            squery="call ko_anggota_potongan_by_periode_update("+ yop+","+mop+",'"+member_number+"',"+ toko+","+sisa_tagihan_bln_seb+")";
            db.execute(squery);
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
