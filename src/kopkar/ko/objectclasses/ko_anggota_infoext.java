/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.ko.objectclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.CodeException;

/**
 *
 * @author solution
 */
public class ko_anggota_infoext extends ko_anggotaext{
    private Double simpanan_info_wajib=new Double(0);
    private Double simpanan_info_pokok = new Double(0);
    private Double simpanan_info_sukarela = new Double(0);
    private Double simpanan_info_khusus = new Double(0);
    private Double pinjaman_info = new Double(0);
    private ko_anggota_pinjamancol info_pinjaman=new ko_anggota_pinjamancol("");

    @Override
    public Boolean initdata(String member_number) throws CodeException {
        if (super.initdata(member_number)){
            initdata_simpanan();
            return true;
        }
        return false;
    }


    @Override
    public Boolean moveFirst() throws CodeException {
        if (super.moveFirst()){
            initdata_simpanan();
            return true;
        }
        return false;
    }

    @Override
    public Boolean movePrevious() throws CodeException {
        if (super.movePrevious()){
            initdata_simpanan();
            return true;
        }
        return false;
    }

    @Override
    public Boolean moveNext() throws CodeException {
        if (super.moveNext()){
            initdata_simpanan();
            return true;
        }
        return false;
    }

    @Override
    public Boolean moveLast() throws CodeException {
        if (super.moveLast()){
            initdata_simpanan();
            return true;
        }
        return false;
    }




    private boolean initdata_simpanan() {
        try {
            squery="call sp_ko_anggota_simpanan_get ('"+this.getmember_number()+"')";
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_anggota_infoext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean fillme(ResultSet rs) throws SQLException {
        this.setSimpanan_info_wajib(rs.getDouble("simpanan_wajib"));
        this.setSimpanan_info_pokok(rs.getDouble("simpanan_pokok"));
        this.setSimpanan_info_sukarela(rs.getDouble("simpanan_sukarela"));
        this.setSimpanan_info_khusus(rs.getDouble("simpanan_khusus"));
        this.setPinjaman_info(rs.getDouble("pinjaman"));

        info_pinjaman=new ko_anggota_pinjamancol(this.getmember_number());
        info_pinjaman.initdata();
        return true;
    }

    /**
     * @return the simpanan_info_wajib
     */
    public Double getSimpanan_info_wajib() {
        return simpanan_info_wajib;
    }

    /**
     * @param simpanan_info_wajib the simpanan_info_wajib to set
     */
    public void setSimpanan_info_wajib(Double simpanan_info_wajib) {
        this.simpanan_info_wajib = simpanan_info_wajib;
    }

    /**
     * @return the simpanan_info_pokok
     */
    public Double getSimpanan_info_pokok() {
        return simpanan_info_pokok;
    }

    /**
     * @param simpanan_info_pokok the simpanan_info_pokok to set
     */
    public void setSimpanan_info_pokok(Double simpanan_info_pokok) {
        this.simpanan_info_pokok = simpanan_info_pokok;
    }

    /**
     * @return the simpanan_info_sukarela
     */
    public Double getSimpanan_info_sukarela() {
        return simpanan_info_sukarela;
    }

    /**
     * @param simpanan_info_sukarela the simpanan_info_sukarela to set
     */
    public void setSimpanan_info_sukarela(Double simpanan_info_sukarela) {
        this.simpanan_info_sukarela = simpanan_info_sukarela;
    }

    /**
     * @return the simpanan_info_khusus
     */
    public Double getSimpanan_info_khusus() {
        return simpanan_info_khusus;
    }

    /**
     * @param simpanan_info_khusus the simpanan_info_khusus to set
     */
    public void setSimpanan_info_khusus(Double simpanan_info_khusus) {
        this.simpanan_info_khusus = simpanan_info_khusus;
    }

    /**
     * @return the pinjaman_info
     */
    public Double getPinjaman_info() {
        return pinjaman_info;
    }

    /**
     * @param pinjaman_info the pinjaman_info to set
     */
    public void setPinjaman_info(Double pinjaman_info) {
        this.pinjaman_info = pinjaman_info;
    }

    public ko_anggota_pinjamancol getinfo_pinjaman() {
        return this.info_pinjaman;
    }
    

}
