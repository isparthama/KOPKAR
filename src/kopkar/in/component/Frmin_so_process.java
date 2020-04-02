/*
 * From in_so_process
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
import common.component.FrmBrowseData;
import common.component.FrmMainFrame;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import kopkar.in.objectclasses.in_so_process_detail1ext;
import kopkar.in.objectclasses.in_so_processext;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import kopkar.in.objectclasses.in_productext;
import kopkar.in.objectclasses.in_so_process_detail1extcol;
import kopkar.utils.browsecontroller;
import org.kazao.calendar.KazaoCalendarDateTimeException;
import utils.CodeException;
import utils.GlobalModel;
import utils.GlobalUtils;
import utils.selectallJTable;

/**
 *
 * @author  Generator
 */

public class Frmin_so_process extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 0;
    public static String CLASSNAME="Frmin_so_process";
    
    FrmMainFrame mf ;

    in_so_processext obj=new in_so_processext();
    private DefaultTableModel model;
    private in_so_process_detail1extcol objd;
    private browsecontroller obrowse;
    private in_so_processext objtmp;
   
    /** Creates new form Area */
    public Frmin_so_process() throws CodeException {
        initComponents();
    }
    
    public Frmin_so_process(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
        model=(DefaultTableModel) jtbldetail.getModel();
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
        jbtnBrowse_document = new javax.swing.JButton();
        jlbldocument_number = new javax.swing.JLabel();
        jtxtdocument_number = new javax.swing.JTextField();
        jlbldocument_status = new javax.swing.JLabel();
        jtxtdocument_status = new javax.swing.JTextField();
        jlblcomplete_status = new javax.swing.JLabel();
        jlbldocument_date = new javax.swing.JLabel();
        jlblbrand_code_fr = new javax.swing.JLabel();
        jlblbrand_code_to = new javax.swing.JLabel();
        jlblreference = new javax.swing.JLabel();
        jtxtreference = new javax.swing.JTextField();
        jlbldscription = new javax.swing.JLabel();
        jtxtdscription = new javax.swing.JTextField();
        jlbltotal_adm_qty = new javax.swing.JLabel();
        jtxttotal_adm_qty = new javax.swing.JTextField();
        jtxtTanggalEntry = new javax.swing.JTextField();
        jtxtTanggalUpdate = new javax.swing.JTextField();
        jtxtUserID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbldetail = new selectallJTable(model);
        jlblbrand_code_fr1 = new javax.swing.JLabel();
        joptcomplete_status_Complete = new javax.swing.JRadioButton();
        joptcomplete_status_draff = new javax.swing.JRadioButton();
        kzodocument_date = new org.kazao.calendar.KazaoCalendarDate();
        kzodocument_date_to = new org.kazao.calendar.KazaoCalendarDate();
        kzodocument_date_fr = new org.kazao.calendar.KazaoCalendarDate();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lembar Kerja Stock Opname");
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
        jHeader.setText(" : : Lembar Kerja Stock Opname");
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

        jbtnBrowse_document.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse_document.setText("...");
        jbtnBrowse_document.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse_documentActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse_document);
        jbtnBrowse_document.setBounds(890, 100, 30, 17);

        jlbldocument_number.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_number.setText("No. Dokumen");
        getContentPane().add(jlbldocument_number);
        jlbldocument_number.setBounds(550, 100, 140, 13);

        jtxtdocument_number.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocument_number.setText("document_number");
        jtxtdocument_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_numberFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocument_number);
        jtxtdocument_number.setBounds(740, 100, 150, 23);

        jlbldocument_status.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_status.setText("Status");
        getContentPane().add(jlbldocument_status);
        jlbldocument_status.setBounds(550, 80, 140, 13);

        jtxtdocument_status.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdocument_status.setText("document_status");
        jtxtdocument_status.setFocusable(false);
        jtxtdocument_status.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdocument_statusFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdocument_status);
        jtxtdocument_status.setBounds(740, 80, 150, 23);

        jlblcomplete_status.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblcomplete_status.setText("complete_status");
        getContentPane().add(jlblcomplete_status);
        jlblcomplete_status.setBounds(70, 430, 140, 13);

        jlbldocument_date.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldocument_date.setText("Tgl. Dokumen");
        getContentPane().add(jlbldocument_date);
        jlbldocument_date.setBounds(550, 120, 140, 13);

        jlblbrand_code_fr.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblbrand_code_fr.setText("Stock Opname Periode");
        getContentPane().add(jlblbrand_code_fr);
        jlblbrand_code_fr.setBounds(70, 80, 140, 13);

        jlblbrand_code_to.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblbrand_code_to.setText("S.d Tanggal Dokumen");
        getContentPane().add(jlblbrand_code_to);
        jlblbrand_code_to.setBounds(70, 120, 140, 13);

        jlblreference.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblreference.setText("Referensi");
        getContentPane().add(jlblreference);
        jlblreference.setBounds(70, 380, 140, 13);

        jtxtreference.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtreference.setText("reference");
        jtxtreference.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtreferenceFocusGained(evt);
            }
        });
        getContentPane().add(jtxtreference);
        jtxtreference.setBounds(260, 380, 150, 23);

        jlbldscription.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbldscription.setText("Keterangan");
        getContentPane().add(jlbldscription);
        jlbldscription.setBounds(70, 400, 140, 13);

        jtxtdscription.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxtdscription.setText("dscription");
        jtxtdscription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtdscriptionFocusGained(evt);
            }
        });
        getContentPane().add(jtxtdscription);
        jtxtdscription.setBounds(260, 400, 150, 23);

        jlbltotal_adm_qty.setFont(new java.awt.Font("Dialog", 1, 10));
        jlbltotal_adm_qty.setText("Total");
        getContentPane().add(jlbltotal_adm_qty);
        jlbltotal_adm_qty.setBounds(590, 380, 140, 13);

        jtxttotal_adm_qty.setFont(new java.awt.Font("Dialog", 0, 10));
        jtxttotal_adm_qty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxttotal_adm_qty.setText("total_adm_qty");
        jtxttotal_adm_qty.setFocusable(false);
        jtxttotal_adm_qty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxttotal_adm_qtyFocusGained(evt);
            }
        });
        getContentPane().add(jtxttotal_adm_qty);
        jtxttotal_adm_qty.setBounds(780, 380, 150, 23);

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

        jButton1.setFont(new java.awt.Font("Dialog", 0, 10));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(840, 140, 80, 20);

        jtbldetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "#", "Documen No", "Keterangan", "Total SO Qty", "Total Adm Qty", "Stock.Qty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbldetail.setSurrendersFocusOnKeystroke(true);
        jtbldetail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtbldetailFocusGained(evt);
            }
        });
        jtbldetail.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtbldetailPropertyChange(evt);
            }
        });
        jtbldetail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtbldetailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtbldetailKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtbldetail);
        jtbldetail.getColumnModel().getColumn(0).setMaxWidth(30);
        jtbldetail.getColumnModel().getColumn(2).setMinWidth(300);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 170, 860, 200);

        jlblbrand_code_fr1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblbrand_code_fr1.setText("Dari Tanggal Dokumen");
        getContentPane().add(jlblbrand_code_fr1);
        jlblbrand_code_fr1.setBounds(70, 100, 140, 13);

        buttonGroup1.add(joptcomplete_status_Complete);
        joptcomplete_status_Complete.setFont(new java.awt.Font("Dialog", 1, 10));
        joptcomplete_status_Complete.setText("Complete");
        getContentPane().add(joptcomplete_status_Complete);
        joptcomplete_status_Complete.setBounds(330, 430, 123, 24);

        buttonGroup1.add(joptcomplete_status_draff);
        joptcomplete_status_draff.setFont(new java.awt.Font("Dialog", 1, 10));
        joptcomplete_status_draff.setSelected(true);
        joptcomplete_status_draff.setText("Draff");
        getContentPane().add(joptcomplete_status_draff);
        joptcomplete_status_draff.setBounds(260, 430, 54, 24);

        kzodocument_date.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date.setOpaque(false);
        getContentPane().add(kzodocument_date);
        kzodocument_date.setBounds(740, 120, 100, 20);

        kzodocument_date_to.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_to.setOpaque(false);
        getContentPane().add(kzodocument_date_to);
        kzodocument_date_to.setBounds(260, 120, 100, 20);

        kzodocument_date_fr.setFont(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setFontDate(new java.awt.Font("Dialog", 0, 10));
        kzodocument_date_fr.setOpaque(false);
        getContentPane().add(kzodocument_date_fr);
        kzodocument_date_fr.setBounds(260, 100, 100, 20);

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

private void jbtnBrowse_documentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBrowse_documentActionPerformed
    // TODO add your handling code here:
    obrowse=new browsecontroller();
    obrowse.showbrowser(obrowse.in_so_process, "", jtxtdocument_number);

    if (!jtxtdocument_number.getText().equalsIgnoreCase("")){
            try {
                if (obj.initdata(jtxtdocument_number.getText())) {
                    showData();
                }
            } catch (CodeException ex) {
                Logger.getLogger(Frmin_so_process.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}//GEN-LAST:event_jbtnBrowse_documentActionPerformed

private void jtbldetailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtbldetailFocusGained
    // TODO add your handling code here:
    if (jtbldetail.getRowCount()==0){
        insertnewlastrow();
    }
}//GEN-LAST:event_jtbldetailFocusGained

private void jtbldetailPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtbldetailPropertyChange
    // TODO add your handling code here:
    int irow=jtbldetail.getSelectedRow();
    int icol=jtbldetail.getSelectedColumn();

    if (irow>-1){
        switch (icol){
            case 3:
                showproduct(irow);
                break;
        }
        cekdetail();
        obj.calculatetotal();
        jtxttotal_adm_qty.setText(GlobalUtils.formatnumber(obj.gettotal_adm_qty()));
        jHeader.setText(" : : Lembar Kerja Stock Opname ("+objd.size()+")");
    }
}//GEN-LAST:event_jtbldetailPropertyChange

private void jtbldetailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbldetailKeyPressed
    // TODO add your handling code here:
    int col=jtbldetail.getSelectedColumn();
    int row=jtbldetail.getSelectedRow();
    switch (evt.getKeyCode()){
        case KeyEvent.VK_F5:
            switch (jtbldetail.getSelectedColumn()){
                case 1:
                    obrowse=new browsecontroller();
                    obrowse.showbrowser(obrowse.in_product, "", jtbldetail);
                    showproduct((Integer)jtbldetail.getSelectedRow());
                    jtbldetailPropertyChange(null);
                    GlobalUtils.selectCellTable(jtbldetail, row, 3);
                    break;
            }
            break;
        case KeyEvent.VK_INSERT:
            evt.consume();
            insertnewlastrow();
            break;
        case KeyEvent.VK_DELETE:
            evt.consume();
            if (jtbldetail.getSelectedRow()<objd.size()){
            in_so_process_detail1ext o = objd.get(jtbldetail.getSelectedRow());
                o.setstatus(in_so_process_detail1ext.Status_delete);
            }
            jtbldetailPropertyChange(null);
            break;
        case KeyEvent.VK_ENTER:
            evt.consume();
            break;
    }
}//GEN-LAST:event_jtbldetailKeyPressed

private void jtbldetailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtbldetailKeyReleased
    // TODO add your handling code here:
    int col=jtbldetail.getSelectedColumn();
    int row=jtbldetail.getSelectedRow();
// TODO add your handling code here:
    if (evt.getKeyCode()==evt.VK_ENTER&&row>-1){
        switch (col){
            case 1:
                showproduct(row);
                jtbldetailPropertyChange(null);
                GlobalUtils.selectCellTable(jtbldetail, row, 3);
                break;
            case 5:
                insertnewlastrow();
                break;
        }
    }
}//GEN-LAST:event_jtbldetailKeyReleased

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    if (obj.retrievedata(kzodocument_date_fr.getDate(),kzodocument_date_to.getDate())){
        showdetail();
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jtxtdocument_numberFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtdocument_number.setSelectionStart(0);
    jtxtdocument_number.setSelectionEnd(jtxtdocument_number.getText().length());
}                                               

private void jtxtdocument_statusFocusGained(java.awt.event.FocusEvent evt) {                                             
        // TODO add your handling code here:
    jtxtdocument_status.setSelectionStart(0);
    jtxtdocument_status.setSelectionEnd(jtxtdocument_status.getText().length());
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

private void jtxttotal_adm_qtyFocusGained(java.awt.event.FocusEvent evt) {                                           
        // TODO add your handling code here:
    jtxttotal_adm_qty.setSelectionStart(0);
    jtxttotal_adm_qty.setSelectionEnd(jtxttotal_adm_qty.getText().length());
}                                             

private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    FrmBrowseData frmbrowse=new FrmBrowseData("in_so_process", "");
    frmbrowse.setModal(true);
    frmbrowse.setVisible(true);
    try {
        obj.initdata(frmbrowse.getValue());
        showData();
    } catch (CodeException ex) {
        Logger.getLogger(Frmin_so_process.class.getName()).log(Level.SEVERE, null, ex);
    }
}                                                                                 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmin_so_process().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbtnBrowse_document;
    private javax.swing.JLabel jlblbrand_code_fr;
    private javax.swing.JLabel jlblbrand_code_fr1;
    private javax.swing.JLabel jlblbrand_code_to;
    private javax.swing.JLabel jlblcomplete_status;
    private javax.swing.JLabel jlbldocument_date;
    private javax.swing.JLabel jlbldocument_number;
    private javax.swing.JLabel jlbldocument_status;
    private javax.swing.JLabel jlbldscription;
    private javax.swing.JLabel jlblreference;
    private javax.swing.JLabel jlbltotal_adm_qty;
    private javax.swing.JRadioButton joptcomplete_status_Complete;
    private javax.swing.JRadioButton joptcomplete_status_draff;
    private javax.swing.JTable jtbldetail;
    private javax.swing.JTextField jtxtTanggalEntry;
    private javax.swing.JTextField jtxtTanggalUpdate;
    private javax.swing.JTextField jtxtUserID;
    private javax.swing.JTextField jtxtdocument_number;
    private javax.swing.JTextField jtxtdocument_status;
    private javax.swing.JTextField jtxtdscription;
    private javax.swing.JTextField jtxtreference;
    private javax.swing.JTextField jtxttotal_adm_qty;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_fr;
    private org.kazao.calendar.KazaoCalendarDate kzodocument_date_to;
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
        jtxtdocument_number.setText("");
        jtxtdocument_status.setText("");

        joptcomplete_status_draff.setSelected(true);
        try {
            kzodocument_date.setDate(GlobalUtils.getCurrentDate());
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmin_so_process.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            kzodocument_date_fr.setDate(GlobalUtils.getCurrentDate());
            kzodocument_date_fr.setDate(GlobalUtils.getCurrentDate());
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmin_so_process.class.getName()).log(Level.SEVERE, null, ex);
        }


        jtxtreference.setText("");
        jtxtdscription.setText("");
        jtxttotal_adm_qty.setText("0");

        jtxtTanggalEntry.setText("");
        jtxtTanggalUpdate.setText("");
        jtxtUserID.setText("");


        GlobalModel.clearRow(model);
        insertnewlastrow();
    }

    public void newData() throws CodeException {
        istatus=1;
        objtmp=obj;
        obj=new in_so_processext();

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
        jtxtdocument_status.setText(obj.getdocument_status_desc());
        if (obj.getcomplete_status().equalsIgnoreCase("Y")){
            joptcomplete_status_Complete.setSelected(true);
        }  else {
            joptcomplete_status_draff.setSelected(true);
        }
        try {
            kzodocument_date.setDate(GlobalUtils.formatDate(obj.getdocument_date(),"MM/dd/yyyy"));
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmin_so_process.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            kzodocument_date_fr.setDate(GlobalUtils.formatDate(obj.getdocument_date_fr(),"MM/dd/yyyy"));
            kzodocument_date_to.setDate(GlobalUtils.formatDate(obj.getdocument_date_to(),"MM/dd/yyyy"));
        } catch (KazaoCalendarDateTimeException ex) {
            Logger.getLogger(Frmin_so_process.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jtxtreference.setText(obj.getreference());
        jtxtdscription.setText(obj.getdscription());
        jtxttotal_adm_qty.setText(GlobalUtils.formatnumber(obj.gettotal_adm_qty()));

        jtxtTanggalEntry.setText(GlobalUtils.churuf(obj.getentrydate()));
        jtxtTanggalUpdate.setText(GlobalUtils.churuf(obj.getauditdate()));
        jtxtUserID.setText(obj.getaudituser());

        GlobalModel.clearRow(model);
        showdetail();
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
        if (joptcomplete_status_Complete.isSelected()){
            obj.setcomplete_status("Y");
        } else {
            obj.setcomplete_status("N");
        }
        obj.setdocument_date(kzodocument_date.getDate());
        obj.setdocument_date_fr(kzodocument_date_fr.getDate());
        obj.setdocument_date_to(kzodocument_date_to.getDate());

        obj.setreference(jtxtreference.getText());
        obj.setdscription(jtxtdscription.getText());
        obj.settotal_adm_qty(GlobalUtils.toInt(jtxttotal_adm_qty.getText()));
        
    }

    public void undo() throws CodeException {
        istatus = 0;
        obj=objtmp;
        showData();
    }

    public void execute() throws CodeException {
       int ires=JOptionPane.showConfirmDialog(this, "Prose adjustment","Proses adjustment",JOptionPane.YES_NO_OPTION);
       if (ires==JOptionPane.YES_OPTION){
            if (this.obj.run_sp_in_so_process_process()){
                JOptionPane.showMessageDialog(this, "Proses selesai");
            }
       }
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

    private void insertnewlastrow() {
        if (!lastrowisempty()){
        model.addRow(new Object[model.getColumnCount()]);
        model.setValueAt(false, model.getRowCount()-1, 0);
        model.setValueAt("", model.getRowCount()-1, 1);
        model.setValueAt(0, model.getRowCount()-1, 3);
        model.setValueAt(0, model.getRowCount()-1, 4);
        model.setValueAt(0, model.getRowCount()-1, 5);
        GlobalUtils.selectCellTable(jtbldetail, model.getRowCount()-1, 1);
        }
    }

    private boolean lastrowisempty() {
        if (model.getRowCount()>0){
            if (GlobalUtils.churuf(model.getValueAt(model.getRowCount()-1, 1)).equalsIgnoreCase("")){
                return true;
            }
        }
        return false;
    }

    private void showproduct(Integer irow) {
        in_productext oin_product=new in_productext();

        String sproduct_code=GlobalUtils.churuf(model.getValueAt(irow, 1));
        try {
            if (oin_product.initdata(sproduct_code)) {
                model.setValueAt(oin_product.getproduct_name(), irow, 2);
            }
        } catch (CodeException ex) {
            Logger.getLogger(Frmin_so_process.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cekdetail() {
        int row = jtbldetail.getSelectedRow();
        int col = jtbldetail.getSelectedColumn();


        in_so_process_detail1ext appod=new in_so_process_detail1ext();
        if (row > objd.size() - 1) {
            appod = new in_so_process_detail1ext();
            appod.setstatus(in_so_process_detail1ext.Status_Insert);
            objd.add(appod);
        } else {
            appod = (in_so_process_detail1ext) objd.get(row);
            if (!appod.getstatus().equals(in_so_process_detail1ext.Status_Insert)&&!appod.getstatus().equals(in_so_process_detail1ext.Status_delete)){
                appod.setstatus(in_so_process_detail1ext.Status_update);
            }
        }
        if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(row, 0)))){
            appod.setpilih(1);
        } else {
            appod.setpilih(0);
        }
//        appod.setdocument_number(GlobalUtils.churuf(model.getValueAt(row, 1)));
//        appod.setdocument_date(GlobalUtils.churuf(model.getValueAt(row, 2)));
//        appod.setdscription(GlobalUtils.churuf(model.getValueAt(row, 3  )));
//        appod.settotal_so_qty(GlobalUtils.toInt(GlobalUtils.churuf(model.getValueAt(row, 4))));
//        appod.settotal_adm_qty(GlobalUtils.toInt(GlobalUtils.churuf(model.getValueAt(row, 5))));

        objd.set(row, appod);
    }

    private void showdetail() {
        objd=obj.getdetail();
        if (jtbldetail.getRowCount()==0){
            insertnewlastrow();
        }
        for (int i=0;i<objd.size();i++){
            in_so_process_detail1ext o = objd.get(i);
            model.addRow(new Object[model.getColumnCount()]);
            if (o.getpilih()==1){
                model.setValueAt(true, i, 0);
            } else {
                model.setValueAt(false, i, 0);
            }

            model.setValueAt(o.getdocument_number(), i, 1);
            model.setValueAt(o.getdscription(), i, 2);
            model.setValueAt(o.gettotal_so_qty(), i, 3);
            model.setValueAt(o.gettotal_adm_qty(), i, 4);
            model.setValueAt(o.gettotal_adm_qty()-o.gettotal_so_qty(), i, 5);
            insertnewlastrow();
        }
        obj.calculatetotal();
        jtxttotal_adm_qty.setText(GlobalUtils.formatnumber(obj.gettotal_adm_qty()));
    }

    
}
