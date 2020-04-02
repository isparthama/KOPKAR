/*
 * To change this in_so_sheet, choose Tools | Templates
 * and open the in_so_sheet in the editor.
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
public class in_so_sheetextcol extends ArrayList<in_so_sheetext> {
    in_so_sheetext data=new in_so_sheetext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer id;

    public void insert(){
        data= new in_so_sheetext();
    }
    public in_so_sheetextcol(Integer id){
        this.id=id;
    }

    public in_so_sheetext getData() {
        return data;
    }

    public void setData(in_so_sheetext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setdocument_number(rs.getString("document_number"));
        data.setdocument_status(rs.getString("document_status"));
        data.setcomplete_status(rs.getString("complete_status"));
        data.setdocument_date(rs.getString("document_date"));
        data.setbrand_code_fr(rs.getString("brand_code_fr"));
        data.setbrand_code_to(rs.getString("brand_code_to"));
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
        squery="select * from in_so_sheet where id="+this.id;
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new in_so_sheetext();
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
        in_so_sheetext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(in_so_sheetextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
