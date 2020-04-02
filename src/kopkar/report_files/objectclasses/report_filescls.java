/*
 * To change this report_files, choose Tools | Templates
 * and open the report_files in the editor.
 */

package kopkar.report_files.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class report_filescls implements Serializable {

    private Integer id;
    private String report_code;
    private String report_desc;
    private Integer report_category_code;
    private String report_file;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public report_filescls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public String getreport_code() {
        return report_code;
    }
    public void setreport_code(String report_code) {
        this.report_code = report_code;
    }

    public String getreport_desc() {
        return report_desc;
    }
    public void setreport_desc(String report_desc) {
        this.report_desc = report_desc;
    }

    public Integer getreport_category_code() {
        return report_category_code;
    }
    public void setreport_category_code(Integer report_category_code) {
        this.report_category_code = report_category_code;
    }

    public String getreport_file() {
        return report_file;
    }
    public void setreport_file(String report_file) {
        this.report_file = report_file;
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
