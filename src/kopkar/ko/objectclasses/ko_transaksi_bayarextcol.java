/*
 * To change this ko_transaksi_bayar, choose Tools | Templates
 * and open the ko_transaksi_bayar in the editor.
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
public class ko_transaksi_bayarextcol extends ArrayList<ko_transaksi_bayarext> {
    ko_transaksi_bayarext data=new ko_transaksi_bayarext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_transaksi_bayarext();
    }
    public ko_transaksi_bayarextcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_bayarext getData() {
        return data;
    }

    public void setData(ko_transaksi_bayarext data) {
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
        data.setkode_pinjaman(rs.getString("kode_pinjaman"));
        data.setjumlah_angsuranke(rs.getDouble("jumlah_angsuranke"));
        data.setpelunasan(rs.getString("pelunasan"));
        data.setauto_sts(rs.getString("auto_sts"));
        data.setcash_sts(rs.getString("cash_sts"));
        data.setbayar_angsuran(rs.getDouble("bayar_angsuran"));
        data.setbayar_potongan(rs.getDouble("bayar_potongan"));
        data.setangsuranke(rs.getInt("angsuranke"));
        data.setsisa_angsuranke(rs.getInt("sisa_angsuranke"));
        data.setsaldo_pokok_bunga_awal(rs.getDouble("saldo_pokok_bunga_awal"));
        data.setsaldo_pokok_awal(rs.getDouble("saldo_pokok_awal"));
        data.setsaldo_bunga_awal(rs.getDouble("saldo_bunga_awal"));
        data.setangsuran_pokok_bunga(rs.getDouble("angsuran_pokok_bunga"));
        data.setangsuran_pokok(rs.getDouble("angsuran_pokok"));
        data.setangsuran_bunga(rs.getDouble("angsuran_bunga"));
        data.setsaldo_pokok_bunga_akhir(rs.getDouble("saldo_pokok_bunga_akhir"));
        data.setsaldo_pokok_akhir(rs.getDouble("saldo_pokok_akhir"));
        data.setsaldo_bunga_akhir(rs.getDouble("saldo_bunga_akhir"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_transaksi_bayar where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_bayarext();
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
        ko_transaksi_bayarext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_bayarextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
