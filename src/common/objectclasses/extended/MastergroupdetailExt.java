/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses.extended;

import classinterface.NavigatorObjectInt;
import common.objectclasses.Mastergroupdetail;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class MastergroupdetailExt extends Mastergroupdetail implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.dbcom;
    String squery="";

    private String modulename="";
    private int istatus=0;
    private String Description;
    private boolean updateme=false;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (istatus==this.Status_Insert){
            squery="call sp_insert_Mastergroupdetail( "
                    + "'"+this.getId()+"', "
                    + "'"+this.getKodeGroup()+"', "
                    + "'"+this.getModule()+"', "
                    + "'"+this.getCompany()+"', "
                    + "'"+this.getRead()+"', "
                    + "'"+this.getConfirm()+"', "
                    + "'"+this.getEntry()+"', "
                    + "'"+this.getUpdate()+"', "
                    + "'"+this.getDelete()+"', "
                    + "'"+this.getPrint()+"', "
                    + "'"+this.getExport()+"', "
                    + "'"+this.getImport1()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            MastergroupdetailExt o = new MastergroupdetailExt();
            if (!o.initdata(this.getKodeGroup(), this.getCompany(), this.getModule())){
                o=this;
                o.insert();
                o.update();
            }
            squery="call sp_update_Mastergroupdetail( "
                    + "'"+this.getId()+"', "
                    + "'"+this.getKodeGroup()+"', "
                    + "'"+this.getModule()+"', "
                    + "'"+this.getCompany()+"', "
                    + "'"+this.getRead()+"', "
                    + "'"+this.getConfirm()+"', "
                    + "'"+this.getEntry()+"', "
                    + "'"+this.getUpdate()+"', "
                    + "'"+this.getDelete()+"', "
                    + "'"+this.getPrint()+"', "
                    + "'"+this.getExport()+"', "
                    + "'"+this.getImport1()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_delete_Mastergroupdetail( "
                    + "'"+this.getId()+"', "
                    + "'"+this.getKodeGroup()+"', "
                    + "'"+this.getModule()+"', "
                    + "'"+this.getCompany()+"', "
                    + "'"+this.getRead()+"', "
                    + "'"+this.getConfirm()+"', "
                    + "'"+this.getEntry()+"', "
                    + "'"+this.getUpdate()+"', "
                    + "'"+this.getDelete()+"', "
                    + "'"+this.getPrint()+"', "
                    + "'"+this.getExport()+"', "
                    + "'"+this.getImport1()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        try {
            db.execute(squery);
            insertsts=false;
            throw new CodeException("Data deleted");
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(String key1) throws CodeException {
        squery="select * from mastergroupdetail where module='"+key1+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MastergroupdetailExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setId(rs.getInt("id"));
        this.setModule(rs.getString("module"));
        this.setKodeGroup(rs.getString("KodeGroup"));
        this.setTanggalEntry(rs.getDate("tanggalentry"));
        this.setTanggalUpdate(rs.getDate("tanggalupdate"));
        this.setRead(rs.getInt("read"));
        this.setConfirm(rs.getInt("confirm"));
        this.setEntry(rs.getInt("entry"));
        this.setUpdate(rs.getInt("update"));
        this.setDelete(rs.getInt("delete"));
        this.setPrint(rs.getInt("print"));
        this.setExport(rs.getInt("export"));
        this.setImport1(rs.getInt("import"));
        this.setUserId(rs.getString("userid"));

        this.insertsts=false;
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="select * from mastergroupdetail order by module limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MastergroupdetailExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="select * from mastergroupdetail where module<'"+this.getModule()+"' order by module desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MastergroupdetailExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="select * from mastergroupdetail where module>'"+this.getModule()+"' order by module limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MastergroupdetailExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="select * from mastergroupdetail order by module desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MastergroupdetailExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String getTable() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getClassName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportCsv() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean importText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean exportText() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean refresh() throws CodeException {
        if (this.initdata(this.getModule())){
            return true;
        }
        return false;
    }

    public void undo() {
        insertsts=false;
    }

    /**
     * @return the modulename
     */
    public String getModulename() {
        return modulename;
    }

    /**
     * @param modulename the modulename to set
     */
    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public void setstatus(int i) {
        istatus=i;
    }

    public int getStatus() {
        return istatus;
    }

    public Boolean initdata(String kdgroup, String company, String module) {
        squery="select * from mastergroupdetail where kodegroup='"+kdgroup+"' and company='"+company+"' and module='"+module+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MastergroupdetailExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    void setDescription(String Description) {
        this.Description=Description;
    }

    public String getDescription(){
        return this.Description;
    }

    public void setupdateme(boolean updateme) {
        this.updateme=updateme;
    }

    public boolean updateme() {
        return this.updateme;
    }
}
