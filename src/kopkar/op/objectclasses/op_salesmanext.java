/*
 * To change this op_salesman, choose Tools | op_salesmans
 * and open the op_salesman in the editor.
 */

package kopkar.op.objectclasses;

import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import kopkar.op.objectclasses.op_salesmancls;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class op_salesmanext extends op_salesmancls implements NavigatorObjectInt{
    Boolean insertsts=false;
    DbBean db=appsettinghandler.db;
    String squery="";

    public void insert() throws CodeException {
        this.insertsts=true;
    }

    public Boolean update() throws CodeException {
        if (insertsts){
            squery="call sp_op_salesman_insert( "

                    + "'"+this.getsalesman_code()+"', "
                    + "'"+this.getsalesman_name()+"', "



                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_op_salesman_update( "

                    + "'"+this.getsalesman_code()+"', "
                    + "'"+this.getsalesman_name()+"', "



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
        squery="call sp_op_salesman_delete( "

                    + "'"+this.getsalesman_code()+"', "
                    + "'"+this.getsalesman_name()+"', "



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
        squery="select * from op_salesman where id='"+id+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_salesmanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdata(String salesman_code) throws CodeException {
        squery="CALL sp_op_salesman_get('"+salesman_code+"', 0)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_salesmanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        this.setid(rs.getInt("id"));
        this.setsalesman_code(rs.getString("salesman_code"));
        this.setsalesman_name(rs.getString("salesman_name"));
        this.setentrydate(rs.getString("entrydate"));
        this.setauditdate(rs.getString("auditdate"));
        this.setaudituser(rs.getString("audituser"));
        return true;
    }
    public Boolean moveFirst() throws CodeException {
        squery="CALL sp_op_salesman_get('"+this.getsalesman_code()+"', 1)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_salesmanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean movePrevious() throws CodeException {
        squery="CALL sp_op_salesman_get('"+this.getsalesman_code()+"', 2)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_salesmanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveNext() throws CodeException {
        squery="CALL sp_op_salesman_get('"+this.getsalesman_code()+"', 3)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_salesmanext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean moveLast() throws CodeException {
        squery="CALL sp_op_salesman_get('"+this.getsalesman_code()+"', 4)";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(op_salesmanext.class.getName()).log(Level.SEVERE, null, ex);
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
        if (this.initdata(this.getsalesman_code())){
            return true;
        }
        return false;
    }

}
