/*
 * To change this in_so_sheet, choose Tools | in_so_sheets
 * and open the in_so_sheet in the editor.
 */

package kopkar.in.objectclasses;

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
public class in_so_sheetext extends in_so_sheetcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private in_so_sheet_detail1extcol detail;
    private String brand_name_fr;
    private String brand_name_to;
    private String category_code_fr;
    private String category_name_fr;
    private String category_code_to;
    private String category_name_to;

    public in_so_sheetext() {
        this.setdocentry(0);
        this.setobjtype(7);
        this.setdocument_status("O");
        this.setcomplete_status("N");
        this.setdocument_date(GlobalUtils.sessiondate);
        detail=new in_so_sheet_detail1extcol(this.getdocentry());
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setdocument_date(GlobalUtils.formatDate(this.getdocument_date(), "yyyy-MM-dd"));
        in_so_sheet_detail1ext o;
        ResultSet rs;
        try {
            if (insertsts){
                squery="call sp_in_so_sheet_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getbrand_code_fr()+"', "
                        + "'"+this.getbrand_code_to()+"', "
                        + "'"+this.getcategory_code_fr()+"', "
                        + "'"+this.getcategory_code_to()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getemployee()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_adm_qty()+"', "
                        + "'"+this.getobjtype()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setdocument_number(rs.getString("document_number"));
                    this.setdocentry(rs.getInt("docentry"));
                    for (int i=0;i<detail.size();i++){
                        o=detail.get(i);
                        if (o.getstatus().equals(o.Status_Insert)){
                            o.setdocentry(this.getdocentry());
                        }
                        o.setwarehouse_code(this.getwarehouse_code());
                        o.setstatus(o.Status_Insert);
                        o.update();
                    }
                }


            } else {
                squery="call sp_in_so_sheet_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getdocument_number()+"', "
                        + "'"+this.getcomplete_status()+"', "
                        + "'"+this.getdocument_date()+"', "
                        + "'"+this.getbrand_code_fr()+"', "
                        + "'"+this.getbrand_code_to()+"', "
                        + "'"+this.getcategory_code_fr()+"', "
                        + "'"+this.getcategory_code_to()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getemployee()+"', "
                        + "'"+this.getreference()+"', "
                        + "'"+this.getdscription()+"', "
                        + "'"+this.gettotal_adm_qty()+"', "
                        + "'"+this.getobjtype()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
                for (int i=0;i<detail.size();i++){
                    o=detail.get(i);
                    if (o.getstatus().equals(o.Status_Insert)){
                        o.setdocentry(this.getdocentry());
                    }
                    o.setstatus(o.Status_update);
                    o.update();
                }
            }
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_in_so_sheet_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getdocument_number()+"', "
                    + "'"+this.getcomplete_status()+"', "
                    + "'"+this.getdocument_date()+"', "
                    + "'"+this.getbrand_code_fr()+"', "
                    + "'"+this.getbrand_code_to()+"', "
                    + "'"+this.getcategory_code_fr()+"', "
                    + "'"+this.getcategory_code_to()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getemployee()+"', "
                    + "'"+this.getreference()+"', "
                    + "'"+this.getdscription()+"', "
                    + "'"+this.gettotal_adm_qty()+"', "
                    + "'"+this.getobjtype()+"', "
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
        squery="select * from in_so_sheet where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheetext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String document_number) throws CodeException {
        squery="CALL sp_in_so_sheet_get('"+document_number+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheetext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setdocument_number(rs.getString("document_number"));
        this.setdocument_status(rs.getString("document_status"));
        this.setcomplete_status(rs.getString("complete_status"));
        this.setdocument_date(rs.getString("document_date"));
        this.setbrand_code_fr(rs.getString("brand_code_fr"));
        this.setbrand_code_to(rs.getString("brand_code_to"));
        this.setcategory_code_fr(rs.getString("category_code_fr"));
        this.setcategory_code_to(rs.getString("category_code_to"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setemployee(rs.getString("employee"));
        this.setreference(rs.getString("reference"));
        this.setdscription(rs.getString("dscription"));
        this.settotal_so_qty(rs.getInt("total_so_qty"));
        this.settotal_adm_qty(rs.getInt("total_adm_qty"));
        this.setadjustment_no(rs.getInt("adjustment_no"));
        this.setadjustment_date(rs.getString("adjustment_date"));
        this.setadjustment_user(rs.getString("adjustment_user"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));

        this.setbrand_name_fr(rs.getString("brand_name_fr"));
        this.setbrand_name_to(rs.getString("brand_name_to"));
        this.setcategory_name_fr(rs.getString("category_name_fr"));
        this.setcategory_name_to(rs.getString("category_name_to"));

        detail=new in_so_sheet_detail1extcol(this.getdocentry());
        detail.initdata();
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_so_sheet_get('"+this.getdocument_number()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheetext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_so_sheet_get('"+this.getdocument_number()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheetext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_so_sheet_get('"+this.getdocument_number()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheetext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_so_sheet_get('"+this.getdocument_number()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheetext.class.getName()).log(Level.SEVERE, null, ex);
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

    public in_so_sheet_detail1extcol getdetail() {
        return this.detail;
    }

    private void setbrand_name_fr(String brand_name_fr) {
        this.brand_name_fr=brand_name_fr;
    }

    private void setbrand_name_to(String brand_name_to) {
        this.brand_name_to=brand_name_to;
    }

    public String getbrand_name_fr() {
        return this.brand_name_fr;
    }

    public String getbrand_name_to() {
        return this.brand_name_to;
    }

    public void calculatetotal() {
        Integer total_adm_qty=new Integer(0);
        for (int i=0;i<detail.size();i++){
            in_so_sheet_detail1ext o = detail.get(i);
            total_adm_qty+=o.getbase_total_pcs().intValue();
        }
        this.settotal_adm_qty(total_adm_qty);
    }

    public boolean retrievedata(String sbrand_code_fr, String sbrand_code_to, String scategory_code_fr, String scategory_code_to,String swarehouse_code) {
        try {
            detail=new in_so_sheet_detail1extcol(this.getdocentry());
            if (this.detail.retrievedata(sbrand_code_fr, sbrand_code_to, scategory_code_fr, scategory_code_to, swarehouse_code)) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheetext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getdocument_status_desc() {
        if (this.getdocument_status().equalsIgnoreCase("O")){
            return "Open";
        } else {
            return "Close";
        }
    }

    public void setcategory_code_fr(String category_code_fr) {
        this.category_code_fr=category_code_fr;
    }

    public void setcategory_code_to(String category_code_to) {
        this.category_code_to=category_code_to;
    }

    public String getcategory_code_fr() {
        return this.category_code_fr;
    }

    public String getcategory_name_fr() {
        return this.category_name_fr;
    }

    public String getcategory_code_to() {
        return this.category_code_to;
    }

    public String getcategory_name_to() {
        return this.category_name_to;
    }

    private void setcategory_name_fr(String category_name_fr) {
        this.category_name_fr=category_name_fr;
    }

    private void setcategory_name_to(String category_name_to) {
        this.category_name_to=category_name_to;
    }



}
