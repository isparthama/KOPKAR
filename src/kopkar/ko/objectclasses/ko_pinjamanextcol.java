/*
 * To change this ko_pinjaman, choose Tools | Templates
 * and open the ko_pinjaman in the editor.
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
public class ko_pinjamanextcol extends ArrayList<ko_pinjamanext> {
    ko_pinjamanext data=new ko_pinjamanext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_pinjamanext();
    }
    public ko_pinjamanextcol(Integer id){
        this.id=id;
    }

    public ko_pinjamanext getData() {
        return data;
    }

    public void setData(ko_pinjamanext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setid(rs.getInt("id"));
        data.setkode_pinjaman(rs.getString("kode_pinjaman"));
        data.setnama_pinjaman(rs.getString("nama_pinjaman"));
        data.setaktif_sts(rs.getString("aktif_sts"));
        data.setbunga(rs.getDouble("bunga"));
        data.settipe_bunga(rs.getString("tipe_bunga"));
        data.setjumlah_cicilan(rs.getInt("jumlah_cicilan"));
        data.setcara_bayar(rs.getString("cara_bayar"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_pinjaman where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_pinjamanext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer kode_pinjaman){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getkode_pinjaman().equals(kode_pinjaman)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ko_pinjamanext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_pinjamanextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
