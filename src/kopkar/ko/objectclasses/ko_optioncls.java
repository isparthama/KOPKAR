/*
 * To change this ko_option, choose Tools | Templates
 * and open the ko_option in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_optioncls implements Serializable {

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
    private Double simpanan_wajib;
    private Double simpanan_pokok;
    private Double simpanan_sukarela;
    private Double simpanan_khusus;
    private String term_code;
    private Integer monthly_no;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private String simpanan_wajib_kode_akun;
    private String simpanan_pokok_kode_akun;
    private String simpanan_sukarela_kode_akun;
    private String simpanan_khusus_kode_akun;
    private String tunai_kode_akun;
    private String transfer_kode_akun;
    private String tunai_penampung_kode_akun;
    private String transfer_penampung_kode_akun;
    private Integer cut_off_day;
    private String update_option_info;
    private Integer dop_tagih;

    public ko_optioncls() {
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

    public String getterm_code() {
        return term_code;
    }
    public void setterm_code(String term_code) {
        this.term_code = term_code;
    }

    public Integer getmonthly_no() {
        return monthly_no;
    }
    public void setmonthly_no(Integer monthly_no) {
        this.monthly_no = monthly_no;
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

    public String getsimpanan_wajib_kode_akun() {
        return simpanan_wajib_kode_akun;
    }
    public void setsimpanan_wajib_kode_akun(String simpanan_wajib_kode_akun) {
        this.simpanan_wajib_kode_akun = simpanan_wajib_kode_akun;
    }

    public String getsimpanan_pokok_kode_akun() {
        return simpanan_pokok_kode_akun;
    }
    public void setsimpanan_pokok_kode_akun(String simpanan_pokok_kode_akun) {
        this.simpanan_pokok_kode_akun = simpanan_pokok_kode_akun;
    }

    public String getsimpanan_sukarela_kode_akun() {
        return simpanan_sukarela_kode_akun;
    }
    public void setsimpanan_sukarela_kode_akun(String simpanan_sukarela_kode_akun) {
        this.simpanan_sukarela_kode_akun = simpanan_sukarela_kode_akun;
    }

    public String getsimpanan_khusus_kode_akun() {
        return simpanan_khusus_kode_akun;
    }
    public void setsimpanan_khusus_kode_akun(String simpanan_khusus_kode_akun) {
        this.simpanan_khusus_kode_akun = simpanan_khusus_kode_akun;
    }

    public String gettunai_kode_akun() {
        return tunai_kode_akun;
    }
    public void settunai_kode_akun(String tunai_kode_akun) {
        this.tunai_kode_akun = tunai_kode_akun;
    }

    public String gettransfer_kode_akun() {
        return transfer_kode_akun;
    }
    public void settransfer_kode_akun(String transfer_kode_akun) {
        this.transfer_kode_akun = transfer_kode_akun;
    }

    public String gettunai_penampung_kode_akun() {
        return tunai_penampung_kode_akun;
    }
    public void settunai_penampung_kode_akun(String tunai_penampung_kode_akun) {
        this.tunai_penampung_kode_akun = tunai_penampung_kode_akun;
    }

    public String gettransfer_penampung_kode_akun() {
        return transfer_penampung_kode_akun;
    }
    public void settransfer_penampung_kode_akun(String transfer_penampung_kode_akun) {
        this.transfer_penampung_kode_akun = transfer_penampung_kode_akun;
    }

    public Integer getcut_off_day() {
        return cut_off_day;
    }
    public void setcut_off_day(Integer cut_off_day) {
        this.cut_off_day = cut_off_day;
    }

    public Integer getdop_tagih() {
        return dop_tagih;
    }
    public void setdop_tagih(Integer dop_tagih) {
        this.dop_tagih = dop_tagih;
    }

    public String getupdate_option_info() {
        return update_option_info;
    }
    public void setupdate_option_info(String update_option_info) {
        this.update_option_info = update_option_info;
    }
    

}
