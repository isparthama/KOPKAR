/*
 * To change this ap_account_set, choose Tools | Templates
 * and open the ap_account_set in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_account_setcls implements Serializable {

    private String accset_kode;
    private String accset_desc;
    private String pinjam_account_code;
    private String pdp_tangguh_account_code;
    private String pdp_bunga_account_code;
    private String pot_account_code;
    private String active_sts;
    private String entry_date;
    private String audit_date;
    private String audit_user;

    public ko_account_setcls() {
    }
    
    public String getaccset_kode() {
        return accset_kode;
    }
    public void setaccset_kode(String accset_kode) {
        this.accset_kode = accset_kode;
    }

    public String getaccset_desc() {
        return accset_desc;
    }
    public void setaccset_desc(String accset_desc) {
        this.accset_desc = accset_desc;
    }

    public String getpinjam_account_code() {
        return pinjam_account_code;
    }
    public void setpinjam_account_code(String pinjam_account_code) {
        this.pinjam_account_code = pinjam_account_code;
    }

    public String getpdp_tangguh_account_code() {
        return pdp_tangguh_account_code;
    }
    public void setpdp_tangguh_account_code(String pdp_tangguh_account_code) {
        this.pdp_tangguh_account_code = pdp_tangguh_account_code;
    }

    public String getpdp_bunga_account_code() {
        return pdp_bunga_account_code;
    }
    public void setpdp_bunga_account_code(String pdp_bunga_account_code) {
        this.pdp_bunga_account_code = pdp_bunga_account_code;
    }

    public String getactive_sts() {
        return active_sts;
    }
    public void setactive_sts(String active_sts) {
        this.active_sts = active_sts;
    }

    public String getentry_date() {
        return entry_date;
    }
    public void setentry_date(String entry_date) {
        this.entry_date = entry_date;
    }

    public String getaudit_date() {
        return audit_date;
    }
    public void setaudit_date(String audit_date) {
        this.audit_date = audit_date;
    }

    public String getaudit_user() {
        return audit_user;
    }
    public void setaudit_user(String audit_user) {
        this.audit_user = audit_user;
    }

    public String getpot_account_code() {
        return pot_account_code;
    }

    public void setpot_account_code(String pot_account_code) {
        this.pot_account_code = pot_account_code;
    }
}
