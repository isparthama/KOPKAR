/*
 * To change this op_payment_term, choose Tools | Templates
 * and open the op_payment_term in the editor.
 */

package kopkar.op.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class op_payment_termcls implements Serializable {

    private Integer id;
    private String term_code;
    private String term_desc;
    private Integer days;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public op_payment_termcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getterm_code() {
        return term_code;
    }
    public void setterm_code(String term_code) {
        this.term_code = term_code;
    }

    public String getterm_desc() {
        return term_desc;
    }
    public void setterm_desc(String term_desc) {
        this.term_desc = term_desc;
    }

    public Integer getdays() {
        return days;
    }
    public void setdays(Integer days) {
        this.days = days;
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
