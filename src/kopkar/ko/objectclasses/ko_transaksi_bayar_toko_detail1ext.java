/*
 * To change this ko_transaksi_bayar_toko_detail1, choose Tools | ko_transaksi_bayar_toko_detail1s
 * and open the ko_transaksi_bayar_toko_detail1 in the editor.
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
public class ko_transaksi_bayar_toko_detail1ext extends ko_transaksi_bayar_toko_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private Integer status=0;

    private Boolean selected=false;
    private String periode=GlobalUtils.sessiondate;
    private String reference_number="";
    private Double total_bayar=new Double(0);
    private Double nilai_pending=new Double(0);
    private Double nilai_tagihan=new Double(0);
    private double sisa_bayar=new Double(0);

    public ko_transaksi_bayar_toko_detail1ext(int docentry) {
        this.setdocentry(docentry);
        this.setline_number(0);
        this.setpayment_amount(new Double(0));
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_transaksi_bayar_toko_detail1_insert( "
                    + "'"+this.getdocentry()+"', "
                     + "'"+this.getline_number()+"', "
                     + "'"+this.getmember_number()+"', "
                     + "'"+this.getinvoice_number()+"', "
                     + "'"+this.getinvoice_amount()+"', "
                     + "'"+this.getpayment_amount()+"', "
                     + "'"+this.getinvoice_balance()+"', "
                     + "'"+GlobalUtils.userid+"'"

                    + ")";
        } else {
            squery="call sp_ko_transaksi_bayar_toko_detail1_update( "
                    + "'"+this.getdocentry()+"', "
                     + "'"+this.getline_number()+"', "
                     + "'"+this.getmember_number()+"', "
                     + "'"+this.getinvoice_number()+"', "
                     + "'"+this.getinvoice_amount()+"', "
                     + "'"+this.getpayment_amount()+"', "
                     + "'"+this.getinvoice_balance()+"', "
                     + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_bayar_toko_detail1_delete( "
                    + "'"+this.getdocentry()+"', "
                     + "'"+this.getline_number()+"', "
                     + "'"+this.getmember_number()+"', "
                     + "'"+this.getinvoice_number()+"', "
                     + "'"+this.getinvoice_amount()+"', "
                     + "'"+this.getpayment_amount()+"', "
                     + "'"+this.getinvoice_balance()+"', "
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

    public Boolean initdata(Integer docentry) throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_toko_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setline_number(rs.getInt("line_number"));
        this.setmember_number(rs.getString("member_number"));
        this.setinvoice_number(rs.getString("invoice_number"));
        this.setinvoice_amount(rs.getDouble("invoice_amount"));
        this.setpayment_amount(rs.getDouble("payment_amount"));
        this.setinvoice_balance(rs.getDouble("invoice_balance"));
        this.setctrbution_amount(rs.getDouble("ctrbution_amount"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_toko_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_toko_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_toko_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_toko_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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

    public void setstatus(Integer Status_delete) {
        this.setStatus(Status_delete);
    }

    /**
     * @return the status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return the selected
     */
    public Boolean getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getperiode() {
        return this.periode;
    }

    public String getreference_number() {
        return this.reference_number;
    }

    public Double gettotal_bayar() {
        return this.total_bayar;
    }

    public Double getnilai_pending() {
        return this.nilai_pending;
    }

    public Double getnilai_tagihan() {
        return this.nilai_tagihan;
    }

    public void setNilai_pending(Double nilai_pending) {
        this.nilai_pending = nilai_pending;
    }

    public void setNilai_tagihan(Double nilai_tagihan) {
        this.nilai_tagihan = nilai_tagihan;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public void setReference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public void setTotal_bayar(Double total_bayar) {
        this.total_bayar = total_bayar;
    }

    @Override
    public void setpayment_amount(Double payment_amount) {
        super.setpayment_amount(payment_amount);
        this.sisa_bayar=this.nilai_tagihan-this.getpayment_amount();
    }

    public Double getsisa_bayar() {
        return this.sisa_bayar;
    }


}
