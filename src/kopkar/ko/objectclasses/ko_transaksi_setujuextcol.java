/*
 * To change this ko_transaksi_setuju, choose Tools | Templates
 * and open the ko_transaksi_setuju in the editor.
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
public class ko_transaksi_setujuextcol extends ArrayList<ko_transaksi_setujuext> {
    ko_transaksi_setujuext data=new ko_transaksi_setujuext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_transaksi_setujuext();
    }
    public ko_transaksi_setujuextcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_setujuext getData() {
        return data;
    }

    public void setData(ko_transaksi_setujuext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setyop(rs.getInt("yop"));
        data.setmop(rs.getInt("mop"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
        data.setmember_number(rs.getString("member_number"));
        data.setreference_number(rs.getString("reference_number"));
        data.setlast_payment_number(rs.getString("last_payment_number"));
        data.setmasa_kerja(rs.getString("masa_kerja"));
        data.setkode_pinjaman(rs.getString("kode_pinjaman"));
        data.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        data.setjumlah_bunga(rs.getDouble("jumlah_bunga"));
        data.setjumlah_pokok_bunga(rs.getDouble("jumlah_pokok_bunga"));
        data.setsuku_bunga(rs.getDouble("suku_bunga"));
        data.sethitung_bunga(rs.getString("hitung_bunga"));
        data.setjangka_waktu(rs.getInt("jangka_waktu"));
        data.setsatuan_waktu(rs.getString("satuan_waktu"));
        data.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        data.setyop_start(rs.getInt("yop_start"));
        data.setmop_start(rs.getInt("mop_start"));
        data.setauto_sts(rs.getString("auto_sts"));
        data.setangsuranke(rs.getInt("angsuranke"));
        data.setsisa_angsuranke(rs.getInt("sisa_angsuranke"));
        data.settotal_angsuran(rs.getDouble("total_angsuran"));
        data.settotal_pokok(rs.getDouble("total_pokok"));
        data.settotal_bunga(rs.getDouble("total_bunga"));
        data.settotal_potongan(rs.getDouble("total_potongan"));
        data.settotal_pokok_bunga_akhir(rs.getDouble("total_pokok_bunga_akhir"));
        data.settotal_pokok_akhir(rs.getDouble("total_pokok_akhir"));
        data.settotal_bunga_akhir(rs.getDouble("total_bunga_akhir"));
        data.setangsur_sts(rs.getString("angsur_sts"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_transaksi_setuju where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_setujuext();
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
        ko_transaksi_setujuext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_setujuextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
