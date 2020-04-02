/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses.extended;

import classinterface.NavigatorObjectInt;
import common.objectclasses.Mastergroup;
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
public class MasterGroupExt extends Mastergroup implements NavigatorObjectInt{
    Mastergroupdetailcols detail=new Mastergroupdetailcols("");
    Boolean insertsts=false;
    DbBean db=appsettinghandler.dbcom;
    String squery="";
    private Integer selected;

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_insert_Mastergroup( "
                    + "'"+this.getKodeGroup()+"', "
                    + "'"+this.getKeterangan()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_update_Mastergroup( "
                    + "'"+this.getKodeGroup()+"', "
                    + "'"+this.getKeterangan()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            int i=0;
            for (i=0;i<this.detail.size();i++){
                if (this.detail.get(i).getStatus()==2){
                    this.detail.get(i).update();
                }
            }
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_delete_Mastergroup( "
                    + "'"+this.getKodeGroup()+"', "
                    + "'"+this.getKeterangan()+"', "
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
        squery="select * from mastergroup where kodegroup='"+key1+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterGroupExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setKodeGroup(rs.getString("kodegroup"));
        this.setKeterangan(rs.getString("keterangan"));
        this.setTanggalEntry(rs.getDate("tanggalentry"));
        this.setTanggalUpdate(rs.getDate("tanggalupdate"));
        this.setUserId(rs.getString("userid"));

        detail=new Mastergroupdetailcols(this.getKodeGroup());
        detail.initdata(GlobalUtils.company);
        this.insertsts=false;
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="select * from mastergroup order by kodegroup limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterGroupExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="select * from mastergroup where kodegroup<'"+this.getKodeGroup()+"' order by kodegroup desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterGroupExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="select * from mastergroup where kodegroup>'"+this.getKodeGroup()+"' order by kodegroup limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterGroupExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="select * from mastergroup order by kodegroup desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterGroupExt.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getKodeGroup())){
            return true;
        }
        return false;
    }

    public void undo(){
        this.insertsts=false;
    }

    public Mastergroupdetailcols getDetail() {
        return this.detail;
    }

    void setselected(int selected) {
        this.selected=selected;
    }

    public Integer getselected() {
        return this.selected;
    }


}
