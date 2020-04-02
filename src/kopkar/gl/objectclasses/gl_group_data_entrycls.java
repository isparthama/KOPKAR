/*
 * To change this gl_group_data_entry, choose Tools | Templates
 * and open the gl_group_data_entry in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_group_data_entrycls implements Serializable {

    private String kode_gde="";
    private String nama_gde="";
    private String entrydate;
    private String auditdate;
    private String audituser="";
    private Integer dayend_no;
    private String dayend_date="";
    private String dayend_user="";

    public gl_group_data_entrycls() {
    }
    
    public String getkode_gde() {
        return kode_gde;
    }
    public void setkode_gde(String kode_gde) {
        this.kode_gde = kode_gde;
    }

    public String getnama_gde() {
        return nama_gde;
    }
    public void setnama_gde(String nama_gde) {
        this.nama_gde = nama_gde;
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

    public Integer getdayend_no() {
        return dayend_no;
    }
    public void setdayend_no(Integer dayend_no) {
        this.dayend_no = dayend_no;
    }

    public String getdayend_date() {
        return dayend_date;
    }
    public void setdayend_date(String dayend_date) {
        this.dayend_date = dayend_date;
    }

    public String getdayend_user() {
        return dayend_user;
    }
    public void setdayend_user(String dayend_user) {
        this.dayend_user = dayend_user;
    }


}
