/*
 * To change this setting_common_rpt_detail1, choose Tools | setting_common_rpt_detail1s
 * and open the setting_common_rpt_detail1 in the editor.
 */

package common.objectclasses.extended;

import classinterface.NavigatorObjectInt;
import common.objectclasses.setting_common_rpt_detail1cls;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class setting_common_rpt_detail1ext extends setting_common_rpt_detail1cls implements NavigatorObjectInt{
    DbBean db=appsettinghandler.db;
    String squery="";
    private Integer status=0;

    public void insert() throws CodeException {
        this.status=this.Status_Insert;
    }

    public Boolean update() throws CodeException {
        if (this.status==Status_Insert){
            squery="call sp_setting_common_rpt_detail1_insert( "

                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlineno()+"', "
                    + "'"+this.getrowno()+"', "
                    + "'"+this.getcolumntype()+"', "
                    + "'"+this.getlevelno()+"', "
                    + "'"+this.gettextheader()+"', "
                    + "'"+this.getallowformulation()+"', "
                    + "'"+this.getsummary()+"', "
                    + "'"+this.gettextformulation()+"', "
                    + "'"+this.getvisorder()+"', "
                    + "'"+this.getshowdata()+"' "
                    + ")";
        } else {
            squery="call sp_setting_common_rpt_detail1_update( "

                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlineno()+"', "
                    + "'"+this.getrowno()+"', "
                    + "'"+this.getcolumntype()+"', "
                    + "'"+this.getlevelno()+"', "
                    + "'"+this.gettextheader()+"', "
                    + "'"+this.getallowformulation()+"', "
                    + "'"+this.getsummary()+"', "
                    + "'"+this.gettextformulation()+"', "
                    + "'"+this.getvisorder()+"', "
                    + "'"+this.getshowdata()+"' "
                    + ")";
        }
        try {
            db.execute(squery);
            this.status=Status_normal;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean delete() throws CodeException {
        squery="call sp_setting_common_rpt_detail1_delete( "

                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlineno()+"', "
                    + "'"+this.getrowno()+"', "
                    + "'"+this.getcolumntype()+"', "
                    + "'"+this.getlevelno()+"', "
                    + "'"+this.gettextheader()+"', "
                    + "'"+this.getallowformulation()+"', "
                    + "'"+this.getsummary()+"', "
                    + "'"+this.gettextformulation()+"', "
                    + "'"+this.getvisorder()+"', "
                    + "'"+this.getshowdata()+"' "
                    + ")";
        try {
            db.execute(squery);
            this.status=Status_normal;
            throw new CodeException("Data deleted");
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    public Boolean initdata() throws CodeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Boolean initdata(Integer id) throws CodeException {
        squery="select * from setting_common_rpt_detail1 where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rpt_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_setting_common_rpt_detail1_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rpt_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setdocentry(rs.getInt("docentry"));
        this.setlineno(rs.getInt("lineno"));
        this.setrowno(rs.getInt("rowno"));
        this.setcolumntype(rs.getString("columntype"));
        this.setlevelno(rs.getInt("levelno"));
        this.settextheader(rs.getString("textheader"));
        this.setallowformulation(rs.getString("allowformulation"));
        this.setsummary(rs.getString("summary"));
        this.settextformulation(rs.getString("textformulation"));
        this.setvisorder(rs.getInt("visorder"));
        this.setshowdata(rs.getString("showdata"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_setting_common_rpt_detail1_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rpt_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_setting_common_rpt_detail1_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rpt_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_setting_common_rpt_detail1_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rpt_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_setting_common_rpt_detail1_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rpt_detail1ext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getdocentry())){
            return true;
        }
        return false;
    }

    public void setstatus(Integer status) {
        this.status=status;
    }

    public Integer getstatus() {
        return this.status;
    }

}
