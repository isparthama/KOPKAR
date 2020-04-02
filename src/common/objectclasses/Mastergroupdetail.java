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
public class Mastergroupdetail implements Serializable {
    private Integer id;
    private String kodeGroup;
    private String module;
    private String company;
    private Integer read=0;
    private Integer confirm=0;
    private Integer entry=0;
    private Integer update=0;
    private Integer delete=0;
    private Integer print=0;
    private Integer export=0;
    private Integer import1=0;
    private Date tanggalEntry;
    private Date tanggalUpdate;
    private String userId;

    public Mastergroupdetail() {
    }

    public Mastergroupdetail(Integer id) {
        this.id = id;
    }

    public Mastergroupdetail(Integer id, Date tanggalEntry, Date tanggalUpdate) {
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

    public String getKodeGroup() {
        return kodeGroup;
    }

    public void setKodeGroup(String kodeGroup) {
        this.kodeGroup = kodeGroup;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getRead() {
        return read;
    }

    public void setRead(Integer read) {
        this.read = read;
    }

    public Integer getConfirm() {
        return confirm;
    }

    public void setConfirm(Integer confirm) {
        this.confirm = confirm;
    }

    public Integer getEntry() {
        return entry;
    }

    public void setEntry(Integer entry) {
        this.entry = entry;
    }

    public Integer getUpdate() {
        return update;
    }

    public void setUpdate(Integer update) {
        this.update = update;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }

    public Integer getPrint() {
        return print;
    }

    public void setPrint(Integer print) {
        this.print = print;
    }

    public Integer getExport() {
        return export;
    }

    public void setExport(Integer export) {
        this.export = export;
    }

    public Integer getImport1() {
        return import1;
    }

    public void setImport1(Integer import1) {
        this.import1 = import1;
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
