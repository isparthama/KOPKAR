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

public class Frmrp_product extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 1;
    public static String CLASSNAME="Frmrp_supplier";
    browsecontroller obrowse=new browsecontroller();
    JasperPrint jasperPrint;
    JasperReport jasperReport;
    DbBean db=appsettinghandler.db;
    String status="";


    FrmMainFrame mf ;

   
    /** Creates new form Area */
    public Frmrp_product() throws CodeException {
        initComponents();

    }
    
    public Frmrp_product(FrmMainFrame mf) throws CodeException{
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
        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnBrowse = new javax.swing.JButton();
        jlblsalesman_code = new javax.swing.JLabel();
        jtxtfrsuppcode = new javax.swing.JTextField();
        jtxttosuppcode = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        active = new javax.swing.JCheckBox();
        jlblsalesman_code1 = new javax.swing.JLabel();
        jtxttosuppcode_desc = new javax.swing.JLabel();
        jtxtfrsuppcode_desc = new javax.swing.JLabel();
        jbtnBrowsefrbrand = new javax.swing.JButton();
        jlblsalesman_code2 = new javax.swing.JLabel();
        jtxtfrbrandcode = new javax.swing.JTextField();
        jtxttobrandcode = new javax.swing.JTextField();
        jbtnBrowsetobrand = new javax.swing.JButton();
        jlblsalesman_code3 = new javax.swing.JLabel();
        jtxttobrandcode_desc = new javax.swing.JLabel();
        jtxtfrbrandcode_desc = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbtnInventory = new javax.swing.JRadioButton();
        jbtnUtama = new javax.swing.JRadioButton();
        jbtnBarcode = new javax.swing.JRadioButton();
        jbtnDiscount = new javax.swing.JRadioButton();
        jbtnHarga = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("rp_product");
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
        jHeader.setText(" : : Daftar Produk");
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
        jbtnBrowse.setBounds(290, 110, 30, 17);

        jlblsalesman_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code.setText("s/d Kode Produk");
        getContentPane().add(jlblsalesman_code);
        jlblsalesman_code.setBounds(70, 130, 140, 20);

        jtxtfrsuppcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtfrsuppcode);
        jtxtfrsuppcode.setBounds(190, 110, 90, 23);

        jtxttosuppcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxttosuppcode);
        jtxttosuppcode.setBounds(190, 130, 90, 23);

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
        jbtnBrowse1.setBounds(290, 130, 30, 17);

        active.setFont(new java.awt.Font("Dialog", 1, 10));
        active.setSelected(true);
        active.setText("Tampilkan hanya Supplier aktif");
        active.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeActionPerformed(evt);
            }
        });
        getContentPane().add(active);
        active.setBounds(190, 70, 270, 23);

        jlblsalesman_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code1.setText("Mulai Kode Produk");
        getContentPane().add(jlblsalesman_code1);
        jlblsalesman_code1.setBounds(70, 110, 140, 20);

        jtxttosuppcode_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        jtxttosuppcode_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxttosuppcode_desc);
        jtxttosuppcode_desc.setBounds(330, 130, 330, 20);

        jtxtfrsuppcode_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        jtxtfrsuppcode_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtfrsuppcode_desc);
        jtxtfrsuppcode_desc.setBounds(330, 110, 330, 20);

        jbtnBrowsefrbrand.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowsefrbrand.setText("...");
        jbtnBrowsefrbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowsefrbrandActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowsefrbrand);
        jbtnBrowsefrbrand.setBounds(290, 150, 30, 17);

        jlblsalesman_code2.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code2.setText("s/d Kode Brand");
        getContentPane().add(jlblsalesman_code2);
        jlblsalesman_code2.setBounds(70, 170, 140, 20);

        jtxtfrbrandcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtfrbrandcode);
        jtxtfrbrandcode.setBounds(190, 150, 90, 23);

        jtxttobrandcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxttobrandcode);
        jtxttobrandcode.setBounds(190, 170, 90, 23);

        jbtnBrowsetobrand.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowsetobrand.setText("...");
        jbtnBrowsetobrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowsetobrandActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowsetobrand);
        jbtnBrowsetobrand.setBounds(290, 170, 30, 17);

        jlblsalesman_code3.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code3.setText("Mulai Kode Brand");
        getContentPane().add(jlblsalesman_code3);
        jlblsalesman_code3.setBounds(70, 150, 140, 20);

        jtxttobrandcode_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        jtxttobrandcode_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxttobrandcode_desc);
        jtxttobrandcode_desc.setBounds(330, 170, 330, 20);

        jtxtfrbrandcode_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        jtxtfrbrandcode_desc.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jtxtfrbrandcode_desc);
        jtxtfrbrandcode_desc.setBounds(330, 150, 330, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data produk", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 10))); // NOI18N
        jPanel1.setLayout(null);

        buttonGroup1.add(jbtnInventory);
        jbtnInventory.setFont(new java.awt.Font("Dialog", 1, 10));
        jbtnInventory.setText("Inventory");
        jbtnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInventoryActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnInventory);
        jbtnInventory.setBounds(460, 20, 123, 24);

        buttonGroup1.add(jbtnUtama);
        jbtnUtama.setFont(new java.awt.Font("Dialog", 1, 10));
        jbtnUtama.setSelected(true);
        jbtnUtama.setText("Utama");
        jbtnUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUtamaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnUtama);
        jbtnUtama.setBounds(10, 20, 64, 24);

        buttonGroup1.add(jbtnBarcode);
        jbtnBarcode.setFont(new java.awt.Font("Dialog", 1, 10));
        jbtnBarcode.setText("Barcode");
        jbtnBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBarcodeActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBarcode);
        jbtnBarcode.setBounds(100, 20, 123, 24);

        buttonGroup1.add(jbtnDiscount);
        jbtnDiscount.setFont(new java.awt.Font("Dialog", 1, 10));
        jbtnDiscount.setText("Discount");
        jbtnDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDiscountActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnDiscount);
        jbtnDiscount.setBounds(220, 20, 123, 24);

        buttonGroup1.add(jbtnHarga);
        jbtnHarga.setFont(new java.awt.Font("Dialog", 1, 10));
        jbtnHarga.setText("Harga");
        jbtnHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHargaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnHarga);
        jbtnHarga.setBounds(340, 20, 123, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 200, 590, 70);

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
    obrowse.showbrowser(obrowse.in_product, "", jtxttosuppcode, jtxttosuppcode_desc);
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void activeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeActionPerformed
    // TODO add your handling code here:
    if(active.isSelected()){
        status="Y";
    }
}//GEN-LAST:event_activeActionPerformed

private void jbtnBrowsefrbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowsefrbrandActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.in_brand, "", jtxtfrbrandcode, jtxtfrbrandcode_desc);
}//GEN-LAST:event_jbtnBrowsefrbrandActionPerformed

private void jbtnBrowsetobrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowsetobrandActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.in_brand, "", jtxttobrandcode, jtxttobrandcode_desc);
}//GEN-LAST:event_jbtnBrowsetobrandActionPerformed

private void jbtnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInventoryActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jbtnInventoryActionPerformed

private void jbtnUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUtamaActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jbtnUtamaActionPerformed

private void jbtnBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBarcodeActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jbtnBarcodeActionPerformed

private void jbtnDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDiscountActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jbtnDiscountActionPerformed

private void jbtnHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHargaActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jbtnHargaActionPerformed
                                     
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    obrowse.showbrowser(obrowse.in_product, "", jtxtfrsuppcode, jtxtfrsuppcode_desc);

}                                                                                 

    public void execute() throws CodeException {


        Map parameter = new HashMap();
        parameter.put("brand_code_fr", jtxtfrbrandcode.getText());
	parameter.put("brand_code_to", jtxttobrandcode.getText());
	parameter.put("product_code_fr", jtxtfrsuppcode.getText());
	parameter.put("product_code_to", jtxttosuppcode.getText());
	parameter.put("active_sts", status);
	parameter.put("audituser", (GlobalUtils.getUserId()));

        // Versi 1
        String file ="";
        if (jbtnUtama.isSelected()) {file="RMKK-15";}
        if (jbtnBarcode.isSelected()) {file="RMKK-16";}
        if (jbtnDiscount.isSelected()) {file="RMKK-17";}
        if (jbtnHarga.isSelected()) {file="RMKK-18";}
        if (jbtnInventory.isSelected()) {file="RMKK-19";}

        if(GlobalUtils.getAppDir()){
            try{
            file = GlobalUtils.getCurrentDir() +"/Reports/"+file+".jrxml";
            jasperReport = JasperCompileManager.compileReport(file);
            //System.out.println("file: "+file);
            System.out.println("isi parameter Daftar Produk:"+parameter);
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
                    new Frmrp_product().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JCheckBox active;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton jbtnBarcode;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JButton jbtnBrowsefrbrand;
    private javax.swing.JButton jbtnBrowsetobrand;
    private javax.swing.JRadioButton jbtnDiscount;
    private javax.swing.JRadioButton jbtnHarga;
    private javax.swing.JRadioButton jbtnInventory;
    private javax.swing.JRadioButton jbtnUtama;
    private javax.swing.JLabel jlblsalesman_code;
    private javax.swing.JLabel jlblsalesman_code1;
    private javax.swing.JLabel jlblsalesman_code2;
    private javax.swing.JLabel jlblsalesman_code3;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtfrbrandcode;
    private javax.swing.JLabel jtxtfrbrandcode_desc;
    private javax.swing.JTextField jtxtfrsuppcode;
    private javax.swing.JLabel jtxtfrsuppcode_desc;
    private javax.swing.JTextField jtxttobrandcode;
    private javax.swing.JLabel jtxttobrandcode_desc;
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