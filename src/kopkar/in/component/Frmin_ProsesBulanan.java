/*
 * From ko_departemen
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kopkar.in.objectclasses.in_warehouseext;
import kopkar.in.objectclasses.in_warehouseextcol;
import utils.CodeException;
import utils.GlobalModel;
import utils.GlobalUtils;

/**
 *
 * @author  Generator
 */

public class Frmin_ProsesBulanan extends javax.swing.JInternalFrame implements NavigatorFormInt {

    private static int istatus = 0;
    private static int iformtype = 1;
    public static String CLASSNAME="Frmin_ProsesBulanan";
    
    FrmMainFrame mf ;

    in_warehouseextcol obj=new in_warehouseextcol();
    private DefaultTableModel model;
   
    /** Creates new form Area */
    public Frmin_ProsesBulanan() throws CodeException {
        initComponents();
    }
    
    public Frmin_ProsesBulanan(FrmMainFrame mf) throws CodeException{
        this.mf = mf;
        initComponents();
        model=(DefaultTableModel) jtblWarehouse.getModel();
        filltahun();
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
        jlblkode_departemen = new javax.swing.JLabel();
        jlblnama_departemen = new javax.swing.JLabel();
        jcmbTahun = new javax.swing.JComboBox();
        jcmbBulan = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblWarehouse = new javax.swing.JTable();
        jchkUpdate_On_Hand_Stock = new javax.swing.JCheckBox();
        jchkUpdate_Price_History = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Proses Bulanan");
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
        jHeader.setText(" : : Proses Bulanan");
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

        jlblkode_departemen.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblkode_departemen.setText("Tahun");
        getContentPane().add(jlblkode_departemen);
        jlblkode_departemen.setBounds(70, 100, 140, 13);

        jlblnama_departemen.setFont(new java.awt.Font("Dialog", 1, 10));
        jlblnama_departemen.setText("Bulan");
        getContentPane().add(jlblnama_departemen);
        jlblnama_departemen.setBounds(70, 120, 140, 13);

        jcmbTahun.setFont(new java.awt.Font("Dialog", 0, 10));
        jcmbTahun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmbTahun.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbTahunItemStateChanged(evt);
            }
        });
        getContentPane().add(jcmbTahun);
        jcmbTahun.setBounds(230, 100, 65, 20);

        jcmbBulan.setFont(new java.awt.Font("Dialog", 0, 10));
        jcmbBulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        jcmbBulan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbBulanItemStateChanged(evt);
            }
        });
        getContentPane().add(jcmbBulan);
        jcmbBulan.setBounds(230, 120, 88, 20);

        jtblWarehouse.setFont(new java.awt.Font("Dialog", 0, 10));
        jtblWarehouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Warehouse Code", "Warehouse Nama", "Recalculate Stock", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblWarehouse);
        jtblWarehouse.getColumnModel().getColumn(0).setMinWidth(150);
        jtblWarehouse.getColumnModel().getColumn(0).setMaxWidth(150);
        jtblWarehouse.getColumnModel().getColumn(2).setMinWidth(150);
        jtblWarehouse.getColumnModel().getColumn(2).setMaxWidth(150);
        jtblWarehouse.getColumnModel().getColumn(3).setMaxWidth(100);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 150, 720, 260);

        jchkUpdate_On_Hand_Stock.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkUpdate_On_Hand_Stock.setText("Update On Hand Stock");
        getContentPane().add(jchkUpdate_On_Hand_Stock);
        jchkUpdate_On_Hand_Stock.setBounds(70, 410, 200, 24);

        jchkUpdate_Price_History.setFont(new java.awt.Font("Dialog", 1, 10));
        jchkUpdate_Price_History.setSelected(true);
        jchkUpdate_Price_History.setText("Update Price History");
        getContentPane().add(jchkUpdate_Price_History);
        jchkUpdate_Price_History.setBounds(70, 430, 200, 24);

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

private void jcmbBulanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbBulanItemStateChanged
    // TODO add your handling code here:
    enableupdateonhand();
}//GEN-LAST:event_jcmbBulanItemStateChanged

private void jcmbTahunItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbTahunItemStateChanged
    // TODO add your handling code here:
    enableupdateonhand();
}//GEN-LAST:event_jcmbTahunItemStateChanged

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
                    new Frmin_ProsesBulanan().setVisible(true);
                } catch (CodeException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator HorizontalLine;
    private javax.swing.JLabel jHeader;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox jchkUpdate_On_Hand_Stock;
    private javax.swing.JCheckBox jchkUpdate_Price_History;
    private javax.swing.JComboBox jcmbBulan;
    private javax.swing.JComboBox jcmbTahun;
    private javax.swing.JLabel jlblkode_departemen;
    private javax.swing.JLabel jlblnama_departemen;
    private javax.swing.JTable jtblWarehouse;
    // End of variables declaration//GEN-END:variables

 
    public void moveFirst() throws CodeException {        
        showData();
        mf.setIcon(CLASSNAME);
    }

    public void movePrevious() throws CodeException {

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveNext() throws CodeException {

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void moveLast() throws CodeException {

        showData();
        mf.setIcon(CLASSNAME);
    }

    public void searchData() throws CodeException {
        showData();
        mf.setIcon(CLASSNAME);

    }

    private void clearfield(){
        jcmbTahun.setSelectedItem(GlobalUtils.getCurrentYear());
        jcmbBulan.setSelectedIndex(GlobalUtils.toInt(GlobalUtils.getCurrentMonth())-1);
    }

    public void newData() throws CodeException {
        istatus=1;
        clearfield();
        setToolBar(iformtype,istatus);
    }

    public void saveData() throws CodeException {
        setData();

        Integer seletectedyear=GlobalUtils.toInt(GlobalUtils.churuf(jcmbTahun.getSelectedItem()));
        Integer selectedmonth=GlobalUtils.toInt(GlobalUtils.churuf(jcmbBulan.getSelectedIndex()+1));
        for (int i=0;i<obj.size();i++){
            if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(i, 2)))){
                in_warehouseext o = obj.get(i);
                if (o.run_sp_in_inventory_process_end_balance(seletectedyear,selectedmonth)){
                    if (jchkUpdate_On_Hand_Stock.isSelected()){
                        o.run_sp_in_inventory_process_update_onhand(seletectedyear,selectedmonth);
                    }
                    model.setValueAt("complete", i, 3);
                }
            }
        }

        if (jchkUpdate_Price_History.isSelected()){
            obj.run_sp_in_product_price_history_process(seletectedyear,selectedmonth);
        }

        JOptionPane.showMessageDialog(this, "Proses Bulanan Selesai");

        istatus = 0;
        setToolBar(iformtype,istatus);
        mf.setIcon(CLASSNAME);
    }

    public void showData() throws CodeException {
        setToolBar(iformtype,istatus);
        setCursor(GlobalUtils.HOURGLASSCURSOR);
        clearfield();
        GlobalModel.clearRow(model);
        in_warehouseext o;
        if (obj.initdataall()){
            for (int i=0;i<obj.size();i++){
                o=obj.get(i);
                model.addRow(new Object[model.getColumnCount()]);
                model.setValueAt(o.getwarehouse_code(), i, 0);
                model.setValueAt(o.getwarehouse_name(), i, 1);
                model.setValueAt(false, i, 2);
                model.setValueAt("", i, 3);
            }
        }
        setCursor(GlobalUtils.NORMALCURSOR);
    }

    public void delete() throws CodeException {

        mf.setIcon(CLASSNAME);
    }

    public void setToolBar(int iFormType, int istatus) {
        mf.setToolBar(iformtype,istatus);

    }

    public void setData() throws CodeException {
        if (istatus==1){
            obj.insert();
        }

    }

    public void undo() throws CodeException {
        istatus = 0;
        showData();
    }

    public void execute() throws CodeException {
       int ires=JOptionPane.showConfirmDialog(this, "Proses Bulanan?","Proses Bulanan",JOptionPane.YES_NO_OPTION);
       if (ires==JOptionPane.YES_OPTION){
        saveData();
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

    private void filltahun() {
        jcmbTahun.removeAllItems();
        for (int i=2013;i<2013+10;i++){
            jcmbTahun.addItem(i+"");
        }
    }

    private void enableupdateonhand() {
        jchkUpdate_On_Hand_Stock.setEnabled(false);
        jchkUpdate_On_Hand_Stock.setSelected(false);
        Integer current_year=GlobalUtils.toInt(GlobalUtils.getCurrentYear());
        Integer current_month=GlobalUtils.toInt(GlobalUtils.getCurrentMonth());

        Integer selected_year=GlobalUtils.toInt(GlobalUtils.churuf(jcmbTahun.getSelectedItem()));
        Integer selected_month=jcmbBulan.getSelectedIndex()+1;
        if (current_year.equals(selected_year)&&current_month.equals(selected_month)){
            jchkUpdate_On_Hand_Stock.setEnabled(true);
        }
    }

    
}
