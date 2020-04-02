/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.ko.objectclasses;

import utils.CodeException;
import classinterface.NavigatorObjectInt;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;
/**
 *
 * @author Aryadanaraya
 */
public class ko_transaksi_tagihan_detail1_newext  extends ko_transaksi_tagihan_detail1ext{

    public ko_transaksi_tagihan_detail1_newext(Integer docentry) {
        this.setdocentry(docentry);
    }

    public ko_transaksi_tagihan_detail1_newext() {
        
    }

    @Override
    public Boolean update() throws CodeException {
        if (this.getlinenum().equals(0)){
            insertsts=true;
        }
        if (this.getmember_number().equalsIgnoreCase("")||!this.getselected()){
            return false;
        }
        if (insertsts){
            squery="call sp_ko_transaksi_tagihan_detail1_insert_new( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlinenum()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "

                    + "'"+this.getTotal_simpanan_info()+"', "
                    + "'"+this.getTotal_pinjaman_info()+"', "
                    + "'"+this.getToko_info()+"', "
                    + "'"+this.getSisa_tagihan_bln_seb_info()+"', "
                    + "'"+this.getTotal_tagihan_info()+"', "
                    + "'"+this.getTotal_bayar_info()+"', "
                    + "'"+this.getSisa_tagihan_info()+"', "

                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        } else {
            squery="call sp_ko_transaksi_tagihan_detail1_update_new( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlinenum()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "

                    + "'"+this.getTotal_simpanan_info()+"', "
                    + "'"+this.getTotal_pinjaman_info()+"', "
                    + "'"+this.getToko_info()+"', "
                    + "'"+this.getSisa_tagihan_bln_seb_info()+"', "
                    + "'"+this.getTotal_tagihan_info()+"', "
                    + "'"+this.getTotal_bayar_info()+"', "
                    + "'"+this.getSisa_tagihan_info()+"', "

                    + "'"+GlobalUtils.userid+"'"
                    + ")";
        }
        try {
            db.execute(squery);
            insertsts=false;
            return true;
        } catch (SQLException ex) {
            throw new CodeException(ex.getMessage());
        }
    }

    @Override
    public Boolean delete() throws CodeException {
        squery="call sp_ko_transaksi_tagihan_detail1_delete_new( "
                    + "'"+this.getdocentry()+"', "
                    + "'"+this.getlinenum()+"', "
                    + "'"+this.getyop()+"', "
                    + "'"+this.getmop()+"', "
                    + "'"+this.getmember_number()+"', "
                    + "'"+this.gettotal_tagihan()+"', "
                    + "'"+this.gettotal_bayar()+"', "
                    + "'"+this.getsisa_tagihan()+"', "



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




}
