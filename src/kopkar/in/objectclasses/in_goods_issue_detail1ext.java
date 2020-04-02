/*
 * To change this in_goods_issue_detail1, choose Tools | in_goods_issue_detail1s
 * and open the in_goods_issue_detail1 in the editor.
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
public class in_goods_issue_detail1ext extends in_goods_issue_detail1cls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private Integer status=0;
    private String product_name;
    private String uom_code;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        try {
            if (status==in_goods_issue_detail1ext.Status_Insert){
                squery="call sp_in_goods_issue_detail1_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getline_number()+"', "
                        + "'"+this.getproduct_code()+"', "
                        + "'"+this.getuom_id()+"', "
                        + "'"+this.getquantity()+"', "
                        + "'"+this.getprice()+"', "
                        + "'"+this.getdiscount_percent()+"', "
                        + "'"+this.getdiscount_amount()+"', "
                        + "'"+this.gettotal_gross()+"', "
                        + "'"+this.gettotal_after_discount()+"', "
                        + "'"+this.getuom2()+"', "
                        + "'"+this.getuom3()+"', "
                        + "'"+this.getbase_objtype()+"', "
                        + "'"+this.getbase_docentry()+"', "
                        + "'"+this.getbase_line_number()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                    ResultSet rs = db.executeQuery(squery);
                    if (rs.next()){
                        this.setline_number(rs.getInt("line_number"));
                    }
            } else if (this.status.equals(this.Status_update)) {
                squery="call sp_in_goods_issue_detail1_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getline_number()+"', "
                        + "'"+this.getproduct_code()+"', "
                        + "'"+this.getuom_id()+"', "
                        + "'"+this.getquantity()+"', "
                        + "'"+this.getprice()+"', "
                        + "'"+this.getdiscount_percent()+"', "
                        + "'"+this.getdiscount_amount()+"', "
                        + "'"+this.gettotal_gross()+"', "
                        + "'"+this.gettotal_after_discount()+"', "
                        + "'"+this.getuom2()+"', "
                        + "'"+this.getuom3()+"', "
                        + "'"+this.getbase_objtype()+"', "
                        + "'"+this.getbase_docentry()+"', "
                        + "'"+this.getbase_line_number()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
            } else if (this.status==this.Status_delete){
                squery="call sp_in_goods_issue_detail1_delete( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getline_number()+"', "
                        + "'"+this.getproduct_code()+"', "
                        + "'"+this.getuom_id()+"', "
                        + "'"+this.getquantity()+"', "
                        + "'"+this.getprice()+"', "
                        + "'"+this.getdiscount_percent()+"', "
                        + "'"+this.getdiscount_amount()+"', "
                        + "'"+this.gettotal_gross()+"', "
                        + "'"+this.gettotal_after_discount()+"', "
                        + "'"+this.getuom2()+"', "
                        + "'"+this.getuom3()+"', "
                        + "'"+this.getbase_objtype()+"', "
                        + "'"+this.getbase_docentry()+"', "
                        + "'"+this.getbase_line_number()+"', "
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+GlobalUtils.userid+"'"
                        + ")";
                db.execute(squery);
            }
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_in_goods_issue_detail1_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getline_number()+"', "
                    + "'"+this.getline_status()+"', "
                    + "'"+this.getproduct_code()+"', "
                    + "'"+this.getuom_id()+"', "
                    + "'"+this.getquantity()+"', "
                    + "'"+this.getcost()+"', "
                    + "'"+this.getprice()+"', "
                    + "'"+this.getdiscount_percent()+"', "
                    + "'"+this.getdiscount_amount()+"', "
                    + "'"+this.gettotal_gross()+"', "
                    + "'"+this.gettotal_after_discount()+"', "
                    + "'"+this.getuom2()+"', "
                    + "'"+this.getuom3()+"', "
                    + "'"+this.getquantity_pcs()+"', "
                    + "'"+this.getcost_pcs()+"', "
                    + "'"+this.getprice_pcs()+"', "
                    + "'"+this.getquantity_open()+"', "
                    + "'"+this.getquantity_pcs_open()+"', "
                    + "'"+this.getbase_objtype()+"', "
                    + "'"+this.getbase_docentry()+"', "
                    + "'"+this.getbase_line_number()+"', "
                    + "'"+this.getprice_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "


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
        squery="select * from in_goods_issue_detail1 where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_issue_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_in_goods_issue_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_issue_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setdocentry(rs.getInt("docentry"));
        this.setline_number(rs.getInt("line_number"));
        this.setline_status(rs.getString("line_status"));
        this.setproduct_code(rs.getString("product_code"));
        this.setuom_id(rs.getInt("uom_id"));
        this.setquantity(rs.getDouble("quantity"));
        this.setcost(rs.getDouble("cost"));
        this.setprice(rs.getDouble("price"));
        this.setdiscount_percent(rs.getDouble("discount_percent"));
        this.setdiscount_amount(rs.getDouble("discount_amount"));
        this.settotal_gross(rs.getDouble("total_gross"));
        this.settotal_after_discount(rs.getDouble("total_after_discount"));
        this.setuom2(rs.getDouble("uom2"));
        this.setuom3(rs.getDouble("uom3"));
        this.setquantity_pcs(rs.getDouble("quantity_pcs"));
        this.setcost_pcs(rs.getDouble("cost_pcs"));
        this.setprice_pcs(rs.getDouble("price_pcs"));
        this.setquantity_open(rs.getDouble("quantity_open"));
        this.setquantity_pcs_open(rs.getDouble("quantity_pcs_open"));
        this.setbase_objtype(rs.getInt("base_objtype"));
        this.setbase_docentry(rs.getInt("base_docentry"));
        this.setbase_line_number(rs.getInt("base_line_number"));
        this.setprice_code(rs.getString("price_code"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setobjtype(rs.getInt("objtype"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_goods_issue_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_issue_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_goods_issue_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_issue_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_goods_issue_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_issue_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_goods_issue_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_goods_issue_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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

    public void setstatus(Integer status) {
        System.out.println(status);
        this.status=status;
    }

    public Integer getstatus() {
        return this.status;
    }

    void setproduct_name(String product_name) {
        this.product_name=product_name;
    }

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    void setuom_code(String uom_code) {
        this.uom_code=uom_code;
    }

    /**
     * @return the uom_code
     */
    public String getUom_code() {
        return uom_code;
    }

}
