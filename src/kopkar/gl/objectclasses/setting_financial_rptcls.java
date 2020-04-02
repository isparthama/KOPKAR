/*
 * To change this setting_financial_rpt, choose Tools | Templates
 * and open the setting_financial_rpt in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class setting_financial_rptcls implements Serializable {

    private Integer id;
    private Integer docentry=0;
    private String reportname;
    private String reportdesc;
    private String reprocess;
    private Integer lastyop;
    private Integer lastmop;
    private String cratedate;
    private String entrydate;
    private String auditdate;
    private String audituser;
    private Integer objtype;
    private String cmpnyid;

    public setting_financial_rptcls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
    }

    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public String getreportname() {
        return reportname;
    }
    public void setreportname(String reportname) {
        this.reportname = reportname;
    }

    public String getreportdesc() {
        return reportdesc;
    }
    public void setreportdesc(String reportdesc) {
        this.reportdesc = reportdesc;
    }

    public String getreprocess() {
        return reprocess;
    }
    public void setreprocess(String reprocess) {
        this.reprocess = reprocess;
    }

    public Integer getlastyop() {
        return lastyop;
    }
    public void setlastyop(Integer lastyop) {
        this.lastyop = lastyop;
    }

    public Integer getlastmop() {
        return lastmop;
    }
    public void setlastmop(Integer lastmop) {
        this.lastmop = lastmop;
    }

    public String getcratedate() {
        return cratedate;
    }
    public void setcratedate(String cratedate) {
        this.cratedate = cratedate;
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

    public Integer getobjtype() {
        return objtype;
    }
    public void setobjtype(Integer objtype) {
        this.objtype = objtype;
    }

    public String getcmpnyid() {
        return cmpnyid;
    }
    public void setcmpnyid(String cmpnyid) {
        this.cmpnyid = cmpnyid;
    }


}
