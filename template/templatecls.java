/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generator.template;

import bmtapp.objectclasses.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class templatecls implements Serializable {

    //getdeklarasi
    Integer id;
    private String kdCarabyr;
    private String nmCarabyr;
    private String interval="Day";
    private Date entrydate;
    private Date auditdate;
    private String audituser;
    //getdeklarasiend

    public templatecls() {
    }
    
    //getgettersetter
    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getKdCarabyr() {
        return kdCarabyr;
    }

    public void setKdCarabyr(String kdCarabyr) {
        this.kdCarabyr = kdCarabyr;
    }

    public String getNmCarabyr() {
        return nmCarabyr;
    }

    public void setNmCarabyr(String nmCarabyr) {
        this.nmCarabyr = nmCarabyr;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }

    public String getAudituser() {
        return audituser;
    }

    public void setAudituser(String audituser) {
        this.audituser = audituser;
    }

    /**
     * @return the interval
     */
    public String getInterval() {
        return interval;
    }

    /**
     * @param interval the interval to set
     */
    public void setInterval(String interval) {
        this.interval = interval;
    }
    //getgettersetterend

}
