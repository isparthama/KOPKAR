/*
 * To change this ko_anggota_potongan_by_periode, choose Tools | Templates
 * and open the ko_anggota_potongan_by_periode in the editor.
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
public class ko_anggota_potongan_by_periodeextcol extends ArrayList<ko_anggota_potongan_by_periodeext> {
    ko_anggota_potongan_by_periodeext data=new ko_anggota_potongan_by_periodeext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_anggota_potongan_by_periodeext();
    }
    public ko_anggota_potongan_by_periodeextcol(Integer id){
        this.id=id;
    }

    public ko_anggota_potongan_by_periodeext getData() {
        return data;
    }

    public void setData(ko_anggota_potongan_by_periodeext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setyop(rs.getInt("yop"));
        data.setmop(rs.getInt("mop"));
        data.setmember_number(rs.getString("member_number"));
        data.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        data.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        data.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        data.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        data.setpinjaman(rs.getDouble("pinjaman"));
        data.settoko(rs.getDouble("toko"));
        data.setsisa_tagihan_bln_seb(rs.getDouble("sisa_tagihan_bln_seb"));
        data.setmonthly_no(rs.getInt("monthly_no"));
        data.setmonthly_auditdate(rs.getString("monthly_auditdate"));
        data.setmonthly_audituser(rs.getString("monthly_audituser"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.settotal_tagihan(rs.getDouble("total_tagihan"));
        data.setbayar_simpanan(rs.getDouble("bayar_simpanan"));
        data.setbayar_pinjaman(rs.getDouble("bayar_pinjaman"));
        data.setbayar_toko(rs.getDouble("bayar_toko"));
        data.setbayar_tagihan_sebelum(rs.getDouble("bayar_tagihan_sebelum"));
        data.settotal_bayar(rs.getDouble("total_bayar"));
        data.setsisa_simpanan(rs.getDouble("sisa_simpanan"));
        data.setsisa_pinjaman(rs.getDouble("sisa_pinjaman"));
        data.setsisa_toko(rs.getDouble("sisa_toko"));
        data.setsisa_tagihan_sebelum(rs.getDouble("sisa_tagihan_sebelum"));
        data.setsisa_tagihan(rs.getDouble("sisa_tagihan"));
        data.settagihan_sts(rs.getString("tagihan_sts"));
        data.setpendapatan_bunga(rs.getDouble("pendapatan_bunga"));
        data.setpendapatan_toko(rs.getDouble("pendapatan_toko"));
        data.setmonthly_sts(rs.getString("monthly_sts"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_anggota_potongan_by_periode where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_anggota_potongan_by_periodeext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer id){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getid().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_anggota_potongan_by_periodeext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_anggota_potongan_by_periodeextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
