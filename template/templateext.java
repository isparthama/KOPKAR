/*
 * To change this template, choose Tools | templates
 * and open the template in the editor.
 */

package generator.template;

import bmtapp.objectclasses.extended.*;
import bmtapp.classinterface.NavigatorObjectInt;
import bmtapp.jdbc.DbBean;
import bmtapp.utils.CodeException;
import bmtapp.utils.GlobalUtils;
import bmtapp.utils.appsettinghandler;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mtgmis30
 */
public class templateext extends templatecls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_template_insert( "
                    //getparameter
                    + "'"+this.getKdCarabyr()+"', "
                    + "'"+this.getNmCarabyr()+"', "
                    + "'"+this.getInterval()+"', "
                    //getparameterend
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_template_update( "
                    //getparameter
                    + "'"+this.getKdCarabyr()+"', "
                    + "'"+this.getNmCarabyr()+"', "
                    + "'"+this.getInterval()+"', "
                    //getparameterend
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
        squery="call sp_template_delete( "
                    //getparameter
                    + "'"+this.getKdCarabyr()+"', "
                    + "'"+this.getNmCarabyr()+"', "
                    + "'"+this.getInterval()+"', "
                    //getparameterend
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

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from template where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(templateext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String KEY) throws CodeException {
        squery="CALL sp_template_get('"+KEY+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(templateext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        //getfillme
        this.setKdCarabyr(rs.getString("id"));
        this.setNmCarabyr(rs.getString("nm_carabyr"));
        this.setInterval(rs.getString("interval"));
        this.setEntrydate(rs.getDate("entrydate"));
        this.setAuditdate(rs.getDate("auditdate"));
        this.setAudituser(rs.getString("audituser"));
        //getfillmeend
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_template_get('"+this.getKEY()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(templateext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_template_get('"+this.getKEY()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(templateext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_template_get('"+this.getKEY()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(templateext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_template_get('"+this.getKEY()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(templateext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getKEY())){
            return true;
        }
        return false;
    }

}
