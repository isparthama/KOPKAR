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
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jdbc.DbBean;
import kopkar.in.objectclasses.in_productext;
import kopkar.in.objectclasses.in_productextcol;
import kopkar.utils.browsecontroller;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import utils.CodeException;
import utils.GlobalModel;
import utils.GlobalUtils;
import utils.appsettinghandler;
import utils.selectallJTable;

/**
 *
 * @author  Generator
 */

public class Frmlabel_product extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 1;
    public static String CLASSNAME="Frmrp_supplier";
    browsecontroller obrowse=new browsecontroller();
    JasperPrint jasperPrint;
    JasperReport jasperReport;
    DbBean db=appsettinghandler.db;
    String status="";
    DefaultTableModel model;

    FrmMainFrame mf ;

   
    /** Creates new form Area */
    public Frmlabel_product() throws CodeException {
        initComponents();

    }
    
    public Frmlabel_product(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();

        model=(DefaultTableModel) jTable1.getModel();

        fillrow();
        fillcol();
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
        jtxtfrsuppcode = new javax.swing.JTextField();
        jtxttosuppcode = new javax.swing.JTextField();
        jbtnBrowse1 = new javax.swing.JButton();
        jlblsalesman_code1 = new javax.swing.JLabel();
        jtxttosuppcode_desc = new javax.swing.JLabel();
        jtxtfrsuppcode_desc = new javax.swing.JLabel();
        jlblsalesman_code2 = new javax.swing.JLabel();
        jlblsalesman_code3 = new javax.swing.JLabel();
        jHeader1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new selectallJTable(model);
        jHeader2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Print Label Barcode Product");
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
        jHeader.setText("Model Tampilan");
        jHeader.setAlignmentY(0.0F);
        jHeader.setOpaque(true);
        getContentPane().add(jHeader);
        jHeader.setBounds(330, 160, 210, 20);

        HorizontalLine.setForeground(new java.awt.Color(102, 102, 102));
        HorizontalLine.setAlignmentX(0.0F);
        HorizontalLine.setAlignmentY(0.0F);
        getContentPane().add(HorizontalLine);
        HorizontalLine.setBounds(160, 50, 650, 12);

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setAlignmentX(0.0F);
        jSeparator3.setAlignmentY(0.0F);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(30, 50, 12, 400);

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
        jlblsalesman_code.setText("Product To");
        getContentPane().add(jlblsalesman_code);
        jlblsalesman_code.setBounds(70, 130, 140, 20);

        jtxtfrsuppcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxtfrsuppcode);
        jtxtfrsuppcode.setBounds(190, 110, 90, 25);

        jtxttosuppcode.setFont(new java.awt.Font("Dialog", 0, 10));
        getContentPane().add(jtxttosuppcode);
        jtxttosuppcode.setBounds(190, 130, 90, 25);

        jbtnBrowse1.setFont(new java.awt.Font("Dialog", 0, 10));
        jbtnBrowse1.setText("...");
        jbtnBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBrowse1);
        jbtnBrowse1.setBounds(290, 130, 30, 17);

        jlblsalesman_code1.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code1.setText("Product from");
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

        jlblsalesman_code2.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblsalesman_code2.setText("Column ");
        getContentPane().add(jlblsalesman_code2);
        jlblsalesman_code2.setBounds(70, 200, 140, 20);

        jlblsalesman_code3.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jlblsalesman_code3.setText("Row ");
        getContentPane().add(jlblsalesman_code3);
        jlblsalesman_code3.setBounds(70, 180, 140, 20);

        jHeader1.setBackground(new java.awt.Color(102, 102, 102));
        jHeader1.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader1.setForeground(new java.awt.Color(255, 255, 255));
        jHeader1.setText(" : : Print Label Barcode Product");
        jHeader1.setAlignmentY(0.0F);
        jHeader1.setOpaque(true);
        getContentPane().add(jHeader1);
        jHeader1.setBounds(30, 30, 200, 20);

        jComboBox2.setFont(new java.awt.Font("Dialog", 0, 10));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(190, 200, 87, 27);

        jComboBox3.setFont(new java.awt.Font("Dialog", 0, 10));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(190, 180, 87, 27);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pilih ", "Kode Barang ", "Nama Barang ", "Jumlah Unit "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(50);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(1).setMinWidth(100);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
        jTable1.getColumnModel().getColumn(3).setMinWidth(100);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(100);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 230, 590, 220);

        jHeader2.setBackground(new java.awt.Color(102, 102, 102));
        jHeader2.setFont(new java.awt.Font("Dialog", 1, 10));
        jHeader2.setForeground(new java.awt.Color(255, 255, 255));
        jHeader2.setText(" Mulai Cetak Label ");
        jHeader2.setAlignmentY(0.0F);
        jHeader2.setOpaque(true);
        getContentPane().add(jHeader2);
        jHeader2.setBounds(70, 160, 210, 20);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jRadioButton1.setText("Form");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(320, 200, 120, 23);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Label");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(320, 180, 58, 23);

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
        try {
            showdata();
        } catch (SQLException ex) {
            Logger.getLogger(Frmlabel_product.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_jbtnBrowse1ActionPerformed

private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
    // TODO add your handling code here:
    int irow=jTable1.getSelectedRow();
    if (irow>-1){
        int icol=jTable1.getSelectedColumn();
        switch (icol){
            case 3:
                setselected(true,irow);
                break;
            case 0:
                set_default_jumlah(irow);
                break;
        }
    }
}//GEN-LAST:event_jTable1PropertyChange

private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jRadioButton1ActionPerformed

private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jRadioButton2ActionPerformed
                                     
private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {                                            
    setToolBar(iformtype,istatus);
    mf.setIcon(CLASSNAME);
}                                           

private void jbtnBrowseActionPerformed(java.awt.event.ActionEvent evt) {                                           
    obrowse.showbrowser(obrowse.in_product, "", jtxtfrsuppcode, jtxtfrsuppcode_desc);
        try {
            showdata();
        } catch (SQLException ex) {
            Logger.getLogger(Frmlabel_product.class.getName()).log(Level.SEVERE, null, ex);
        }
}                                                                                 

    public void execute() throws CodeException {
        if (truncate_in_product_print()){
            if (collectdata()){
                if (exec_sp_in_product_print_list_get()){
                    Map parameter = new HashMap();

                    parameter.put("audituser", (GlobalUtils.getUserId()));

                    // Versi 1
                    String file ="label_product";
                    if (!jRadioButton2.isSelected()){
                        file ="label_product2";
                    }
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
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Frmlabel_product().setVisible(true);
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
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jHeader;
    private javax.swing.JLabel jHeader1;
    private javax.swing.JLabel jHeader2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnBrowse;
    private javax.swing.JButton jbtnBrowse1;
    private javax.swing.JLabel jlblsalesman_code;
    private javax.swing.JLabel jlblsalesman_code1;
    private javax.swing.JLabel jlblsalesman_code2;
    private javax.swing.JLabel jlblsalesman_code3;
    private javax.swing.JTextField jtxtfrsuppcode;
    private javax.swing.JLabel jtxtfrsuppcode_desc;
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

    private void showdata() throws SQLException {
        in_productextcol oprod=new in_productextcol();
        in_productext o;
        GlobalModel.clearRow(model);
        if (oprod.initdata(jtxtfrsuppcode.getText(),jtxttosuppcode.getText())){
            for (int i=0;i<oprod.size();i++){
                o=oprod.get(i);
                model.addRow(new Object[model.getColumnCount()]);
                model.setValueAt(false,model.getRowCount()-1, 0);
                model.setValueAt(o.getproduct_code(),model.getRowCount()-1, 1);
                model.setValueAt(o.getproduct_name(),model.getRowCount()-1, 2);
                model.setValueAt(0,model.getRowCount()-1, 3);
            }
        }
    }

    private void setselected(boolean b, int irow) {
        int jumlah_unit=GlobalUtils.toInt(model.getValueAt(irow,3));
        if (jumlah_unit>0){
            model.setValueAt(true, irow, 0);
        } else {
            model.setValueAt(false, irow, 0);
        }
    }

    private void set_default_jumlah(int irow) {
        if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(irow, 0)))){
            model.setValueAt(1, irow, 3);
        } else {
            model.setValueAt(0, irow, 3);
        }
    }

    private boolean collectdata() {
        boolean result=false;
        for (int i=0;i<model.getRowCount();i++){
            if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(i, 0)))){
                result=insertdata(i);
            }
        }
        return result;
    }

    private boolean insertdata(int i) {
        String saudituser=GlobalUtils.userid;
        int sprint_unit=GlobalUtils.toInt(model.getValueAt(i, 3));
        String sproduct_code=GlobalUtils.churuf(model.getValueAt(i, 1));
        String squery="call sp_in_product_print_insert('"+sproduct_code+"',"+sprint_unit+",'"+saudituser+"')";
        try {
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Frmlabel_product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private boolean exec_sp_in_product_print_list_get() {
        String saudituser=GlobalUtils.userid;
        int scol=GlobalUtils.toInt(jComboBox2.getSelectedItem());
        int srow=GlobalUtils.toInt(jComboBox3.getSelectedItem());
        String squery="call sp_in_product_print_list_get ("+srow+","+scol+",'"+saudituser+"')";
        try {
            db.execute(squery);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Frmlabel_product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void fillrow() {
        jComboBox3.removeAllItems();
        for (int i=0;i<11;i++){
            jComboBox3.addItem(i+1);
        }
    }

    private void fillcol() {
        jComboBox2.removeAllItems();
        for (int i=0;i<5;i++){
            jComboBox2.addItem(i+1);
        }
    }

    private boolean truncate_in_product_print() {
        try {
            db.execute("delete from in_product_print  where audituser='" + GlobalUtils.userid + "'");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Frmlabel_product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
