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

package kopkar.in.component;


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

public class Frmrp_goods_transfer extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmrp_goods_transfer";
    browsecontroller obrowse=new browsecontroller();
    JasperPrint jasperPrint;
    JasperReport jasperReport;
    DbBean db=appsettinghandler.db;
    String status="";
    String type="0";



    FrmMainFrame mf ;

   
    /** Creates new form Area */
    public Frmrp_goods_transfer() throws CodeException {
        initComponents();

    }
    
    public Frmrp_goods_transfer(FrmMainFrame mf) throws CodeException{
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
        jbtnBrowse = new javax.swing.JButton();
        jlblsalesman_code = new javax.swing.JLabel();
        jtxt_docnum_fr = new javax.swing.JTextField();
        jtxt_docnum_to = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jlblsalesman_code1 = new javax.swing.JLabel();
        jlblsalesman_code2 = new javax.swing.JLabel();
        jlblsalesman_code3 = new javax.swing.JLabel();
        kzodocument_date_to = new org.kazao.calendar.KazaoCalendarDate();
        kzodocument_date_fr = new org.kazao.calendar.KazaoCalendarDate();
        jlblsalesman_code4 = new javax.swing.JLabel();
        status_close = new javax.swing.JRadioButton();
        status_all = new javax.swing.JRadioButton();
        status_open = new javax.swing.JRadioButton();
        jlblsalesman_code5 = new javax.swing.JLabel();
        type_form = new javax.swing.JRadioButton();
        type_summary = new javax.swing.JRadioButton();
        type_detail = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laporan Perpindahan Barang");
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
        jHeader.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader.setForeground(new java.awt.Color(255, 255, 255));
        jHeader.setText(" : : Laporan Perpindahan Barang");
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

        jbtnBrowse.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse.setText("...");
        jbtnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse);
        jbtnBrowse.setBounds(290, 80, 30, 17);

        jlblsalesman_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code.setText("s/d No. Dokumen");
        getContentPane().add(jlblsalesman_code);
        jlblsalesman_code.setBounds(70, 100, 120, 20);

        jtxt_docnum_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxt_docnum_fr);
        jtxt_docnum_fr.setBounds(190, 80, 90, 23);

        jtxt_docnum_to.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxt_docnum_to);
        jtxt_docnum_to.setBounds(190, 100, 90, 23);

        jtxtTanggalEntry.setEditable(false);
        jtxtTanggalEntry.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalEntry.setText("TanggalEntry");
        getContentPane().add(jtxtTanggalEntry);
        jtxtTanggalEntry.setBounds(360, 30, 170, 20);

        jtxtTanggalUpdate.setEditable(false);
        jtxtTanggalUpdate.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtTanggalUpdate.setText("TanggalUpdate");
        getContentPane().add(jtxtTanggalUpdate);
        jtxtTanggalUpdate.setBounds(530, 30, 130, 20);

        jtxtUserID.setEditable(false);
        jtxtUserID.setFont(new java.awt.Font("Dialog", 0, 8));
        jtxtUserID.setText("UserID");
        getContentPane().add(jtxtUserID);
        jtxtUserID.setBounds(660, 30, 140, 20);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(290, 100, 30, 17);

        jlblsalesman_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code1.setText("Mulai No. Dokumen");
        getContentPane().add(jlblsalesman_code1);
        jlblsalesman_code1.setBounds(70, 80, 120, 20);

        jlblsalesman_code2.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code2.setText("Jenis Report");
        getContentPane().add(jlblsalesman_code2);
        jlblsalesman_code2.setBounds(70, 180, 120, 20);

        jlblsalesman_code3.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code3.setText("Mulai Tgl. Dokumen");
        getContentPane().add(jlblsalesman_code3);
        jlblsalesman_code3.setBounds(70, 120, 120, 20);

        kzodocument_date_to.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setOpaque(false);
        getContentPane().add(kzodocument_date_to);
        kzodocument_date_to.setBounds(190, 140, 120, 20);

        kzodocument_date_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setOpaque(false);
        getContentPane().add(kzodocument_date_fr);
        kzodocument_date_fr.setBounds(190, 120, 120, 20);

        jlblsalesman_code4.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code4.setText("s/d Tgl. Dokumen");
        getContentPane().add(jlblsalesman_code4);
        jlblsalesman_code4.setBounds(70, 140, 120, 20);

        buttonGroup1.add(status_close);
        status_close.setFont(new java.awt.Font("Dialog", 1, 10));
        status_close.setText("Close");
        status_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_closeActionPerformed(evt);
            }
        });
        getContentPane().add(status_close);
        status_close.setBounds(310, 160, 114, 23);

        buttonGroup1.add(status_all);
        status_all.setFont(new java.awt.Font("Dialog", 1, 10));
        status_all.setSelected(true);
        status_all.setText("Semua");
        status_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_allActionPerformed(evt);
            }
        });
        getContentPane().add(status_all);
        status_all.setBounds(190, 160, 65, 24);

        buttonGroup1.add(status_open);
        status_open.setFont(new java.awt.Font("Dialog", 1, 10));
        status_open.setText("Open");
        status_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_openActionPerformed(evt);
            }
        });
        getContentPane().add(status_open);
        status_open.setBounds(250, 160, 60, 23);

        jlblsalesman_code5.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code5.setText("Status Dokumen");
        getContentPane().add(jlblsalesman_code5);
        jlblsalesman_code5.setBounds(70, 160, 120, 20);

        buttonGroup2.add(type_form);
        type_form.setFont(new java.awt.Font("Dialog", 1, 10));
        type_form.setText("Form");
        type_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_formActionPerformed(evt);
            }
        });
        getContentPane().add(type_form);
        type_form.setBounds(190, 180, 55, 24);

        buttonGroup2.add(type_summary);
        type_summary.setFont(new java.awt.Font("Dialog", 1, 10));
        type_summary.setSelected(true);
        type_summary.setText("Summary");
        type_summary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_summaryActionPerformed(evt);
            }
        });
        getContentPane().add(type_summary);
        type_summary.setBounds(240, 180, 80, 23);

        buttonGroup2.add(type_detail);
        type_detail.setFont(new java.awt.Font("Dialog", 1, 10));
        type_detail.setText("Detail");
        type_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_detailActionPerformed(evt);
            }
        });
        getContentPane().add(type_detail);
        type_detail.setBounds(320, 180, 114, 23);

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
    obrowse.showbrowser(obrowse.in_goods_transfer, "", jtxt_docnum_to);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void status_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_allActionPerformed
    // TODO add your handling code here:
    if(status_all.isSelected()){
        status="A";
    }
}//GEN-LAST:event_status_allActionPerformed

private void status_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_openActionPerformed
    // TODO add your handling code here:
    if(status_open.isSelected()){
        status="O";
    }
}//GEN-LAST:event_status_openActionPerformed

private void status_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_closeActionPerformed
    // TODO add your handling code here:
    if(status_close.isSelected()){
        status="C";
    }
}//GEN-LAST:event_status_closeActionPerformed

private void type_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_formActionPerformed
    // TODO add your handling code here:
    if(type_form.isSelected()){
        type="0";
    }
}//GEN-LAST:event_type_formActionPerformed

private void type_summaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_summaryActionPerformed
    // TODO add your handling code here:
    if(type_summary.isSelected()){
        type="2";
    }
}//GEN-LAST:event_type_summaryActionPerformed

private void type_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_detailActionPerformed
    // TODO add your handling code here:
    if(type_detail.isSelected()){
        type="1";
    }
}//GEN-LAST:event_type_detailActionPerformed
                                     
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    obrowse.showbrowser(obrowse.in_goods_transfer, "", jtxt_docnum_fr);
}                                                                                 

    public void execute() throws CodeException {


        Map parameter = new HashMap();
        parameter.put("audituser", (GlobalUtils.getUserId()));
        parameter.put("docnum_fr", jtxt_docnum_fr.getText());
        parameter.put("docnum_to", jtxt_docnum_to.getText());
        parameter.put("docdate_fr", GlobalUtils.formatDate(kzodocument_date_fr.getDate(),"yyyy-MM-dd"));
        parameter.put("docdate_to", GlobalUtils.formatDate(kzodocument_date_to.getDate(),"yyyy-MM-dd"));
        parameter.put("status", status);
        parameter.put("reporttype", type);


        // Versi 1
        String file ="";
        String rptFile="";
        if(type.equalsIgnoreCase("0")){
            rptFile="GoodsTransfer.jrxml";
        }else if(type.equalsIgnoreCase("2")){
            rptFile="goodstransfer_rkp_rpt.jrxml";
        }else{
            rptFile="goodstransfer_dtl_rpt.jrxml";
        }
        if(GlobalUtils.getAppDir()){
            try{
            file = GlobalUtils.getCurrentDir() +"/Reports/"+rptFile;
            jasperReport = JasperCompileManager.compileReport(file);
            //System.out.println("file: "+file);
            System.out.println("isi parameter Report GT:"+parameter);
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
                    new Frmrp_goods_transfer().setVisible(true);
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
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JLabel jlblsalesman_code;
    private javax.swing.JLabel jlblsalesman_code1;
    private javax.swing.JLabel jlblsalesman_code2;
    private javax.swing.JLabel jlblsalesman_code3;
    private javax.swing.JLabel jlblsalesman_code4;
    private javax.swing.JLabel jlblsalesman_code5;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxt_docnum_fr;
    private javax.swing.JTextField jtxt_docnum_to;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_fr;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_to;
    private javax.swing.JRadioButton status_all;
    private javax.swing.JRadioButton status_close;
    private javax.swing.JRadioButton status_open;
    private javax.swing.JRadioButton type_detail;
    private javax.swing.JRadioButton type_form;
    private javax.swing.JRadioButton type_summary;
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
