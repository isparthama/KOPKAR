/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package common.objectclasses.extended;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class Mastergroupdetailcols extends ArrayList<MastergroupdetailExt>{
    String kodegroup;
    MastergroupdetailExt data;

    DbBean db=appsettinghandler.dbcom;
    
    Mastergroupdetailcols(String kodegroup) {
        this.kodegroup=kodegroup;
    }

    public Mastergroupdetailcols() {
        
    }

    public Boolean fillme(ResultSet rs) throws SQLException{
        data.setId(rs.getInt("id"));
        data.setKodeGroup(rs.getString("KodeGroup"));
        data.setModule(rs.getString("Module"));
        data.setCompany(rs.getString("Company"));
        data.setRead(rs.getInt("Read"));
        data.setConfirm(rs.getInt("Confirm"));
        data.setEntry(rs.getInt("Entry"));
        data.setUpdate(rs.getInt("Update"));
        data.setDelete(rs.getInt("Delete"));
        data.setPrint(rs.getInt("Print"));
        data.setExport(rs.getInt("Export"));
        data.setImport1(rs.getInt("Import"));
        data.setTanggalEntry(rs.getDate("TanggalEntry"));
        data.setTanggalUpdate(rs.getDate("TanggalUpdate"));
        data.setUserId(rs.getString("UserId"));

        data.setModulename(rs.getString("modulename"));
        return true;
    }
    public Boolean initdata(String company){
        try {
            String squery="select m.description as modulename,x.* from "+
                        "mastermodule m left outer join "+
                        "(select * from mastergroupdetail  where company='"+company+"' and kodegroup='"+this.kodegroup+"') as x "+
                        "on m.module=x.module";
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                data=new MastergroupdetailExt();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mastergroupdetailcols.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public Boolean initdata(String userid, String company) {
        String squery="select m.description as modulename,gd.* "
                + "from masteruserdetail mu inner join mastergroupdetail gd on "
                + "mu.KodeGroup=gd.KodeGroup and gd.Company='"+company+"' inner join mastermodule m on m.module=gd.module "
                + "where user='"+userid+"'";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                data=new MastergroupdetailExt();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mastergroupdetailcols.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean initdataAll(String kodegroup, String company) {
        String squery="call sp_mastergroupdetail_get_all('"+kodegroup+"','"+company+"')";
        try {
            ResultSet rs = db.executeQuery(squery);
            while (rs.next()){
                data=new MastergroupdetailExt();
                if (fillme(rs)){
                    this.add(data);
                }
            }
            if (this.size()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mastergroupdetailcols.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
