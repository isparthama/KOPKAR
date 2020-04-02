/*
 * To change this op_bank, choose Tools | Templates
 * and open the op_bank in the editor.
 */

package kopkar.op.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class op_bankcls implements Serializable {

    private Integer id;
    private String bank_code;
    private String bank_desc;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public op_bankcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getbank_code() {
        return bank_code;
    }
    public void setbank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public String getbank_desc() {
        return bank_desc;
    }
    public void setbank_desc(String bank_desc) {
        this.bank_desc = bank_desc;
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
