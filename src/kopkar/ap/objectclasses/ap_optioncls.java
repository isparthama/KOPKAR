/*
 * To change this ap_option, choose Tools | Templates
 * and open the ap_option in the editor.
 */

package kopkar.ap.objectclasses;

import kopkar.ar.objectclasses.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class ap_optioncls implements Serializable {

    private Integer id;
    private String company_id;
    private String company_name;
    private String active_sts;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
    private String faximale;
    private String email;
    private String pic;
    private String register_date;
    private String term_code;
    private String salesman_code;
    private String cost_price_code;
    private String sales_price_code;
    private String discount_code;
    private String warehouse_code;
    private String counter_number;
    private String textnotapos;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String accset_code;
    private String cash_account;
    private String trns_account;
    private String crdt_account;
    private String temp_account;
    private String ppn_account;

    public ap_optioncls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getcompany_id() {
        return company_id;
    }
    public void setcompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getcompany_name() {
        return company_name;
    }
    public void setcompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getactive_sts() {
        return active_sts;
    }
    public void setactive_sts(String active_sts) {
        this.active_sts = active_sts;
    }

    public String getaddress1() {
        return address1;
    }
    public void setaddress1(String address1) {
        this.address1 = address1;
    }

    public String getaddress2() {
        return address2;
    }
    public void setaddress2(String address2) {
        this.address2 = address2;
    }

    public String getcity() {
        return city;
    }
    public void setcity(String city) {
        this.city = city;
    }

    public String getstate() {
        return state;
    }
    public void setstate(String state) {
        this.state = state;
    }

    public String getzipcode() {
        return zipcode;
    }
    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getphone() {
        return phone;
    }
    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getfaximale() {
        return faximale;
    }
    public void setfaximale(String faximale) {
        this.faximale = faximale;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }

    public String getpic() {
        return pic;
    }
    public void setpic(String pic) {
        this.pic = pic;
    }

    public String getregister_date() {
        return register_date;
    }
    public void setregister_date(String register_date) {
        this.register_date = register_date;
    }

    public String getterm_code() {
        return term_code;
    }
    public void setterm_code(String term_code) {
        this.term_code = term_code;
    }

    public String getsalesman_code() {
        return salesman_code;
    }
    public void setsalesman_code(String salesman_code) {
        this.salesman_code = salesman_code;
    }

    public String getcost_price_code() {
        return cost_price_code;
    }
    public void setcost_price_code(String cost_price_code) {
        this.cost_price_code = cost_price_code;
    }

    public String getsales_price_code() {
        return sales_price_code;
    }
    public void setsales_price_code(String sales_price_code) {
        this.sales_price_code = sales_price_code;
    }

    public String getdiscount_code() {
        return discount_code;
    }
    public void setdiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public String getwarehouse_code() {
        return warehouse_code;
    }
    public void setwarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public String getcounter_number() {
        return counter_number;
    }
    public void setcounter_number(String counter_number) {
        this.counter_number = counter_number;
    }

    public String gettextnotapos() {
        return textnotapos;
    }
    public void settextnotapos(String textnotapos) {
        this.textnotapos = textnotapos;
    }

    public String getentrydate() {
        return entrydate;
    }
    public void setentrydate(String entrydate) {
        this.entrydate = entrydate;
    }

    public String getauditdate() {
        return auditdate;
    }
    public void setauditdate(String auditdate) {
        this.auditdate = auditdate;
    }

    public String getaudituser() {
        return audituser;
    }
    public void setaudituser(String audituser) {
        this.audituser = audituser;
    }

    public String getaccset_code() {
        return accset_code;
    }
    public void setaccset_code(String accset_code) {
        this.accset_code = accset_code;
    }

    public String getcash_account() {
        return cash_account;
    }
    public void setcash_account(String cash_account) {
        this.cash_account = cash_account;
    }

    public String gettrns_account() {
        return trns_account;
    }
    public void settrns_account(String trns_account) {
        this.trns_account = trns_account;
    }

    public String getcrdt_account() {
        return crdt_account;
    }
    public void setcrdt_account(String crdt_account) {
        this.crdt_account = crdt_account;
    }

    public String gettemp_account() {
        return temp_account;
    }
    public void settemp_account(String temp_account) {
        this.temp_account = temp_account;
    }

    public String getppn_account() {
        return ppn_account;
    }
    public void setppn_account(String ppn_account) {
        this.ppn_account = ppn_account;
    }
}
