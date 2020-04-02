/*
 * To change this ap_payment_detail3, choose Tools | ap_payment_detail3s
 * and open the ap_payment_detail3 in the editor.
 */

package kopkar.ap.objectclasses;

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
public class ap_payment_detail3ext extends ap_payment_detail3cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private Integer status=1;
    private boolean pilih=false;
    private double sisaFaktur=0;
    private double nilaiAkhirFaktur=0;
    private double totalBayar=0;
    private String payment_type;

    public ap_payment_detail3ext(){
    }
    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (this.getstatus()==Status_Insert){
            squery="call sp_ap_payment_detail3_insert( "
                        + "'"+this.getbatchentry()+"', "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getlinenum()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getjumlah_bayar()+"', "
                        + "'"+this.getpayment_type()+"', "
                        + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ap_payment_detail3_update( "
                    + "'"+this.getbatchentry()+"', "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getlinenum()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getjumlah_bayar()+"', "
                        + "'"+this.getpayment_type()+"', "
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
        squery="call sp_ap_payment_detail3_delete( "
                    + "'"+this.getbatchentry()+"', "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getlinenum()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getjumlah_bayar()+"', "
                        + "'"+this.getpayment_type()+"', "
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
        squery="select * from ap_payment_detail3 where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail3ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        //squery="CALL sp_ap_payment_detail3_get('"++"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail3ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setbatchentry(rs.getInt("batchentry"));
        this.setdocentry(rs.getInt("docentry"));
        this.setlinenum(rs.getInt("linenum"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setdocument_duedate(rs.getString("document_duedate"));
        this.setsupplier_code(rs.getString("supplier_code"));
        this.settotal_aft_tax(rs.getDouble("total_aft_tax"));
        this.setjumlah_bayar(rs.getDouble("jumlah_bayar"));
        this.setjumlah_cash(rs.getDouble("jumlah_cash"));
        this.setjumlah_transfer(rs.getDouble("jumlah_transfer"));
        this.setjumlah_dncn(rs.getDouble("jumlah_dncn"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));
        this.setprocess_sts(rs.getString("process_sts"));
        this.setprocess_date(rs.getString("process_date"));
        this.setprocess_user(rs.getString("process_user"));
        this.setdayseqno(rs.getInt("dayseqno"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
//        squery="CALL sp_ap_payment_detail3_get('"+this.get()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail3ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
//        squery="CALL sp_ap_payment_detail3_get('"+this.get()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail3ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
//        squery="CALL sp_ap_payment_detail3_get('"+this.get()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail3ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
//        squery="CALL sp_ap_payment_detail3_get('"+this.get()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail3ext.class.getName()).log(Level.SEVERE, null, ex);
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
//        if (this.initdata(this.get())){
//            return true;
//        }
        return false;
    }

    public void setstatus(Integer status) {
        System.out.println(status);
        this.status=status;
    }

    public Integer getstatus() {
        return this.status;
    }

    public void setpilih(boolean b) {
        this.pilih=b;
    }

    void setsisaFaktur(double sisaFaktur) {
        this.sisaFaktur=sisaFaktur;
    }

    void setnilaiAkhirFaktur(double nilaiAkhirFaktur) {
        this.nilaiAkhirFaktur=nilaiAkhirFaktur;
    }

    void settotalBayar(double totalBayar) {
        this.totalBayar=totalBayar;
    }

    public double gettotalBayar() {
        return this.totalBayar;
    }

    public double getsisaFaktur() {
        return this.sisaFaktur;
    }

    public double getnilaiAkhirFaktur() {
        return this.nilaiAkhirFaktur;
    }

    @Override
    public void setjumlah_bayar(Double jumlah_bayar) {
        super.setjumlah_bayar(jumlah_bayar);

        this.setnilaiAkhirFaktur(this.getsisaFaktur()-this.getjumlah_bayar());

        if (this.getjumlah_bayar()>0){
            this.setpilih(true);
        } else {
            this.setpilih(false);
        }
    }

    public Boolean getpilih() {
        return this.pilih;
    }

    private String getpayment_type() {
        return this.payment_type;
    }

    public void setpayment_type(String payment_type) {
        this.payment_type=payment_type;
    }

}
