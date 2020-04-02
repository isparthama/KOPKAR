/*
 * To change this in_so_entry_detail1, choose Tools | in_so_entry_detail1s
 * and open the in_so_entry_detail1 in the editor.
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
public class in_so_entry_detail1ext extends in_so_entry_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private Integer status=0;
    private int pilih=0;
    private String product_name="";
    private double variant;

    public in_so_entry_detail1ext(Integer docentry) {
        this.setdocentry(docentry);
        this.setline_number(0);
        this.setline_status("O");
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (status==Status_Insert){
            squery="call sp_in_so_entry_detail1_insert( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
                    + "'"+this.getuom3_qty()+"', "
                    + "'"+this.getuom2_qty()+"', "
                    + "'"+this.getpcs_qty()+"', "
                    + "'"+this.gettotal_pcs()+"', "
                    + "'"+this.getbase_total_pcs()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_in_so_entry_detail1_update( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
                    + "'"+this.getuom3_qty()+"', "
                    + "'"+this.getuom2_qty()+"', "
                    + "'"+this.getpcs_qty()+"', "
                    + "'"+this.gettotal_pcs()+"', "
                    + "'"+this.getbase_total_pcs()+"', "
                    + "'"+this.getwarehouse_code()+"', "
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
        squery="call sp_in_so_entry_detail1_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
                    + "'"+this.getuom3_qty()+"', "
                    + "'"+this.getuom2_qty()+"', "
                    + "'"+this.getpcs_qty()+"', "
                    + "'"+this.gettotal_pcs()+"', "
                    + "'"+this.getbase_total_pcs()+"', "
                    + "'"+this.getwarehouse_code()+"', "
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
        squery="CALL sp_in_so_entry_detail1_get('"+this.getdocentry()+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_entry_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setline_number(rs.getInt("line_number"));
        this.setline_status(rs.getString("line_status"));
        this.setproduct_code(rs.getString("product_code"));
        this.setuom2(rs.getDouble("uom2"));
        this.setuom3(rs.getDouble("uom3"));
        this.setbase_total_pcs(rs.getDouble("base_total_pcs"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_so_entry_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_entry_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_so_entry_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_entry_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_so_entry_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_entry_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_so_entry_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_entry_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata()){
            return true;
        }
        return false;
    }

    public void setstatus(Integer Status_Insert) {
        this.status=Status_Insert;
    }

    public Integer getstatus() {
        return this.status;
    }

    public void setpilih(int pilih) {
        this.pilih=pilih;
    }

    public void setproduct_name(String product_name) {
        this.product_name=product_name;
    }

    public int getpilih() {
        return this.pilih;
    }

    public String getproduct_name() {
        return this.product_name;
    }

    public void calculatetotalqty(Boolean bytotal) {
        if (!bytotal){
            this.settotal_pcs((this.getuom3_qty()*this.getuom3())+(this.getuom2_qty()*this.getuom2())+this.getpcs_qty());
        } else {
            this.setuom3_qty(Math.floor(this.gettotal_pcs()/this.getuom3()));
            double sisapcs = this.gettotal_pcs() - (this.getuom3_qty() * this.getuom3());
            this.setuom2_qty(Math.floor(sisapcs/this.getuom2()));
            sisapcs=this.gettotal_pcs()-(this.getuom3_qty() * this.getuom3())-(this.getuom2_qty() * this.getuom2());
            this.setpcs_qty(sisapcs);
        }
        this.variant=this.gettotal_pcs()-this.getbase_total_pcs();
    }

    public Double getvariant() {
        return this.variant;
    }

    void setvariant(double variant) {
        this.variant=variant;
    }



}
