/*
 * To change this in_function, choose Tools | Templates
 * and open the in_function in the editor.
 */

package kopkar.in.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class in_functioncls implements Serializable {

    private Integer id;
    private String function_code;
    private String function_name;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public in_functioncls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getfunction_code() {
        return function_code;
    }
    public void setfunction_code(String function_code) {
        this.function_code = function_code;
    }

    public String getfunction_name() {
        return function_name;
    }
    public void setfunction_name(String function_name) {
        this.function_name = function_name;
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
