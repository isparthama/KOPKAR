/*
 * To change this in_option, choose Tools | in_options
 * and open the in_option in the editor.
 */

package kopkar.in.objectclasses;

import kopkar.ar.objectclasses.*;
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
public class in_optionext extends in_optioncls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    private String term_code_desc;
    private String supplier_code_desc;
    private String cost_price_code_desc;
    

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_in_option_insert( "
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
                    + "'"+this.getsupplier_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_in_option_update( "

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
                    + "'"+this.getsupplier_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
                    + "'"+this.getterm_code()+"', "
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
        squery="call sp_in_option_delete( "

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
                    + "'"+this.getsupplier_code()+"', "
                    + "'"+this.getcost_price_code()+"', "
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
        squery="CALL sp_in_option_get()";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_optionext.class.getName()).log(Level.SEVERE, null, ex);
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
        this.setsupplier_code(rs.getString("supplier_code"));
        this.setcost_price_code(rs.getString("cost_price_code"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));

        this.setTerm_code_desc(rs.getString("term_desc"));
        this.setsupplier_code_desc(rs.getString("supplier_name"));
        this.setCost_price_code_desc(rs.getString("price_desc"));

        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_option_get()";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_option_get('"+this.getcompany_id()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_option_get('"+this.getcompany_id()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_optionext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_option_get('"+this.getcompany_id()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_optionext.class.getName()).log(Level.SEVERE, null, ex);
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
    public String getsupplier_code_desc() {
        return supplier_code_desc;
    }

    /**
     * @param supplier_code_desc the supplier_code_desc to set
     */
    public void setsupplier_code_desc(String supplier_code_desc) {
        this.supplier_code_desc = supplier_code_desc;
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
    
    
}
