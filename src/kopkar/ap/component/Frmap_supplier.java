/*
 * From ap_supplier
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

package kopkar.ap.component;


import classinterface.NavigatorFormInt;
import common.component.FrmMainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.ap.objectclasses.ap_optionext;
import kopkar.ap.objectclasses.ap_supplierext;
import utils.CodeException;
import utils.GlobalUtils;
import kopkar.utils.browsecontroller;
import kopkar.utils.findcontroller;

/**
 *
 * @author  Generator
 */

public class Frmap_supplier extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmap_supplier";
    String status="";
    
    FrmMainFrame mf ;

    ap_supplierext obj=new ap_supplierext();
   browsecontroller obrowse=new browsecontroller();
   findcontroller ofind=new findcontroller();
    /** Creates new form Area */
    public Frmap_supplier() throws CodeException {
        initComponents();
    }
    
    public Frmap_supplier(FrmMainFrame mf) throws CodeException{
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

        jHeader = new javax.swing.JLabel();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnBrowse = new javax.swing.JButton();
        jlblsupplier_code = new javax.swing.JLabel();
        jtxtsupplier_code = new javax.swing.JTextField();
        jlblsupplier_name = new javax.swing.JLabel();
        jtxtsupplier_name = new javax.swing.JTextField();
        jlbladdress1 = new javax.swing.JLabel();
        jtxtaddress1 = new javax.swing.JTextField();
        jtxtaddress2 = new javax.swing.JTextField();
        jlblcity = new javax.swing.JLabel();
        jtxtcity = new javax.swing.JTextField();
        jlblstate = new javax.swing.JLabel();
        jtxtstate = new javax.swing.JTextField();
        jlblzipcode = new javax.swing.JLabel();
        jtxtzipcode = new javax.swing.JTextField();
        jlblphone = new javax.swing.JLabel();
        jtxtphone = new javax.swing.JTextField();
        jlblfaximale = new javax.swing.JLabel();
        jtxtfaximale = new javax.swing.JTextField();
        jlblemail = new javax.swing.JLabel();
        jtxtemail = new javax.swing.JTextField();
        jlblpic = new javax.swing.JLabel();
        jlblregister_date = new javax.swing.JLabel();
        jtxtpic = new javax.swing.JTextField();
        jtxtregister_date = new javax.swing.JTextField();
        jlblterm_code = new javax.swing.JLabel();
        jtxtterm_code = new javax.swing.JTextField();
        jlblsalesman_code = new javax.swing.JLabel();
        jtxtsalesman_code = new javax.swing.JTextField();
        jlblprice_code = new javax.swing.JLabel();
        jtxtprice_code = new javax.swing.JTextField();
        jlbldiscount_code = new javax.swing.JLabel();
        jtxtdiscount_code = new javax.swing.JTextField();
        jlblwarehouse_code = new javax.swing.JLabel();
        jtxtwarehouse_code = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        status_chk = new javax.swing.JCheckBox();
        jbtnBrowse1 = new javax.swing.JButton();
        jbtnBrowse2 = new javax.swing.JButton();
        jbtnBrowse3 = new javax.swing.JButton();
        jbtnBrowse4 = new javax.swing.JButton();
        jbtnBrowse5 = new javax.swing.JButton();
        warehouse_name = new javax.swing.JLabel();
        term_desc = new javax.swing.JLabel();
        salesman_desc = new javax.swing.JLabel();
        price_desc = new javax.swing.JLabel();
        discount_desc = new javax.swing.JLabel();
        jtxtaccset_kode = new javax.swing.JTextField();
        jlblwarehouse_code1 = new javax.swing.JLabel();
        jbtnBrowse6 = new javax.swing.JButton();
        jlblaccset_desc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ap_supplier");
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
        jHeader.setText(" : : Supplier");
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
        jbtnBrowse.setBounds(350, 100, 30, 17);

        jlblsupplier_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsupplier_code.setText("Kode Supplier");
        getContentPane().add(jlblsupplier_code);
        jlblsupplier_code.setBounds(70, 100, 190, 20);

        jtxtsupplier_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsupplier_code.setText("supplier_code");
        jtxtsupplier_code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtsupplier_codeFocusGained(evt);
            }
        });
        getContentPane().add(jtxtsupplier_code);
        jtxtsupplier_code.setBounds(190, 100, 150, 23);

        jlblsupplier_name.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsupplier_name.setText("Nama Supplier");
        getContentPane().add(jlblsupplier_name);
        jlblsupplier_name.setBounds(70, 120, 190, 20);

        jtxtsupplier_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsupplier_name.setText("supplier_name");
        getContentPane().add(jtxtsupplier_name);
        jtxtsupplier_name.setBounds(190, 120, 500, 23);

        jlbladdress1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbladdress1.setText("Alamat");
        getContentPane().add(jlbladdress1);
        jlbladdress1.setBounds(70, 160, 140, 13);

        jtxtaddress1.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtaddress1.setText("address1");
        getContentPane().add(jtxtaddress1);
        jtxtaddress1.setBounds(190, 160, 500, 23);

        jtxtaddress2.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtaddress2.setText("address2");
        getContentPane().add(jtxtaddress2);
        jtxtaddress2.setBounds(190, 180, 500, 23);

        jlblcity.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblcity.setText("Kota");
        getContentPane().add(jlblcity);
        jlblcity.setBounds(70, 200, 140, 20);

        jtxtcity.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtcity.setText("city");
        getContentPane().add(jtxtcity);
        jtxtcity.setBounds(190, 200, 150, 23);

        jlblstate.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblstate.setText("Propinsi");
        getContentPane().add(jlblstate);
        jlblstate.setBounds(70, 220, 190, 20);

        jtxtstate.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtstate.setText("state");
        getContentPane().add(jtxtstate);
        jtxtstate.setBounds(190, 220, 150, 23);

        jlblzipcode.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblzipcode.setText("Kodepos");
        getContentPane().add(jlblzipcode);
        jlblzipcode.setBounds(370, 200, 70, 20);

        jtxtzipcode.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtzipcode.setText("zipcode");
        getContentPane().add(jtxtzipcode);
        jtxtzipcode.setBounds(440, 200, 150, 23);

        jlblphone.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblphone.setText("Telephone");
        getContentPane().add(jlblphone);
        jlblphone.setBounds(70, 240, 140, 20);

        jtxtphone.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtphone.setText("phone");
        getContentPane().add(jtxtphone);
        jtxtphone.setBounds(190, 240, 150, 23);

        jlblfaximale.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblfaximale.setText("Fax");
        getContentPane().add(jlblfaximale);
        jlblfaximale.setBounds(370, 240, 70, 20);

        jtxtfaximale.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtfaximale.setText("faximale");
        getContentPane().add(jtxtfaximale);
        jtxtfaximale.setBounds(440, 240, 150, 23);

        jlblemail.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblemail.setText("E-Mail");
        getContentPane().add(jlblemail);
        jlblemail.setBounds(370, 260, 70, 20);

        jtxtemail.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtemail.setText("email");
        getContentPane().add(jtxtemail);
        jtxtemail.setBounds(440, 260, 150, 23);

        jlblpic.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblpic.setText("Penanggung Jawab");
        getContentPane().add(jlblpic);
        jlblpic.setBounds(70, 400, 120, 20);

        jlblregister_date.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblregister_date.setText("Tanggal Register");
        getContentPane().add(jlblregister_date);
        jlblregister_date.setBounds(70, 260, 140, 20);

        jtxtpic.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtpic.setText("pic");
        getContentPane().add(jtxtpic);
        jtxtpic.setBounds(190, 400, 490, 23);

        jtxtregister_date.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtregister_date.setText("register_date");
        getContentPane().add(jtxtregister_date);
        jtxtregister_date.setBounds(190, 260, 150, 23);

        jlblterm_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblterm_code.setText("Jangka Bayar");
        getContentPane().add(jlblterm_code);
        jlblterm_code.setBounds(70, 300, 140, 20);

        jtxtterm_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtterm_code.setText("term_code");
        jtxtterm_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtterm_codeKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtterm_code);
        jtxtterm_code.setBounds(190, 300, 40, 23);

        jlblsalesman_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code.setText("Kode Salesman");
        getContentPane().add(jlblsalesman_code);
        jlblsalesman_code.setBounds(70, 320, 140, 20);

        jtxtsalesman_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsalesman_code.setText("salesman_code");
        jtxtsalesman_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsalesman_codeKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtsalesman_code);
        jtxtsalesman_code.setBounds(190, 320, 40, 23);

        jlblprice_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblprice_code.setText("Kode Harga");
        getContentPane().add(jlblprice_code);
        jlblprice_code.setBounds(70, 340, 140, 20);

        jtxtprice_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtprice_code.setText("price_code");
        jtxtprice_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtprice_codeKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtprice_code);
        jtxtprice_code.setBounds(190, 340, 40, 23);

        jlbldiscount_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldiscount_code.setText("Kode Discount");
        getContentPane().add(jlbldiscount_code);
        jlbldiscount_code.setBounds(70, 360, 140, 20);

        jtxtdiscount_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdiscount_code.setText("discount_code");
        jtxtdiscount_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtdiscount_codeKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtdiscount_code);
        jtxtdiscount_code.setBounds(190, 360, 40, 23);

        jlblwarehouse_code.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblwarehouse_code.setText("Kode Gudang");
        getContentPane().add(jlblwarehouse_code);
        jlblwarehouse_code.setBounds(70, 380, 140, 20);

        jtxtwarehouse_code.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtwarehouse_code.setText("warehouse_code");
        jtxtwarehouse_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtwarehouse_codeKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtwarehouse_code);
        jtxtwarehouse_code.setBounds(190, 380, 40, 23);

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

        status_chk.setFont(new java.awt.Font("Dialog", 1, 10));
        status_chk.setText("Aktif");
        status_chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_chkActionPerformed(evt);
            }
        });
        getContentPane().add(status_chk);
        status_chk.setBounds(440, 90, 140, 20);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(240, 300, 30, 17);

        jbtnBrowse2.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse2.setText("...");
        jbtnBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse2);
        jbtnBrowse2.setBounds(240, 320, 30, 17);

        jbtnBrowse3.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse3.setText("...");
        jbtnBrowse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse3);
        jbtnBrowse3.setBounds(240, 340, 30, 17);

        jbtnBrowse4.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse4.setText("...");
        jbtnBrowse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse4);
        jbtnBrowse4.setBounds(240, 360, 30, 17);

        jbtnBrowse5.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse5.setText("...");
        jbtnBrowse5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse5);
        jbtnBrowse5.setBounds(240, 380, 30, 17);

        warehouse_name.setFont(new java.awt.Font("Dialog", 1, 10));
        warehouse_name.setText("warehouse_name");
        getContentPane().add(warehouse_name);
        warehouse_name.setBounds(280, 380, 290, 20);

        term_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        term_desc.setText("term_desc");
        getContentPane().add(term_desc);
        term_desc.setBounds(280, 300, 290, 20);

        salesman_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        salesman_desc.setText("salesman_desc");
        getContentPane().add(salesman_desc);
        salesman_desc.setBounds(280, 320, 290, 20);

        price_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        price_desc.setText("price_desc");
        getContentPane().add(price_desc);
        price_desc.setBounds(280, 340, 290, 20);

        discount_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        discount_desc.setText("discount_desc");
        getContentPane().add(discount_desc);
        discount_desc.setBounds(280, 360, 290, 20);

        jtxtaccset_kode.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtaccset_kode.setText("accset_code");
        jtxtaccset_kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtaccset_kodeKeyPressed(evt);
            }
        });
        getContentPane().add(jtxtaccset_kode);
        jtxtaccset_kode.setBounds(190, 420, 80, 23);

        jlblwarehouse_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblwarehouse_code1.setText("Set Akun");
        getContentPane().add(jlblwarehouse_code1);
        jlblwarehouse_code1.setBounds(70, 420, 140, 20);

        jbtnBrowse6.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse6.setText("...");
        jbtnBrowse6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse6);
        jbtnBrowse6.setBounds(280, 420, 30, 17);

        jlblaccset_desc.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblaccset_desc.setText("accset_desc");
        getContentPane().add(jlblaccset_desc);
        jlblaccset_desc.setBounds(320, 420, 290, 20);

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

private void status_chkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_chkActionPerformed
    if(status_chk.isSelected()){
        status = "Y";
    }else{
        status = "N";
    }
}//GEN-LAST:event_status_chkActionPerformed

private void jbtnBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse1ActionPerformed
    obrowse.showbrowser(obrowse.op_payment_term, "", jtxtterm_code, term_desc);

}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void jbtnBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse2ActionPerformed
    obrowse.showbrowser(obrowse.op_salesman, "", jtxtsalesman_code, salesman_desc);
}//GEN-LAST:event_jbtnBrowse2ActionPerformed

private void jbtnBrowse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse3ActionPerformed
        obrowse.showbrowser(obrowse.in_price, "", jtxtprice_code, price_desc);
}//GEN-LAST:event_jbtnBrowse3ActionPerformed

private void jbtnBrowse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse4ActionPerformed
        obrowse.showbrowser(obrowse.in_discount, "", jtxtdiscount_code, discount_desc);
}//GEN-LAST:event_jbtnBrowse4ActionPerformed

private void jbtnBrowse5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse5ActionPerformed
        obrowse.showbrowser(obrowse.in_warehouse, "", jtxtwarehouse_code, warehouse_name);
}//GEN-LAST:event_jbtnBrowse5ActionPerformed

private void jtxtterm_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtterm_codeKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode()==evt.VK_ENTER){
        ofind.find(ofind.op_payment_term, jtxtterm_code, term_desc);
    }
}//GEN-LAST:event_jtxtterm_codeKeyPressed

private void jtxtsalesman_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsalesman_codeKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode()==evt.VK_ENTER){
        ofind.find(ofind.op_salesman, jtxtsalesman_code, salesman_desc);
    }
}//GEN-LAST:event_jtxtsalesman_codeKeyPressed

private void jtxtprice_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtprice_codeKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode()==evt.VK_ENTER){
        ofind.find(ofind.in_price, jtxtprice_code, price_desc);
    }
}//GEN-LAST:event_jtxtprice_codeKeyPressed

private void jtxtdiscount_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdiscount_codeKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode()==evt.VK_ENTER){
        ofind.find(ofind.in_discount, jtxtdiscount_code, discount_desc);
    }
}//GEN-LAST:event_jtxtdiscount_codeKeyPressed

private void jtxtwarehouse_codeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtwarehouse_codeKeyPressed
    // TODO add your handling code here:
    if (evt.getKeyCode()==evt.VK_ENTER){
        ofind.find(ofind.in_warehouse, jtxtwarehouse_code, warehouse_name);
    }
}//GEN-LAST:event_jtxtwarehouse_codeKeyPressed

private void jtxtsupplier_codeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtsupplier_codeFocusGained
    // TODO add your handling code here:
    jtxtsupplier_code.setSelectionStart(0);
    jtxtsupplier_code.setSelectionEnd(jtxtsupplier_code.getText().length());
}//GEN-LAST:event_jtxtsupplier_codeFocusGained

private void jtxtaccset_kodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtaccset_kodeKeyPressed
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtaccset_kodeKeyPressed

private void jbtnBrowse6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse6ActionPerformed
    // TODO add your handling code here:
    obrowse.showbrowser(obrowse.ap_account_set, "", jtxtaccset_kode, jlblaccset_desc);
}//GEN-LAST:event_jbtnBrowse6ActionPerformed


private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {
    obrowse.showbrowser(obrowse.ap_supplier, "", jtxtsupplier_code, jtxtsupplier_name);

    try {
        if (!jtxtsupplier_code.getText().equalsIgnoreCase("")){
            if (obj.initdata(jtxtsupplier_code.getText())){
                showData();
            }
        }
    } catch (CodeException ex) {
        Logger.getLogger(Frmap_supplier.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmap_supplier().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JLabel discount_desc;
    private javax.swing.JLabel jHeader;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JButton jbtnBrowse2;
    private javax.swing.JButton jbtnBrowse3;
    private javax.swing.JButton jbtnBrowse4;
    private javax.swing.JButton jbtnBrowse5;
    private javax.swing.JButton jbtnBrowse6;
    private javax.swing.JLabel jlblaccset_desc;
    private javax.swing.JLabel jlbladdress1;
    private javax.swing.JLabel jlblcity;
    private javax.swing.JLabel jlbldiscount_code;
    private javax.swing.JLabel jlblemail;
    private javax.swing.JLabel jlblfaximale;
    private javax.swing.JLabel jlblphone;
    private javax.swing.JLabel jlblpic;
    private javax.swing.JLabel jlblprice_code;
    private javax.swing.JLabel jlblregister_date;
    private javax.swing.JLabel jlblsalesman_code;
    private javax.swing.JLabel jlblstate;
    private javax.swing.JLabel jlblsupplier_code;
    private javax.swing.JLabel jlblsupplier_name;
    private javax.swing.JLabel jlblterm_code;
    private javax.swing.JLabel jlblwarehouse_code;
    private javax.swing.JLabel jlblwarehouse_code1;
    private javax.swing.JLabel jlblzipcode;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtaccset_kode;
    private javax.swing.JTextField jtxtaddress1;
    private javax.swing.JTextField jtxtaddress2;
    private javax.swing.JTextField jtxtcity;
    private javax.swing.JTextField jtxtdiscount_code;
    private javax.swing.JTextField jtxtemail;
    private javax.swing.JTextField jtxtfaximale;
    private javax.swing.JTextField jtxtphone;
    private javax.swing.JTextField jtxtpic;
    private javax.swing.JTextField jtxtprice_code;
    private javax.swing.JTextField jtxtregister_date;
    private javax.swing.JTextField jtxtsalesman_code;
    private javax.swing.JTextField jtxtstate;
    private javax.swing.JTextField jtxtsupplier_code;
    private javax.swing.JTextField jtxtsupplier_name;
    private javax.swing.JTextField jtxtterm_code;
    private javax.swing.JTextField jtxtwarehouse_code;
    private javax.swing.JTextField jtxtzipcode;
    private javax.swing.JLabel price_desc;
    private javax.swing.JLabel salesman_desc;
    private javax.swing.JCheckBox status_chk;
    private javax.swing.JLabel term_desc;
    private javax.swing.JLabel warehouse_name;
    // End of variables declaration//GEN-END:variables

 
    public void moveFirst() throws CodeException {
        obj.moveFirst();
        
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void movePrevious() throws CodeException {
        obj.movePrevious();

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveNext() throws CodeException {
        obj.moveNext();

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveLast() throws CodeException {
        obj.moveLast();

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void searchData() throws CodeException {
        showData();
        mf.setIcon(CLASSNAME);

    }

    private void clearfield(){
        jtxtsupplier_code.setText("");
        jtxtsupplier_name.setText("");
        //jtxtactive_sts.setText("");
        status_chk.setSelected(false);
        jtxtaddress1.setText("");
        jtxtaddress2.setText("");
        jtxtcity.setText("");
        jtxtstate.setText("");
        jtxtzipcode.setText("");
        jtxtphone.setText("");
        jtxtfaximale.setText("");
        jtxtemail.setText("");
        jtxtpic.setText("");
        jtxtregister_date.setText("");
        jtxtterm_code.setText("");
        jtxtsalesman_code.setText("");
        jtxtprice_code.setText("");
        jtxtdiscount_code.setText("");
        jtxtwarehouse_code.setText("");
        jtxtTanggalEntry.setText("");
        jtxtTanggalUpdate.setText("");
        jtxtUserID.setText("");
        price_desc.setText("");
        discount_desc.setText("");
        salesman_desc.setText("");
        warehouse_name.setText("");
        term_desc.setText("");
    }

    public void newData() throws CodeException {
        istatus=1;
        clearfield();

        ap_optionext aop=new ap_optionext();
        aop.initdata(GlobalUtils.company);
        jtxtterm_code.setText(aop.getterm_code());
        jtxtwarehouse_code.setText(aop.getwarehouse_code());
        jtxtprice_code.setText(aop.getsales_price_code());
        jtxtdiscount_code.setText(aop.getdiscount_code());
        jtxtaccset_kode.setText(aop.getaccset_code());

        term_desc.setText(aop.getTerm_code_desc());
        warehouse_name.setText(aop.getWarehouse_code_desc());
        price_desc.setText(aop.getSales_price_code_desc());
        discount_desc.setText(aop.getDiscount_code_desc());
        jlblaccset_desc.setText(aop.getAccset_code_desc());

        setToolBar(iformtype,istatus);
    }

    public void saveData() throws CodeException {
        setData();
        obj.update();
        showData();

        istatus = 0;
        setToolBar(iformtype,istatus);
        mf.setIcon(CLASSNAME);
    }

    public void showData() throws CodeException {
        setToolBar(iformtype,istatus);
        setCursor(GlobalUtils.HOURGLASSCURSOR);

        jtxtsupplier_code.setText(obj.getsupplier_code());
        jtxtsupplier_name.setText(obj.getsupplier_name());
        //jtxtactive_sts.setText(obj.getactive_sts());
        if(obj.getactive_sts().equalsIgnoreCase("Y")){
            status_chk.setSelected(true);
        } else {
            status_chk.setSelected(false);
        }
        jtxtaddress1.setText(obj.getaddress1());
        jtxtaddress2.setText(obj.getaddress2());
        jtxtcity.setText(obj.getcity());
        jtxtstate.setText(obj.getstate());
        jtxtzipcode.setText(obj.getzipcode());
        jtxtphone.setText(obj.getphone());
        jtxtfaximale.setText(obj.getfaximale());
        jtxtemail.setText(obj.getemail());
        jtxtpic.setText(obj.getpic());
        jtxtregister_date.setText(obj.getregister_date());
        jtxtterm_code.setText(obj.getterm_code());
        jtxtsalesman_code.setText(obj.getsalesman_code());
        jtxtprice_code.setText(obj.getprice_code());
        jtxtdiscount_code.setText(obj.getdiscount_code());
        jtxtwarehouse_code.setText(obj.getwarehouse_code());
        jtxtaccset_kode.setText(obj.getaccset_code());
        
        term_desc.setText(obj.getTerm_desc());
        salesman_desc.setText(obj.getSalesman_name());
        discount_desc.setText(obj.getDiscount_desc());
        price_desc.setText(obj.getPrice_desc());
        warehouse_name.setText(obj.getWarehouse_name());
        jlblaccset_desc.setText(obj.getaccset_desc());
        jtxtTanggalEntry.setText(GlobalUtils.churuf(obj.getentrydate()));
        jtxtTanggalUpdate.setText(GlobalUtils.churuf(obj.getauditdate()));
        jtxtUserID.setText(obj.getaudituser());

        setCursor(GlobalUtils.NORMALCURSOR);
    }

    public void delete() throws CodeException {
        if (obj.delete()){
            obj.moveNext();
            showData();
        }
        mf.setIcon(CLASSNAME);
    }

    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);

        if (istatus==1){
            jbtnBrowse.setEnabled(false);
        } else {
            jbtnBrowse.setEnabled(true);
        }
    }

    public void setData() throws CodeException {
        if (istatus==1){
            obj.insert();
        }
        obj.setsupplier_code(jtxtsupplier_code.getText());
        obj.setsupplier_name(jtxtsupplier_name.getText());
        obj.setactive_sts(status);
        obj.setaddress1(jtxtaddress1.getText());
        obj.setaddress2(jtxtaddress2.getText());
        obj.setcity(jtxtcity.getText());
        obj.setstate(jtxtstate.getText());
        obj.setzipcode(jtxtzipcode.getText());
        obj.setphone(jtxtphone.getText());
        obj.setfaximale(jtxtfaximale.getText());
        obj.setemail(jtxtemail.getText());
        obj.setpic(jtxtpic.getText());
        obj.setregister_date(GlobalUtils.formatDate(jtxtregister_date.getText(),"yyyy-MM-dd"));
        obj.setterm_code(jtxtterm_code.getText());
        obj.setsalesman_code(jtxtsalesman_code.getText());
        obj.setprice_code(jtxtprice_code.getText());
        obj.setdiscount_code(jtxtdiscount_code.getText());
        obj.setwarehouse_code(jtxtwarehouse_code.getText());
        obj.setaccset_code(jtxtaccset_kode.getText());

    }

    public void undo() throws CodeException {
        istatus = 0;
        showData();
    }

    public void execute() throws CodeException {
       saveData();
    }

    public void printData() throws CodeException {
    }

    public void importCsv() throws CodeException {
            

    }

    public void exportCsv() throws CodeException {
        
        
    }

    public void importText() throws CodeException {
        
    }

    public void exportText() throws CodeException {
        
    }

    
}
