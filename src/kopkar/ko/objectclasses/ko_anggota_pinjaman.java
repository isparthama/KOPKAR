/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.ko.objectclasses;

/**
 *
 * @author solution
 */
public class ko_anggota_pinjaman {
        private String document_number="";
    private Double jumlah_pinjaman = new Double(0);
    private Double jumlah_angsuran = new Double(0);
    Double total_pokok_akhir=new Double(0);
    Double total_bunga_akhir=new Double(0);
    private Double total_pokok_bunga_akhir = new Double(0);
    private Double angsuranke = new Double(0);
    private Double sisa_angsuranke = new Double(0);

    /**
     * @return the document_number
     */
    public String getDocument_number() {
        return document_number;
    }

    /**
     * @param document_number the document_number to set
     */
    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    /**
     * @return the jumlah_pinjaman
     */
    public Double getJumlah_pinjaman() {
        return jumlah_pinjaman;
    }

    /**
     * @param jumlah_pinjaman the jumlah_pinjaman to set
     */
    public void setJumlah_pinjaman(Double jumlah_pinjaman) {
        this.jumlah_pinjaman = jumlah_pinjaman;
    }

    /**
     * @return the jumlah_angsuran
     */
    public Double getJumlah_angsuran() {
        return jumlah_angsuran;
    }

    /**
     * @param jumlah_angsuran the jumlah_angsuran to set
     */
    public void setJumlah_angsuran(Double jumlah_angsuran) {
        this.jumlah_angsuran = jumlah_angsuran;
    }

    /**
     * @return the total_pokok_bunga_akhir
     */
    public Double getTotal_pokok_bunga_akhir() {
        return total_pokok_bunga_akhir;
    }

    /**
     * @param total_pokok_bunga_akhir the total_pokok_bunga_akhir to set
     */
    public void setTotal_pokok_bunga_akhir(Double total_pokok_bunga_akhir) {
        this.total_pokok_bunga_akhir = total_pokok_bunga_akhir;
    }

    public Double getTotal_bunga_akhir() {
        return total_bunga_akhir;
    }

    public void setTotal_bunga_akhir(Double total_bunga_akhir) {
        this.total_bunga_akhir = total_bunga_akhir;
    }

    public Double getTotal_pokok_akhir() {
        return total_pokok_akhir;
    }

    public void setTotal_pokok_akhir(Double total_pokok_akhir) {
        this.total_pokok_akhir = total_pokok_akhir;
    }

    
    /**
     * @return the angsuranke
     */
    public Double getAngsuranke() {
        return angsuranke;
    }

    /**
     * @param angsuranke the angsuranke to set
     */
    public void setAngsuranke(Double angsuranke) {
        this.angsuranke = angsuranke;
    }

    /**
     * @return the sisa_angsuranke
     */
    public Double getSisa_angsuranke() {
        return sisa_angsuranke;
    }

    /**
     * @param sisa_angsuranke the sisa_angsuranke to set
     */
    public void setSisa_angsuranke(Double sisa_angsuranke) {
        this.sisa_angsuranke = sisa_angsuranke;
    }
}
