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

package kopkar.component;


import classinterface.NavigatorFormInt;
import common.component.FrmMainFrame;
import java.util.Calendar;
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

public class Frmrp_mutasi_simpanan extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 1;
    public static String CLASSNAME="Frmrp_transaksi_mohon";
    browsecontroller obrowse=new browsecontroller();
    JasperPrint jasperPrint;
    JasperReport jasperReport;
    DbBean db=appsettinghandler.db;
    String status="";
    String isUnit="Y";
    Calendar c = Calendar.getInstance();
    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    String tahun;


    FrmMainFrame mf ;

   
    /** Creates new form Area */
    public Frmrp_mutasi_simpanan() throws CodeException {
        initComponents();
        
    }

    public Frmrp_mutasi_simpanan(FrmMainFrame mf) throws CodeException{
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
        jtxt_dept_code_fr = new javax.swing.JTextField();
        jtxt_dept_code_to = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jlblsalesman_code1 = new javax.swing.JLabel();
        jtxt_dept_name_to = new javax.swing.JLabel();
        jtxt_dept_name_fr = new javax.swing.JLabel();
        jlblsalesman_code2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnBrowse3 = new javax.swing.JButton();
        jtxt_pos_code_fr = new javax.swing.JTextField();
        jtxt_pos_code_to = new javax.swing.JTextField();
        jbtnBrowse4 = new javax.swing.JButton();
        jlblsalesman_code4 = new javax.swing.JLabel();
        jtxt_pos_name_to = new javax.swing.JLabel();
        jtxt_pos_name_fr = new javax.swing.JLabel();
        jlblsalesman_code5 = new javax.swing.JLabel();
        jbtnBrowse2 = new javax.swing.JButton();
        jtxtmember_number_fr = new javax.swing.JTextField();
        jbtnBrowse5 = new javax.swing.JButton();
        jtxtmember_number_to = new javax.swing.JTextField();
        jtxt_member_name_fr = new javax.swing.JLabel();
        jtxt_member_name_to = new javax.swing.JLabel();
        kzodocument_date_fr = new org.kazao.calendar.KazaoCalendarDate();
        kzodocument_date_to = new org.kazao.calendar.KazaoCalendarDate();
        jlblsalesman_code3 = new javax.swing.JLabel();
        jlblsalesman_code6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report Mutasi Simpanan");
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
        jHeader.setText(" : : Report Mutasi Simpanan");
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
        jbtnBrowse.setBounds(290, 160, 30, 17);

        jtxt_dept_code_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxt_dept_code_fr);
        jtxt_dept_code_fr.setBounds(190, 160, 90, 23);

        jtxt_dept_code_to.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxt_dept_code_to);
        jtxt_dept_code_to.setBounds(190, 180, 90, 23);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(290, 180, 30, 17);

        jlblsalesman_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code1.setText("Dari Departemen");
        getContentPane().add(jlblsalesman_code1);
        jlblsalesman_code1.setBounds(60, 160, 140, 20);

        jtxt_dept_name_to.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxt_dept_name_to);
        jtxt_dept_name_to.setBounds(330, 180, 330, 20);

        jtxt_dept_name_fr.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxt_dept_name_fr);
        jtxt_dept_name_fr.setBounds(330, 160, 330, 20);

        jlblsalesman_code2.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code2.setText("S/d Departemen");
        getContentPane().add(jlblsalesman_code2);
        jlblsalesman_code2.setBounds(60, 180, 140, 20);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel1.setText("Dari Tanggal");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 70, 110, 20);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel2.setText("s/d Tanggal");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 90, 100, 20);

        jbtnBrowse3.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse3.setText("...");
        jbtnBrowse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse3);
        jbtnBrowse3.setBounds(290, 200, 30, 17);

        jtxt_pos_code_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxt_pos_code_fr);
        jtxt_pos_code_fr.setBounds(190, 200, 90, 23);

        jtxt_pos_code_to.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxt_pos_code_to);
        jtxt_pos_code_to.setBounds(190, 220, 90, 23);

        jbtnBrowse4.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse4.setText("...");
        jbtnBrowse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse4);
        jbtnBrowse4.setBounds(290, 220, 30, 17);

        jlblsalesman_code4.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code4.setText("Dari Posisi");
        getContentPane().add(jlblsalesman_code4);
        jlblsalesman_code4.setBounds(60, 200, 140, 20);

        jtxt_pos_name_to.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxt_pos_name_to);
        jtxt_pos_name_to.setBounds(330, 220, 330, 20);

        jtxt_pos_name_fr.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxt_pos_name_fr);
        jtxt_pos_name_fr.setBounds(330, 200, 330, 20);

        jlblsalesman_code5.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code5.setText("S/d Posisi");
        getContentPane().add(jlblsalesman_code5);
        jlblsalesman_code5.setBounds(60, 220, 140, 20);

        jbtnBrowse2.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse2.setText("...");
        jbtnBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse2);
        jbtnBrowse2.setBounds(290, 120, 30, 17);

        jtxtmember_number_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtmember_number_fr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtmember_number_frFocusGained(evt);
            }
        });
        getContentPane().add(jtxtmember_number_fr);
        jtxtmember_number_fr.setBounds(190, 120, 90, 23);

        jbtnBrowse5.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse5.setText("...");
        jbtnBrowse5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse5);
        jbtnBrowse5.setBounds(290, 140, 30, 17);

        jtxtmember_number_to.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtmember_number_to.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtmember_number_toFocusGained(evt);
            }
        });
        getContentPane().add(jtxtmember_number_to);
        jtxtmember_number_to.setBounds(190, 140, 90, 23);

        jtxt_member_name_fr.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxt_member_name_fr);
        jtxt_member_name_fr.setBounds(330, 120, 330, 20);

        jtxt_member_name_to.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxt_member_name_to);
        jtxt_member_name_to.setBounds(330, 140, 330, 20);

        kzodocument_date_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setOpaque(false);
        getContentPane().add(kzodocument_date_fr);
        kzodocument_date_fr.setBounds(190, 70, 120, 20);

        kzodocument_date_to.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setOpaque(false);
        getContentPane().add(kzodocument_date_to);
        kzodocument_date_to.setBounds(190, 90, 120, 20);

        jlblsalesman_code3.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code3.setText("Dari Anggota");
        getContentPane().add(jlblsalesman_code3);
        jlblsalesman_code3.setBounds(60, 120, 140, 20);

        jlblsalesman_code6.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code6.setText("S/d Anggota");
        getContentPane().add(jlblsalesman_code6);
        jlblsalesman_code6.setBounds(60, 140, 140, 20);

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
    obrowse.showbrowser(obrowse.ko_departemen, "", jtxt_dept_code_to, jtxt_dept_name_to);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void jbtnBrowse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse3ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ko_jabatan, "", jtxt_pos_code_fr, jtxt_pos_name_fr);

}//GEN-LAST:event_jbtnBrowse3ActionPerformed

private void jbtnBrowse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse4ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ko_jabatan, "", jtxt_pos_code_to, jtxt_pos_name_to);

}//GEN-LAST:event_jbtnBrowse4ActionPerformed

private void jbtnBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse2ActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.ko_anggota, "", jtxtmember_number_fr,jtxt_member_name_fr);
}//GEN-LAST:event_jbtnBrowse2ActionPerformed

private void jtxtmember_number_frFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtmember_number_frFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtmember_number_frFocusGained

private void jbtnBrowse5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse5ActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.ko_anggota, "", jtxtmember_number_to,jtxt_member_name_to);
}//GEN-LAST:event_jbtnBrowse5ActionPerformed

private void jtxtmember_number_toFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtmember_number_toFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtmember_number_toFocusGained
                                     
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    obrowse.showbrowser(obrowse.ko_departemen, "", jtxt_dept_code_fr, jtxt_dept_name_fr);

}                                                                                 

    public void execute() throws CodeException {

        Map parameter = new HashMap();
        parameter.put("puser", (GlobalUtils.getUserId()));
        parameter.put("datefr",  GlobalUtils.formatDate(kzodocument_date_fr.getDate(),"yyyy-MM-dd"));
        parameter.put("dateto",  GlobalUtils.formatDate(kzodocument_date_to.getDate(),"yyyy-MM-dd"));
        parameter.put("memberfr", jtxtmember_number_fr.getText());
        parameter.put("memberto", jtxtmember_number_fr.getText());
        parameter.put("deptfr", jtxt_dept_code_fr.getText());
        parameter.put("deptto", jtxt_dept_code_to.getText());
        parameter.put("posfr", jtxt_pos_code_fr.getText());
        parameter.put("posto", jtxt_pos_code_to.getText());

        // Versi 1
        String file ="";
        if(GlobalUtils.getAppDir()){
            try{
            file = GlobalUtils.getCurrentDir() +"/Reports/ko_transaksi_setor_simpanan_report.jrxml";
            jasperReport = JasperCompileManager.compileReport(file);
            //System.out.println("file: "+file);
            System.out.println("isi parameter Mutasi Simpanan:"+parameter);
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
                    new Frmrp_mutasi_simpanan().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JButton jbtnBrowse2;
    private javax.swing.JButton jbtnBrowse3;
    private javax.swing.JButton jbtnBrowse4;
    private javax.swing.JButton jbtnBrowse5;
    private javax.swing.JLabel jlblsalesman_code1;
    private javax.swing.JLabel jlblsalesman_code2;
    private javax.swing.JLabel jlblsalesman_code3;
    private javax.swing.JLabel jlblsalesman_code4;
    private javax.swing.JLabel jlblsalesman_code5;
    private javax.swing.JLabel jlblsalesman_code6;
    private javax.swing.JTextField jtxt_dept_code_fr;
    private javax.swing.JTextField jtxt_dept_code_to;
    private javax.swing.JLabel jtxt_dept_name_fr;
    private javax.swing.JLabel jtxt_dept_name_to;
    private javax.swing.JLabel jtxt_member_name_fr;
    private javax.swing.JLabel jtxt_member_name_to;
    private javax.swing.JTextField jtxt_pos_code_fr;
    private javax.swing.JTextField jtxt_pos_code_to;
    private javax.swing.JLabel jtxt_pos_name_fr;
    private javax.swing.JLabel jtxt_pos_name_to;
    private javax.swing.JTextField jtxtmember_number_fr;
    private javax.swing.JTextField jtxtmember_number_to;
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
