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
public class Masteruser implements Serializable {
    private int id;
    private String user;
    private String password;
    private String nama;
    private String tanggalEntry;
    private String tanggalUpdate;
    private String userId;

    public Masteruser() {
    }

    public Masteruser(String user) {
        this.user = user;
    }

    public Masteruser(String user, int id, String nama, String tanggalEntry, String tanggalUpdate) {
        this.user = user;
        this.id = id;
        this.nama = nama;
        this.tanggalEntry = tanggalEntry;
        this.tanggalUpdate = tanggalUpdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalEntry() {
        return tanggalEntry;
    }

    public void setTanggalEntry(String tanggalEntry) {
        this.tanggalEntry = tanggalEntry;
    }

    public String getTanggalUpdate() {
        return tanggalUpdate;
    }

    public void setTanggalUpdate(String tanggalUpdate) {
        this.tanggalUpdate = tanggalUpdate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
