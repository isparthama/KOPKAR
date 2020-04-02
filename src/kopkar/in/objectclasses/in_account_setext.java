/*
 * To change this in_account_set, choose Tools | in_account_sets
 * and open the in_account_set in the editor.
 */

package kopkar.in.objectclasses;

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
public class in_account_setext extends in_account_setcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";


    String sls_account_desc="";
    String inv_account_desc="";
    String hpp_account_desc="";
    String pot_account_desc="";
    String inc_account_desc="";
    String oug_account_desc="";
    String trn_account_desc="";


    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_in_account_set_insert( "
                     + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getsls_account_code()+"', "
                    + "'"+this.getinv_account_code()+"', "
                    + "'"+this.gethpp_account_code()+"', "
                    + "'"+this.getpot_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getinc_account_code()+"', "
                    + "'"+this.getoug_account_code()+"', "
                    + "'"+this.gettrn_account_code()+"', "
                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_in_account_set_update( "
                    + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getsls_account_code()+"', "
                    + "'"+this.getinv_account_code()+"', "
                    + "'"+this.gethpp_account_code()+"', "
                    + "'"+this.getpot_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getinc_account_code()+"', "
                    + "'"+this.getoug_account_code()+"', "
                    + "'"+this.gettrn_account_code()+"', "
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
        squery="call sp_in_account_set_delete( "
                     + "'"+this.getaccset_kode()+"', "
                    + "'"+this.getaccset_desc()+"', "
                    + "'"+this.getsls_account_code()+"', "
                    + "'"+this.getinv_account_code()+"', "
                    + "'"+this.gethpp_account_code()+"', "
                    + "'"+this.getpot_account_code()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getinc_account_code()+"', "
                    + "'"+this.getoug_account_code()+"', "
                    + "'"+this.gettrn_account_code()+"', "
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
        squery="select * from in_account_set where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String accset_kode) throws CodeException {
        squery="CALL sp_in_account_set_get('"+accset_kode+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setaccset_kode(rs.getString("accset_kode"));
        this.setaccset_desc(rs.getString("accset_desc"));
        this.setsls_account_code(rs.getString("sls_account_code"));
        this.setinv_account_code(rs.getString("inv_account_code"));
        this.sethpp_account_code(rs.getString("hpp_account_code"));
        this.setpot_account_code(rs.getString("pot_account_code"));
        this.setactive_sts(rs.getString("active_sts"));
        this.setentry_date(rs.getString("entry_date"));
        this.setaudit_date(rs.getString("audit_date"));
        this.setaudit_user(rs.getString("audit_user"));
        this.setinc_account_code(rs.getString("inc_account_code"));
        this.setoug_account_code(rs.getString("oug_account_code"));
        this.settrn_account_code(rs.getString("trn_account_code"));

        this.setsls_account_desc(rs.getString("sls_account_desc"));
        this.setinv_account_desc(rs.getString("inv_account_desc"));
        this.sethpp_account_desc(rs.getString("hpp_account_desc"));
        this.setpot_account_desc(rs.getString("pot_account_desc"));
        this.setinc_account_desc(rs.getString("inc_account_desc"));
        this.setoug_account_desc(rs.getString("oug_account_desc"));
        this.settrn_account_desc(rs.getString("trn_account_desc"));

        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_in_account_set_get('"+this.getaccset_kode()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_in_account_set_get('"+this.getaccset_kode()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_in_account_set_get('"+this.getaccset_kode()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_account_setext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_in_account_set_get('"+this.getaccset_kode()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_account_setext.class.getName()).log(Level.SEVERE, null, ex);
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


    public String getsls_account_desc() { return sls_account_desc;}
    public String getinv_account_desc() { return inv_account_desc;}
    public String gethpp_account_desc() { return hpp_account_desc;}
    public String getpot_account_desc() { return pot_account_desc;}
    public String getinc_account_desc() { return inc_account_desc;}
    public String getoug_account_desc() { return oug_account_desc;}
    public String gettrn_account_desc() { return trn_account_desc;}


    public void setsls_account_desc(String sls_account_desc) { this.sls_account_desc = sls_account_desc;}
    public void setinv_account_desc(String inv_account_desc) { this.inv_account_desc = inv_account_desc;}
    public void sethpp_account_desc(String hpp_account_desc) { this.hpp_account_desc = hpp_account_desc;}
    public void setpot_account_desc(String pot_account_desc) { this.pot_account_desc = pot_account_desc;}
    public void setinc_account_desc(String inc_account_desc) { this.inc_account_desc = inc_account_desc;}
    public void setoug_account_desc(String oug_account_desc) { this.oug_account_desc = oug_account_desc;}
    public void settrn_account_desc(String trn_account_desc) { this.trn_account_desc = trn_account_desc;}

    
}
