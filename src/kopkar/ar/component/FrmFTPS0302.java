/*
 * From op_salesman
 *
 * Created on June 29, 2007, 2:00 PM
 * 
 * 
 * How to Call this Form on FrmMainFrame
 * Sample : 
 *    
 * import common.component.FrmCompany;
 * 
 * .......
 * 
 * 
 * FrmCompany frmCompany;
 * 
 * .......
 * 
 try {
        if (frmCompany == null) {
            frmmCompany = new FrmCompany(this);
        }
        
        showForm(frmCompany);
        
    }catch(Exception e) {
        e.printStackTrace();
    }
 * 
 */

package kopkar.ar.component;


import kopkar.ap.component.*;
import classinterface.NavigatorFormInt;
import common.component.FrmMainFrame;
import java.util.HashMap;
import java.util.Map;
import jdbc.DbBean;
import kopkar.utils.browsecontroller;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import utils.CodeException;
import utils.GlobalUtils;
import utils.appsettinghandler;

/**
 *
 * @author  Generator
 */

public class FrmFTPS0302 extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 1;
    public static String CLASSNAME="Frmrp_purchase_order";
    browsecontroller obrowse=new browsecontroller();
    JasperPrint jasperPrint;
    JasperReport jasperReport;
    DbBean db=appsettinghandler.db;
    String status="";
    String type="0";



    FrmMainFrame mf ;

   
    /** Creates new form Area */
    public FrmFTPS0302() throws CodeException {
        initComponents();

    }
    
    public FrmFTPS0302(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
    }
     
       
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jbtnBrowse = new javax.swing.JButton();
        jlblsalesman_code = new javax.swing.JLabel();
        jtxtdocument_number_fr = new javax.swing.JTextField();
        jtxtdocument_number_to = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jlblsalesman_code1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        joptprint_type12 = new javax.swing.JRadioButton();
        joptprint_type14 = new javax.swing.JRadioButton();
        joptprint_typekg = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jlblsalesman_code4 = new javax.swing.JLabel();
        jlblsalesman_code3 = new javax.swing.JLabel();
        kzodocument_date_fr = new org.kazao.calendar.KazaoCalendarDate();
        kzodocument_date_to = new org.kazao.calendar.KazaoCalendarDate();
        jPanel4 = new javax.swing.JPanel();
        joptpayment_salary_status_semua = new javax.swing.JRadioButton();
        joptpayment_salary_status_tunai = new javax.swing.JRadioButton();
        joptpayment_salary_status_potonggaji = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pos Sales Form/Struk");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jHeader.setBackground(new java.awt.Color(102, 102, 102));
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Pos Sales Form/Struk");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(30, 30, 200, 20);

        HorizontalLine.setForeground(new java.awt.Color(102, 102, 102));
        HorizontalLine.setAlignmentX(0.0F);
        HorizontalLine.setAlignmentY(0.0F);
        getContentPane().add(HorizontalLine);
        HorizontalLine.setBounds(160, 50, 650, 6);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 50, 6, 400);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nomor Dokumen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        jPanel1.setLayout(null);

        jbtnBrowse.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBrowse);
        jbtnBrowse.setBounds(250, 20, 30, 17);

        jlblsalesman_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code.setText("Sampai");
        jPanel1.add(jlblsalesman_code);
        jlblsalesman_code.setBounds(30, 40, 120, 20);

        jtxtdocument_number_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        jPanel1.add(jtxtdocument_number_fr);
        jtxtdocument_number_fr.setBounds(150, 20, 90, 23);

        jtxtdocument_number_to.setFont(new java.awt.Font("Dialog", 0, 10));
        jPanel1.add(jtxtdocument_number_to);
        jtxtdocument_number_to.setBounds(150, 40, 90, 23);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBrowse1);
        jbtnBrowse1.setBounds(250, 40, 30, 17);

        jlblsalesman_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code1.setText("Dari");
        jPanel1.add(jlblsalesman_code1);
        jlblsalesman_code1.setBounds(30, 20, 120, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 160, 640, 80);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Model Cetak", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        jPanel2.setLayout(null);

        buttonGroup2.add(joptprint_type12);
        joptprint_type12.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        joptprint_type12.setSelected(true);
        joptprint_type12.setText("1/2 Kertas A4");
        joptprint_type12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joptprint_type12ActionPerformed(evt);
            }
        });
        jPanel2.add(joptprint_type12);
        joptprint_type12.setBounds(30, 30, 110, 24);

        buttonGroup2.add(joptprint_type14);
        joptprint_type14.setFont(new java.awt.Font("Dialog", 1, 10));
        joptprint_type14.setText("1/4 Kertas A4");
        joptprint_type14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joptprint_type14ActionPerformed(evt);
            }
        });
        jPanel2.add(joptprint_type14);
        joptprint_type14.setBounds(140, 30, 140, 23);

        buttonGroup2.add(joptprint_typekg);
        joptprint_typekg.setFont(new java.awt.Font("Dialog", 1, 10));
        joptprint_typekg.setText("Kertas Gulung");
        joptprint_typekg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joptprint_typekgActionPerformed(evt);
            }
        });
        jPanel2.add(joptprint_typekg);
        joptprint_typekg.setBounds(290, 30, 114, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 320, 640, 80);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal Transaksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        jPanel3.setLayout(null);

        jlblsalesman_code4.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code4.setText("Sampai");
        jPanel3.add(jlblsalesman_code4);
        jlblsalesman_code4.setBounds(30, 40, 120, 20);

        jlblsalesman_code3.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code3.setText("Dari");
        jPanel3.add(jlblsalesman_code3);
        jlblsalesman_code3.setBounds(30, 20, 120, 20);

        kzodocument_date_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setOpaque(false);
        jPanel3.add(kzodocument_date_fr);
        kzodocument_date_fr.setBounds(150, 20, 120, 20);

        kzodocument_date_to.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setOpaque(false);
        jPanel3.add(kzodocument_date_to);
        kzodocument_date_to.setBounds(150, 40, 120, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(60, 80, 640, 80);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipe Bayar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        jPanel4.setLayout(null);

        buttonGroup1.add(joptpayment_salary_status_semua);
        joptpayment_salary_status_semua.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        joptpayment_salary_status_semua.setSelected(true);
        joptpayment_salary_status_semua.setText("Semua");
        joptpayment_salary_status_semua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joptpayment_salary_status_semuaActionPerformed(evt);
            }
        });
        jPanel4.add(joptpayment_salary_status_semua);
        joptpayment_salary_status_semua.setBounds(30, 30, 65, 24);

        buttonGroup1.add(joptpayment_salary_status_tunai);
        joptpayment_salary_status_tunai.setFont(new java.awt.Font("Dialog", 1, 10));
        joptpayment_salary_status_tunai.setText("Tunai");
        joptpayment_salary_status_tunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joptpayment_salary_status_tunaiActionPerformed(evt);
            }
        });
        jPanel4.add(joptpayment_salary_status_tunai);
        joptpayment_salary_status_tunai.setBounds(140, 30, 60, 23);

        buttonGroup1.add(joptpayment_salary_status_potonggaji);
        joptpayment_salary_status_potonggaji.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        joptpayment_salary_status_potonggaji.setText("Potong Gaji");
        joptpayment_salary_status_potonggaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joptpayment_salary_status_potonggajiActionPerformed(evt);
            }
        });
        jPanel4.add(joptpayment_salary_status_potonggaji);
        joptpayment_salary_status_potonggaji.setBounds(290, 30, 114, 23);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(60, 240, 640, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         try {
            moveFirst();

         } catch (CodeException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formInternalFrameOpened

private void kdatePurchaseDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kdatePurchaseDateFocusLost

}//GEN-LAST:event_kdatePurchaseDateFocusLost

private void kdatePurchaseDateCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_kdatePurchaseDateCaretPositionChanged

}//GEN-LAST:event_kdatePurchaseDateCaretPositionChanged

private void kdatePurchaseDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_kdatePurchaseDatePropertyChange

}//GEN-LAST:event_kdatePurchaseDatePropertyChange

private void jbtnBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse1ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ar_pos_sales, "", jtxtdocument_number_to);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void joptpayment_salary_status_semuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joptpayment_salary_status_semuaActionPerformed
    // TODO add your handling code here:
    if(joptpayment_salary_status_semua.isSelected()){
        status="A";
    }
}//GEN-LAST:event_joptpayment_salary_status_semuaActionPerformed

private void joptpayment_salary_status_tunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joptpayment_salary_status_tunaiActionPerformed
    // TODO add your handling code here:
    if(joptpayment_salary_status_tunai.isSelected()){
        status="O";
    }
}//GEN-LAST:event_joptpayment_salary_status_tunaiActionPerformed

private void joptpayment_salary_status_potonggajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joptpayment_salary_status_potonggajiActionPerformed
    // TODO add your handling code here:
    if(joptpayment_salary_status_potonggaji.isSelected()){
        status="C";
    }
}//GEN-LAST:event_joptpayment_salary_status_potonggajiActionPerformed

private void joptprint_type12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joptprint_type12ActionPerformed
    // TODO add your handling code here:
    if(joptprint_type12.isSelected()){
        type="0";
    }
}//GEN-LAST:event_joptprint_type12ActionPerformed

private void joptprint_type14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joptprint_type14ActionPerformed
    // TODO add your handling code here:
    if(joptprint_type14.isSelected()){
        type="2";
    }
}//GEN-LAST:event_joptprint_type14ActionPerformed

private void joptprint_typekgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joptprint_typekgActionPerformed
    // TODO add your handling code here:
    if(joptprint_typekg.isSelected()){
        type="1";
    }
}//GEN-LAST:event_joptprint_typekgActionPerformed
                                     
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    obrowse.showbrowser(obrowse.ar_pos_sales, "", jtxtdocument_number_fr);
}                                                                                 

    public void execute() throws CodeException {

        String rptFile="FTPS-03-01a.jrxml";
        String file ="";
        Map parameter = new HashMap();
        
        parameter.put("document_date_fr", GlobalUtils.formatDate(kzodocument_date_fr.getDate(),"yyyy-MM-dd"));
        parameter.put("document_date_to", GlobalUtils.formatDate(kzodocument_date_to.getDate(),"yyyy-MM-dd"));

        parameter.put("document_number_fr", jtxtdocument_number_fr.getText());
        parameter.put("document_number_to", jtxtdocument_number_to.getText());
        String payment_salary_status="A";
        if (joptpayment_salary_status_tunai.isSelected()){
            payment_salary_status="N";
        }
        if (joptpayment_salary_status_potonggaji.isSelected()){
            payment_salary_status="Y";
        }

        parameter.put("payment_salary_status", payment_salary_status);
        String print_type="1";

        if (joptprint_type14.isSelected()){
            print_type="2";
            rptFile="FTPS-03-02a.jrxml";
        }
        if (joptprint_typekg.isSelected()){
            print_type="3";
            rptFile="FTPS-03-03a.jrxml";
        }

        parameter.put("audituser", (GlobalUtils.getUserId()));


        // Versi 1
        
        if(GlobalUtils.getAppDir()){
            try{
            file = GlobalUtils.getCurrentDir() +"/Reports/"+rptFile;
            jasperReport = JasperCompileManager.compileReport(file);
            //System.out.println("file: "+file);
            System.out.println("isi parameter"+parameter);
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, db.getConnection());
            JasperViewer.viewReport(jasperPrint, false);
    }catch (Exception e) {
        e.printStackTrace();
    }
        }
        // Versi 2
        /*
        String file ="";
        if(GlobalUtils.getAppDir()){
            file = GlobalUtils.getCurrentDir() +"/Reports/ap_supplier.jrxml";
            GlobalUtils.printReport(file, parameter, false);
            System.out.println("file: "+file);
            System.out.println("isi parameter FAR-06:"+parameter);
        }
         *
         */



    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmFTPS0302().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JLabel jlblsalesman_code;
    private javax.swing.JLabel jlblsalesman_code1;
    private javax.swing.JLabel jlblsalesman_code3;
    private javax.swing.JLabel jlblsalesman_code4;
    private javax.swing.JRadioButton joptpayment_salary_status_potonggaji;
    private javax.swing.JRadioButton joptpayment_salary_status_semua;
    private javax.swing.JRadioButton joptpayment_salary_status_tunai;
    private javax.swing.JRadioButton joptprint_type12;
    private javax.swing.JRadioButton joptprint_type14;
    private javax.swing.JRadioButton joptprint_typekg;
    private javax.swing.JTextField jtxtdocument_number_fr;
    private javax.swing.JTextField jtxtdocument_number_to;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_fr;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_to;
    // End of variables declaration//GEN-END:variables

 

    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);

        if (istatus==1){
            jbtnBrowse.setEnabled(false);
        } else {
            jbtnBrowse.setEnabled(true);
        }
    }

    public void delete() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void moveFirst() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void movePrevious() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void moveNext() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void moveLast() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void newData() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void saveData() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void printData() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void showData() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setData() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void undo() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void searchData() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void importCsv() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void exportCsv() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void importText() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void exportText() throws CodeException {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
