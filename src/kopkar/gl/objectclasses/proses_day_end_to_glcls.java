/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.gl.objectclasses;

/**
 *
 * @author solution
 */
public class proses_day_end_to_glcls {
    private Boolean Pilih=false;
    private String Transfer_Data = "";
    private Integer Jumlah = 0;
    private Double Total = new Double(0);
    private Integer No_Process = 0;
    private String Status = "";
    private Integer trxno=0;

    /**
     * @return the Pilih
     */
    public Boolean getPilih() {
        return Pilih;
    }

    /**
     * @param Pilih the Pilih to set
     */
    public void setPilih(Boolean Pilih) {
        this.Pilih = Pilih;
    }

    /**
     * @return the Transfer_Data
     */
    public String getTransfer_Data() {
        return Transfer_Data;
    }

    /**
     * @param Transfer_Data the Transfer_Data to set
     */
    public void setTransfer_Data(String Transfer_Data) {
        this.Transfer_Data = Transfer_Data;
    }

    /**
     * @return the Jumlah
     */
    public Integer getJumlah() {
        return Jumlah;
    }

    /**
     * @param Jumlah the Jumlah to set
     */
    public void setJumlah(Integer Jumlah) {
        this.Jumlah = Jumlah;
    }

    /**
     * @return the Total
     */
    public Double getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(Double Total) {
        this.Total = Total;
    }

    /**
     * @return the No_Process
     */
    public Integer getNo_Process() {
        return No_Process;
    }

    /**
     * @param No_Process the No_Process to set
     */
    public void setNo_Process(Integer No_Process) {
        this.No_Process = No_Process;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the trxno
     */
    public Integer getTrxno() {
        return trxno;
    }

    /**
     * @param trxno the trxno to set
     */
    public void setTrxno(Integer trxno) {
        this.trxno = trxno;
    }
}
