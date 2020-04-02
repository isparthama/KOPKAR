/*
 * To change this op_payment_term, choose Tools | op_payment_terms
 * and open the op_payment_term in the editor.
 */

package kopkar.op.objectclasses;

import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import kopkar.op.objectclasses.op_payment_termcls;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class op_payment_termext extends op_payment_termcls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_op_payment_term_insert( "

                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getterm_desc()+"', "
                    + "'"+this.getdays()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_op_payment_term_update( "

                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getterm_desc()+"', "
                    + "'"+this.getdays()+"', "



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
        squery="call sp_op_payment_term_delete( "

                    + "'"+this.getterm_code()+"', "
                    + "'"+this.getterm_desc()+"', "
                    + "'"+this.getdays()+"', "



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
        squery="select * from op_payment_term where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_payment_termext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String term_code) throws CodeException {
        squery="CALL sp_op_payment_term_get('"+term_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_payment_termext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public String initdataduedate(String tanggal,String term_code) throws CodeException {
        tanggal=GlobalUtils.formatDate(tanggal, "yyyy-MM-dd");
        squery="select date_add('"+tanggal+"',INTERVAL days day) as duedate "+
                "from op_payment_term where term_code='"+term_code+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                return GlobalUtils.formatDate(rs.getString("duedate"),"MM/dd/yyyy");
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_payment_termext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return GlobalUtils.getCurrentDate();
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setterm_code(rs.getString("term_code"));
        this.setterm_desc(rs.getString("term_desc"));
        this.setdays(rs.getInt("days"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_op_payment_term_get('"+this.getterm_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_payment_termext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_op_payment_term_get('"+this.getterm_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_payment_termext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_op_payment_term_get('"+this.getterm_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_payment_termext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_op_payment_term_get('"+this.getterm_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_payment_termext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getterm_code())){
            return true;
        }
        return false;
    }

    
}
