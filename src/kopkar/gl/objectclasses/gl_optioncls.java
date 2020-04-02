/*
 * To change this gl_option, choose Tools | Templates
 * and open the gl_option in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_optioncls implements Serializable {

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
    private String kode_gde;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String gabung_gde;

    public gl_optioncls() {
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

    public String getkode_gde() {
        return kode_gde;
    }
    public void setkode_gde(String kode_gde) {
        this.kode_gde = kode_gde;
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

    public String getgabung_gde() {
        return gabung_gde;
    }
    public void setgabung_gde(String gabung_gde) {
        this.gabung_gde = gabung_gde;
    }
    

}
