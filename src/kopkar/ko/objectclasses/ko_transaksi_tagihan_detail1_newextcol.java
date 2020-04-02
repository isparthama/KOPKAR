/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.ko.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.CodeException;
/**
 *
 * @author Aryadanaraya
 */
public class ko_transaksi_tagihan_detail1_newextcol extends ko_transaksi_tagihan_detail1extcol {

    ko_transaksi_tagihan_newext header;
    ko_transaksi_tagihan_detail1_newext data=new ko_transaksi_tagihan_detail1_newext();

    public ko_transaksi_tagihan_detail1_newextcol(ko_transaksi_tagihan_newext header){
        this.header=header;
        this.id=this.header.getdocentry();
    }

    @Override
    public void initdata() throws SQLException {
        this.squery="call sp_ko_transaksi_tagihan_detail1_get_new("+this.header.getdocentry()
                +",'"+this.header.getbase_docentry()+"'"
                +")";
        ResultSet rs=db.executeQuery(this.squery);
        while (rs.next()){
            data=new ko_transaksi_tagihan_detail1_newext(this.id);
            if (fillme(rs)){
                this.add(data);
            }
        }
    }


    public ko_transaksi_tagihan_detail1_newext get(int index) {
        return (ko_transaksi_tagihan_detail1_newext) super.get(index);
    }

    @Override
    protected Boolean fillme(ResultSet rs) throws SQLException {
        try {
            if (rs.getString("pilih").equalsIgnoreCase("Y")){
                data.setselected(true);
            }
            data.setdocentry(rs.getInt("docentry"));
            data.setlinenum(rs.getInt("linenum"));

            if (data.getdocentry().equals(0)){
                data.insert();
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

        } catch (CodeException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1_newextcol.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }





}
