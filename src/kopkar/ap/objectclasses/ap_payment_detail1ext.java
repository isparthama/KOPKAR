/*
 * To change this ap_payment_detail1, choose Tools | ap_payment_detail1s
 * and open the ap_payment_detail1 in the editor.
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
public class ap_payment_detail1ext extends ap_payment_detail1cls implements NavigatorObjectInt{
    public Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private ap_payment_detail2extcol objd2s;
    private ap_payment_detail3extcol objd3s;
    private String supplier_code_desc="";
    private ap_paymentext obj;

    private Double total_payment=new Double(0);
    private Double total_entry=new Double(0);

    public ap_paymentext getObj() {
        return obj;
    }

    public ap_payment_detail1ext(ap_paymentext obj){
        this.obj=obj;
        this.setbatchentry(obj.getbatchentry());
        this.setyop(GlobalUtils.toInt(GlobalUtils.getYear(GlobalUtils.sessiondate)));
        this.setmop(GlobalUtils.toInt(GlobalUtils.getMonth(GlobalUtils.sessiondate)));
        insertsts=true;
        this.objd2s=new ap_payment_detail2extcol(this.getsupplier_code(), this.getbatchentry(),this.getdocentry());
        this.objd3s=new ap_payment_detail3extcol(this.getsupplier_code(),this.getbatchentry(),this.getdocentry());
    }
    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocdate(GlobalUtils.formatDate(this.getdocdate(), "yyyy-MM-dd"));
        try {
            if (insertsts){
                squery="call sp_ap_payment_detail1_insert( "
                        + "'"+this.getbatchentry()+"', "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocdate()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getsupplier_code()+"', "
                        + "'"+this.getpayment_type()+"', "
                        + "'"+this.getpayment_ammount()+"', "
                        + "'"+this.getpayment_total()+"', "
                        + "'"+this.getpayment_balance()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                ResultSet rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocentry(rs.getInt("docentry"));
                    this.setbatchentry(rs.getInt("batchentry"));


                    for (int i=0;i<this.objd2s.size();i++){
                        ap_payment_detail2ext o=this.objd2s.get(i);

                        o.setbatchentry(this.getbatchentry());
                        o.setdocentry(this.getdocentry());
                        
                        if (o.getlinenum().equals(0)&&o.getpilih()){
                            o.setstatus(o.Status_Insert);
                        } else {
                            o.setstatus(o.Status_normal);
                        }
                        if (o.getstatus()==o.Status_Insert){
                            o.update();
                        } else if (o.getlinenum()>0){
                            if (o.getstatus()==o.Status_update){
                                o.update();
                            }
                            if (o.getstatus()==o.Status_delete){
                                o.delete();
                            }
                        }
                    }

                    for (int i=0;i<this.objd3s.size();i++){
                        ap_payment_detail3ext o=this.objd3s.get(i);

                        o.setbatchentry(this.getbatchentry());
                        o.setdocentry(this.getdocentry());

                        if (o.getlinenum().equals(0)&&o.getpilih()){
                            o.setstatus(o.Status_Insert);
                        } else {
                            o.setstatus(o.Status_normal);
                        }
                        if (o.getstatus()==o.Status_Insert){
                            o.update();
                        } else if (o.getlinenum()>0){
                            if (o.getstatus()==o.Status_update){
                                o.update();
                            }
                            if (o.getstatus()==o.Status_delete){
                                o.delete();
                            }
                        }
                    }
                }
            } else {
                squery="call sp_ap_payment_detail1_update( "
                        + "'"+this.getbatchentry()+"', "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocdate()+"', "
                        + "'"+this.getyop()+"', "
                        + "'"+this.getmop()+"', "
                        + "'"+this.getsupplier_code()+"', "
                        + "'"+this.getpayment_type()+"', "
                        + "'"+this.getpayment_ammount()+"', "
                        + "'"+this.getpayment_total()+"', "
                        + "'"+this.getpayment_balance()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);

                for (int i=0;i<this.objd2s.size();i++){
                        ap_payment_detail2ext o=this.objd2s.get(i);

                        o.setbatchentry(this.getbatchentry());
                        o.setdocentry(this.getdocentry());

                        if (o.getstatus()!=2){
                            if (o.getlinenum().equals(0)&&o.getpilih()){
                                o.setstatus(o.Status_Insert);
                            } else {
                                o.setstatus(o.Status_normal);
                            }
                        }
                        if (o.getstatus()==o.Status_Insert){
                            o.update();
                        } else if (o.getlinenum()>0){
                            if (o.getstatus()==o.Status_update){
                                o.update();
                            }
                            if (o.getstatus()==o.Status_delete){
                                o.delete();
                            }
                        }
                    }

                    for (int i=0;i<this.objd3s.size();i++){
                        ap_payment_detail3ext o=this.objd3s.get(i);

                        o.setbatchentry(this.getbatchentry());
                        o.setdocentry(this.getdocentry());

                        if (o.getlinenum().equals(0)&&o.getpilih()){
                            o.setstatus(o.Status_Insert);
                        } else {
                            o.setstatus(o.Status_normal);
                        }
                        if (o.getstatus()==o.Status_Insert){
                            o.update();
                        } else if (o.getlinenum()>0){
                            if (o.getstatus()==o.Status_update){
                                o.update();
                            }
                            if (o.getstatus()==o.Status_delete){
                                o.delete();
                            }
                        }
                    }
            }
            insertsts=false;
            this.refresh();
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_ap_payment_detail1_delete( "
                    + "'"+this.getbatchentry()+"', "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getdocdate()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getsupplier_code()+"', "
                    + "'"+this.getpayment_type()+"', "
                    + "'"+this.getpayment_ammount()+"', "
                    + "'"+this.getpayment_total()+"', "
                    + "'"+this.getpayment_balance()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        try {
            db.execute(squery);
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer docentry) throws CodeException {
        squery="CALL sp_ap_payment_detail1_get('"+this.getbatchentry()+"','"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_ap_payment_detail1_get('"+this.getbatchentry()+"','"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        insertsts=false;
        
        this.setbatchentry(rs.getInt("batchentry"));
        this.setdocentry(rs.getInt("docentry"));
        this.setdocdate(rs.getString("docdate"));
        this.setyop(rs.getInt("yop"));
        this.setmop(rs.getInt("mop"));
        this.setsupplier_code(rs.getString("supplier_code"));
        this.setpayment_type(rs.getString("payment_type"));
        this.setpayment_ammount(rs.getDouble("payment_ammount"));
            this.setpayment_total(rs.getDouble("payment_total"));
        this.setpayment_balance(rs.getDouble("payment_balance"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));
        this.setprocess_sts(rs.getString("process_sts"));
        this.setprocess_date(rs.getString("process_date"));
        this.setprocess_user(rs.getString("process_user"));
        this.setdayseqno(rs.getInt("dayseqno"));

        this.setTotal_payment(rs.getDouble("total_payment"));
        this.setTotal_entry(rs.getDouble("total_entry"));
        this.obj.settotal_payment(total_payment+this.getpayment_total());
        this.obj.settotal_entry(total_entry+1);
        
        this.obj.settotal_payment_tmp(total_payment);
        this.objd2s=new ap_payment_detail2extcol(this.getsupplier_code(), this.getbatchentry(),this.getdocentry());
        this.objd2s.initdata();
        
        this.objd3s=new ap_payment_detail3extcol(this.getsupplier_code(),this.getbatchentry(),this.getdocentry());
        this.objd3s.initdata();

        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ap_payment_detail1_get('"+this.getbatchentry()+"','"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ap_payment_detail1_get('"+this.getbatchentry()+"','"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ap_payment_detail1_get('"+this.getbatchentry()+"','"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ap_payment_detail1_get('"+this.getbatchentry()+"','"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_payment_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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

    /**
     * @return the objd2s
     */
    public ap_payment_detail2extcol getObjd2s() {
        return objd2s;
    }

    /**
     * @param objd2s the objd2s to set
     */
    public void setObjd2s(ap_payment_detail2extcol objd2s) {
        this.objd2s = objd2s;
    }

    /**
     * @return the objd3s
     */
    public ap_payment_detail3extcol getObjd3s() {
        return objd3s;
    }

    /**
     * @param objd3s the objd3s to set
     */
    public void setObjd3s(ap_payment_detail3extcol objd3s) {
        this.objd3s = objd3s;
    }

    public String getsupplier_code_desc() {
        return this.supplier_code_desc;
    }

    @Override
    public void setsupplier_code(String supplier_code) {
        super.setsupplier_code(supplier_code);

        if (this.insertsts){
            this.objd2s=new ap_payment_detail2extcol(this.getsupplier_code(), this.getbatchentry(), this.getdocentry());
            this.objd3s=new ap_payment_detail3extcol(this.getsupplier_code(), this.getbatchentry(), this.getdocentry());
            try {
                this.objd2s.initdata_open_invoice(this.getsupplier_code());
                this.objd3s.initdata_open_invoice(this.getsupplier_code());
            } catch (SQLException ex) {
                Logger.getLogger(ap_payment_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void calculatetotal() {
        obj.settotal_payment(new Double(0));
        obj.settotal_entry(new Double(0));
        this.setpayment_total(new Double(0));
        for (int i=0;i<this.objd2s.size();i++){
            ap_payment_detail2ext o = objd2s.get(i);
            this.setpayment_total(this.getpayment_total()+o.getjumlah_bayar());
        }

        if(this.getpayment_type().equals("3")){
            Double payment_dnote=new Double(0);
            for (int i=0;i<this.objd3s.size();i++){
                ap_payment_detail3ext o = objd3s.get(i);
                payment_dnote=payment_dnote+o.getjumlah_bayar();
            }
            this.setpayment_ammount(payment_dnote);
        }

        this.setpayment_balance(this.getpayment_ammount()-this.getpayment_total());

        obj.settotal_payment(obj.gettotal_payment_tmp()+this.getpayment_total());
        obj.settotal_entry(obj.gettotal_entry()+1);
    }

    @Override
    public void setpayment_ammount(Double payment_ammount) {
        super.setpayment_ammount(payment_ammount);

        this.setpayment_balance(this.getpayment_ammount()-this.getpayment_total());
    }

    /**
     * @return the total_payment
     */
    public Double getTotal_payment() {
        return total_payment;
    }

    /**
     * @param total_payment the total_payment to set
     */
    public void setTotal_payment(Double total_payment) {
        this.total_payment = total_payment;
    }

    private void setTotal_entry(Double total_entry) {
        this.total_entry=total_entry;
    }




}
