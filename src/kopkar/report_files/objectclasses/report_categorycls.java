/*
 * To change this report_category, choose Tools | Templates
 * and open the report_category in the editor.
 */

package kopkar.report_files.objectclasses;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class report_categorycls implements Serializable {

    private Integer report_category_id=0;
    private String report_category_code;
    private String report_category_desc;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public report_categorycls() {
    }
    
    public Integer getreport_category_id() {
        return report_category_id;
    }
    public void setreport_category_id(Integer report_category_id) {
        this.report_category_id = report_category_id;
    }

    public String getreport_category_code() {
        return report_category_code;
    }
    public void setreport_category_code(String report_category_code) {
        this.report_category_code = report_category_code;
    }

    public String getreport_category_desc() {
        return report_category_desc;
    }
    public void setreport_category_desc(String report_category_desc) {
        this.report_category_desc = report_category_desc;
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
