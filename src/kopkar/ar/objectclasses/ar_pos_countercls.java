/*
 * To change this ar_pos_counter, choose Tools | Templates
 * and open the ar_pos_counter in the editor.
 */

package kopkar.ar.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class ar_pos_countercls implements Serializable {

    private Integer id;
    private String counter_number;
    private String counter_name;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public ar_pos_countercls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getcounter_number() {
        return counter_number;
    }
    public void setcounter_number(String counter_number) {
        this.counter_number = counter_number;
    }

    public String getcounter_name() {
        return counter_name;
    }
    public void setcounter_name(String counter_name) {
        this.counter_name = counter_name;
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
