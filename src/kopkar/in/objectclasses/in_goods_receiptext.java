/*
 * To change this in_goods_receipt, choose Tools | in_goods_receipts
 * and open the in_goods_receipt in the editor.
 */

package kopkar.in.objectclasses;

import kopkar.ap.objectclasses.ap_supplierext;
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
public class in_goods_receiptext extends in_goods_receiptcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String document_status_desc="Open";
    ap_supplierext osupplier=new ap_supplierext();

    public in_goods_receiptext() {
        this.setdocument_date(GlobalUtils.sessiondate);
    }

    public in_goods_receipt_detail1extcol getDetail1() {
        return detail1;
    }

    public void setDetail1(in_goods_receipt_detail1extcol detail1) {
        this.detail1 = detail1;
    }
    private in_goods_receipt_detail1extcol detail1=new in_goods_receipt_detail1extcol(null);

    public ap_supplierext getOsupplier() {
        return osupplier;
    }

    public String getDocument_status_desc() {
        return document_status_desc;
    }

    public void setDocument_status_desc(String document_status_desc) {
        this.document_status_desc = document_status_desc;
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        this.setdocument_duedate(GlobalUtils.formatDate(this.getdocument_duedate(), "yyyy-MM-dd"));
        in_goods_receipt_detail1ext o;
        try {
            if (insertsts){
                squery="call sp_in_goods_receipt_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getdocument_duedate()+"', "
                        + "'"+this.getsupplier_code()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getterm_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getsalesman_code()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getinclude_tax()+"', "
                        + "'"+this.gettotal_bfr_discount()+"', "
                        + "'"+this.gettotal_discount()+"', "
                        + "'"+this.gettotal_aft_discount()+"', "
                        + "'"+this.gettax_amount()+"', "
                        + "'"+this.gettotal_aft_tax()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                        this.calculatetotal();
                        ResultSet rs=db.executeQuery(squery);
                        if (rs.next()){
                            this.setdocentry(rs.getInt("docentry"));
                            this.setdocument_number(rs.getString("document_number"));
                        }
                        
                        int i=0;
                        for (i=0;i<this.detail1.size();i++){
                            o=this.detail1.get(i);
                            if (o.getstatus()==in_goods_receipt_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                            }
                            o.setwarehouse_code(this.getwarehouse_code());
                            o.setprice_code(this.getprice_code());
                            o.update();
                        }

                        

            } else {
                squery="call sp_in_goods_receipt_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getdocument_duedate()+"', "
                        + "'"+this.getsupplier_code()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getterm_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getsalesman_code()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getinclude_tax()+"', "
                        + "'"+this.gettotal_bfr_discount()+"', "
                        + "'"+this.gettotal_discount()+"', "
                        + "'"+this.gettotal_aft_discount()+"', "
                        + "'"+this.gettax_amount()+"', "
                        + "'"+this.gettotal_aft_tax()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                        

                        int i=0;
                        for (i=0;i<this.detail1.size();i++){
                            o=this.detail1.get(i);
                            if (o.getstatus()==in_goods_receipt_detail1ext.Status_Insert){
                                o.setdocentry(this.getdocentry());
                            }
                            o.setwarehouse_code(this.getwarehouse_code());
                            o.setprice_code(this.getprice_code());
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
        squery="call sp_in_goods_receipt_delete( "
                    + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getdocument_duedate()+"', "
                        + "'"+this.getsupplier_code()+"', "
                        + "'"+this.getreference_number()+"', "
                        + "'"+this.getterm_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getsalesman_code()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.getinclude_tax()+"', "
                        + "'"+this.gettotal_bfr_discount()+"', "
                        + "'"+this.gettotal_discount()+"', "
                        + "'"+this.gettotal_aft_discount()+"', "
                        + "'"+this.gettax_amount()+"', "
                        + "'"+this.gettotal_aft_tax()+"', "
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
        squery="select * from in_goods_receipt where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_receiptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_in_goods_receipt_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_receiptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setdocument_duedate(rs.getString("document_duedate"));
        this.setsupplier_code(rs.getString("supplier_code"));
        this.setreference_number(rs.getString("reference_number"));
        this.setterm_code(rs.getString("term_code"));
        this.setdiscount_code(rs.getString("discount_code"));
        this.setprice_code(rs.getString("price_code"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setsalesman_code(rs.getString("salesman_code"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.setinclude_tax(rs.getString("include_tax"));
        this.settax_percent(rs.getDouble("tax_percent"));
        this.settotal_bfr_discount(rs.getDouble("total_bfr_discount"));
        this.settotal_discount(rs.getDouble("total_discount"));
        this.settotal_aft_discount(rs.getDouble("total_aft_discount"));
        this.settax_amount(rs.getDouble("tax_amount"));
        this.settotal_aft_tax(rs.getDouble("total_aft_tax"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));

        this.setDocument_status_desc(rs.getString("document_status_desc"));
        osupplier=new ap_supplierext();
        osupplier.setsupplier_name(rs.getString("supplier_name"));
        osupplier.setaddress1(rs.getString("address"));

        detail1=new in_goods_receipt_detail1extcol(this.getdocentry());
        detail1.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_goods_receipt_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_receiptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_goods_receipt_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_receiptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_goods_receipt_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_receiptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_goods_receipt_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_receiptext.class.getName()).log(Level.SEVERE, null, ex);
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
        double total_gross = 0;
        double total_after_discount=0;
        double total_discount=0;
        for (i=0;i<this.detail1.size();i++){
            in_goods_receipt_detail1ext o = this.detail1.get(i);
            if (!o.getstatus().equals(in_goods_receipt_detail1ext.Status_delete)){
            total_gross+=o.gettotal_gross();
            total_after_discount+=o.gettotal_after_discount();
            total_discount+=o.getdiscount_amount();
            }
        }
        this.settotal_bfr_discount(total_gross);
        this.settotal_aft_discount(total_after_discount);
        this.settotal_discount(total_discount);
        this.settax_amount(this.gettotal_aft_discount()*this.gettax_percent()/100);
        this.settotal_aft_tax(this.gettotal_aft_discount()+this.gettax_amount());
    }



}
