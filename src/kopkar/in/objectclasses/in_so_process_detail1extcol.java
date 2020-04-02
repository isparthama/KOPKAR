/*
 * To change this in_so_process_detail1, choose Tools | Templates
 * and open the in_so_process_detail1 in the editor.
 */

package kopkar.in.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class in_so_process_detail1extcol extends ArrayList<in_so_process_detail1ext> {
    in_so_process_detail1ext data=new in_so_process_detail1ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_so_process_detail1ext();
    }
    public in_so_process_detail1extcol(Integer id){
        this.id=id;
    }

    public in_so_process_detail1ext getData() {
        return data;
    }

    public void setData(in_so_process_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setpilih(rs.getInt("pilih"));
        data.setdocentry(rs.getInt("docentry"));
        data.setline_number(rs.getInt("line_number"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_date(rs.getString("document_date"));
        data.setreference(rs.getString("reference"));
        data.setdscription(rs.getString("dscription"));
        data.settotal_so_qty(rs.getInt("total_so_qty"));
        data.settotal_adm_qty(rs.getInt("total_adm_qty"));
        data.setadjustment_no(rs.getString("adjustment_no"));
        data.setadjustment_status(rs.getString("adjustment_status"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setobjtype(rs.getInt("objtype"));
        data.setaudituser(rs.getString("audituser"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_in_so_process_detail1_get("+this.id+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_so_process_detail1ext();
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
        in_so_process_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_so_process_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    boolean retrievedata(String datefr, String dateto) throws CodeException {
        try {
            datefr=GlobalUtils.formatDate(datefr, "yyyy-MM-dd");
            dateto=GlobalUtils.formatDate(dateto, "yyyy-MM-dd");
            ResultSet rs = db.executeQuery("call sp_in_so_process_detail1_get_new('"+datefr+"','"+dateto+"')");
            while (rs.next()){
                data=new in_so_process_detail1ext();
                data.setstatus(in_so_process_detail1ext.Status_Insert);
                data.setpilih(rs.getInt("pilih"));
                data.setdocentry(rs.getInt("docentry"));
                data.setline_number(rs.getInt("line_number"));
                data.setdocument_number(rs.getString("document_number"));
                data.setdocument_date(rs.getString("document_date"));
                data.setdscription(rs.getString("dscription"));
                data.settotal_so_qty(rs.getInt("total_so_qty"));
                data.settotal_adm_qty(rs.getInt("total_adm_qty"));
                this.add(data);
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(in_so_process_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}
