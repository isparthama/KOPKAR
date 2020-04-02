/*
 * To change this in_so_process, choose Tools | Templates
 * and open the in_so_process in the editor.
 */

package kopkar.in.objectclasses;

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
public class in_so_processextcol extends ArrayList<in_so_processext> {
    in_so_processext data=new in_so_processext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_so_processext();
    }
    public in_so_processextcol(Integer id){
        this.id=id;
    }

    public in_so_processext getData() {
        return data;
    }

    public void setData(in_so_processext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setreference_number(rs.getString("reference_number"));
        data.setdocument_date_fr(rs.getString("document_date_fr"));
        data.setdocument_date_to(rs.getString("document_date_to"));
        data.setwarehouse_code(rs.getString("warehouse_code"));
        data.setemployee(rs.getString("employee"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
        data.settotal_so_qty(rs.getInt("total_so_qty"));
        data.settotal_adm_qty(rs.getInt("total_adm_qty"));
        data.setadjustment_no(rs.getInt("adjustment_no"));
        data.setadjustment_date(rs.getString("adjustment_date"));
        data.setadjustment_user(rs.getString("adjustment_user"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setobjtype(rs.getInt("objtype"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="select * from in_so_process where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_so_processext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Integer find(Integer document_number){
        int i=0;
        for (i=0;i<this.size();i++){
            if (this.get(i).getdocument_number().equals(document_number)){
                return i;
            }
        }
        return -1;
    }

    public Boolean delete(int row) {
        in_so_processext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_so_processextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
