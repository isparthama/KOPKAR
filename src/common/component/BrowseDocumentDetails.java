/*
 * test.java
 *
 * Created on March 9, 2007, 8:31 AM
 */

package common.component;

import javax.swing.table.DefaultTableModel;
import jdbc.DbBean;
import kopkar.ap.objectclasses.ap_purchase_order_detail1ext;
import kopkar.ap.objectclasses.ap_purchase_orderext;
import kopkar.ap.objectclasses.ap_purchase_receive_detail1ext;
import kopkar.ap.objectclasses.ap_purchase_receiveext;
import kopkar.ap.objectclasses.ap_purchase_return_detail1ext;
import kopkar.ap.objectclasses.ap_purchase_returnext;
import kopkar.ar.objectclasses.ar_sales_delivery_detail1ext;
import kopkar.ar.objectclasses.ar_sales_deliveryext;
import kopkar.ar.objectclasses.ar_sales_order_detail1ext;
import kopkar.ar.objectclasses.ar_sales_orderext;
import kopkar.ar.objectclasses.ar_sales_return_detail1ext;
import kopkar.ar.objectclasses.ar_sales_returnext;
import utils.GlobalModel;
import utils.GlobalUtils;
import utils.appsettinghandler;


/**
 *
 * @author  ISParthama
 */
public class BrowseDocumentDetails extends javax.swing.JDialog {
    public String ap_purchase_order="ap_purchase_order";
    public String ap_purchase_return="ap_purchase_return";
    public String ap_purchase_receive="ap_purchase_receive";
    public String ar_sales_order="ar_sales_order";
    public String ar_sales_delivery="ar_sales_delivery";
    public String ar_sales_return="ar_sales_return";

    DbBean db=appsettinghandler.db;
    private DefaultTableModel model;
    private String browse_what="";
    private ap_purchase_returnext oap_purchase_return;
    private ap_purchase_orderext oap_purchase_order;
    private ap_purchase_receiveext oap_purchase_receive;
    private ar_sales_returnext oar_sales_return;
    private ar_sales_orderext oar_sales_order;
    private ar_sales_deliveryext oar_sales_delivery;
    
    public BrowseDocumentDetails(ap_purchase_returnext objref) {
        this.browse_what=this.ap_purchase_return;
        this.oap_purchase_return=objref;
        initComponents();
        int i=0;
        model=(DefaultTableModel) jTable1.getModel();
        GlobalModel.clearRow(model);
        for (i=0;i<objref.getDetail1().size();i++){
            ap_purchase_return_detail1ext o = objref.getDetail1().get(i);
            model.addRow(new Object[6]);
            jTable1.setValueAt(false,model.getRowCount()-1,0);
            jTable1.setValueAt(o.getproduct_code(),model.getRowCount()-1,1);
            jTable1.setValueAt(o.getProduct_name(),model.getRowCount()-1,2);
            jTable1.setValueAt(o.getquantity_open(),model.getRowCount()-1,3);
            jTable1.setValueAt(o.getprice(),model.getRowCount()-1,4);
            jTable1.setValueAt(o.getquantity_open()*o.getprice(),model.getRowCount()-1,5);
        }
        jLabel4.setText("Number of Records Found : "+GlobalUtils.formatnumber(objref.getDetail1().size()));
        this.setLocationRelativeTo(null);
    }

    public BrowseDocumentDetails(ap_purchase_orderext objref) {
        this.browse_what=this.ap_purchase_order;
        this.oap_purchase_order=objref;
        initComponents();
        int i=0;
        model=(DefaultTableModel) jTable1.getModel();
        GlobalModel.clearRow(model);
        for (i=0;i<objref.getDetail1().size();i++){
            ap_purchase_order_detail1ext o = objref.getDetail1().get(i);
            model.addRow(new Object[6]);
            jTable1.setValueAt(false,model.getRowCount()-1,0);
            jTable1.setValueAt(o.getproduct_code(),model.getRowCount()-1,1);
            jTable1.setValueAt(o.getProduct_name(),model.getRowCount()-1,2);
            jTable1.setValueAt(o.getquantity_open(),model.getRowCount()-1,3);
            jTable1.setValueAt(o.getprice(),model.getRowCount()-1,4);
            jTable1.setValueAt(o.getquantity_open()*o.getprice(),model.getRowCount()-1,5);
        }
        jLabel4.setText("Number of Records Found : "+GlobalUtils.formatnumber(objref.getDetail1().size()));
        this.setLocationRelativeTo(null);
    }

    public BrowseDocumentDetails(ap_purchase_receiveext objref) {
        this.browse_what=this.ap_purchase_receive;
        this.oap_purchase_receive=objref;
        initComponents();
        int i=0;
        model=(DefaultTableModel) jTable1.getModel();
        GlobalModel.clearRow(model);
        for (i=0;i<objref.getDetail1().size();i++){
            ap_purchase_receive_detail1ext o = objref.getDetail1().get(i);
            model.addRow(new Object[6]);
            jTable1.setValueAt(false,model.getRowCount()-1,0);
            jTable1.setValueAt(o.getproduct_code(),model.getRowCount()-1,1);
            jTable1.setValueAt(o.getProduct_name(),model.getRowCount()-1,2);
            jTable1.setValueAt(o.getquantity_open(),model.getRowCount()-1,3);
            jTable1.setValueAt(o.getprice(),model.getRowCount()-1,4);
            jTable1.setValueAt(o.getquantity_open()*o.getprice(),model.getRowCount()-1,5);
        }
        jLabel4.setText("Number of Records Found : "+GlobalUtils.formatnumber(objref.getDetail1().size()));
        this.setLocationRelativeTo(null);
    }

    public BrowseDocumentDetails(ar_sales_returnext objref) {
        this.browse_what=this.ar_sales_return;
        this.oar_sales_return=objref;
        initComponents();
        int i=0;
        model=(DefaultTableModel) jTable1.getModel();
        GlobalModel.clearRow(model);
        for (i=0;i<objref.getDetail1().size();i++){
            ar_sales_return_detail1ext o = objref.getDetail1().get(i);
            model.addRow(new Object[6]);
            jTable1.setValueAt(false,model.getRowCount()-1,0);
            jTable1.setValueAt(o.getproduct_code(),model.getRowCount()-1,1);
            jTable1.setValueAt(o.getProduct_name(),model.getRowCount()-1,2);
            jTable1.setValueAt(o.getquantity_open(),model.getRowCount()-1,3);
            jTable1.setValueAt(o.getprice(),model.getRowCount()-1,4);
            jTable1.setValueAt(o.getquantity_open()*o.getprice(),model.getRowCount()-1,5);
        }
        jLabel4.setText("Number of Records Found : "+GlobalUtils.formatnumber(objref.getDetail1().size()));
        this.setLocationRelativeTo(null);
    }

    public BrowseDocumentDetails(ar_sales_orderext objref) {
        this.browse_what=this.ar_sales_order;
        this.oar_sales_order=objref;
        initComponents();
        int i=0;
        model=(DefaultTableModel) jTable1.getModel();
        GlobalModel.clearRow(model);
        for (i=0;i<objref.getDetail1().size();i++){
            ar_sales_order_detail1ext o = objref.getDetail1().get(i);
            model.addRow(new Object[6]);
            jTable1.setValueAt(false,model.getRowCount()-1,0);
            jTable1.setValueAt(o.getproduct_code(),model.getRowCount()-1,1);
            jTable1.setValueAt(o.getProduct_name(),model.getRowCount()-1,2);
            jTable1.setValueAt(o.getquantity_open(),model.getRowCount()-1,3);
            jTable1.setValueAt(o.getprice(),model.getRowCount()-1,4);
            jTable1.setValueAt(o.getquantity_open()*o.getprice(),model.getRowCount()-1,5);
        }
        jLabel4.setText("Number of Records Found : "+GlobalUtils.formatnumber(objref.getDetail1().size()));
        this.setLocationRelativeTo(null);
    }

    public BrowseDocumentDetails(ar_sales_deliveryext objref) {
        this.browse_what=this.ar_sales_delivery;
        this.oar_sales_delivery=objref;
        initComponents();
        int i=0;
        model=(DefaultTableModel) jTable1.getModel();
        GlobalModel.clearRow(model);
        for (i=0;i<objref.getDetail1().size();i++){
            ar_sales_delivery_detail1ext o = objref.getDetail1().get(i);
            model.addRow(new Object[6]);
            jTable1.setValueAt(false,model.getRowCount()-1,0);
            jTable1.setValueAt(o.getproduct_code(),model.getRowCount()-1,1);
            jTable1.setValueAt(o.getProduct_name(),model.getRowCount()-1,2);
            jTable1.setValueAt(o.getquantity_open(),model.getRowCount()-1,3);
            jTable1.setValueAt(o.getprice(),model.getRowCount()-1,4);
            jTable1.setValueAt(o.getquantity_open()*o.getprice(),model.getRowCount()-1,5);
        }
        jLabel4.setText("Number of Records Found : "+GlobalUtils.formatnumber(objref.getDetail1().size()));
        this.setLocationRelativeTo(null);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyPressed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Product Code", "Product Name", "Quantity Open", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(50);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(1).setMinWidth(150);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
        jTable1.getColumnModel().getColumn(2).setMinWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
        jTable1.getColumnModel().getColumn(3).setMinWidth(130);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(130);
        jTable1.getColumnModel().getColumn(3).setMaxWidth(130);
        jTable1.getColumnModel().getColumn(4).setMinWidth(130);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTable1.getColumnModel().getColumn(4).setMaxWidth(130);
        jTable1.getColumnModel().getColumn(5).setMinWidth(130);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(130);
        jTable1.getColumnModel().getColumn(5).setMaxWidth(130);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel4.setText("Number of Records Found : ");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel1.setText("Browse Document Details");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton3.setText("Select All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton4.setText("Un Select All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                            .add(jLabel1))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 234, Short.MAX_VALUE)
                        .add(jLabel4)
                        .add(169, 169, 169))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2)
                    .add(jLabel4)
                    .add(jButton3)
                    .add(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        Integer i=new Integer(0);
        for (i=0;i<model.getRowCount();i++){
            jTable1.setValueAt(false,i,0);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Integer i=new Integer(0);
        for (i=0;i<model.getRowCount();i++){
            GlobalUtils.selectCellTable(jTable1, i, 0);
            jTable1.setValueAt(true,i,0);
            jTable1PropertyChange(null);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        setVisible(false);            					// free the system resources 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

        if (evt.getKeyCode()==evt.VK_ENTER){
            doSelect();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jScrollPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyPressed

    }//GEN-LAST:event_jScrollPane1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        doSelect();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        // TODO add your handling code here:
        int row=jTable1.getSelectedRow();
        int col=jTable1.getSelectedColumn();

        if (row>-1){
            if (this.browse_what.equalsIgnoreCase(this.ap_purchase_return)){
                if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(row, 0).toString()))){
                    ap_purchase_return_detail1ext o;
                    ap_purchase_returnext obj=this.oap_purchase_return;
                    o=obj.getDetail1().get(row);
                    o.setselected();
                    obj.getDetail1().set(row, o);
                }
            }
            if (this.browse_what.equalsIgnoreCase(this.ap_purchase_order)){
                if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(row, 0).toString()))){
                    ap_purchase_order_detail1ext o;
                    ap_purchase_orderext obj=this.oap_purchase_order;
                    o=obj.getDetail1().get(row);
                    o.setselected();
                    obj.getDetail1().set(row, o);
                }
            }
            if (this.browse_what.equalsIgnoreCase(this.ap_purchase_receive)){
                if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(row, 0).toString()))){
                    ap_purchase_receive_detail1ext o;
                    ap_purchase_receiveext obj=this.oap_purchase_receive;
                    o=obj.getDetail1().get(row);
                    o.setselected();
                    obj.getDetail1().set(row, o);
                }
            }
            if (this.browse_what.equalsIgnoreCase(this.ar_sales_return)){
                if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(row, 0).toString()))){
                    ar_sales_return_detail1ext o;
                    ar_sales_returnext obj=this.oar_sales_return;
                    o=obj.getDetail1().get(row);
                    o.setselected();
                    obj.getDetail1().set(row, o);
                }
            }
            if (this.browse_what.equalsIgnoreCase(this.ar_sales_order)){
                if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(row, 0).toString()))){
                    ar_sales_order_detail1ext o;
                    ar_sales_orderext obj=this.oar_sales_order;
                    o=obj.getDetail1().get(row);
                    o.setselected();
                    obj.getDetail1().set(row, o);
                }
            }
            if (this.browse_what.equalsIgnoreCase(this.ar_sales_delivery)){
                if (Boolean.parseBoolean(GlobalUtils.churuf(model.getValueAt(row, 0).toString()))){
                    ar_sales_delivery_detail1ext o;
                    ar_sales_deliveryext obj=this.oar_sales_delivery;
                    o=obj.getDetail1().get(row);
                    o.setselected();
                    obj.getDetail1().set(row, o);
                }
            }
        }
    }//GEN-LAST:event_jTable1PropertyChange
    
     
    /**
     * @param args the command line arguments
     */
     
     
    public static void main(String args[]) {
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void doSelect() {
        this.setVisible(false);
    }
    
}
