/*
 * To change this ko_transaksi_bayar_toko_detail1, choose Tools | Templates
 * and open the ko_transaksi_bayar_toko_detail1 in the editor.
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
public class ko_transaksi_bayar_toko_detail1extcol extends ArrayList<ko_transaksi_bayar_toko_detail1ext> {
    ko_transaksi_bayar_toko_detail1ext data=new ko_transaksi_bayar_toko_detail1ext(0);
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;
    private ko_transaksi_bayar_tokoext header=null;

    ko_transaksi_bayar_toko_detail1extcol(ko_transaksi_bayar_tokoext header) {
        this.header=header;
        this.id=this.header.getdocentry();
    }

    public void insert(){
        data= new ko_transaksi_bayar_toko_detail1ext(this.id);
    }
    public ko_transaksi_bayar_toko_detail1extcol(Integer id){
        this.id=id;
    }

    public ko_transaksi_bayar_toko_detail1ext getData() {
        return data;
    }

    public void setData(ko_transaksi_bayar_toko_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setline_number(rs.getInt("line_number"));
        data.setmember_number(rs.getString("member_number"));
        data.setinvoice_number(rs.getString("invoice_number"));
        data.setinvoice_amount(rs.getDouble("invoice_amount"));
        data.setpayment_amount(rs.getDouble("payment_amount"));
        data.setinvoice_balance(rs.getDouble("invoice_balance"));
//        data.setctrbution_amount(rs.getDouble("ctrbution_amount"));
//        data.setentrydate(rs.getString("entrydate"));
//        data.setauditdate(rs.getString("auditdate"));
//        data.setaudituser(rs.getString("audituser"));

        data.setSelected(rs.getBoolean("pilih"));
        data.setPeriode(rs.getString("Periode"));
        data.setReference_number(rs.getString("Periode"));
        data.setTotal_bayar(rs.getDouble("Total_bayar"));
        data.setNilai_pending(rs.getDouble("Nilai_pending"));
        data.setNilai_tagihan(rs.getDouble("Nilai_tagihan"));
        return true;
    }

    public void initdata(String member_number) throws SQLException{
        squery="call sp_ko_transaksi_bayar_toko_detail1_get('"+member_number+"',"+id+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_bayar_toko_detail1ext(this.id);
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
        ko_transaksi_bayar_toko_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_bayar_toko_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
