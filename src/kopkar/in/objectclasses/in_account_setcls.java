/*
 * To change this in_account_set, choose Tools | Templates
 * and open the in_account_set in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class in_account_setcls implements Serializable {

    private String accset_kode;
    private String accset_desc;
    private String sls_account_code;
    private String inv_account_code;
    private String hpp_account_code;
    private String pot_account_code;
    private String active_sts;
    private String entry_date;
    private String audit_date;
    private String audit_user;
    private String inc_account_code;
    private String oug_account_code;
    private String trn_account_code;

    public in_account_setcls() {
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

    public String getsls_account_code() {
        return sls_account_code;
    }
    public void setsls_account_code(String sls_account_code) {
        this.sls_account_code = sls_account_code;
    }

    public String getinv_account_code() {
        return inv_account_code;
    }
    public void setinv_account_code(String inv_account_code) {
        this.inv_account_code = inv_account_code;
    }

    public String gethpp_account_code() {
        return hpp_account_code;
    }
    public void sethpp_account_code(String hpp_account_code) {
        this.hpp_account_code = hpp_account_code;
    }

    public String getpot_account_code() {
        return pot_account_code;
    }
    public void setpot_account_code(String pot_account_code) {
        this.pot_account_code = pot_account_code;
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

    public String getinc_account_code() {
        return inc_account_code;
    }
    public void setinc_account_code(String inc_account_code) {
        this.inc_account_code = inc_account_code;
    }

    public String getoug_account_code() {
        return oug_account_code;
    }
    public void setoug_account_code(String oug_account_code) {
        this.oug_account_code = oug_account_code;
    }

    public String gettrn_account_code() {
        return trn_account_code;
    }
    public void settrn_account_code(String trn_account_code) {
        this.trn_account_code = trn_account_code;
    }


}
