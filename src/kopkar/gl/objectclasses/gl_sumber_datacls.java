/*
 * To change this gl_sumber_data, choose Tools | Templates
 * and open the gl_sumber_data in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class gl_sumber_datacls implements Serializable {

    private String kode_data_entry;
    private String nama_data_entry;
    private Integer dayseqno;
    private String coa_debet;
    private String coa_kredit;
    private String kode_gde;
    private String entrydate;
    private String auditdate;
    private String audituser;

    public gl_sumber_datacls() {
    }
    
    public String getkode_data_entry() {
        return kode_data_entry;
    }
    public void setkode_data_entry(String kode_data_entry) {
        this.kode_data_entry = kode_data_entry;
    }

    public String getnama_data_entry() {
        return nama_data_entry;
    }
    public void setnama_data_entry(String nama_data_entry) {
        this.nama_data_entry = nama_data_entry;
    }

    public Integer getdayseqno() {
        return dayseqno;
    }
    public void setdayseqno(Integer dayseqno) {
        this.dayseqno = dayseqno;
    }

    public String getcoa_debet() {
        return coa_debet;
    }
    public void setcoa_debet(String coa_debet) {
        this.coa_debet = coa_debet;
    }

    public String getcoa_kredit() {
        return coa_kredit;
    }
    public void setcoa_kredit(String coa_kredit) {
        this.coa_kredit = coa_kredit;
    }

    public String getkode_gde() {
        return kode_gde;
    }
    public void setkode_gde(String kode_gde) {
        this.kode_gde = kode_gde;
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
