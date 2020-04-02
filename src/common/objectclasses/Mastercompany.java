/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses;

import java.util.Date;

/**
 *
 * @author mtgmis30
 */
public class Mastercompany {
    private String company;
    private String description;
    private String database;
    private Integer selected=0;
    private Date tanggalEntry;
    private Date tanggalUpdate;
    private String userID;

    public Mastercompany() {
    }

    public Mastercompany(String company) {
        this.company = company;
    }

    public Mastercompany(String company, int id, String database) {
        this.company = company;
        this.database = database;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Integer getSelected() {
        return selected;
    }

    public void setSelected(Integer selected) {
        this.selected = selected;
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
