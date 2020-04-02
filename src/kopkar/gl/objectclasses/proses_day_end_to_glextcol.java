/*
 * To change this proses_day_end_to_gl, choose Tools | Templates
 * and open the proses_day_end_to_gl in the editor.
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
public class proses_day_end_to_glextcol extends ArrayList<proses_day_end_to_glext> {
    proses_day_end_to_glext data=new proses_day_end_to_glext();
    String squery="";
    DbBean db=appsettinghandler.db;

    public void insert(){
        data= new proses_day_end_to_glext();
    }
    public proses_day_end_to_glextcol(){
        
    }

    public proses_day_end_to_glext getData() {
        return data;
    }

    public void setData(proses_day_end_to_glext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setTransfer_Data(rs.getString("trx"));
        data.setJumlah(rs.getInt("jml_entry"));
        data.setTotal(rs.getDouble("ttl_amount"));
        data.setTrxno(rs.getInt("trxno"));
        data.setStatus("");
        return true;
    }

    public void initdata(String yop, String mop) throws SQLException{
        squery="call sp_proses_day_end_to_gl_get("+yop+","+mop+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new proses_day_end_to_glext();
            if (fillme(rs)){
                this.add(data);
            }
        }
    }

    public Boolean run_process(String syop,String smop){
        try {
            for (int i=0;i<this.size();i++){
                proses_day_end_to_glext o = this.get(i);
                if (o.getPilih()){
                    o.run_process(syop, smop);
                }
            }
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(proses_day_end_to_glextcol.class.getName()).log(Level.SEVERE, null, ex);
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
