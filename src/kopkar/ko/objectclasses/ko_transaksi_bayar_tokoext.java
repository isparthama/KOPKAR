/*
 * To change this ko_transaksi_bayar_toko, choose Tools | ko_transaksi_bayar_tokos
 * and open the ko_transaksi_bayar_toko in the editor.
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
public class ko_transaksi_bayar_tokoext extends ko_transaksi_bayar_tokocls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private ko_transaksi_bayar_toko_detail1extcol detail1;
    private String document_status_desc="Open";
    private double sisa_belum_dibayar=new Double(0);
    private String member_name="";
    private String department_code="";
    private String nama_departemen = "";

    public ko_transaksi_bayar_tokoext() {
        this.setdocentry(0);
        this.settotal_bayar(new Double(0));
        this.setterima_bayar(new Double(0));
        this.setcomplete_status("N");
        this.setcash_sts("Y");
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        ko_transaksi_bayar_toko_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_bayar_toko_insert( "
                        + "'"+this.getdocentry()+"', "
                         + "'"+this.getdocument_number()+"', "
                         + "'"+this.getcomplete_status()+"', "
                         + "'"+this.getdocument_date()+"', "
                         + "'"+this.getyop()+"', "
                         + "'"+this.getmop()+"', "
                         + "'"+this.getmember_number()+"', "
                         + "'"+this.getreference()+"', "
                         + "'"+this.getdscription()+"', "
                         + "'"+this.gettotal_tagihan()+"', "
                         + "'"+this.getterima_bayar()+"', "
                         + "'"+this.gettotal_bayar()+"', "
                         + "'"+this.getsisa_tagihan()+"', "
                         + "'"+this.getsisa_bayar()+"', "
                         + "'"+GlobalUtils.userid+"'"
                        + ")";

                ResultSet rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocentry(rs.getInt("docentry"));
                    this.setdocument_number(rs.getString("document_number"));
                }

                int i=0;
                for (i=0;i<this.detail1.size();i++){
                    o=this.detail1.get(i);
                    if (o.getline_number().equals(0)){
                        o.insert();
                        o.setstatus(ko_transaksi_tagihan_detail1ext.Status_Insert);
                    }
                    if (o.getStatus()==ko_transaksi_tagihan_detail1ext.Status_Insert){
                        o.setdocentry(this.getdocentry());
                    }
                    o.update();
                }
            } else {
                squery="call sp_ko_transaksi_bayar_toko_update( "
                        + "'"+this.getdocentry()+"', "
                         + "'"+this.getdocument_number()+"', "
                         + "'"+this.getcomplete_status()+"', "
                         + "'"+this.getdocument_date()+"', "
                         + "'"+this.getyop()+"', "
                         + "'"+this.getmop()+"', "
                         + "'"+this.getmember_number()+"', "
                         + "'"+this.getreference()+"', "
                         + "'"+this.getdscription()+"', "
                         + "'"+this.gettotal_tagihan()+"', "
                         + "'"+this.getterima_bayar()+"', "
                         + "'"+this.gettotal_bayar()+"', "
                         + "'"+this.getsisa_tagihan()+"', "
                         + "'"+this.getsisa_bayar()+"', "
                         + "'"+GlobalUtils.userid+"'"
                        + ")";

                int i=0;
                for (i=0;i<this.detail1.size();i++){
                    o=this.detail1.get(i);
                    if (o.getline_number().equals(0)){
                        o.insert();
                        o.setstatus(ko_transaksi_tagihan_detail1ext.Status_Insert);
                    }
                    if (o.getStatus()==ko_transaksi_tagihan_detail1ext.Status_Insert){
                        o.setdocentry(this.getdocentry());
                    }
                    o.update();
                }

                db.execute(squery);
            }
        
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_bayar_toko_delete( "
                    + "'"+this.getdocentry()+"', "
                     + "'"+this.getdocument_number()+"', "
                     + "'"+this.getcomplete_status()+"', "
                     + "'"+this.getdocument_date()+"', "
                     + "'"+this.getyop()+"', "
                     + "'"+this.getmop()+"', "
                     + "'"+this.getmember_number()+"', "
                     + "'"+this.getreference()+"', "
                     + "'"+this.getdscription()+"', "
                     + "'"+this.gettotal_tagihan()+"', "
                     + "'"+this.getterima_bayar()+"', "
                     + "'"+this.gettotal_bayar()+"', "
                     + "'"+this.getsisa_tagihan()+"', "
                     + "'"+this.getsisa_bayar()+"', "
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
        squery="select * from ko_transaksi_bayar_toko where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setmember_number(rs.getString("member_number"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_tagihan(rs.getDouble("total_tagihan"));
        this.setterima_bayar(rs.getDouble("terima_bayar"));
        this.settotal_bayar(rs.getDouble("total_bayar"));
        this.setsisa_tagihan(rs.getDouble("sisa_tagihan"));
        this.setsisa_bayar(rs.getDouble("sisa_bayar"));
        this.setmonthly_sts(rs.getString("monthly_sts"));
        this.setmonthly_no(rs.getInt("monthly_no"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        this.setprocess_sts(rs.getString("process_sts"));
        this.setprocess_date(rs.getString("process_date"));
        this.setprocess_user(rs.getString("process_user"));
        this.setdayseqno(rs.getInt("dayseqno"));
        this.setcash_sts(rs.getString("cash_sts"));

        this.setMember_name(rs.getString("member_name"));
        this.setDepartment_code(rs.getString("department_code"));
        this.setNama_departemen(rs.getString("nama_departemen"));

        detail1=new ko_transaksi_bayar_toko_detail1extcol(this.getdocentry());
        detail1.initdata(this.getmember_number());
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_bayar_toko_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getdocument_number())){
            return true;
        }
        return false;
    }

    public void calculatetotal() {
        int i=0;
        this.settotal_bayar(new Double(0));
        this.settotal_tagihan(new Double(0));
        this.setsisa_bayar(new Double(0));
        this.setsisa_tagihan(new Double(0));

        for (i=0;i<this.getDetail1().size();i++){
            ko_transaksi_bayar_toko_detail1ext o = this.getDetail1().get(i);
            if (!o.getStatus().equals(ko_transaksi_bayar_toko_detail1ext.Status_delete)&&o.getSelected()){
            this.settotal_bayar(this.gettotal_bayar()+o.getpayment_amount());
            this.settotal_tagihan(this.gettotal_tagihan()+o.getinvoice_amount());
            this.setsisa_tagihan(this.getsisa_tagihan()+o.getinvoice_balance());
            }
        }

    }

    /**
     * @return the detail1
     */
    public ko_transaksi_bayar_toko_detail1extcol getDetail1() {
        return detail1;
    }

    /**
     * @param detail1 the detail1 to set
     */
    public void setDetail1(ko_transaksi_bayar_toko_detail1extcol detail1) {
        this.detail1 = detail1;
    }

    public String getDocument_status_desc() {
        return document_status_desc;
    }

    public void setDocument_status_desc(String document_status_desc) {
        this.document_status_desc = document_status_desc;
    }

    public void loaddetail()  {
        int i;
        this.detail1=new ko_transaksi_bayar_toko_detail1extcol(this);
        try {
            this.detail1.initdata(this.getmember_number());
            for (i=0;i<this.getDetail1().size();i++){
                ko_transaksi_bayar_toko_detail1ext o = this.getDetail1().get(i);
                o.setstatus(Status_Insert);
                this.getDetail1().set(i, o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_bayar_tokoext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void setterima_bayar(Double terima_bayar) {
        super.setterima_bayar(terima_bayar);

        this.setSisa_belum_dibayar(this.getterima_bayar() - this.gettotal_bayar());
    }

    /**
     * @return the sisa_belum_dibayar
     */
    public double getSisa_belum_dibayar() {
        this.setSisa_belum_dibayar(this.getterima_bayar() - this.gettotal_bayar());
        return sisa_belum_dibayar;
    }

    /**
     * @param sisa_belum_dibayar the sisa_belum_dibayar to set
     */
    public void setSisa_belum_dibayar(double sisa_belum_dibayar) {
        this.sisa_belum_dibayar = sisa_belum_dibayar;
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


}
