/*
 * To change this ko_member_deposit, choose Tools | ko_member_deposits
 * and open the ko_member_deposit in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_member_depositcls;
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
public class ko_member_depositext extends ko_member_depositcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_member_deposit_insert( "

                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getpinjaman()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_member_deposit_update( "

                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getpinjaman()+"', "



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
        squery="call sp_ko_member_deposit_delete( "

                    + "'"+this.getmember_number()+"', "
                    + "'"+this.getsimpanan_wajib()+"', "
                    + "'"+this.getsimpanan_pokok()+"', "
                    + "'"+this.getsimpanan_sukarela()+"', "
                    + "'"+this.getsimpanan_khusus()+"', "
                    + "'"+this.getpinjaman()+"', "



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
        squery="select * from ko_member_deposit where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_member_depositext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setmember_number(rs.getString("member_number"));
        this.setsimpanan_wajib(rs.getDouble("simpanan_wajib"));
        this.setsimpanan_pokok(rs.getDouble("simpanan_pokok"));
        this.setsimpanan_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setsimpanan_khusus(rs.getDouble("simpanan_khusus"));
        this.setpinjaman(rs.getDouble("pinjaman"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_member_deposit_get('"+this.getid()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_member_depositext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_member_deposit_get('"+this.getid()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_member_depositext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_member_deposit_get('"+this.getid()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_member_depositext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_member_deposit_get('"+this.getid()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_member_depositext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getid())){
            return true;
        }
        return false;
    }

}
