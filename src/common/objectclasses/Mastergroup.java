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
public class Mastergroup implements Serializable {
    private int id;
    private String kodeGroup;
    private String keterangan;
    private Date tanggalEntry;
    private Date tanggalUpdate;
    private String userId;


    public Mastergroup() {
    }

    public Mastergroup(String kodeGroup) {
        this.kodeGroup = kodeGroup;
    }

    public Mastergroup(String kodeGroup, int id, Date tanggalEntry, Date tanggalUpdate) {
        this.kodeGroup = kodeGroup;
        this.id = id;
        this.tanggalEntry = tanggalEntry;
        this.tanggalUpdate = tanggalUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKodeGroup() {
        return kodeGroup;
    }

    public void setKodeGroup(String kodeGroup) {
        this.kodeGroup = kodeGroup;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
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
