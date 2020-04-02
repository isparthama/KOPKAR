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
public class ko_transaksi_setuju_detailext extends ko_transaksi_setujuext{
    private Double jml_bayar_angsuran=new Double(0);
    private Double jml_bayar_potongan = new Double(0);
    private Double saldo_awal_pokok = new Double(0);
    private Double saldo_awal_bunga = new Double(0);
    private Double saldo_awal_pokok_bunga = new Double(0);
    private Double angsuran_pokok = new Double(0);
    private Double angsuran_bunga = new Double(0);
    private Double angsuran_pokok_bunga = new Double(0);
    private Double saldo_akhir_pokok = new Double(0);
    private Double saldo_akhir_bunga = new Double(0);
    private Double saldo_akhir_pokok_bunga = new Double(0);

    public Boolean initdata(String document_number,String pelunasan) throws CodeException {
        try {
            squery="call sp_ko_transaksi_bayar_get_angsur('"+document_number+"','"+pelunasan+"')";
            ResultSet rs = db.executeQuery(squery);
            if (rs.next()){
                if (fillme(rs)){
                    return true;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ko_transaksi_setuju_detailext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }


    /**
     * @return the jml_bayar_angsuran
     */
    public Double getJml_bayar_angsuran() {
        return jml_bayar_angsuran;
    }

    /**
     * @param jml_bayar_angsuran the jml_bayar_angsuran to set
     */
    public void setJml_bayar_angsuran(Double jml_bayar_angsuran) {
        this.jml_bayar_angsuran = jml_bayar_angsuran;
    }

    /**
     * @return the jml_bayar_potongan
     */
    public Double getJml_bayar_potongan() {
        return jml_bayar_potongan;
    }

    /**
     * @param jml_bayar_potongan the jml_bayar_potongan to set
     */
    public void setJml_bayar_potongan(Double jml_bayar_potongan) {
        this.jml_bayar_potongan = jml_bayar_potongan;
    }

    /**
     * @return the saldo_awal_pokok
     */
    public Double getSaldo_awal_pokok() {
        return saldo_awal_pokok;
    }

    /**
     * @param saldo_awal_pokok the saldo_awal_pokok to set
     */
    public void setSaldo_awal_pokok(Double saldo_awal_pokok) {
        this.saldo_awal_pokok = saldo_awal_pokok;
    }

    /**
     * @return the saldo_awal_bunga
     */
    public Double getSaldo_awal_bunga() {
        return saldo_awal_bunga;
    }

    /**
     * @param saldo_awal_bunga the saldo_awal_bunga to set
     */
    public void setSaldo_awal_bunga(Double saldo_awal_bunga) {
        this.saldo_awal_bunga = saldo_awal_bunga;
    }

    /**
     * @return the saldo_awal_pokok_bunga
     */
    public Double getSaldo_awal_pokok_bunga() {
        return saldo_awal_pokok_bunga;
    }

    /**
     * @param saldo_awal_pokok_bunga the saldo_awal_pokok_bunga to set
     */
    public void setSaldo_awal_pokok_bunga(Double saldo_awal_pokok_bunga) {
        this.saldo_awal_pokok_bunga = saldo_awal_pokok_bunga;
    }

    /**
     * @return the angsuran_pokok
     */
    public Double getAngsuran_pokok() {
        return angsuran_pokok;
    }

    /**
     * @param angsuran_pokok the angsuran_pokok to set
     */
    public void setAngsuran_pokok(Double angsuran_pokok) {
        this.angsuran_pokok = angsuran_pokok;
    }

    /**
     * @return the angsuran_bunga
     */
    public Double getAngsuran_bunga() {
        return angsuran_bunga;
    }

    /**
     * @param angsuran_bunga the angsuran_bunga to set
     */
    public void setAngsuran_bunga(Double angsuran_bunga) {
        this.angsuran_bunga = angsuran_bunga;
    }

    /**
     * @return the angsuran_pokok_bunga
     */
    public Double getAngsuran_pokok_bunga() {
        return angsuran_pokok_bunga;
    }

    /**
     * @param angsuran_pokok_bunga the angsuran_pokok_bunga to set
     */
    public void setAngsuran_pokok_bunga(Double angsuran_pokok_bunga) {
        this.angsuran_pokok_bunga = angsuran_pokok_bunga;
    }

    /**
     * @return the saldo_akhir_pokok
     */
    public Double getSaldo_akhir_pokok() {
        return saldo_akhir_pokok;
    }

    /**
     * @param saldo_akhir_pokok the saldo_akhir_pokok to set
     */
    public void setSaldo_akhir_pokok(Double saldo_akhir_pokok) {
        this.saldo_akhir_pokok = saldo_akhir_pokok;
    }

    /**
     * @return the saldo_akhir_bunga
     */
    public Double getSaldo_akhir_bunga() {
        return saldo_akhir_bunga;
    }

    /**
     * @param saldo_akhir_bunga the saldo_akhir_bunga to set
     */
    public void setSaldo_akhir_bunga(Double saldo_akhir_bunga) {
        this.saldo_akhir_bunga = saldo_akhir_bunga;
    }

    /**
     * @return the saldo_akhir_pokok_bunga
     */
    public Double getSaldo_akhir_pokok_bunga() {
        return saldo_akhir_pokok_bunga;
    }

    /**
     * @param saldo_akhir_pokok_bunga the saldo_akhir_pokok_bunga to set
     */
    public void setSaldo_akhir_pokok_bunga(Double saldo_akhir_pokok_bunga) {
        this.saldo_akhir_pokok_bunga = saldo_akhir_pokok_bunga;
    }

    private boolean fillme(ResultSet rs) throws SQLException {
        this.setkode_pinjaman(rs.getString("kode_pinjaman"));
        this.setNama_pinjaman(rs.getString("nama_pinjaman"));
        this.setsuku_bunga(rs.getDouble("suku_bunga"));
        this.sethitung_bunga(rs.getString("hitung_bunga"));
        this.setjumlah_angsuran(rs.getDouble("jumlah_angsuran"));
        this.setjangka_waktu(rs.getInt("jangka_waktu"));
        this.setsatuan_waktu(rs.getString("satuan_waktu"));
        this.setyop_start(rs.getInt("yop_start"));
        this.setmop_start(rs.getInt("mop_start"));
        this.setdop_tagih(rs.getInt("dop_tagih"));
        this.settgl_cair(rs.getString("tgl_cair"));
        this.setjumlah_pinjaman(rs.getDouble("jumlah_pinjaman"));
        this.setjumlah_bunga(rs.getDouble("jumlah_bunga"));
        this.setjumlah_pokok_bunga(rs.getDouble("jumlah_pokok_bunga"));
        this.setangsuranke(rs.getInt("angsuranke"));
        this.setsisa_angsuranke(rs.getInt("sisa_angsuranke"));
        this.setJml_bayar_angsuran(rs.getDouble("jml_bayar_angsuran"));
        this.setJml_bayar_potongan(rs.getDouble("jml_bayar_potongan"));
        this.setSaldo_awal_pokok(rs.getDouble("saldo_awal_pokok"));
        this.setSaldo_awal_bunga(rs.getDouble("saldo_awal_bunga"));
        this.setSaldo_awal_pokok_bunga(rs.getDouble("saldo_awal_pokok_bunga"));
        this.setAngsuran_pokok(rs.getDouble("angsuran_pokok"));
        this.setAngsuran_bunga(rs.getDouble("angsuran_bunga"));
        this.setAngsuran_pokok_bunga(rs.getDouble("angsuran_pokok_bunga"));
        this.setSaldo_akhir_pokok(rs.getDouble("saldo_akhir_pokok"));
        this.setSaldo_akhir_bunga(rs.getDouble("saldo_akhir_bunga"));
        this.setSaldo_akhir_pokok_bunga(rs.getDouble("saldo_akhir_pokok_bunga"));
        return true;
    }



}
