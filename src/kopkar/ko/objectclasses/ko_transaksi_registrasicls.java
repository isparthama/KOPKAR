/*
 * To change this ko_transaksi_registrasi, choose Tools | Templates
 * and open the ko_transaksi_registrasi in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_transaksi_registrasicls implements Serializable {

    private Integer docentry=0;
    private String document_number;
    private String document_status="O";
    private String complete_status="N";
    private String document_date;
    private String reference;
    private String dscription;
    private String member_number="";
    private String member_name;
    private String active_sts="Y";
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String phone;
    private String faximale;
    private String email;
    private String pic;
    private String employee_sts="Y";
    private String employee_number;
    private String tanggal_masuk;
    private String sex="L";
    private String religion="1";
    private String department_code;
    private String position_code;
    private String register_date;
    private Double simpanan_wajib;
    private Double simpanan_pokok;
    private Double simpanan_sukarela;
    private Double simpanan_khusus;
    private String hp;
    private String member_sts="Y";
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_transaksi_registrasicls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public String getdocument_number() {
        return document_number;
    }
    public void setdocument_number(String document_number) {
        this.document_number = document_number;
    }

    public String getdocument_status() {
        return document_status;
    }
    public void setdocument_status(String document_status) {
        this.document_status = document_status;
    }

    public String getcomplete_status() {
        return complete_status;
    }
    public void setcomplete_status(String complete_status) {
        this.complete_status = complete_status;
    }

    public String getdocument_date() {
        return document_date;
    }
    public void setdocument_date(String document_date) {
        this.document_date = document_date;
    }

    public String getreference() {
        return reference;
    }
    public void setreference(String reference) {
        this.reference = reference;
    }

    public String getdscription() {
        return dscription;
    }
    public void setdscription(String dscription) {
        this.dscription = dscription;
    }

    public String getmember_number() {
        return member_number;
    }
    public void setmember_number(String member_number) {
        this.member_number = member_number;
    }

    public String getmember_name() {
        return member_name;
    }
    public void setmember_name(String member_name) {
        this.member_name = member_name;
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

    public String getemployee_sts() {
        return employee_sts;
    }
    public void setemployee_sts(String employee_sts) {
        this.employee_sts = employee_sts;
    }

    public String getemployee_number() {
        return employee_number;
    }
    public void setemployee_number(String employee_number) {
        this.employee_number = employee_number;
    }

    public String gettanggal_masuk() {
        return tanggal_masuk;
    }
    public void settanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public String getsex() {
        return sex;
    }
    public void setsex(String sex) {
        this.sex = sex;
    }

    public String getreligion() {
        return religion;
    }
    public void setreligion(String religion) {
        this.religion = religion;
    }

    public String getdepartment_code() {
        return department_code;
    }
    public void setdepartment_code(String department_code) {
        this.department_code = department_code;
    }

    public String getposition_code() {
        return position_code;
    }
    public void setposition_code(String position_code) {
        this.position_code = position_code;
    }

    public String getregister_date() {
        return register_date;
    }
    public void setregister_date(String register_date) {
        this.register_date = register_date;
    }

    public Double getsimpanan_wajib() {
        return simpanan_wajib;
    }
    public void setsimpanan_wajib(Double simpanan_wajib) {
        this.simpanan_wajib = simpanan_wajib;
    }

    public Double getsimpanan_pokok() {
        return simpanan_pokok;
    }
    public void setsimpanan_pokok(Double simpanan_pokok) {
        this.simpanan_pokok = simpanan_pokok;
    }

    public Double getsimpanan_sukarela() {
        return simpanan_sukarela;
    }
    public void setsimpanan_sukarela(Double simpanan_sukarela) {
        this.simpanan_sukarela = simpanan_sukarela;
    }

    public Double getsimpanan_khusus() {
        return simpanan_khusus;
    }
    public void setsimpanan_khusus(Double simpanan_khusus) {
        this.simpanan_khusus = simpanan_khusus;
    }

    public String gethp() {
        return hp;
    }
    public void sethp(String hp) {
        this.hp = hp;
    }

    public String getmember_sts() {
        return member_sts;
    }
    public void setmember_sts(String member_sts) {
        this.member_sts = member_sts;
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
