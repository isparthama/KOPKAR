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
public class Masteruserdetail implements Serializable {
    private Integer id=0;
    private String user;
    private String kodeGroup;
    private Date tanggalEntry;
    private Date tanggalUpdate;
    private String userId;

    public Masteruserdetail() {
    }

    public Masteruserdetail(Integer id) {
        this.id = id;
    }

    public Masteruserdetail(Integer id, Date tanggalEntry, Date tanggalUpdate) {
        this.id = id;
        this.tanggalEntry = tanggalEntry;
        this.tanggalUpdate = tanggalUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getKodeGroup() {
        return kodeGroup;
    }

    public void setKodeGroup(String kodeGroup) {
        this.kodeGroup = kodeGroup;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


}
