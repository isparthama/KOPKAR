/*
 * To change this ar_option, choose Tools | ar_options
 * and open the ar_option in the editor.
 */

package kopkar.ar.objectclasses;

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
public class ar_optionext extends ar_optioncls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private String term_code_desc;
    private String salesman_code_desc;
    private String cost_price_code_desc;
    private String sales_price_code_desc;
    private String discount_code_desc;
    private String warehouse_code_desc;
    private String accset_code_desc;

    private String cash_account_desc;
    private String trns_account_desc;
    private String crdt_account_desc;
    private String temp_account_desc;
    private String ppn_account_desc;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ar_option_insert( "
                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getsalesman_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
                    + "'"+this.getsales_price_code()+"', "
                    + "'"+this.getdiscount_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.gettextnotapos()+"', "
                    + "'"+this.getaccset_code()+"', "
                    + "'"+this.getcash_account()+"', "
                    + "'"+this.gettrns_account()+"', "
                    + "'"+this.getcrdt_account()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ar_option_update( "

                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getsalesman_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
                    + "'"+this.getsales_price_code()+"', "
                    + "'"+this.getdiscount_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.gettextnotapos()+"', "
                    + "'"+this.getaccset_code()+"', "
                    + "'"+this.getcash_account()+"', "
                    + "'"+this.gettrns_account()+"', "
                    + "'"+this.getcrdt_account()+"', "
                    + "'"+this.gettemp_account()+"', "
                    + "'"+this.getppn_account()+"', "
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
        squery="call sp_ar_option_delete( "

                    + "'"+this.getcompany_id()+"', "
                    + "'"+this.getcompany_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getaddress1()+"', "
                    + "'"+this.getaddress2()+"', "
                    + "'"+this.getcity()+"', "
                    + "'"+this.getstate()+"', "
                    + "'"+this.getzipcode()+"', "
                    + "'"+this.getphone()+"', "
                    + "'"+this.getfaximale()+"', "
                    + "'"+this.getemail()+"', "
                    + "'"+this.getpic()+"', "
                    + "'"+this.getregister_date()+"', "
                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getsalesman_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
                    + "'"+this.getsales_price_code()+"', "
                    + "'"+this.getdiscount_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getcounter_number()+"', "
                    + "'"+this.gettextnotapos()+"', "



                    + "'"+this.getaccset_code()+"', "
                    + "'"+this.getcash_account()+"', "
                    + "'"+this.gettrns_account()+"', "
                    + "'"+this.getcrdt_account()+"', "
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
        squery="select * from ar_option where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String company_id) throws CodeException {
        squery="CALL sp_ar_option_get('"+company_id+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setcompany_id(rs.getString("company_id"));
        this.setcompany_name(rs.getString("company_name"));
        this.setactive_sts(rs.getString("active_sts"));
        this.setaddress1(rs.getString("address1"));
        this.setaddress2(rs.getString("address2"));
        this.setcity(rs.getString("city"));
        this.setstate(rs.getString("state"));
        this.setzipcode(rs.getString("zipcode"));
        this.setphone(rs.getString("phone"));
        this.setfaximale(rs.getString("faximale"));
        this.setemail(rs.getString("email"));
        this.setpic(rs.getString("pic"));
        this.setregister_date(rs.getString("register_date"));
        this.setterm_code(rs.getString("term_code"));
        this.setsalesman_code(rs.getString("salesman_code"));
        this.setcost_price_code(rs.getString("cost_price_code"));
        this.setsales_price_code(rs.getString("sales_price_code"));
        this.setdiscount_code(rs.getString("discount_code"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setcounter_number(rs.getString("counter_number"));
        this.settextnotapos(rs.getString("textnotapos"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        this.setaccset_code(rs.getString("accset_code"));
        this.setcash_account(rs.getString("cash_account"));
        this.settrns_account(rs.getString("trns_account"));
        this.setcrdt_account(rs.getString("crdt_account"));
        this.settemp_account(rs.getString("temp_account"));
        this.setppn_account(rs.getString("ppn_account"));

        this.setTerm_code_desc(rs.getString("term_code_desc"));
        this.setSalesman_code_desc(rs.getString("salesman_code_desc"));
        this.setCost_price_code_desc(rs.getString("cost_price_code_desc"));
        this.setSales_price_code_desc(rs.getString("sales_price_code_desc"));
        this.setDiscount_code_desc(rs.getString("discount_code_desc"));
        this.setWarehouse_code_desc(rs.getString("warehouse_code_desc"));
        this.setAccset_code_desc(rs.getString("accset_code_desc"));
        this.setCash_account_desc(rs.getString("cash_account_desc"));
        this.setTrns_account_desc(rs.getString("trns_account_desc"));
        this.setCrdt_account_desc(rs.getString("crdt_account_desc"));

        this.settemp_account_desc(rs.getString("temp_account_desc"));
        this.setppn_account_desc(rs.getString("ppn_account_desc"));

        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_option_get('"+this.getcompany_id()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_option_get('"+this.getcompany_id()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_option_get('"+this.getcompany_id()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_option_get('"+this.getcompany_id()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_optionext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getcompany_id())){
            return true;
        }
        return false;
    }

    /**
     * @return the term_code_desc
     */
    public String getTerm_code_desc() {
        return term_code_desc;
    }

    /**
     * @param term_code_desc the term_code_desc to set
     */
    public void setTerm_code_desc(String term_code_desc) {
        this.term_code_desc = term_code_desc;
    }

    /**
     * @return the salesman_code_desc
     */
    public String getSalesman_code_desc() {
        return salesman_code_desc;
    }

    /**
     * @param salesman_code_desc the salesman_code_desc to set
     */
    public void setSalesman_code_desc(String salesman_code_desc) {
        this.salesman_code_desc = salesman_code_desc;
    }

    /**
     * @return the cost_price_code_desc
     */
    public String getCost_price_code_desc() {
        return cost_price_code_desc;
    }

    /**
     * @param cost_price_code_desc the cost_price_code_desc to set
     */
    public void setCost_price_code_desc(String cost_price_code_desc) {
        this.cost_price_code_desc = cost_price_code_desc;
    }

    /**
     * @return the sales_price_code_desc
     */
    public String getSales_price_code_desc() {
        return sales_price_code_desc;
    }

    /**
     * @param sales_price_code_desc the sales_price_code_desc to set
     */
    public void setSales_price_code_desc(String sales_price_code_desc) {
        this.sales_price_code_desc = sales_price_code_desc;
    }

    /**
     * @return the discount_code_desc
     */
    public String getDiscount_code_desc() {
        return discount_code_desc;
    }

    /**
     * @param discount_code_desc the discount_code_desc to set
     */
    public void setDiscount_code_desc(String discount_code_desc) {
        this.discount_code_desc = discount_code_desc;
    }

    /**
     * @return the warehouse_code_desc
     */
    public String getWarehouse_code_desc() {
        return warehouse_code_desc;
    }

    /**
     * @param warehouse_code_desc the warehouse_code_desc to set
     */
    public void setWarehouse_code_desc(String warehouse_code_desc) {
        this.warehouse_code_desc = warehouse_code_desc;
    }

    /**
     * @return the accset_code_desc
     */
    public String getAccset_code_desc() {
        return accset_code_desc;
    }

    /**
     * @param accset_code_desc the accset_code_desc to set
     */
    public void setAccset_code_desc(String accset_code_desc) {
        this.accset_code_desc = accset_code_desc;
    }

    /**
     * @return the cash_account_desc
     */
    public String getCash_account_desc() {
        return cash_account_desc;
    }

    /**
     * @param cash_account_desc the cash_account_desc to set
     */
    public void setCash_account_desc(String cash_account_desc) {
        this.cash_account_desc = cash_account_desc;
    }

    /**
     * @return the trns_account_desc
     */
    public String getTrns_account_desc() {
        return trns_account_desc;
    }

    /**
     * @param trns_account_desc the trns_account_desc to set
     */
    public void setTrns_account_desc(String trns_account_desc) {
        this.trns_account_desc = trns_account_desc;
    }

    /**
     * @return the crdt_account_desc
     */
    public String getCrdt_account_desc() {
        return crdt_account_desc;
    }

    /**
     * @param crdt_account_desc the crdt_account_desc to set
     */
    public void setCrdt_account_desc(String crdt_account_desc) {
        this.crdt_account_desc = crdt_account_desc;
    }

    private void settemp_account_desc(String temp_account_desc) {
        this.temp_account_desc=temp_account_desc;
    }

    private void setppn_account_desc(String ppn_account_desc) {
        this.ppn_account_desc=ppn_account_desc;
    }

    public String gettemp_account_desc() {
        return this.temp_account_desc;
    }

    public String getppn_account_desc() {
        return this.ppn_account_desc;
    }
    
}
