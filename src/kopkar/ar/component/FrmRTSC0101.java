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
import common.component.FrmMainFrame;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.DbBean;
import kopkar.ar.objectclasses.ar_customerext;
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

public class FrmRTSC0101 extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 1;
    public static String CLASSNAME="FrmRTPS03";
    browsecontroller obrowse=new browsecontroller();
    JasperPrint jasperPrint;
    JasperReport jasperReport;
    DbBean db=appsettinghandler.db;
    String status="";
    String type="0";



    FrmMainFrame mf ;

   
    /** Creates new form Area */
    public FrmRTSC0101() throws CodeException {
        initComponents();

    }
    
    public FrmRTSC0101(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
        
        showcustomer();
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
        buttonGroup3 = new javax.swing.ButtonGroup();
        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jlblsalesman_code2 = new javax.swing.JLabel();
        joptsort_by_tanggal = new javax.swing.JRadioButton();
        joptsort_by_type = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jlblsalesman_code3 = new javax.swing.JLabel();
        kzodocument_date_to = new org.kazao.calendar.KazaoCalendarDate();
        kzodocument_date_fr = new org.kazao.calendar.KazaoCalendarDate();
        jlblsalesman_code4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnBrowse = new javax.swing.JButton();
        jlblsalesman_code = new javax.swing.JLabel();
        jtxtcustomer_code_fr = new javax.swing.JTextField();
        jtxtcustomer_code_to = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jlblsalesman_code1 = new javax.swing.JLabel();
        jtxtcustomer_code_to_desc = new javax.swing.JTextField();
        jtxtcustomer_code_fr_desc = new javax.swing.JTextField();
        jlblsalesman_code6 = new javax.swing.JLabel();
        type_summary1 = new javax.swing.JRadioButton();
        type_detail1 = new javax.swing.JRadioButton();
        joptsort_by_customer = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laporan Penjualan");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jHeader.setBackground(new java.awt.Color(102, 102, 102));
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Laporan Penjualan");
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

        jlblsalesman_code2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsalesman_code2.setText("Urut Berdsaarkan");
        getContentPane().add(jlblsalesman_code2);
        jlblsalesman_code2.setBounds(70, 320, 120, 20);

        buttonGroup2.add(joptsort_by_tanggal);
        joptsort_by_tanggal.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        joptsort_by_tanggal.setSelected(true);
        joptsort_by_tanggal.setText("Tanggal");
        getContentPane().add(joptsort_by_tanggal);
        joptsort_by_tanggal.setBounds(190, 320, 130, 23);

        buttonGroup2.add(joptsort_by_type);
        joptsort_by_type.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        joptsort_by_type.setText("Tipe bayar");
        getContentPane().add(joptsort_by_type);
        joptsort_by_type.setBounds(320, 320, 114, 23);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tanggal Transaksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N
        jPanel1.setLayout(null);

        jlblsalesman_code3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsalesman_code3.setText("Dari");
        jPanel1.add(jlblsalesman_code3);
        jlblsalesman_code3.setBounds(30, 30, 120, 20);

        kzodocument_date_to.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_date_to.setFontDate(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_date_to.setOpaque(false);
        jPanel1.add(kzodocument_date_to);
        kzodocument_date_to.setBounds(150, 50, 120, 20);

        kzodocument_date_fr.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_date_fr.setFontDate(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        kzodocument_date_fr.setOpaque(false);
        jPanel1.add(kzodocument_date_fr);
        kzodocument_date_fr.setBounds(150, 30, 120, 20);

        jlblsalesman_code4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsalesman_code4.setText("Sampai");
        jPanel1.add(jlblsalesman_code4);
        jlblsalesman_code4.setBounds(30, 50, 120, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 70, 720, 100);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N
        jPanel2.setLayout(null);

        jbtnBrowse.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBrowse);
        jbtnBrowse.setBounds(250, 40, 30, 17);

        jlblsalesman_code.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsalesman_code.setText("Sampai");
        jPanel2.add(jlblsalesman_code);
        jlblsalesman_code.setBounds(30, 60, 120, 20);

        jtxtcustomer_code_fr.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jPanel2.add(jtxtcustomer_code_fr);
        jtxtcustomer_code_fr.setBounds(150, 40, 90, 23);

        jtxtcustomer_code_to.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jPanel2.add(jtxtcustomer_code_to);
        jtxtcustomer_code_to.setBounds(150, 60, 90, 23);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnBrowse1);
        jbtnBrowse1.setBounds(250, 60, 30, 17);

        jlblsalesman_code1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsalesman_code1.setText("Dari");
        jPanel2.add(jlblsalesman_code1);
        jlblsalesman_code1.setBounds(30, 40, 120, 20);

        jtxtcustomer_code_to_desc.setEditable(false);
        jtxtcustomer_code_to_desc.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jPanel2.add(jtxtcustomer_code_to_desc);
        jtxtcustomer_code_to_desc.setBounds(290, 60, 390, 23);

        jtxtcustomer_code_fr_desc.setEditable(false);
        jtxtcustomer_code_fr_desc.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jPanel2.add(jtxtcustomer_code_fr_desc);
        jtxtcustomer_code_fr_desc.setBounds(290, 40, 390, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 180, 720, 110);

        jlblsalesman_code6.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsalesman_code6.setText("Jenis Tampilan");
        getContentPane().add(jlblsalesman_code6);
        jlblsalesman_code6.setBounds(70, 340, 120, 20);

        buttonGroup3.add(type_summary1);
        type_summary1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        type_summary1.setSelected(true);
        type_summary1.setText("Summary");
        type_summary1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_summary1ActionPerformed(evt);
            }
        });
        getContentPane().add(type_summary1);
        type_summary1.setBounds(190, 340, 130, 23);

        buttonGroup3.add(type_detail1);
        type_detail1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        type_detail1.setText("Detail");
        type_detail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_detail1ActionPerformed(evt);
            }
        });
        getContentPane().add(type_detail1);
        type_detail1.setBounds(320, 340, 114, 23);

        buttonGroup2.add(joptsort_by_customer);
        joptsort_by_customer.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        joptsort_by_customer.setText("Customer");
        getContentPane().add(joptsort_by_customer);
        joptsort_by_customer.setBounds(500, 320, 114, 23);

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
    obrowse.showbrowser(obrowse.ar_customer, "", jtxtcustomer_code_to,jtxtcustomer_code_to_desc);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void type_summary1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_summary1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_type_summary1ActionPerformed

private void type_detail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_detail1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_type_detail1ActionPerformed
                                     
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    obrowse.showbrowser(obrowse.ar_customer, "", jtxtcustomer_code_fr,jtxtcustomer_code_fr_desc);
}                                                                                 

    public void execute() throws CodeException {


        Map parameter = new HashMap();


        parameter.put("document_date_fr", GlobalUtils.formatDate(kzodocument_date_fr.getDate(),"yyyy-MM-dd"));
        parameter.put("document_date_to", GlobalUtils.formatDate(kzodocument_date_to.getDate(),"yyyy-MM-dd"));
        parameter.put("customer_code_fr", jtxtcustomer_code_fr.getText());
        parameter.put("customer_code_to", jtxtcustomer_code_to.getText());
        
        String sort_by="1";
        if (joptsort_by_type.isSelected()){
            sort_by="2";
        }
        if (joptsort_by_customer.isSelected()){
            sort_by="3";
        }
        parameter.put("sort_by", sort_by);
        parameter.put("audituser", (GlobalUtils.getUserId()));

        // Versi 1
        String file ="";
        String rptFile="";
        if(type_summary1.isSelected()){
            rptFile="RTSC-01-02.jrxml";
        }else{
            rptFile="RTSC-01-01.jrxml";
        }
        if(GlobalUtils.getAppDir()){
            try{
            file = GlobalUtils.getCurrentDir() +"/Reports/"+rptFile;
            jasperReport = JasperCompileManager.compileReport(file);
            //System.out.println("file: "+file);
            System.out.println("isi parameter Report PO:"+parameter);
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
                    new FrmRTSC0101().setVisible(true);
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
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JLabel jlblsalesman_code;
    private javax.swing.JLabel jlblsalesman_code1;
    private javax.swing.JLabel jlblsalesman_code2;
    private javax.swing.JLabel jlblsalesman_code3;
    private javax.swing.JLabel jlblsalesman_code4;
    private javax.swing.JLabel jlblsalesman_code6;
    private javax.swing.JRadioButton joptsort_by_customer;
    private javax.swing.JRadioButton joptsort_by_tanggal;
    private javax.swing.JRadioButton joptsort_by_type;
    private javax.swing.JTextField jtxtcustomer_code_fr;
    private javax.swing.JTextField jtxtcustomer_code_fr_desc;
    private javax.swing.JTextField jtxtcustomer_code_to;
    private javax.swing.JTextField jtxtcustomer_code_to_desc;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_fr;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_to;
    private javax.swing.JRadioButton type_detail1;
    private javax.swing.JRadioButton type_summary1;
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

    private void showcustomer() {
        try {
            ar_customerext ocust=new ar_customerext();
            ocust.moveFirst();
            jtxtcustomer_code_fr.setText(ocust.getcustomer_code());
            jtxtcustomer_code_fr_desc.setText(ocust.getcustomer_name());
            
            ocust.moveLast();
            jtxtcustomer_code_to.setText(ocust.getcustomer_code());
            jtxtcustomer_code_to_desc.setText(ocust.getcustomer_name());
            
        } catch (CodeException ex) {
            Logger.getLogger(FrmRTSC0101.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}