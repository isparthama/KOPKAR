/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses.extended;

import classinterface.NavigatorObjectInt;
import common.objectclasses.Mastermodule;
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
public class MasterModuleExt extends Mastermodule implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.dbcom;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_insert_Mastermodule( "
                    + "'"+this.getModule()+"', "
                    + "'"+this.getDescription()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_update_Mastermodule( "
                    + "'"+this.getModule()+"', "
                    + "'"+this.getDescription()+"', "
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
        squery="call sp_delete_Mastermodule( "
                    + "'"+this.getModule()+"', "
                    + "'"+this.getDescription()+"', "
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
        squery="select * from mastermodule where module='"+key1+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterModuleExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setModule(rs.getString("module"));
        this.setDescription(rs.getString("Description"));
        this.setTanggalEntry(rs.getDate("tanggalentry"));
        this.setTanggalUpdate(rs.getDate("tanggalupdate"));
        this.setUserId(rs.getString("userid"));

        this.insertsts=false;
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="select * from mastermodule order by module limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterModuleExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="select * from mastermodule where module<'"+this.getModule()+"' order by module desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterModuleExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="select * from mastermodule where module>'"+this.getModule()+"' order by module limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterModuleExt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="select * from mastermodule order by module desc limit 0,1";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MasterModuleExt.class.getName()).log(Level.SEVERE, null, ex);
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

    public void creategroupdetail() {
        try {
            db.execute("insert into mastergroupdetail " +
                    "\n (kodegroup,module,userid,company) " +
                    "\n select  " + "\n mg.kodegroup,mm.module,'admin',mc.company " +
                    "\n from mastermodule mm , mastergroup mg,mastercompany mc " +
                    "\n where not exists( " +
                    "\n select * from mastergroupdetail where KodeGroup=mg.KodeGroup and Module=mm.Module and company=mc.company " +
                    "\n ) " + "\n ");
        } catch (SQLException ex) {
            Logger.getLogger(MasterModuleExt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
