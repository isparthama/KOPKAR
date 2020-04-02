/*
 * To change this ko_loan, choose Tools | Templates
 * and open the ko_loan in the editor.
 */

package kopkar.ko.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ko_loancls implements Serializable {

    private Integer id;
    private String loan_code;
    private String loan_name;
    private String active_sts;
    private Double rate;
    private String mode;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ko_loancls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getloan_code() {
        return loan_code;
    }
    public void setloan_code(String loan_code) {
        this.loan_code = loan_code;
    }

    public String getloan_name() {
        return loan_name;
    }
    public void setloan_name(String loan_name) {
        this.loan_name = loan_name;
    }

    public String getactive_sts() {
        return active_sts;
    }
    public void setactive_sts(String active_sts) {
        this.active_sts = active_sts;
    }

    public Double getrate() {
        return rate;
    }
    public void setrate(Double rate) {
        this.rate = rate;
    }

    public String getmode() {
        return mode;
    }
    public void setmode(String mode) {
        this.mode = mode;
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
