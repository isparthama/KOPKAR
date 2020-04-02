/*
 * To change this gl_transaksi_rab_detail1, choose Tools | Templates
 * and open the gl_transaksi_rab_detail1 in the editor.
 */

package kopkar.gl.objectclasses;

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
public class gl_transaksi_rab_detail1extcol extends ArrayList<gl_transaksi_rab_detail1ext> {
    gl_transaksi_rab_detail1ext data=new gl_transaksi_rab_detail1ext();
    String squery="";
    DbBean db=appsettinghandler.db;
    Integer docentry;

    public void insert(){
        data= new gl_transaksi_rab_detail1ext();
    }
    public gl_transaksi_rab_detail1extcol(Integer docentry){
        this.docentry=docentry;
    }

    public gl_transaksi_rab_detail1ext getData() {
        return data;
    }

    public void setData(gl_transaksi_rab_detail1ext data) {
        this.data = data;
    }

    private Boolean fillme(ResultSet rs) throws SQLException{
        data.setdocentry(rs.getInt("docentry"));
        data.setlinenum(rs.getInt("linenum"));
        data.setkode_rab(rs.getString("kode_rab"));
        data.setjumlah(rs.getDouble("jumlah"));
        data.setcoa_debet(rs.getString("coa_debet"));
        data.setcoa_kredit(rs.getString("coa_kredit"));
        data.setreferensi(rs.getString("referensi"));
        data.setketerangan(rs.getString("keterangan"));
        data.setclosed(rs.getString("closed"));
        data.setentrydate(rs.getString("entrydate"));
        data.setauditdate(rs.getString("auditdate"));
        data.setaudituser(rs.getString("audituser"));

        data.setnama_rab(rs.getString("nama_rab"));

        return true;
    }

    public void initdata() throws SQLException{
        squery="call sp_gl_transaksi_rab_detail1_get("+this.docentry+")";
        ResultSet rs=db.executeQuery(squery);
        while (rs.next()){
            data=new gl_transaksi_rab_detail1ext();
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
        gl_transaksi_rab_detail1ext o = this.get(row);
        try {
            return o.delete();
        } catch (CodeException ex) {
            Logger.getLogger(gl_transaksi_rab_detail1extcol.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
