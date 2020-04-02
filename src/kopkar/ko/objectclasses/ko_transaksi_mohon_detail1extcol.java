/*
 * To change this ko_transaksi_mohon_detail1, choose Tools | Templates
 * and open the ko_transaksi_mohon_detail1 in the editor.
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
public class ko_transaksi_mohon_detail1extcol extends ArrayList<ko_transaksi_mohon_detail1ext> {
    ko_transaksi_mohon_detail1ext data=new ko_transaksi_mohon_detail1ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_transaksi_mohon_detail1ext();
    }
    public ko_transaksi_mohon_detail1extcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_mohon_detail1ext getData() {
        return data;
    }

    public void setData(ko_transaksi_mohon_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setline_number(rs.getInt("line_number"));
        data.setkode_pinjaman_tipe(rs.getString("kode_pinjaman_tipe"));
        data.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        data.setsisa_pinjaman(rs.getDouble("sisa_pinjaman"));
        data.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        data.setsisa_angsuran(rs.getInt("sisa_angsuran"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_transaksi_mohon_detail1 where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_mohon_detail1ext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer docentry){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocentry().equals(docentry)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_transaksi_mohon_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_mohon_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String member_number, int i) throws SQLException {
        squery="call sp_ko_transaksi_mohon_detail1_get_info("+this.id+",'"+member_number+"',"+i+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_mohon_detail1ext();
            if (fillme_info(rs)){
                this.add(data);
            }
        }
        if (this.size()>0){
            return true;
        }
        return false;
    }

    private boolean fillme_info(ResultSet rs) throws SQLException {
        data.setnama_pinjaman_tipe(rs.getString("nama_pinjaman_tipe"));
        data.setkode_pinjaman_tipe(rs.getString("kode_pinjaman_tipe"));
        data.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        data.setsisa_pinjaman(rs.getDouble("sisa_pinjaman"));
        data.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        data.setsisa_angsuran(rs.getInt("sisa_angsuran"));
        return true;
    }
}
