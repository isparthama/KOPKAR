/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.gl.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.DbBean;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author solution
 */
public class proses_day_end_to_glext extends proses_day_end_to_glcls {
    DbBean db=appsettinghandler.db;
    String squery="";

    public Boolean run_process(String syop, String smop) throws SQLException{
        switch (this.getTrxno()){
            case 101:
                squery="call sp_proses_beli_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 102:
                squery="call sp_proses_beli_rtr_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 103:
                squery="call sp_proses_mlain_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 104:
                squery="call sp_proses_klain_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 105:
                squery="call sp_proses_sales_dlvry_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 107:
                squery="call sp_proses_ap_invoice_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 111:
                squery="call sp_proses_ap_receive_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 108:
                squery="call sp_proses_ap_dnote_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 109:
                squery="call sp_proses_ar_invoice_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 112:
                squery="call sp_proses_ar_receive_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 106:
                squery="call sp_proses_sales_return_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 110:
                squery="call sp_proses_ar_cnote_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 113:
                squery="call sp_proses_ar_pos_sales_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 114:
                squery="call sp_proses_ar_pos_return_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 115:
                squery="call sp_proses_ar_pos_open_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 116:
                squery="call sp_proses_ar_pos_close_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 201:
                squery="call sp_proses_str_simpan_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 202:
                squery="call sp_proses_trk_simpan_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 203:
                squery="call sp_proses_stj_pinjam_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 204:
                squery="call sp_proses_cair_pinjam_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 205:
                squery="call sp_proses_byr_pinjam_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 206:
                squery="call sp_proses_tagih_pinjam_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 207:
                squery="call sp_proses_rab_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
            case 208:
                squery="call sp_proses_bayar_toko_ke_je("+syop+","+smop+",'"+GlobalUtils.sessiondate_mysql+"','"+GlobalUtils.userid+"');";
                break;
        }
        ResultSet rs=db.executeQuery(squery);
        if (rs.next()){
            this.setNo_Process(rs.getInt("dayseqno"));
            this.setStatus(rs.getString("txtpesan"));
            return true;
        }

        return false;
    }
}
