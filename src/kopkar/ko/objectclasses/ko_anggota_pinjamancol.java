/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.ko.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class ko_anggota_pinjamancol extends ArrayList<ko_anggota_pinjaman>{
    ko_anggota_pinjaman data=new ko_anggota_pinjaman();
    DbBean db=appsettinghandler.db;

    private final String member_number;
    private String squery;


    public ko_anggota_pinjamancol (String member_number){
        this.member_number=member_number;
    }

    public Boolean initdata(){
        try {
            squery="call sp_ko_anggota_pinjaman_get('"+this.member_number+"')";
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                data=new ko_anggota_pinjaman();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_pinjamancol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean fillme(ResultSet rs) throws SQLException {
        data.setDocument_number(rs.getString("Document_number"));
        data.setJumlah_pinjaman(rs.getDouble("Jumlah_pinjaman"));
        data.setJumlah_angsuran(rs.getDouble("Jumlah_angsuran"));
        data.setTotal_pokok_akhir(rs.getDouble("total_pokok_akhir"));
        data.setTotal_bunga_akhir(rs.getDouble("total_bunga_akhir"));
        data.setTotal_pokok_bunga_akhir(rs.getDouble("Total_pokok_bunga_akhir"));
        data.setAngsuranke(rs.getDouble("Angsuranke"));
        data.setSisa_angsuranke(rs.getDouble("Sisa_angsuranke"));
        return true;
    }

}
