/*
 * To change this ko_transaksi_bayar_toko, choose Tools | Templates
 * and open the ko_transaksi_bayar_toko in the editor.
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
public class ko_transaksi_bayar_tokoextcol extends ArrayList<ko_transaksi_bayar_tokoext> {
    ko_transaksi_bayar_tokoext data=new ko_transaksi_bayar_tokoext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ko_transaksi_bayar_tokoext();
    }
    public ko_transaksi_bayar_tokoextcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_bayar_tokoext getData() {
        return data;
    }

    public void setData(ko_transaksi_bayar_tokoext data) {
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
        data.setmember_number(rs.getString("member_number"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
        data.settotal_tagihan(rs.getDouble("total_tagihan"));
        data.setterima_bayar(rs.getDouble("terima_bayar"));
        data.settotal_bayar(rs.getDouble("total_bayar"));
        data.setsisa_tagihan(rs.getDouble("sisa_tagihan"));
        data.setsisa_bayar(rs.getDouble("sisa_bayar"));
        data.setmonthly_sts(rs.getString("monthly_sts"));
        data.setmonthly_no(rs.getInt("monthly_no"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));
        data.setprocess_sts(rs.getString("process_sts"));
        data.setprocess_date(rs.getString("process_date"));
        data.setprocess_user(rs.getString("process_user"));
        data.setdayseqno(rs.getInt("dayseqno"));
        data.setcash_sts(rs.getString("cash_sts"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ko_transaksi_bayar_toko where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_bayar_tokoext();
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
        ko_transaksi_bayar_tokoext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
