/*
 * To change this ap_account_set, choose Tools | Templates
 * and open the ap_account_set in the editor.
 */

package kopkar.ap.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ap_account_setcls implements Serializable {

    private String accset_kode;
    private String accset_desc;
    private String ap_account_code;
    private String disc_account_code;
    private String ppay_account_code;
    private String active_sts;
    private String entry_date;
    private String audit_date;
    private String audit_user;
    private String in_account_code;
    private String out_account_code;

    public ap_account_setcls() {
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

    public String getap_account_code() {
        return ap_account_code;
    }
    public void setap_account_code(String ap_account_code) {
        this.ap_account_code = ap_account_code;
    }

    public String getdisc_account_code() {
        return disc_account_code;
    }
    public void setdisc_account_code(String disc_account_code) {
        this.disc_account_code = disc_account_code;
    }

    public String getppay_account_code() {
        return ppay_account_code;
    }
    public void setppay_account_code(String ppay_account_code) {
        this.ppay_account_code = ppay_account_code;
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

    public String getin_account_code() {
        return in_account_code;
    }
    public void setin_account_code(String in_account_code) {
        this.in_account_code = in_account_code;
    }

    public String getout_account_code() {
        return out_account_code;
    }
    public void setout_account_code(String out_account_code) {
        this.out_account_code = out_account_code;
    }


}
