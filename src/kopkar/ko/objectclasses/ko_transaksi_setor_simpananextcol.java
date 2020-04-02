/*
 * To change this ko_transaksi_setor_simpanan, choose Tools | Templates
 * and open the ko_transaksi_setor_simpanan in the editor.
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
public class ko_transaksi_setor_simpananextcol extends ArrayList<ko_transaksi_setor_simpananext> {
    ko_transaksi_setor_simpananext data=new ko_transaksi_setor_simpananext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_transaksi_setor_simpananext();
    }
    public ko_transaksi_setor_simpananextcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_setor_simpananext getData() {
        return data;
    }

    public void setData(ko_transaksi_setor_simpananext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setmember_number(rs.getString("member_number"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
        data.setsimpanan_wajib_awal(rs.getDouble("simpanan_wajib_awal"));
        data.setsimpanan_pokok_awal(rs.getDouble("simpanan_pokok_awal"));
        data.setsimpanan_sukarela_awal(rs.getDouble("simpanan_sukarela_awal"));
        data.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        data.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        data.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        data.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        data.setsimpanan_wajib_akhir(rs.getDouble("simpanan_wajib_akhir"));
        data.setsimpanan_pokok_akhir(rs.getDouble("simpanan_pokok_akhir"));
        data.setsimpanan_sukarela_akhir(rs.getDouble("simpanan_sukarela_akhir"));
        data.setsimpanan_khusus_akhir(rs.getDouble("simpanan_khusus_akhir"));
        data.setsimpanan_khusus_awal(rs.getDouble("simpanan_khusus_awal"));
        data.setmanual_sts(rs.getString("manual_sts"));
        data.setregistrasi_sts(rs.getString("registrasi_sts"));
        data.settunai_sts(rs.getString("tunai_sts"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_transaksi_setor_simpanan where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_setor_simpananext();
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
        ko_transaksi_setor_simpananext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_setor_simpananextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
