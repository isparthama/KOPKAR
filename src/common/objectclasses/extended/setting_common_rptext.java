/*
 * To change this setting_common_rpt, choose Tools | setting_common_rpts
 * and open the setting_common_rpt in the editor.
 */

package common.objectclasses.extended;

import classinterface.NavigatorObjectInt;
import common.objectclasses.setting_common_rptcls;
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
public class setting_common_rptext extends setting_common_rptcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";
    private setting_common_rpt_detail1extcol detail=new setting_common_rpt_detail1extcol(this.getdocentry());

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        try {
            setting_common_rpt_detail1ext o;
            if (insertsts){
                this.setcratedate(GlobalUtils.formatDate(GlobalUtils.getCurrentDate(),"yyyy-MM-dd"));
                squery="call sp_setting_common_rpt_insert( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getreportname()+"', "
                        + "'"+this.getreportdesc()+"', "
                        + "'"+this.getcratedate()+"', "
                        + "'"+GlobalUtils.userid+"',"
                        + "'"+this.getcmpnyid()+"' "
                        + ")";
                db.execute(squery);
            } else {
                squery="call sp_setting_common_rpt_update( "
                        + "'"+this.getdocentry()+"', "
                        + "'"+this.getreportname()+"', "
                        + "'"+this.getreportdesc()+"', "
                        + "'"+this.getcratedate()+"', "
                        + "'"+GlobalUtils.userid+"',"
                        + "'"+this.getcmpnyid()+"' "
                        + ")";
                db.execute(squery);

                for (int i=0;i<detail.size();i++){
                    o=detail.get(i);
                    if (o.getstatus()==o.Status_Insert||o.getstatus()==o.Status_update){
                        if (o.getstatus()==o.Status_Insert){
                            o.setdocentry(this.getdocentry());
                        }
                        o.update();
                    }
                    if (o.getstatus()==o.Status_delete){
                        o.delete();
                    }
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
        squery="call sp_setting_common_rpt_delete( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getreportname()+"', "
                    + "'"+this.getreportdesc()+"', "
                    + "'"+this.getcratedate()+"', "
                    + "'"+GlobalUtils.userid+"',"
                    + "'"+this.getcmpnyid()+"' "
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
        squery="select * from setting_common_rpt where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String docentry) throws CodeException {
        squery="CALL sp_setting_common_rpt_get('"+docentry+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setdocentry(rs.getInt("docentry"));
        this.setreportname(rs.getString("reportname"));
        this.setreportdesc(rs.getString("reportdesc"));
        this.setreprocess(rs.getString("reprocess"));
        this.setlastyop(rs.getInt("lastyop"));
        this.setlastmop(rs.getInt("lastmop"));
        this.setcratedate(rs.getString("cratedate"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        this.setobjtype(rs.getInt("objtype"));
        this.setcmpnyid(rs.getString("cmpnyid"));

        detail=new setting_common_rpt_detail1extcol(this.getdocentry());
        detail.initdata();

        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_setting_common_rpt_get('"+this.getdocentry()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_setting_common_rpt_get('"+this.getdocentry()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_setting_common_rpt_get('"+this.getdocentry()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rptext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_setting_common_rpt_get('"+this.getdocentry()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(setting_common_rptext.class.getName()).log(Level.SEVERE, null, ex);
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

    public setting_common_rpt_detail1extcol getDetail1() {
        return this.detail;
    }

    public void setDetail1(setting_common_rpt_detail1extcol detail) {
        this.detail=detail;
    }

}
