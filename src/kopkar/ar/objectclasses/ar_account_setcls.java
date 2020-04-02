/*
 * To change this ap_account_set, choose Tools | Templates
 * and open the ap_account_set in the editor.
 */

package kopkar.ar.objectclasses;

import kopkar.ap.objectclasses.*;
import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ar_account_setcls implements Serializable {

    private String accset_kode;
    private String accset_desc;
    private String ar_account_code;
    private String disc_account_code;
    private String ppay_account_code;
    private String ppn_account_code;
    private String active_sts;
    private String entry_date;
    private String audit_date;
    private String audit_user;

    public ar_account_setcls() {
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

    public String getar_account_code() {
        return ar_account_code;
    }
    public void setar_account_code(String ar_account_code) {
        this.ar_account_code = ar_account_code;
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

    public String getPpn_account_code() {
        return ppn_account_code;
    }

    public void setPpn_account_code(String ppn_account_code) {
        this.ppn_account_code = ppn_account_code;
    }
}
