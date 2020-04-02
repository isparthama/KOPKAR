/*
 * To change this in_warehouse, choose Tools | Templates
 * and open the in_warehouse in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_warehousecls implements Serializable {

    private Integer id;
    private String warehouse_code;
    private String warehouse_name;
    private String check_oh;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
    private String faximale;
    private String email;
    private String pic;
    private String warehouse_type;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_warehousecls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getwarehouse_code() {
        return warehouse_code;
    }
    public void setwarehouse_code(String warehouse_code) {
        this.warehouse_code = warehouse_code;
    }

    public String getwarehouse_name() {
        return warehouse_name;
    }
    public void setwarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getcheck_oh() {
        return check_oh;
    }
    public void setcheck_oh(String check_oh) {
        this.check_oh = check_oh;
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

    public String getwarehouse_type() {
        return warehouse_type;
    }
    public void setwarehouse_type(String warehouse_type) {
        this.warehouse_type = warehouse_type;
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


}
