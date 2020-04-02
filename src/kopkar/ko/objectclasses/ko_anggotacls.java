/*
 * To change this ko_anggota, choose Tools | Templates
 * and open the ko_anggota in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_anggotacls implements Serializable {

    private Integer id;
    private String member_number;
    private String member_name;
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
    private String employee_sts="N";
    private String employee_number;
    private String tanggal_masuk;
    private String sex="L";
    private String religion="0";
    private String department_code;
    private String position_code;
    private String kode_pendidikan;
    private String register_number;
    private String register_date;
    private Double simpanan_wajib;
    private Double simpanan_pokok;
    private Double simpanan_sukarela;
    private Double simpanan_khusus;
    private String reference_number;
    private String last_update;
    private String hp;
    private String member_sts;
    private String bank_code;
    private String bank_branch;
    private String bank_account;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_anggotacls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
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

    public String getkode_pendidikan() {
        return kode_pendidikan;
    }
    public void setkode_pendidikan(String kode_pendidikan) {
        this.kode_pendidikan = kode_pendidikan;
    }

    public String getregister_number() {
        return register_number;
    }
    public void setregister_number(String register_number) {
        this.register_number = register_number;
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

    public String getreference_number() {
        return reference_number;
    }
    public void setreference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public String getlast_update() {
        return last_update;
    }
    public void setlast_update(String last_update) {
        this.last_update = last_update;
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

    public String getbank_code() {
        return bank_code;
    }
    public void setbank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getbank_branch() {
        return bank_branch;
    }
    public void setbank_branch(String bank_branch) {
        this.bank_branch = bank_branch;
    }

    public String getbank_account() {
        return bank_account;
    }
    public void setbank_account(String bank_account) {
        this.bank_account = bank_account;
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
