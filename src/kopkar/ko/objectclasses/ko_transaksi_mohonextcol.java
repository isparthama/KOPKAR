/*
 * To change this ko_transaksi_mohon, choose Tools | Templates
 * and open the ko_transaksi_mohon in the editor.
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
public class ko_transaksi_mohonextcol extends ArrayList<ko_transaksi_mohonext> {
    ko_transaksi_mohonext data=new ko_transaksi_mohonext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_transaksi_mohonext();
    }
    public ko_transaksi_mohonextcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_mohonext getData() {
        return data;
    }

    public void setData(ko_transaksi_mohonext data) {
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
        data.setmasa_kerja(rs.getString("masa_kerja"));
        data.setkode_pinjaman(rs.getString("kode_pinjaman"));
        data.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        data.setsuku_bunga(rs.getDouble("suku_bunga"));
        data.sethitung_bunga(rs.getString("hitung_bunga"));
        data.setjangka_waktu(rs.getInt("jangka_waktu"));
        data.setsatuan_waktu(rs.getString("satuan_waktu"));
        data.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        data.setyop_start(rs.getInt("yop_start"));
        data.setmop_start(rs.getInt("mop_start"));
        data.setauto_sts(rs.getString("auto_sts"));
        data.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        data.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        data.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        data.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_transaksi_mohon where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_mohonext();
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
        ko_transaksi_mohonext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_mohonextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
