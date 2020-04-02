/*
 * To change this master_brand, choose Tools | Templates
 * and open the master_brand in the editor.
 */

package ikan.in.objectclasses;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class master_brandcls implements Serializable {

    private String kodebrand;
    private String namabrand;
    private Integer objtype;
    private String audituser;
    private String auditdate;

    public master_brandcls() {
    }
    
    public String getkodebrand() {
        return kodebrand;
    }
    public void setkodebrand(String kodebrand) {
        this.kodebrand = kodebrand;
    }

    public String getnamabrand() {
        return namabrand;
    }
    public void setnamabrand(String namabrand) {
        this.namabrand = namabrand;
    }

    public Integer getobjtype() {
        return objtype;
    }
    public void setobjtype(Integer objtype) {
        this.objtype = objtype;
    }

    public String getaudituser() {
        return audituser;
    }
    public void setaudituser(String audituser) {
        this.audituser = audituser;
    }

    public String getauditdate() {
        return auditdate;
    }
    public void setauditdate(String auditdate) {
        this.auditdate = auditdate;
    }


}
