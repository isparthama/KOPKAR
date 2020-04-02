/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses.extended;

import classinterface.NavigatorObjectInt;
import common.objectclasses.Masteruser;
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
public class MasterUserExt extends Masteruser implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.dbcom;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_insert_masteruser( "
                    + "'"+this.getUser()+"', "
                    + "'"+this.getPassword()+"', "
                    + "'"+this.getNama()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_update_masteruser( "
                    + "'"+this.getUser()+"', "
                    + "'"+this.getPassword()+"', "
                    + "'"+this.getNama()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            this.refresh();
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_delete_masteruser( "
                    + "'"+this.getUser()+"', "
                    + "'"+this.getPassword()+"', "
                    + "'"+this.getNama()+"', "
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
        squery="select * from masteruser where User='"+key1+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterUserExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setUser(rs.getString("User"));
        this.setNama(rs.getString("nama"));
        this.setPassword(rs.getString("password"));
        this.setTanggalEntry(rs.getString("tanggalentry"));
        this.setTanggalUpdate(rs.getString("tanggalupdate"));
        this.setUserId(rs.getString("userid"));

        this.insertsts=false;
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="select * from masteruser order by User limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterUserExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="select * from masteruser where User<'"+this.getUser()+"' order by User desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterUserExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="select * from masteruser where User>'"+this.getUser()+"' order by User limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterUserExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="select * from masteruser order by User desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterUserExt.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getUser())){
            return true;
        }
        return false;
    }

    public void undo(){
        this.insertsts=false;
    }
}
