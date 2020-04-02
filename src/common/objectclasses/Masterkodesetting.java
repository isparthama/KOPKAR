/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author mtgmis30
 */
public class Masterkodesetting implements Serializable {
    private Integer id;
    private String owner;
    private String kodeSetting;
    private String description;
    private String sessionId;
    private Date tanggalEntry;
    private Date tanggalUpdate;
    private String userID;

    public Masterkodesetting() {
    }

    public Masterkodesetting(Integer id) {
        this.id = id;
    }

    public Masterkodesetting(Integer id, String owner, String kodeSetting, Date tanggalEntry, Date tanggalUpdate) {
        this.id = id;
        this.owner = owner;
        this.kodeSetting = kodeSetting;
        this.tanggalEntry = tanggalEntry;
        this.tanggalUpdate = tanggalUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getKodeSetting() {
        return kodeSetting;
    }

    public void setKodeSetting(String kodeSetting) {
        this.kodeSetting = kodeSetting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getTanggalEntry() {
        return tanggalEntry;
    }

    public void setTanggalEntry(Date tanggalEntry) {
        this.tanggalEntry = tanggalEntry;
    }

    public Date getTanggalUpdate() {
        return tanggalUpdate;
    }

    public void setTanggalUpdate(Date tanggalUpdate) {
        this.tanggalUpdate = tanggalUpdate;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }


}
