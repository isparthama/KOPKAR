/*
 * To change this ar_customer, choose Tools | ar_customers
 * and open the ar_customer in the editor.
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
public class ar_customerext extends ar_customercls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private String employee_number;
    private String accset_desc="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        this.setregister_date(GlobalUtils.formatDate(this.getregister_date(), "yyyy-MM-dd"));
        ResultSet rs;
        try {
            if (insertsts){
                squery="call sp_ar_customer_insert( "

                        + "'"+this.getcustomer_code()+"', "
                        + "'"+this.getcustomer_name()+"', "
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
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getmember_koperasi()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getaccset_code()+"', "


                        + "'"+GlobalUtils.userid+"'"
                        + ")";

                rs=db.executeQuery(squery);
                if (rs.next()){
                    this.setcustomer_code(rs.getString("customer_code"));
                }
            } else {
                squery="call sp_ar_customer_update( "

                        + "'"+this.getcustomer_code()+"', "
                        + "'"+this.getcustomer_name()+"', "
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
                        + "'"+this.getprice_code()+"', "
                        + "'"+this.getdiscount_code()+"', "
                        + "'"+this.getwarehouse_code()+"', "
                        + "'"+this.getmember_koperasi()+"', "
                        + "'"+this.getmember_number()+"', "
                        + "'"+this.getaccset_code()+"', "


                        + "'"+GlobalUtils.userid+"'"
                        + ")";
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
        squery="call sp_ar_customer_delete( "

                    + "'"+this.getcustomer_code()+"', "
                    + "'"+this.getcustomer_name()+"', "
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
                    + "'"+this.getprice_code()+"', "
                    + "'"+this.getdiscount_code()+"', "
                    + "'"+this.getwarehouse_code()+"', "
                    + "'"+this.getmember_koperasi()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getaccset_code()+"', "


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
        squery="select * from ar_customer where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_customerext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String customer_code) throws CodeException {
        squery="CALL sp_ar_customer_get('"+customer_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_customerext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public Boolean run_sp_ar_customer_get_find(String customer_code) throws CodeException {
        squery="CALL sp_ar_customer_get_find('"+customer_code+"')";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                
                this.setcustomer_code(rs.getString("customer_code"));
                this.setcustomer_name(rs.getString("customer_name"));
                this.setterm_code(rs.getString("term_code"));
                this.setsalesman_code(rs.getString("salesman_code"));
                this.setprice_code(rs.getString("price_code"));
                this.setdiscount_code(rs.getString("discount_code"));
                this.setwarehouse_code(rs.getString("warehouse_code"));
                this.setmember_koperasi(rs.getString("member_koperasi"));
                this.setmember_number(rs.getString("member_number"));
                this.setemployee_number(rs.getString("employee_number"));
                return true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_customerext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setcustomer_code(rs.getString("customer_code"));
        this.setcustomer_name(rs.getString("customer_name"));
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
        this.setprice_code(rs.getString("price_code"));
        this.setdiscount_code(rs.getString("discount_code"));
        this.setwarehouse_code(rs.getString("warehouse_code"));
        this.setmember_koperasi(rs.getString("member_koperasi"));
        this.setmember_number(rs.getString("member_number"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        this.setTerm_desc(rs.getString("term_desc"));
        this.setSalesman_name(rs.getString("salesman_name"));
        this.setPrice_desc(rs.getString("price_desc"));
        this.setDiscount_desc(rs.getString("discount_desc"));
        this.setWarehouse_name(rs.getString("warehouse_name"));

        this.setaccset_code(rs.getString("accset_code"));
        this.setaccset_desc(rs.getString("accset_desc"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_customer_get('"+this.getcustomer_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_customerext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_customer_get('"+this.getcustomer_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_customerext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_customer_get('"+this.getcustomer_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_customerext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_customer_get('"+this.getcustomer_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_customerext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getcustomer_code())){
            return true;
        }
        return false;
    }

    private void setemployee_number(String employee_number) {
        this.employee_number=employee_number;
    }

    public String getaccset_desc() { return accset_desc;}
    public void setaccset_desc(String accset_desc) { this.accset_desc = accset_desc;}
}
