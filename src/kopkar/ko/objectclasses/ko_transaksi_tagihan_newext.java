/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
 * @author Aryadanaraya
 */
public class ko_transaksi_tagihan_newext extends ko_transaksi_tagihanext{
    private String reference_number="";
    private ko_transaksi_tagihan_detail1_newextcol detail1=new ko_transaksi_tagihan_detail1_newextcol(this);

    private String getreference_number(){
        return this.reference_number;
    }

    private void setreference_number(String reference_number){
        this.reference_number=reference_number;
    }

    @Override
    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_get_new('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    protected Boolean fillme(ResultSet rs) throws SQLException {
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setyop_tagihan(rs.getInt("yop_tagihan"));
        this.setmop_tagihan(rs.getInt("mop_tagihan"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_tagihan(rs.getDouble("total_tagihan"));
        this.setterima_bayar(rs.getDouble("terima_bayar"));
        this.settotal_bayar(rs.getDouble("total_bayar"));
        this.setsisa_tagihan(rs.getDouble("sisa_tagihan"));
        this.setsisa_bayar(rs.getDouble("sisa_bayar"));
        this.setmonthly_sts(rs.getString("monthly_sts"));
        this.setmonthly_no(rs.getInt("monthly_no"));
        this.setCash_sts(rs.getString("Cash_sts"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setall_departemen(rs.getString("all_departemen"));
        this.setkode_departemen(rs.getString("kode_departemen"));
        this.setnama_departemen(rs.getString("nama_departemen"));

        this.detail1=new ko_transaksi_tagihan_detail1_newextcol(this);
        this.detail1.initdata();
        return true;
    }

    @Override
    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        ko_transaksi_tagihan_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_ko_transaksi_tagihan_insert_new( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getReference_number()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getyop_tagihan()+"', "
                        + "'"+this.getmop_tagihan()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_tagihan()+"', "
                        + "'"+this.getterima_bayar()+"', "
                        + "'"+this.gettotal_bayar()+"', "
                        + "'"+this.getsisa_tagihan()+"', "
                        + "'"+this.getmonthly_sts()+"', "
                        + "'"+this.getmonthly_no()+"', "
                        + "'"+this.getCash_sts()+"', "
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
                    if (o.getstatus()==ko_transaksi_tagihan_detail1ext.Status_Insert){
                        o.setdocentry(this.getdocentry());
                    }
                    o.setyop(this.getyop());
                    o.setmop(this.getmop());
                    o.update();
                }
            } else {
                squery="call sp_ko_transaksi_tagihan_update_new( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getReference_number()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getyop_tagihan()+"', "
                        + "'"+this.getmop_tagihan()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_tagihan()+"', "
                        + "'"+this.getterima_bayar()+"', "
                        + "'"+this.gettotal_bayar()+"', "
                        + "'"+this.getsisa_tagihan()+"', "
                        + "'"+this.getmonthly_sts()+"', "
                        + "'"+this.getmonthly_no()+"', "
                        + "'"+this.getCash_sts()+"', "
                        + "'"+this.getall_departemen()+"', "
                        + "'"+this.getkode_departemen()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                int i=0;
                for (i=0;i<this.detail1.size();i++){
                    o=this.detail1.get(i);
                    if (o.getstatus()==ko_transaksi_tagihan_detail1ext.Status_Insert){
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

    @Override
    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_tagihan_delete_new( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getReference_number()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getyop_tagihan()+"', "
                    + "'"+this.getmop_tagihan()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.getterima_bayar()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "
                    + "'"+this.getmonthly_sts()+"', "
                    + "'"+this.getmonthly_no()+"', "
                    + "'"+this.getCash_sts()+"', "
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

    @Override
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_get_new('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_get_new('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_get_new('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_transaksi_tagihan_get_new('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    public ko_transaksi_tagihan_detail1_newextcol getDetail1() {
        return this.detail1;
    }

     public void setDetail1(ko_transaksi_tagihan_detail1_newextcol detail1) {
        this.detail1 = detail1;
    }

    public Boolean refreshdetail() {
        this.detail1=new ko_transaksi_tagihan_detail1_newextcol(this);
        try {
            this.detail1.initdata();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_tagihan_newext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }





}
