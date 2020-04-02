/*
 * To change this ko_transaksi_tagihan_detail1, choose Tools | ko_transaksi_tagihan_detail1s
 * and open the ko_transaksi_tagihan_detail1 in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_tagihan_detail1ext extends ko_transaksi_tagihan_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private Integer status=0;
    private Boolean selected=false;
    private String employee_number="";
    private String member_name = "";
    private String position_code = "";
    private String nama_jabatan = "";
    private String department_code = "";
    private String nama_departemen = "";

    private Double total_simpanan_info=new Double(0);
    private Double total_pinjaman_info = new Double(0);
    private Double toko_info = new Double(0);
    private Double sisa_tagihan_bln_seb_info = new Double(0);
    private Double total_tagihan_info = new Double(0);
    private Double total_bayar_info = new Double(0);
    private Double sisa_tagihan_info = new Double(0);


    public ko_transaksi_tagihan_detail1ext(Integer docentry) {
        this.setdocentry(docentry);
    }

    public ko_transaksi_tagihan_detail1ext() {
    }

    
    public void insert() throws CodeException {
        this.insertsts=true;
        this.status=this.Status_Insert;
    }

    public Boolean update() throws CodeException {
        if (this.getlinenum().equals(0)){
            insertsts=true;
        }
        if (this.getmember_number().equalsIgnoreCase("")||!this.getselected()){
            return false;
        }
        if (insertsts){
            squery="call sp_ko_transaksi_tagihan_detail1_insert( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlinenum()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_transaksi_tagihan_detail1_update( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlinenum()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_tagihan_detail1_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlinenum()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        try {
            db.execute(squery);
            insertsts=false;
            throw new CodeException("Data deleted");
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from ko_transaksi_tagihan_detail1 where docentry='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setlinenum(rs.getInt("linenum"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setmember_number(rs.getString("member_number"));
        this.settotal_tagihan(rs.getDouble("total_tagihan"));
        this.settotal_bayar(rs.getDouble("total_bayar"));
        this.setsisa_tagihan(rs.getDouble("sisa_tagihan"));

        this.setEmployee_number(rs.getString("employee_number"));
        this.setMember_name(rs.getString("member_name"));
        this.setPosition_code(rs.getString("position_code"));
        this.setNama_jabatan(rs.getString("nama_jabatan"));
        this.setDepartment_code(rs.getString("department_code"));
        this.setNama_departemen(rs.getString("nama_departemen"));


        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihan_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getClassName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean refresh() throws CodeException {
        if (this.initdata(this.getdocentry())){
            return true;
        }
        return false;
    }

    public void setstatus(Integer status) {
        this.status=status;
    }

    public Integer getstatus() {
        return this.status;
    }

    public Boolean getselected() {
        return selected;
    }

    public void setselected(boolean selected) {
        this.selected=selected;
    }

    /**
     * @return the total_simpanan_info
     */
    public Double getTotal_simpanan_info() {
        return total_simpanan_info;
    }

    /**
     * @param total_simpanan_info the total_simpanan_info to set
     */
    public void setTotal_simpanan_info(Double total_simpanan_info) {
        this.total_simpanan_info = total_simpanan_info;
    }

    /**
     * @return the total_pinjaman_info
     */
    public Double getTotal_pinjaman_info() {
        return total_pinjaman_info;
    }

    /**
     * @param total_pinjaman_info the total_pinjaman_info to set
     */
    public void setTotal_pinjaman_info(Double total_pinjaman_info) {
        this.total_pinjaman_info = total_pinjaman_info;
    }

    /**
     * @return the toko_info
     */
    public Double getToko_info() {
        return toko_info;
    }

    /**
     * @param toko_info the toko_info to set
     */
    public void setToko_info(Double toko_info) {
        this.toko_info = toko_info;
    }

    /**
     * @return the sisa_tagihan_bln_seb_info
     */
    public Double getSisa_tagihan_bln_seb_info() {
        return sisa_tagihan_bln_seb_info;
    }

    /**
     * @param sisa_tagihan_bln_seb_info the sisa_tagihan_bln_seb_info to set
     */
    public void setSisa_tagihan_bln_seb_info(Double sisa_tagihan_bln_seb_info) {
        this.sisa_tagihan_bln_seb_info = sisa_tagihan_bln_seb_info;
    }

    /**
     * @return the total_tagihan_info
     */
    public Double getTotal_tagihan_info() {
        return total_tagihan_info;
    }

    /**
     * @param total_tagihan_info the total_tagihan_info to set
     */
    public void setTotal_tagihan_info(Double total_tagihan_info) {
        this.total_tagihan_info = total_tagihan_info;
    }

    /**
     * @return the total_bayar_info
     */
    public Double getTotal_bayar_info() {
        return total_bayar_info;
    }

    /**
     * @param total_bayar_info the total_bayar_info to set
     */
    public void setTotal_bayar_info(Double total_bayar_info) {
        this.total_bayar_info = total_bayar_info;
    }

    /**
     * @return the sisa_tagihan_info
     */
    public Double getSisa_tagihan_info() {
        return sisa_tagihan_info;
    }

    /**
     * @param sisa_tagihan_info the sisa_tagihan_info to set
     */
    public void setSisa_tagihan_info(Double sisa_tagihan_info) {
        this.sisa_tagihan_info = sisa_tagihan_info;
    }

    /**
     * @return the employee_number
     */
    public String getEmployee_number() {
        return employee_number;
    }

    /**
     * @param employee_number the employee_number to set
     */
    public void setEmployee_number(String employee_number) {
        this.employee_number = employee_number;
    }

    /**
     * @return the member_name
     */
    public String getMember_name() {
        return member_name;
    }

    /**
     * @param member_name the member_name to set
     */
    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    /**
     * @return the position_code
     */
    public String getPosition_code() {
        return position_code;
    }

    /**
     * @param position_code the position_code to set
     */
    public void setPosition_code(String position_code) {
        this.position_code = position_code;
    }

    /**
     * @return the nama_jabatan
     */
    public String getNama_jabatan() {
        return nama_jabatan;
    }

    /**
     * @param nama_jabatan the nama_jabatan to set
     */
    public void setNama_jabatan(String nama_jabatan) {
        this.nama_jabatan = nama_jabatan;
    }

    /**
     * @return the department_code
     */
    public String getDepartment_code() {
        return department_code;
    }

    /**
     * @param department_code the department_code to set
     */
    public void setDepartment_code(String department_code) {
        this.department_code = department_code;
    }

    /**
     * @return the nama_departemen
     */
    public String getNama_departemen() {
        return nama_departemen;
    }

    /**
     * @param nama_departemen the nama_departemen to set
     */
    public void setNama_departemen(String nama_departemen) {
        this.nama_departemen = nama_departemen;
    }

    @Override
    public Double getsisa_tagihan() {
        this.setsisa_tagihan(this.gettotal_tagihan()-this.gettotal_bayar());
        return super.getsisa_tagihan();
    }


}
