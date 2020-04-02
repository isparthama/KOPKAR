/*
 * To change this ko_transaksi_lembar_tagihan, choose Tools | ko_transaksi_lembar_tagihans
 * and open the ko_transaksi_lembar_tagihan in the editor.
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
public class ko_transaksi_lembar_tagihanext extends ko_transaksi_lembar_tagihancls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private ko_transaksi_lembar_tagihan_detail1extcol detail1;
    private String document_status_desc="Open";
    private double sisa_belum_dibayar=new Double(0);
    private String nama_departemen="";

    public ko_transaksi_lembar_tagihanext(){
        this.setdocument_date(GlobalUtils.sessiondate);
        detail1=new ko_transaksi_lembar_tagihan_detail1extcol(this);
    }


    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        ko_transaksi_lembar_tagihan_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_lembar_tagihan_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getyop_tagihan()+"', "
                        + "'"+this.getmop_tagihan()+"', "
                        + "'"+this.getday_tagihan()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_tagihan()+"', "
                        + "'"+this.getterima_bayar()+"', "
                        + "'"+this.gettotal_bayar()+"', "
                        + "'"+this.getsisa_tagihan()+"', "
                        + "'"+this.getmonthly_sts()+"', "
                        + "'"+this.getmonthly_no()+"', "
                        + "'"+this.getcash_sts()+"', "
                        + "'"+this.getall_departemen()+"', "
                        + "'"+this.getkode_departemen()+"', "
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
                    if (o.getstatus()==ko_transaksi_lembar_tagihan_detail1ext.Status_Insert){
                        o.setdocentry(this.getdocentry());
                    }
                    o.setyop(this.getyop());
                    o.setmop(this.getmop());
                    o.update();
                }
            } else {
                squery="call sp_ko_transaksi_lembar_tagihan_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getyop_tagihan()+"', "
                        + "'"+this.getmop_tagihan()+"', "
                         + "'"+this.getday_tagihan()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_tagihan()+"', "
                        + "'"+this.getterima_bayar()+"', "
                        + "'"+this.gettotal_bayar()+"', "
                        + "'"+this.getsisa_tagihan()+"', "
                        + "'"+this.getmonthly_sts()+"', "
                        + "'"+this.getmonthly_no()+"', "
                        + "'"+this.getcash_sts()+"', "
                        + "'"+this.getall_departemen()+"', "
                        + "'"+this.getkode_departemen()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                int i=0;
                for (i=0;i<this.detail1.size();i++){
                    o=this.detail1.get(i);
                    if (o.getstatus()==ko_transaksi_lembar_tagihan_detail1ext.Status_Insert){
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
        squery="call sp_ko_transaksi_lembar_tagihan_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getyop_tagihan()+"', "
                    + "'"+this.getmop_tagihan()+"', "
                     + "'"+this.getday_tagihan()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.getterima_bayar()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "
                    + "'"+this.getmonthly_sts()+"', "
                    + "'"+this.getmonthly_no()+"', "
                    + "'"+this.getcash_sts()+"', "
                    + "'"+this.getall_departemen()+"', "
                    + "'"+this.getkode_departemen()+"', "
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
        squery="select * from ko_transaksi_lembar_tagihan where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_lembar_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_lembar_tagihan_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_lembar_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException, CodeException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setyop_tagihan(rs.getInt("yop_tagihan"));
        this.setmop_tagihan(rs.getInt("mop_tagihan"));
        this.setday_tagihan(rs.getInt("day_tagihan"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_tagihan(rs.getDouble("total_tagihan"));
        this.setterima_bayar(rs.getDouble("terima_bayar"));
        this.settotal_bayar(rs.getDouble("total_bayar"));
        this.setsisa_tagihan(rs.getDouble("sisa_tagihan"));
        this.setsisa_bayar(rs.getDouble("sisa_bayar"));
        this.setmonthly_sts(rs.getString("monthly_sts"));
        this.setmonthly_no(rs.getInt("monthly_no"));
        this.setcash_sts(rs.getString("Cash_sts"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setall_departemen(rs.getString("all_departemen"));
        this.setkode_departemen(rs.getString("kode_departemen"));
        this.setnama_departemen(rs.getString("nama_departemen"));

        this.detail1=new ko_transaksi_lembar_tagihan_detail1extcol(this);
        this.detail1.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_lembar_tagihan_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_lembar_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_lembar_tagihan_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_lembar_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_lembar_tagihan_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_lembar_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_lembar_tagihan_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_lembar_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
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
            ko_transaksi_lembar_tagihan_detail1ext o = this.getDetail1().get(i);
            if (!o.getstatus().equals(ko_transaksi_lembar_tagihan_detail1ext.Status_delete)&&o.getselected()){
            this.settotal_bayar(this.gettotal_bayar()+o.gettotal_bayar());
            this.settotal_tagihan(this.gettotal_tagihan()+o.gettotal_tagihan());
            this.setsisa_tagihan(this.getsisa_tagihan()+o.getsisa_tagihan());
            }
        }

    }

    /**
     * @return the detail1
     */
    public ko_transaksi_lembar_tagihan_detail1extcol getDetail1() {
        return detail1;
    }

    /**
     * @param detail1 the detail1 to set
     */
    public void setDetail1(ko_transaksi_lembar_tagihan_detail1extcol detail1) {
        this.detail1 = detail1;
    }

    public String getDocument_status_desc() {
        return document_status_desc;
    }

    public void setDocument_status_desc(String document_status_desc) {
        this.document_status_desc = document_status_desc;
    }

    public void loaddetail() throws CodeException  {
        int i;
        this.detail1=new ko_transaksi_lembar_tagihan_detail1extcol(this);
        try {
            this.detail1.initdata();
            for (i=0;i<this.getDetail1().size();i++){
                ko_transaksi_lembar_tagihan_detail1ext o = this.getDetail1().get(i);
                o.setstatus(Status_Insert);
                this.getDetail1().set(i, o);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_lembar_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getnama_departemen() {
        return this.nama_departemen;
    }

    private void setnama_departemen(String nama_departemen) {
        this.nama_departemen=nama_departemen;
    }




}
