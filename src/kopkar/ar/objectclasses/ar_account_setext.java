/*
 * To change this ar_account_set, choose Tools | ar_account_sets
 * and open the ar_account_set in the editor.
 */

package kopkar.ar.objectclasses;

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
public class ar_account_setext extends ar_account_setcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String ar_account_desc="";
    String disc_account_desc="";
    String ppay_account_desc="";
    String ppn_account_desc="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ar_account_set_insert( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getar_account_code()+"', "
                    + "'"+this.getdisc_account_code()+"', "
                    + "'"+this.getppay_account_code()+"', "
                    + "'"+this.getPpn_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ar_account_set_update( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getar_account_code()+"', "
                    + "'"+this.getdisc_account_code()+"', "
                    + "'"+this.getppay_account_code()+"', "
                    + "'"+this.getPpn_account_code()+"', "
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
        squery="call sp_ar_account_set_delete( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getar_account_code()+"', "
                    + "'"+this.getdisc_account_code()+"', "
                    + "'"+this.getppay_account_code()+"', "
                    + "'"+this.getPpn_account_code()+"', "
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
        squery="select * from ar_account_set where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String accset_kode) throws CodeException {
        squery="CALL sp_ar_account_set_get('"+accset_kode+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setaccset_kode(rs.getString("accset_kode"));
        this.setaccset_desc(rs.getString("accset_desc"));
        this.setar_account_code(rs.getString("ar_account_code"));
        this.setdisc_account_code(rs.getString("disc_account_code"));
        this.setppay_account_code(rs.getString("ppay_account_code"));
        this.setPpn_account_code(rs.getString("ppn_account_code"));

        this.setar_account_desc(rs.getString("ar_account_desc"));
        this.setDisc_account_desc(rs.getString("disc_account_desc"));
        this.setPpay_account_desc(rs.getString("ppay_account_desc"));
        this.setPpn_account_desc(rs.getString("ppn_account_desc"));

        this.setactive_sts(rs.getString("active_sts"));
        this.setentry_date(rs.getString("entry_date"));
        this.setaudit_date(rs.getString("audit_date"));
        this.setaudit_user(rs.getString("audit_user"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ar_account_set_get('"+this.getaccset_kode()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ar_account_set_get('"+this.getaccset_kode()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ar_account_set_get('"+this.getaccset_kode()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ar_account_set_get('"+this.getaccset_kode()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ar_account_setext.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getar_account_desc() {
        return ar_account_desc;
    }

    public void setar_account_desc(String ar_account_desc) {
        this.ar_account_desc = ar_account_desc;
    }

    public String getDisc_account_desc() {
        return disc_account_desc;
    }

    public void setDisc_account_desc(String disc_account_desc) {
        this.disc_account_desc = disc_account_desc;
    }

    public String getPpay_account_desc() {
        return ppay_account_desc;
    }

    public void setPpay_account_desc(String ppay_account_desc) {
        this.ppay_account_desc = ppay_account_desc;
    }

    public String getPpn_account_desc() {
        return ppn_account_desc;
    }

    public void setPpn_account_desc(String ppn_account_desc) {
        this.ppn_account_desc = ppn_account_desc;
    }

    
}
