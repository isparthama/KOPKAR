/*
 * To change this op_salesman, choose Tools | Templates
 * and open the op_salesman in the editor.
 */

package kopkar.op.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class op_salesmancls implements Serializable {

    private Integer id;
    private String salesman_code="";
    private String salesman_name;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public op_salesmancls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getsalesman_code() {
        return salesman_code;
    }
    public void setsalesman_code(String salesman_code) {
        this.salesman_code = salesman_code;
    }

    public String getsalesman_name() {
        return salesman_name;
    }
    public void setsalesman_name(String salesman_name) {
        this.salesman_name = salesman_name;
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
