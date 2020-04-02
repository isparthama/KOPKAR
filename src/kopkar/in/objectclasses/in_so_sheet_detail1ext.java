/*
 * To change this in_so_sheet_detail1, choose Tools | in_so_sheet_detail1s
 * and open the in_so_sheet_detail1 in the editor.
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
public class in_so_sheet_detail1ext extends in_so_sheet_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private Integer status=0;
    private int pilih=0;
    private String product_name="";

    public in_so_sheet_detail1ext() {
        this.setline_number(0);
    }

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (status==Status_Insert){
            squery="call sp_in_so_sheet_detail1_insert( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
                    + "'"+this.getbase_total_pcs()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_in_so_sheet_detail1_update( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
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
        squery="call sp_in_so_sheet_detail1_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
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
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from in_so_sheet_detail1 where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheet_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_in_so_sheet_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheet_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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
        squery="CALL sp_in_so_sheet_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheet_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_so_sheet_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheet_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_so_sheet_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheet_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_so_sheet_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_sheet_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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

}
