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

package kopkar.ko.component;


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

public class FrmRMKO04 extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 1;
    public static String CLASSNAME="Frmrp_anggota_simpanan";

    public static String Report_Name_Laporan="Laporan Simpanan Anggota";
    public static String Report_Name_Daftar="Setting Simpanan Anggota";
    public String Report_Name=this.Report_Name_Laporan;
    
    browsecontroller obrowse=new browsecontroller();
    JasperPrint jasperPrint;
    JasperReport jasperReport;
    DbBean db=appsettinghandler.db;
    String status="";


    FrmMainFrame mf ;

   
    /** Creates new form Area */
    public FrmRMKO04() throws CodeException {
        initComponents();

    }
    
    public FrmRMKO04(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
    }

    public FrmRMKO04(FrmMainFrame mf, String Report_Name) {
        this.mf = mf;
        initComponents();

        this.Report_Name=Report_Name_Daftar;
        this.setTitle(this.Report_Name);
        jHeader.setText(" : : "+this.Report_Name);
    }
     
       
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnBrowse = new javax.swing.JButton();
        jlblsalesman_code = new javax.swing.JLabel();
        jtxtfrsuppcode = new javax.swing.JTextField();
        jtxttosuppcode = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jchkactive_sts = new javax.swing.JCheckBox();
        jlblsalesman_code1 = new javax.swing.JLabel();
        jtxttosuppcode_desc = new javax.swing.JLabel();
        jtxtfrsuppcode_desc = new javax.swing.JLabel();
        jbtnBrowse2 = new javax.swing.JButton();
        jtxtkode_departemen = new javax.swing.JTextField();
        jchkall_department = new javax.swing.JCheckBox();
        jlblsalesman_code2 = new javax.swing.JLabel();
        jtxtnama_departemen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar Setting Simpanan Anggota");
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
        jHeader.setText(" : : Daftar Setting Simpanan Anggota");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(30, 30, 280, 20);

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
        jbtnBrowse.setBounds(310, 210, 30, 17);

        jlblsalesman_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code.setText("s/d Kode Anggota");
        getContentPane().add(jlblsalesman_code);
        jlblsalesman_code.setBounds(70, 230, 140, 20);

        jtxtfrsuppcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtfrsuppcode);
        jtxtfrsuppcode.setBounds(210, 210, 90, 23);

        jtxttosuppcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxttosuppcode);
        jtxttosuppcode.setBounds(210, 230, 90, 23);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(310, 230, 30, 17);

        jchkactive_sts.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkactive_sts.setText("Tampilkan hanya Anggota aktif");
        jchkactive_sts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkactive_stsActionPerformed(evt);
            }
        });
        getContentPane().add(jchkactive_sts);
        jchkactive_sts.setBounds(70, 180, 270, 23);

        jlblsalesman_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code1.setText("Mulai Kode Anggota");
        getContentPane().add(jlblsalesman_code1);
        jlblsalesman_code1.setBounds(70, 210, 140, 20);

        jtxttosuppcode_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxttosuppcode_desc);
        jtxttosuppcode_desc.setBounds(350, 230, 330, 20);

        jtxtfrsuppcode_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxtfrsuppcode_desc);
        jtxtfrsuppcode_desc.setBounds(350, 210, 330, 20);

        jbtnBrowse2.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse2.setText("...");
        jbtnBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse2);
        jbtnBrowse2.setBounds(310, 150, 30, 17);

        jtxtkode_departemen.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtkode_departemen);
        jtxtkode_departemen.setBounds(210, 150, 90, 23);

        jchkall_department.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkall_department.setText("Semua Departemen");
        jchkall_department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchkall_departmentActionPerformed(evt);
            }
        });
        getContentPane().add(jchkall_department);
        jchkall_department.setBounds(70, 120, 270, 23);

        jlblsalesman_code2.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code2.setText("Kode Departemen");
        getContentPane().add(jlblsalesman_code2);
        jlblsalesman_code2.setBounds(70, 150, 140, 20);

        jtxtnama_departemen.setFont(new java.awt.Font("Dialog", 1, 10));
        getContentPane().add(jtxtnama_departemen);
        jtxtnama_departemen.setBounds(350, 150, 330, 20);

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
    obrowse.showbrowser(obrowse.ko_anggota, "", jtxttosuppcode, jtxttosuppcode_desc);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void jchkactive_stsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkactive_stsActionPerformed
    // TODO add your handling code here:
    if(jchkactive_sts.isSelected()){
        status="Y";
    }
}//GEN-LAST:event_jchkactive_stsActionPerformed

private void jbtnBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse2ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ko_departemen, "", jtxtkode_departemen, jtxtnama_departemen);
}//GEN-LAST:event_jbtnBrowse2ActionPerformed

private void jchkall_departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchkall_departmentActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jchkall_departmentActionPerformed
                                     
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    obrowse.showbrowser(obrowse.ko_anggota, "", jtxtfrsuppcode, jtxtfrsuppcode_desc);

}                                                                                 

    public void execute() throws CodeException {


        Map parameter = new HashMap();

        String all_department="N";
        if (jchkall_department.isSelected()){
            all_department="Y";
        }
        parameter.put("all_department", all_department);
        parameter.put("department_code", jtxtkode_departemen.getText());

        parameter.put("member_number_fr", jtxtfrsuppcode.getText());
        parameter.put("member_number_to", jtxttosuppcode.getText());

        String active_sts="N";
        if(jchkactive_sts.isSelected()){
            active_sts="Y";
        }
        parameter.put("active_sts", active_sts);
        parameter.put("audituser", (GlobalUtils.getUserId()));

        // Versi 1
        String file ="";
        if(GlobalUtils.getAppDir()){
            try{
            file = GlobalUtils.getCurrentDir() +"/Reports/RMKO-04.jrxml";
            jasperReport = JasperCompileManager.compileReport(file);
            //System.out.println("file: "+file);
            System.out.println("isi parameter Daftar Simpanan Anggota:"+parameter);
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
                    new FrmRMKO04().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JLabel jHeader;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JButton jbtnBrowse2;
    private javax.swing.JCheckBox jchkactive_sts;
    private javax.swing.JCheckBox jchkall_department;
    private javax.swing.JLabel jlblsalesman_code;
    private javax.swing.JLabel jlblsalesman_code1;
    private javax.swing.JLabel jlblsalesman_code2;
    private javax.swing.JTextField jtxtfrsuppcode;
    private javax.swing.JLabel jtxtfrsuppcode_desc;
    private javax.swing.JTextField jtxtkode_departemen;
    private javax.swing.JLabel jtxtnama_departemen;
    private javax.swing.JTextField jtxttosuppcode;
    private javax.swing.JLabel jtxttosuppcode_desc;
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
