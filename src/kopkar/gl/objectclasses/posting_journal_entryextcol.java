/*
 * To change this posting_journal_entry, choose Tools | Templates
 * and open the posting_journal_entry in the editor.
 */

package kopkar.gl.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class posting_journal_entryextcol extends ArrayList<posting_journal_entryext> {
    posting_journal_entryext data=new posting_journal_entryext();
    String squery="";
    DbBean db=appsettinghandler.db;

    public void insert(){
        data= new posting_journal_entryext();
    }
    public posting_journal_entryextcol(){
        
    }

    public posting_journal_entryext getData() {
        return data;
    }

    public void setData(posting_journal_entryext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setTransfer_Data(rs.getString("trx"));
        data.setJumlah(rs.getInt("jml_entry"));
        data.setTotal(rs.getDouble("ttl_amount"));
        data.setTrxno(1);
        data.setStatus("");
        return true;
    }

    public void initdata(String yop, String mop) throws SQLException{
        squery="call sp_proses_posting_JE_get("+yop+","+mop+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new posting_journal_entryext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Boolean run_process(String syop,String smop){
        try {
            for (int i=0;i<this.size();i++){
                posting_journal_entryext o = this.get(i);
                if (o.getPilih()){
                    o.run_process(syop, smop);
                }
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(posting_journal_entryextcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public Integer find(Integer docentry){
        
        return -1;
    }

    public Boolean delete(int row) {
        
        return false;
    }
}
