/*
 * From ko_transaksi_revisi_simpanan
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
import common.component.FrmBrowseData;
import common.component.FrmMainFrame;
import kopkar.ko.objectclasses.ko_transaksi_revisi_simpananext;
import java.util.logging.Level;
import java.util.logging.Logger;
import kopkar.ko.objectclasses.ko_anggotaext;
import kopkar.ko.objectclasses.ko_departemenext;
import kopkar.ko.objectclasses.ko_jabatanext;
import kopkar.utils.browsecontroller;
import org.kazao.calendar.KazaoCalendarDateTimeException;
import utils.CodeException;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmko_transaksi_revisi_simpanan extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmko_transaksi_revisi_simpanan";
    
    FrmMainFrame mf ;

    ko_transaksi_revisi_simpananext obj=new ko_transaksi_revisi_simpananext();
    private ko_anggotaext oagt;
    private browsecontroller obrowse=new browsecontroller();
    private ko_transaksi_revisi_simpananext objtmp;
   
    /** Creates new form Area */
    public Frmko_transaksi_revisi_simpanan() throws CodeException {
        initComponents();
    }
    
    public Frmko_transaksi_revisi_simpanan(FrmMainFrame mf) throws CodeException{
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

        btngrp_cara_entry = new javax.swing.ButtonGroup();
        btngrp_complete_status = new javax.swing.ButtonGroup();
        HorizontalLine = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jtxtmember_number = new javax.swing.JTextField();
        jlblreference = new javax.swing.JLabel();
        jtxtreference = new javax.swing.JTextField();
        jlbldscription = new javax.swing.JLabel();
        jtxtdscription = new javax.swing.JTextField();
        jlblsimpanan_wajib_awal = new javax.swing.JLabel();
        jlblsimpanan_pokok_awal = new javax.swing.JLabel();
        jlblsimpanan_sukarela_awal = new javax.swing.JLabel();
        jtxtsimpanan_wajib = new javax.swing.JTextField();
        jlblsimpanan_pokok = new javax.swing.JLabel();
        jtxtsimpanan_pokok = new javax.swing.JTextField();
        jtxtsimpanan_sukarela = new javax.swing.JTextField();
        jtxtsimpanan_khusus = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jbtnBrowse_anggota = new javax.swing.JButton();
        jlbldocument_number = new javax.swing.JLabel();
        jtxtdocument_number = new javax.swing.JTextField();
        jlbldocument_status = new javax.swing.JLabel();
        jtxtdocument_status = new javax.swing.JTextField();
        jlbldocument_date = new javax.swing.JLabel();
        kzodocument_date = new org.kazao.calendar.KazaoCalendarDate();
        jlblmember_number1 = new javax.swing.JLabel();
        jlblmember_number2 = new javax.swing.JLabel();
        jtxtmember_name = new javax.swing.JTextField();
        jlblmember_number3 = new javax.swing.JLabel();
        jtxtmember_number2 = new javax.swing.JTextField();
        jlblmember_number4 = new javax.swing.JLabel();
        jtxtnama_departemen = new javax.swing.JTextField();
        jlblmember_number5 = new javax.swing.JLabel();
        jtxtnama_jabatan = new javax.swing.JTextField();
        jHeader1 = new javax.swing.JLabel();
        jHeader2 = new javax.swing.JLabel();
        jHeader4 = new javax.swing.JLabel();
        jbtnBrowse_document = new javax.swing.JButton();
        jopt_complete_status_draff = new javax.swing.JRadioButton();
        jopt_complete_status_complete = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Revisi Potongan Simpanan");
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

        jtxtmember_number.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtmember_number.setText("member_number");
        jtxtmember_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtmember_numberFocusGained(evt);
            }
        });
        getContentPane().add(jtxtmember_number);
        jtxtmember_number.setBounds(260, 160, 150, 23);

        jlblreference.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblreference.setText("Referensi");
        getContentPane().add(jlblreference);
        jlblreference.setBounds(70, 400, 140, 13);

        jtxtreference.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtreference.setText("reference");
        jtxtreference.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtreferenceFocusGained(evt);
            }
        });
        getContentPane().add(jtxtreference);
        jtxtreference.setBounds(260, 400, 300, 23);

        jlbldscription.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldscription.setText("Keterangan");
        getContentPane().add(jlbldscription);
        jlbldscription.setBounds(70, 420, 140, 13);

        jtxtdscription.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdscription.setText("dscription");
        jtxtdscription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdscriptionFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdscription);
        jtxtdscription.setBounds(260, 420, 300, 23);

        jlblsimpanan_wajib_awal.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsimpanan_wajib_awal.setText("Wajib");
        getContentPane().add(jlblsimpanan_wajib_awal);
        jlblsimpanan_wajib_awal.setBounds(70, 300, 140, 13);

        jlblsimpanan_pokok_awal.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsimpanan_pokok_awal.setText("Pokok");
        getContentPane().add(jlblsimpanan_pokok_awal);
        jlblsimpanan_pokok_awal.setBounds(70, 320, 140, 13);

        jlblsimpanan_sukarela_awal.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsimpanan_sukarela_awal.setText("Sukarela");
        getContentPane().add(jlblsimpanan_sukarela_awal);
        jlblsimpanan_sukarela_awal.setBounds(70, 340, 140, 13);

        jtxtsimpanan_wajib.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jtxtsimpanan_wajib.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtsimpanan_wajib.setText("simpanan_wajib");
        jtxtsimpanan_wajib.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtsimpanan_wajibFocusGained(evt);
            }
        });
        jtxtsimpanan_wajib.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtsimpanan_wajibKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtsimpanan_wajib);
        jtxtsimpanan_wajib.setBounds(260, 300, 150, 23);

        jlblsimpanan_pokok.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsimpanan_pokok.setText("Khusus");
        getContentPane().add(jlblsimpanan_pokok);
        jlblsimpanan_pokok.setBounds(70, 360, 140, 13);

        jtxtsimpanan_pokok.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsimpanan_pokok.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtsimpanan_pokok.setText("simpanan_pokok");
        jtxtsimpanan_pokok.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtsimpanan_pokokFocusGained(evt);
            }
        });
        jtxtsimpanan_pokok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtsimpanan_pokokKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtsimpanan_pokok);
        jtxtsimpanan_pokok.setBounds(260, 320, 150, 23);

        jtxtsimpanan_sukarela.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsimpanan_sukarela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtsimpanan_sukarela.setText("simpanan_sukarela");
        jtxtsimpanan_sukarela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtsimpanan_sukarelaFocusGained(evt);
            }
        });
        jtxtsimpanan_sukarela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtsimpanan_sukarelaKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtsimpanan_sukarela);
        jtxtsimpanan_sukarela.setBounds(260, 340, 150, 23);

        jtxtsimpanan_khusus.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtsimpanan_khusus.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtsimpanan_khusus.setText("simpanan_khusus");
        jtxtsimpanan_khusus.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtsimpanan_khususFocusGained(evt);
            }
        });
        jtxtsimpanan_khusus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtsimpanan_khususKeyReleased(evt);
            }
        });
        getContentPane().add(jtxtsimpanan_khusus);
        jtxtsimpanan_khusus.setBounds(260, 360, 150, 23);

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

        jbtnBrowse_anggota.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_anggota.setText("...");
        jbtnBrowse_anggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_anggotaActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_anggota);
        jbtnBrowse_anggota.setBounds(410, 160, 30, 17);

        jlbldocument_number.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_number.setText("No. Registrasi");
        getContentPane().add(jlbldocument_number);
        jlbldocument_number.setBounds(520, 100, 110, 13);

        jtxtdocument_number.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocument_number.setText("document_number");
        jtxtdocument_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_numberFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocument_number);
        jtxtdocument_number.setBounds(710, 100, 120, 23);

        jlbldocument_status.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_status.setText("Status");
        getContentPane().add(jlbldocument_status);
        jlbldocument_status.setBounds(520, 80, 140, 13);

        jtxtdocument_status.setEditable(false);
        jtxtdocument_status.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocument_status.setText("document_status");
        jtxtdocument_status.setFocusable(false);
        jtxtdocument_status.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_statusFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocument_status);
        jtxtdocument_status.setBounds(710, 80, 150, 23);

        jlbldocument_date.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_date.setText("Tgl. Dokumen");
        getContentPane().add(jlbldocument_date);
        jlbldocument_date.setBounds(520, 120, 140, 13);

        kzodocument_date.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date.setOpaque(false);
        getContentPane().add(kzodocument_date);
        kzodocument_date.setBounds(710, 120, 100, 20);

        jlblmember_number1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblmember_number1.setText("No. Anggota");
        getContentPane().add(jlblmember_number1);
        jlblmember_number1.setBounds(70, 160, 140, 13);

        jlblmember_number2.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblmember_number2.setText("Nama Anggota");
        getContentPane().add(jlblmember_number2);
        jlblmember_number2.setBounds(70, 180, 140, 13);

        jtxtmember_name.setEditable(false);
        jtxtmember_name.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtmember_name.setText("member_number");
        jtxtmember_name.setFocusable(false);
        jtxtmember_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtmember_nameFocusGained(evt);
            }
        });
        getContentPane().add(jtxtmember_name);
        jtxtmember_name.setBounds(260, 180, 350, 23);

        jlblmember_number3.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblmember_number3.setText("N.I.K");
        getContentPane().add(jlblmember_number3);
        jlblmember_number3.setBounds(70, 200, 140, 13);

        jtxtmember_number2.setEditable(false);
        jtxtmember_number2.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtmember_number2.setText("member_number");
        jtxtmember_number2.setFocusable(false);
        jtxtmember_number2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtmember_number2FocusGained(evt);
            }
        });
        getContentPane().add(jtxtmember_number2);
        jtxtmember_number2.setBounds(260, 200, 150, 23);

        jlblmember_number4.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblmember_number4.setText("Departemen");
        getContentPane().add(jlblmember_number4);
        jlblmember_number4.setBounds(70, 220, 140, 13);

        jtxtnama_departemen.setEditable(false);
        jtxtnama_departemen.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_departemen.setText("member_number");
        jtxtnama_departemen.setFocusable(false);
        jtxtnama_departemen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtnama_departemenFocusGained(evt);
            }
        });
        getContentPane().add(jtxtnama_departemen);
        jtxtnama_departemen.setBounds(260, 220, 260, 23);

        jlblmember_number5.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblmember_number5.setText("Jabatan");
        getContentPane().add(jlblmember_number5);
        jlblmember_number5.setBounds(70, 240, 140, 13);

        jtxtnama_jabatan.setEditable(false);
        jtxtnama_jabatan.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtnama_jabatan.setText("member_number");
        jtxtnama_jabatan.setFocusable(false);
        jtxtnama_jabatan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtnama_jabatanFocusGained(evt);
            }
        });
        getContentPane().add(jtxtnama_jabatan);
        jtxtnama_jabatan.setBounds(260, 240, 260, 23);

        jHeader1.setBackground(new java.awt.Color(102, 102, 102));
        jHeader1.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader1.setForeground(new java.awt.Color(255, 255, 255));
        jHeader1.setText(" : : Revisi Potongan Simpanan");
        jHeader1.setAlignmentY(0.0F);
        jHeader1.setOpaque(true);
        getContentPane().add(jHeader1);
        jHeader1.setBounds(30, 30, 200, 20);

        jHeader2.setBackground(new java.awt.Color(102, 102, 102));
        jHeader2.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader2.setForeground(new java.awt.Color(255, 255, 255));
        jHeader2.setText("Simpanan");
        jHeader2.setAlignmentY(0.0F);
        jHeader2.setOpaque(true);
        getContentPane().add(jHeader2);
        jHeader2.setBounds(70, 270, 190, 20);

        jHeader4.setBackground(new java.awt.Color(102, 102, 102));
        jHeader4.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader4.setForeground(new java.awt.Color(255, 255, 255));
        jHeader4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHeader4.setText("Jumlah");
        jHeader4.setAlignmentY(0.0F);
        jHeader4.setOpaque(true);
        getContentPane().add(jHeader4);
        jHeader4.setBounds(260, 270, 150, 20);

        jbtnBrowse_document.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_document.setText("...");
        jbtnBrowse_document.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_documentActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_document);
        jbtnBrowse_document.setBounds(830, 100, 30, 17);

        btngrp_complete_status.add(jopt_complete_status_draff);
        jopt_complete_status_draff.setFont(new java.awt.Font("Dialog", 0, 10));
        jopt_complete_status_draff.setSelected(true);
        jopt_complete_status_draff.setText("Draff");
        getContentPane().add(jopt_complete_status_draff);
        jopt_complete_status_draff.setBounds(70, 450, 52, 24);

        btngrp_complete_status.add(jopt_complete_status_complete);
        jopt_complete_status_complete.setFont(new java.awt.Font("Dialog", 0, 10));
        jopt_complete_status_complete.setText("Complete");
        getContentPane().add(jopt_complete_status_complete);
        jopt_complete_status_complete.setBounds(150, 450, 123, 24);

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

private void jtxtdocument_numberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtdocument_numberFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtdocument_numberFocusGained

private void jtxtdocument_statusFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtdocument_statusFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtdocument_statusFocusGained

private void jtxtmember_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtmember_nameFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtmember_nameFocusGained

private void jtxtmember_number2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtmember_number2FocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtmember_number2FocusGained

private void jtxtnama_departemenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtnama_departemenFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtnama_departemenFocusGained

private void jtxtnama_jabatanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtnama_jabatanFocusGained
    // TODO add your handling code here:
}//GEN-LAST:event_jtxtnama_jabatanFocusGained

private void jbtnBrowse_anggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_anggotaActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.ko_anggota, "", jtxtmember_number);

    if (!jtxtmember_number.getText().equalsIgnoreCase("")){
        showanggota();
    }
}//GEN-LAST:event_jbtnBrowse_anggotaActionPerformed

private void jtxtsimpanan_wajibKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsimpanan_wajibKeyReleased
    // TODO add your handling code here:
    GlobalUtils.domasking(jtxtsimpanan_wajib);
    calculateakhir();
}//GEN-LAST:event_jtxtsimpanan_wajibKeyReleased

private void jtxtsimpanan_pokokKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsimpanan_pokokKeyReleased
    // TODO add your handling code here:
    GlobalUtils.domasking(jtxtsimpanan_pokok);
    calculateakhir();
}//GEN-LAST:event_jtxtsimpanan_pokokKeyReleased

private void jtxtsimpanan_sukarelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsimpanan_sukarelaKeyReleased
    // TODO add your handling code here:
    GlobalUtils.domasking(jtxtsimpanan_sukarela);
    calculateakhir();
}//GEN-LAST:event_jtxtsimpanan_sukarelaKeyReleased

private void jtxtsimpanan_khususKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsimpanan_khususKeyReleased
    // TODO add your handling code here:
    GlobalUtils.domasking(jtxtsimpanan_khusus);
    calculateakhir();
}//GEN-LAST:event_jtxtsimpanan_khususKeyReleased

private void jbtnBrowse_documentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_documentActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.ko_transaksi_revisi_simpanan, "", jtxtdocument_number);
    if (!jtxtdocument_number.getText().equalsIgnoreCase("")){
            try {
                if (obj.initdata(jtxtdocument_number.getText())) {
                    showData();
                }
            } catch (CodeException ex) {
                Logger.getLogger(Frmko_transaksi_revisi_simpanan.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jbtnBrowse_documentActionPerformed

private void jtxtsimpanan_wajibFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtsimpanan_wajibFocusGained
    // TODO add your handling code here:
    jtxtsimpanan_wajib.setSelectionStart(0);
    jtxtsimpanan_wajib.setSelectionEnd(jtxtsimpanan_wajib.getText().length());
}//GEN-LAST:event_jtxtsimpanan_wajibFocusGained


private void jtxtmember_numberFocusGained(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    jtxtmember_number.setSelectionStart(0);
    jtxtmember_number.setSelectionEnd(jtxtmember_number.getText().length());
}                                             

private void jtxtreferenceFocusGained(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
    jtxtreference.setSelectionStart(0);
    jtxtreference.setSelectionEnd(jtxtreference.getText().length());
}                                         

private void jtxtdscriptionFocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
    jtxtdscription.setSelectionStart(0);
    jtxtdscription.setSelectionEnd(jtxtdscription.getText().length());
}                                          
                                     

private void jtxtsimpanan_pokokFocusGained(java.awt.event.FocusEvent evt) {                                            
        // TODO add your handling code here:
    jtxtsimpanan_pokok.setSelectionStart(0);
    jtxtsimpanan_pokok.setSelectionEnd(jtxtsimpanan_pokok.getText().length());
}                                              

private void jtxtsimpanan_sukarelaFocusGained(java.awt.event.FocusEvent evt) {                                               
        // TODO add your handling code here:
    jtxtsimpanan_sukarela.setSelectionStart(0);
    jtxtsimpanan_sukarela.setSelectionEnd(jtxtsimpanan_sukarela.getText().length());
}                                                 

private void jtxtsimpanan_khususFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtsimpanan_khusus.setSelectionStart(0);
    jtxtsimpanan_khusus.setSelectionEnd(jtxtsimpanan_khusus.getText().length());
}                                               

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmko_transaksi_revisi_simpanan().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.ButtonGroup btngrp_cara_entry;
    private javax.swing.ButtonGroup btngrp_complete_status;
    private javax.swing.JLabel jHeader1;
    private javax.swing.JLabel jHeader2;
    private javax.swing.JLabel jHeader4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse_anggota;
    private javax.swing.JButton jbtnBrowse_document;
    private javax.swing.JLabel jlbldocument_date;
    private javax.swing.JLabel jlbldocument_number;
    private javax.swing.JLabel jlbldocument_status;
    private javax.swing.JLabel jlbldscription;
    private javax.swing.JLabel jlblmember_number1;
    private javax.swing.JLabel jlblmember_number2;
    private javax.swing.JLabel jlblmember_number3;
    private javax.swing.JLabel jlblmember_number4;
    private javax.swing.JLabel jlblmember_number5;
    private javax.swing.JLabel jlblreference;
    private javax.swing.JLabel jlblsimpanan_pokok;
    private javax.swing.JLabel jlblsimpanan_pokok_awal;
    private javax.swing.JLabel jlblsimpanan_sukarela_awal;
    private javax.swing.JLabel jlblsimpanan_wajib_awal;
    private javax.swing.JRadioButton jopt_complete_status_complete;
    private javax.swing.JRadioButton jopt_complete_status_draff;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtdocument_number;
    private javax.swing.JTextField jtxtdocument_status;
    private javax.swing.JTextField jtxtdscription;
    private javax.swing.JTextField jtxtmember_name;
    private javax.swing.JTextField jtxtmember_number;
    private javax.swing.JTextField jtxtmember_number2;
    private javax.swing.JTextField jtxtnama_departemen;
    private javax.swing.JTextField jtxtnama_jabatan;
    private javax.swing.JTextField jtxtreference;
    private javax.swing.JTextField jtxtsimpanan_khusus;
    private javax.swing.JTextField jtxtsimpanan_pokok;
    private javax.swing.JTextField jtxtsimpanan_sukarela;
    private javax.swing.JTextField jtxtsimpanan_wajib;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date;
    // End of variables declaration//GEN-END:variables

 
    public void moveFirst() throws CodeException {
        obj.moveFirst();
        if (obj.getdocentry()==0){
            newData();
        }
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
        jtxtdocument_number.setText("");
        jtxtdocument_status.setText("");
        jopt_complete_status_draff.setSelected(true);
        try {
            kzodocument_date.setDate(GlobalUtils.getCurrentDate());
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmko_transaksi_revisi_simpanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtxtmember_number.setText("");
        jtxtreference.setText("");
        jtxtdscription.setText("");
        jtxtsimpanan_wajib.setText("0");
        jtxtsimpanan_pokok.setText("0");
        jtxtsimpanan_sukarela.setText("0");
        jtxtsimpanan_khusus.setText("0");
        jtxtTanggalEntry.setText("");
        jtxtTanggalUpdate.setText("");
        jtxtUserID.setText("");

        jtxtnama_departemen.setText("");
        jtxtnama_jabatan.setText("");
        jtxtmember_number2.setText("");
        jtxtmember_name.setText("");
    }

    public void newData() throws CodeException {
        istatus=1;
        objtmp=obj;
        obj=new ko_transaksi_revisi_simpananext();
        showData();
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

        jtxtdocument_number.setText(obj.getdocument_number());
        jtxtdocument_status.setText(obj.getdocument_status());
        if (obj.getcomplete_status().equalsIgnoreCase("Y")){
            jopt_complete_status_complete.setSelected(true);
        } else {
            jopt_complete_status_draff.setSelected(true);
        }
        try {
            kzodocument_date.setDate(GlobalUtils.formatDate(obj.getdocument_date(), "MM/dd/yyyy"));
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmko_transaksi_revisi_simpanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        jtxtmember_number.setText(obj.getmember_number());
        showanggota();
        jtxtreference.setText(obj.getreference());
        jtxtdscription.setText(obj.getdscription());
        jtxtsimpanan_wajib.setText(GlobalUtils.formatnumber(obj.getsimpanan_wajib()));
        jtxtsimpanan_pokok.setText(GlobalUtils.formatnumber(obj.getsimpanan_pokok()));
        jtxtsimpanan_sukarela.setText(GlobalUtils.formatnumber(obj.getsimpanan_sukarela()));
        jtxtsimpanan_khusus.setText(GlobalUtils.formatnumber(obj.getsimpanan_khusus()));
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
        if (obj.getdocument_status().equalsIgnoreCase("C")){
            mf.setToolBar(iformtype,7);
        }
        if (istatus==1){
            jbtnBrowse_document.setEnabled(false);
        } else {
            jbtnBrowse_document.setEnabled(true);
        }
    }

    public void setData() throws CodeException {
        if (istatus==1){
            obj.insert();
        }
        obj.setdocument_number(jtxtdocument_number.getText());
        obj.setdocument_status(jtxtdocument_status.getText());
        if (jopt_complete_status_complete.isSelected()){
            obj.setcomplete_status("Y");
        } else {
            obj.setcomplete_status("N");
        }
        obj.setdocument_date(kzodocument_date.getDate());
        obj.setmember_number(jtxtmember_number.getText());
        obj.setreference(jtxtreference.getText());
        obj.setdscription(jtxtdscription.getText());
        obj.setsimpanan_wajib(GlobalUtils.toDbl(jtxtsimpanan_wajib.getText()));
        obj.setsimpanan_pokok(GlobalUtils.toDbl(jtxtsimpanan_pokok.getText()));
        obj.setsimpanan_sukarela(GlobalUtils.toDbl(jtxtsimpanan_sukarela.getText()));
        obj.setsimpanan_khusus(GlobalUtils.toDbl(jtxtsimpanan_khusus.getText()));

    }

    public void undo() throws CodeException {
        istatus = 0;
        obj=objtmp;
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

    private void showanggota() {
        oagt=new ko_anggotaext();
        try {
            oagt.initdata(jtxtmember_number.getText());
            jtxtmember_name.setText(oagt.getmember_name());
            jtxtmember_number2.setText(oagt.getemployee_number());
            ko_departemenext odept=oagt.getdepinfo();
            ko_jabatanext ojbt=oagt.getjbtinfo();
            jtxtnama_departemen.setText(odept.getnama_departemen());
            jtxtnama_jabatan.setText(ojbt.getnama_jabatan());

            jtxtsimpanan_wajib.setText(GlobalUtils.formatnumber(oagt.getsimpanan_wajib()));
            jtxtsimpanan_pokok.setText(GlobalUtils.formatnumber(oagt.getsimpanan_pokok()));
            jtxtsimpanan_sukarela.setText(GlobalUtils.formatnumber(oagt.getsimpanan_sukarela()));
            jtxtsimpanan_khusus.setText(GlobalUtils.formatnumber(oagt.getsimpanan_khusus()));

        } catch (CodeException ex) {
            Logger.getLogger(Frmko_transaksi_revisi_simpanan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void calculateakhir() {
        obj.setsimpanan_khusus(GlobalUtils.toDbl(jtxtsimpanan_khusus.getText()));
        obj.setsimpanan_wajib(GlobalUtils.toDbl(jtxtsimpanan_wajib.getText()));
        obj.setsimpanan_pokok(GlobalUtils.toDbl(jtxtsimpanan_pokok.getText()));
        obj.setsimpanan_sukarela(GlobalUtils.toDbl(jtxtsimpanan_sukarela.getText()));

    }

    
}
