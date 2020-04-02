/*
 * To change this ko_account_set, choose Tools | ko_account_sets
 * and open the ko_account_set in the editor.
 */

package kopkar.ko.objectclasses;

import kopkar.ar.objectclasses.*;
import kopkar.ap.objectclasses.*;
import classinterface.NavigatorObjectInt;
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
public class ko_account_setext extends ko_account_setcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String pinjam_account_desc="";
    String pdp_tangguh_account_desc="";
    String pdp_bunga_account_desc="";
    String pot_account_desc="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_account_set_insert( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getpinjam_account_code()+"', "
                    + "'"+this.getpdp_tangguh_account_code()+"', "
                    + "'"+this.getpdp_bunga_account_code()+"', "
                    + "'"+this.getpot_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_account_set_update( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getpinjam_account_code()+"', "
                    + "'"+this.getpdp_tangguh_account_code()+"', "
                    + "'"+this.getpdp_bunga_account_code()+"', "
                    + "'"+this.getpot_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
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
        squery="call sp_ko_account_set_delete( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getpinjam_account_code()+"', "
                    + "'"+this.getpdp_tangguh_account_code()+"', "
                    + "'"+this.getpdp_bunga_account_code()+"', "
                    + "'"+this.getpot_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
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
        squery="select * from ko_account_set where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String accset_kode) throws CodeException {
        squery="CALL sp_ko_account_set_get('"+accset_kode+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setaccset_kode(rs.getString("accset_kode"));
        this.setaccset_desc(rs.getString("accset_desc"));

        this.setpinjam_account_code(rs.getString("pinjam_account_code"));
        this.setpdp_tangguh_account_code(rs.getString("pdp_tangguh_account_code"));
        this.setpdp_bunga_account_code(rs.getString("pdp_bunga_account_code"));
        this.setpot_account_code(rs.getString("pot_account_code"));

        this.setpinjam_account_desc(rs.getString("pinjam_account_desc"));
        this.setpdp_tangguh_account_desc(rs.getString("pdp_tangguh_account_desc"));
        this.setpdp_bunga_account_desc(rs.getString("pdp_bunga_account_desc"));
        this.setpot_account_desc(rs.getString("pot_account_desc"));


        this.setactive_sts(rs.getString("active_sts"));
        this.setentry_date(rs.getString("entry_date"));
        this.setaudit_date(rs.getString("audit_date"));
        this.setaudit_user(rs.getString("audit_user"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_account_set_get('"+this.getaccset_kode()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_account_set_get('"+this.getaccset_kode()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_account_set_get('"+this.getaccset_kode()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_account_set_get('"+this.getaccset_kode()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_account_setext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getaccset_kode())){
            return true;
        }
        return false;
    }

    public String getpinjam_account_desc() { return pinjam_account_desc;}
    public String getpdp_tangguh_account_desc() { return pdp_tangguh_account_desc;}
    public String getpdp_bunga_account_desc() { return pdp_bunga_account_desc;}
    public String getpot_account_desc() { return pot_account_desc;}

    public void setpinjam_account_desc(String pinjam_account_desc) { this.pinjam_account_desc = pinjam_account_desc;}
    public void setpdp_tangguh_account_desc(String pdp_tangguh_account_desc) { this.pdp_tangguh_account_desc = pdp_tangguh_account_desc;}
    public void setpdp_bunga_account_desc(String pdp_bunga_account_desc) { this.pdp_bunga_account_desc = pdp_bunga_account_desc;}
    public void setpot_account_desc(String pot_account_desc) { this.pot_account_desc = pot_account_desc;}

    
}
