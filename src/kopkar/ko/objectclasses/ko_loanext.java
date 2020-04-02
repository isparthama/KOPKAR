/*
 * To change this ko_loan, choose Tools | ko_loans
 * and open the ko_loan in the editor.
 */

package kopkar.ko.objectclasses;

import classinterface.NavigatorObjectInt;
import kopkar.ko.objectclasses.ko_loancls;
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
public class ko_loanext extends ko_loancls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_ko_loan_insert( "

                    + "'"+this.getloan_code()+"', "
                    + "'"+this.getloan_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getrate()+"', "
                    + "'"+this.getmode()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_loan_update( "

                    + "'"+this.getloan_code()+"', "
                    + "'"+this.getloan_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getrate()+"', "
                    + "'"+this.getmode()+"', "



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
        squery="call sp_ko_loan_delete( "

                    + "'"+this.getloan_code()+"', "
                    + "'"+this.getloan_name()+"', "
                    + "'"+this.getactive_sts()+"', "
                    + "'"+this.getrate()+"', "
                    + "'"+this.getmode()+"', "



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
        squery="select * from ko_loan where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_loanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String loan_code) throws CodeException {
        squery="CALL sp_ko_loan_get('"+loan_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_loanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setloan_code(rs.getString("loan_code"));
        this.setloan_name(rs.getString("loan_name"));
        this.setactive_sts(rs.getString("active_sts"));
        this.setrate(rs.getDouble("rate"));
        this.setmode(rs.getString("mode"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_ko_loan_get('"+this.getloan_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_loanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_ko_loan_get('"+this.getloan_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_loanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_ko_loan_get('"+this.getloan_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_loanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_ko_loan_get('"+this.getloan_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_loanext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getloan_code())){
            return true;
        }
        return false;
    }

}
