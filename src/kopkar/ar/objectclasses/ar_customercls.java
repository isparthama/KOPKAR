/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ar_customercls implements Serializable {

    private Integer id;
    private String customer_code;
    private String customer_name;
    private String active_sts="N";
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
    private String price_code;
    private String discount_code;
    private String warehouse_code;
    private String member_koperasi="N";
    private String member_number;
    private String term_desc;
    private String salesman_name;
    private String price_desc;
    private String discount_desc;
    private String warehouse_name;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String accset_code;

    public ar_customercls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getcustomer_code() {
        return customer_code;
    }
    public void setcustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    public String getcustomer_name() {
        return customer_name;
    }
    public void setcustomer_name(String customer_name) {
        this.customer_name = customer_name;
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

    public String getprice_code() {
        return price_code;
    }
    public void setprice_code(String price_code) {
        this.price_code = price_code;
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

    public String getmember_koperasi() {
        return member_koperasi;
    }
    public void setmember_koperasi(String member_koperasi) {
        this.member_koperasi = member_koperasi;
    }

    public String getmember_number() {
        return member_number;
    }
    public void setmember_number(String member_number) {
        this.member_number = member_number;
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

    /**
     * @return the term_desc
     */
    public String getTerm_desc() {
        return term_desc;
    }

    /**
     * @param term_desc the term_desc to set
     */
    public void setTerm_desc(String term_desc) {
        this.term_desc = term_desc;
    }

    /**
     * @return the salesman_name
     */
    public String getSalesman_name() {
        return salesman_name;
    }

    /**
     * @param salesman_name the salesman_name to set
     */
    public void setSalesman_name(String salesman_name) {
        this.salesman_name = salesman_name;
    }

    /**
     * @return the price_desc
     */
    public String getPrice_desc() {
        return price_desc;
    }

    /**
     * @param price_desc the price_desc to set
     */
    public void setPrice_desc(String price_desc) {
        this.price_desc = price_desc;
    }

    /**
     * @return the discount_desc
     */
    public String getDiscount_desc() {
        return discount_desc;
    }

    /**
     * @param discount_desc the discount_desc to set
     */
    public void setDiscount_desc(String discount_desc) {
        this.discount_desc = discount_desc;
    }

    /**
     * @return the warehouse_name
     */
    public String getWarehouse_name() {
        return warehouse_name;
    }

    /**
     * @param warehouse_name the warehouse_name to set
     */
    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getaccset_code() { return accset_code;}
    public void setaccset_code(String accset_code) { this.accset_code = accset_code;}


}
