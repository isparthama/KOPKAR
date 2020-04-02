/*
 * To change this ko_transaksi_tagihan_detail1, choose Tools | Templates
 * and open the ko_transaksi_tagihan_detail1 in the editor.
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
public class ko_transaksi_tagihan_detail1extcol extends ArrayList<ko_transaksi_tagihan_detail1ext> {
    ko_transaksi_tagihan_detail1ext data;
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    ko_transaksi_tagihanext header;

    public void insert(){
        data= new ko_transaksi_tagihan_detail1ext(id);
    }

    public ko_transaksi_tagihan_detail1extcol() {
    }

    
    public ko_transaksi_tagihan_detail1extcol(ko_transaksi_tagihanext header){
        this.header=header;
        this.id=this.header.getdocentry();
    }

    public ko_transaksi_tagihan_detail1ext getData() {
        return data;
    }

    public void setData(ko_transaksi_tagihan_detail1ext data) {
        this.data = data;
    }

    protected Boolean fillme(ResultSet rs) throws SQLException{
        if (rs.getString("pilih").equalsIgnoreCase("Y")){
            data.setselected(true);
        }
        data.setdocentry(rs.getInt("docentry"));
        data.setlinenum(rs.getInt("linenum"));

        if (data.getdocentry().equals(0)){
            data.setstatus(data.Status_Insert);
        }

        if (data.getlinenum().equals(0)){
            data.setstatus(data.Status_Insert);
        }

        data.setyop(rs.getInt("yop"));
        data.setmop(rs.getInt("mop"));
        data.setmember_number(rs.getString("member_number"));

        data.setEmployee_number(rs.getString("employee_number"));
        data.setMember_name(rs.getString("member_name"));
        data.setPosition_code(rs.getString("position_code"));
        data.setNama_jabatan(rs.getString("nama_jabatan"));
        data.setDepartment_code(rs.getString("department_code"));
        data.setNama_departemen(rs.getString("nama_departemen"));

        data.settotal_tagihan(rs.getDouble("total_tagihan"));
        data.settotal_bayar(rs.getDouble("total_bayar"));
        data.setsisa_tagihan(rs.getDouble("sisa_tagihan"));

        data.setTotal_simpanan_info(rs.getDouble("total_simpanan_info"));
        data.setTotal_pinjaman_info(rs.getDouble("total_pinjaman_info"));
        data.setToko_info(rs.getDouble("toko_info"));
        data.setSisa_tagihan_bln_seb_info(rs.getDouble("sisa_tagihan_bln_seb_info"));
        data.setTotal_tagihan_info(rs.getDouble("total_tagihan_info"));
        data.setTotal_bayar_info(rs.getDouble("total_bayar_info"));
        data.setSisa_tagihan_info(rs.getDouble("sisa_tagihan_info"));

//        data.setentrydate(rs.getString("entrydate"));
//        data.setauditdate(rs.getString("auditdate"));
//        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        
        squery="call sp_ko_transaksi_tagihan_detail1_get("+header.getyop_tagihan()
                +","+header.getmop_tagihan()
                +","+header.getdocentry()
                +",'"+header.getall_departemen()+"'"
                +",'"+header.getkode_departemen()+"'"
                +")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ko_transaksi_tagihan_detail1ext(this.id);
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
        ko_transaksi_tagihan_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
