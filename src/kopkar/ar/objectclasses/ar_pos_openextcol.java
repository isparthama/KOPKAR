/*
 * To change this ar_pos_open, choose Tools | Templates
 * and open the ar_pos_open in the editor.
 */

package kopkar.ar.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class ar_pos_openextcol extends ArrayList<ar_pos_openext> {
    ar_pos_openext data=new ar_pos_openext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new ar_pos_openext();
    }
    public ar_pos_openextcol(Integer id){
        this.id=id;
    }

    public ar_pos_openext getData() {
        return data;
    }

    public void setData(ar_pos_openext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setdscription(rs.getString("dscription"));
        data.setcounter_number(rs.getString("counter_number"));
        data.setchasier_code(rs.getString("chasier_code"));
        data.setcash_register_modal(rs.getDouble("cash_register_modal"));
        data.setbaseentry(rs.getInt("baseentry"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from ar_pos_open where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new ar_pos_openext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer docentry){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocentry().equals(docentry)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        ar_pos_openext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(ar_pos_openextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
