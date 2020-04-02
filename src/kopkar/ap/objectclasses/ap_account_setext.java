/*
 * To change this ap_account_set, choose Tools | ap_account_sets
 * and open the ap_account_set in the editor.
 */

package kopkar.ap.objectclasses;

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
public class ap_account_setext extends ap_account_setcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    String ap_account_desc="";
    String disc_account_desc="";
    String ppay_account_desc="";
    private String in_account_desc="";
    private String out_account_desc="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ap_account_set_insert( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getap_account_code()+"', "
                    + "'"+this.getdisc_account_code()+"', "
                    + "'"+this.getppay_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getin_account_code()+"', "
                    + "'"+this.getout_account_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ap_account_set_update( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getap_account_code()+"', "
                    + "'"+this.getdisc_account_code()+"', "
                    + "'"+this.getppay_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getin_account_code()+"', "
                    + "'"+this.getout_account_code()+"', "
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
        squery="call sp_ap_account_set_delete( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getap_account_code()+"', "
                    + "'"+this.getdisc_account_code()+"', "
                    + "'"+this.getppay_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getin_account_code()+"', "
                    + "'"+this.getout_account_code()+"', "
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
        squery="select * from ap_account_set where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String accset_kode) throws CodeException {
        squery="CALL sp_ap_account_set_get('"+accset_kode+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setaccset_kode(rs.getString("accset_kode"));
        this.setaccset_desc(rs.getString("accset_desc"));
        this.setap_account_code(rs.getString("ap_account_code"));
        this.setdisc_account_code(rs.getString("disc_account_code"));
        this.setppay_account_code(rs.getString("ppay_account_code"));
        this.setin_account_code(rs.getString("in_account_code"));
        this.setout_account_code(rs.getString("out_account_code"));

        this.setAp_account_desc(rs.getString("ap_account_desc"));
        this.setDisc_account_desc(rs.getString("disc_account_desc"));
        this.setPpay_account_desc(rs.getString("ppay_account_desc"));

        this.setin_account_desc(rs.getString("in_account_desc"));
        this.setout_account_desc(rs.getString("out_account_desc"));

        this.setactive_sts(rs.getString("active_sts"));
        this.setentry_date(rs.getString("entry_date"));
        this.setaudit_date(rs.getString("audit_date"));
        this.setaudit_user(rs.getString("audit_user"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ap_account_set_get('"+this.getaccset_kode()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ap_account_set_get('"+this.getaccset_kode()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ap_account_set_get('"+this.getaccset_kode()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ap_account_set_get('"+this.getaccset_kode()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ap_account_setext.class.getName()).log(Level.SEVERE, null, ex);
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

    public String getAp_account_desc() {
        return ap_account_desc;
    }

    public void setAp_account_desc(String ap_account_desc) {
        this.ap_account_desc = ap_account_desc;
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

    private void setin_account_desc(String in_account_desc) {
        this.in_account_desc=in_account_desc;
    }

    private void setout_account_desc(String out_account_desc) {
        this.out_account_desc=out_account_desc;
    }

    public String getin_account_desc() {
        return this.in_account_desc;
    }

    public String getout_account_desc() {
        return this.out_account_desc;
    }

}
