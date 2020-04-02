/*
 * test.java
 *
 * Created on March 9, 2007, 8:31 AM
 */

package common.component;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import jdbc.DbBean;
import tablemodel.bdmodel;
import tablemodel.browcolumnmodelcol;
import utils.appsettinghandler;


/**
 *
 * @author  ISParthama
 */
public class BrowseDocuments extends javax.swing.JDialog {
    private String Value="";
    private String SecondValue="";
    browcolumnmodelcol colModel=new browcolumnmodelcol();
    String datatoshow;
    String FilterField;
    String Tbl;
    String Field1;String Field2;
    DbBean db=appsettinghandler.db;
    DefaultTableModel tmodel=new bdmodel();

    /** Creates new form test */

    
    public BrowseDocuments(String data,String Filter) {
        datatoshow=data;
        FilterField=Filter;
        initComponents();
        SetFieldInCombo();
        SetColHeader();
        RetrieveData ();
        txtsearch.requestFocusInWindow();
        this.setLocationRelativeTo(null);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false); 
        this.setTitle("Browse Document "+data);
    }
    
    private void SetFieldInCombo(){
        if (datatoshow.equalsIgnoreCase("consignment")){
            Tbl="consignment";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("order")){
            Tbl="order";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("delivery")){
            Tbl="delivery";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("return")){
            Tbl="return";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("invoice")){
            Tbl="invoice";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("purchaseorder")){
            Tbl="purchaseorder";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("purchasereturn")){
            Tbl="purchasereturn";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("purchasereceive")){
            Tbl="purchasereceive";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("goodsreceipt")){
            Tbl="goodsreceipt";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("goodsissue")){
            Tbl="goodsissue";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        if (datatoshow.equalsIgnoreCase("goodstransfer")){
            Tbl="goodstransfer";
            colModel.Insert();
            colModel.getColModel().setColName("docnum");
            colModel.getColModel().setColDesc("Order No.");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("docdate");
            colModel.getColModel().setColDesc("Order Date");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("custmrcode");
            colModel.getColModel().setColDesc("Customer Code");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("ref2");
            colModel.getColModel().setColDesc("Reference");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
        }
        Integer i=new Integer(0);
        for(i=0;i<colModel.size();i++){
            cbosearchin.addItem(colModel.get(i).getColDesc());
        }
        txtsearch.setText("");
    }
    
    private void RetrieveData ()
	{
            ResultSet rs =null;
		try
		{	
			int row = tmodel.getRowCount();			
			while(row > 0)
			{	
				row--;				
				tmodel.removeRow(row);
			}	
			
			//execute query		
                        String skode=txtsearch.getText().trim();
                        String Mth=cbosearchmth.getSelectedItem().toString();
                        String Fld=colModel.get(cbosearchin.getSelectedIndex()).getColName();
                        Integer i=new Integer(0);
                        String sFields="";
                        for(i=0;i<colModel.size();i++){
                            sFields=sFields+colModel.get(i).getColName()+",";
                        }
                        sFields=sFields.substring(0,sFields.length()-1);
                        System.out.println(sFields);
                        String sQuery="";
                        if (txtsearch.getText().equalsIgnoreCase("")){
                            skode="";
                        }else{
                            skode=txtsearch.getText();
                        }
                        
                        if (skode=="") {
                            if (FilterField==""){
                                sQuery="select " + sFields + " from `" + Tbl + "` order by " + colModel.get(0).getColName(); 
                            } else {
                                sQuery="select " + sFields + " from `" + Tbl + "` Where docstatus='O' and " + FilterField + " order by " + colModel.get(0).getColName();
                            }
                        } else {       
                            //rs = st.executeQuery("Select * from CourseInfo");
                            if (Mth=="Start With"){
                                if (FilterField==""){
                                    sQuery="select " + sFields + " from `"  + Tbl + "` where docstatus='O' and " + Fld + " like '" + skode + "%' order by " + colModel.get(0).getColName();
                                } else {
                                    sQuery="select " + sFields + " from `"  + Tbl + "` where docstatus='O' and " + Fld + " like '" + skode + "%' and " + FilterField + " order by " + colModel.get(0).getColName();
                                }
                            }else {
                                if (FilterField==""){
                                    sQuery="select " + sFields + " from `"  + Tbl + "` where docstatus='O' and " + Fld + " like '%" + skode + "%' order by " + Fld;
                                } else {
                                    sQuery="select " + sFields + " from `"  + Tbl + "` where docstatus='O' and " + Fld + " like '%" + skode + "%' and " + FilterField + " order by " + colModel.get(0).getColName();
                                }
                                 
                            }
                        }
			if (sQuery!=""){
                            rs = db.executeQuery(sQuery);
                        }
			//get metadata
			ResultSetMetaData md = rs.getMetaData();
			int colcount = md.getColumnCount();
			
			Object[] data = new Object[colcount];
			//extracting data		

			while (rs.next())
			{	
				for (i=1; i<=colModel.size(); i++)
				{
					data[i-1] = rs.getString(i);
				}				
				tmodel.addRow(data);
			}
                        jLabel4.setText("Number of Records Found : " + tmodel.getRowCount());
		}
		catch(Exception e) {System.out.println(e);	}
	}
    private void SetColHeader()
	{
                Integer i=new Integer(0);
                for (i=0;i<colModel.size();i++){
		tmodel.addColumn(colModel.get(i).getColDesc());
                }
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
        jLabel1 = new javax.swing.JLabel();
        cbosearchin = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cbosearchmth = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyPressed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 1, 10));
        jTable1.setModel(tmodel);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel1.setText("Search In Field");

        cbosearchin.setFont(new java.awt.Font("Dialog", 1, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel2.setText("Seach Methode");

        cbosearchmth.setFont(new java.awt.Font("Dialog", 1, 10));
        cbosearchmth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Start With", "Contains" }));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel3.setText("Search Key");

        txtsearch.setFont(new java.awt.Font("Dialog", 1, 10));
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtsearchPropertyChange(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });
        txtsearch.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtsearchVetoableChange(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Dialog", 1, 10));
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jCheckBox1.setText("Automatic Search");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 10));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10));
        jLabel4.setText("Number of Records Found : ");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(cbosearchmth, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(cbosearchin, 0, 179, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(btnsearch)
                                    .add(jCheckBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 140, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 325, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(cbosearchin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(cbosearchmth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnsearch))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(txtsearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(19, 19, 19))
                    .add(jCheckBox1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 171, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton2)
                    .add(jLabel4))
                .add(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount()==2){
            doSelect();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
        setVisible(false);            					// free the system resources 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
// TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER){
                if (jTable1.getRowCount()==1){
                    doSelect();
                } else {
                    RetrieveData();
                }
        } else {
            if (jCheckBox1.isSelected()){
                RetrieveData();
            }
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyPressed
// TODO add your handling code here:
       if (evt.getKeyCode()== evt.VK_DOWN){
           jTable1.requestFocusInWindow();
           if (jTable1.getRowCount()>=0){
               jTable1.setRowSelectionInterval(0,0);
               jTable1.setColumnSelectionInterval(0,0);
           }
       }
        
    }//GEN-LAST:event_txtsearchKeyPressed

    private void txtsearchVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtsearchVetoableChange
// TODO add your handling code here:
         
    }//GEN-LAST:event_txtsearchVetoableChange

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
// TODO add your handling code here:
        
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
// TODO add your handling code here:
         
    }//GEN-LAST:event_txtsearchKeyTyped

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
// TODO add your handling code here:
        if (evt.getKeyCode()==evt.VK_ENTER){
            doSelect();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jScrollPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyPressed
// TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1KeyPressed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
// TODO add your handling code here:
       RetrieveData();
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtsearchPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtsearchPropertyChange
// TODO add your handling code here:
           
    }//GEN-LAST:event_txtsearchPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        doSelect(); 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void doSelect(){
        Integer irow;
        if (jTable1.getRowCount()>0){
            irow=jTable1.getSelectedRow();
            if (irow<0){
                irow=0;
            } 
            String sVal=tmodel.getValueAt(irow,0).toString();
            Value=tmodel.getValueAt(irow,0).toString();;
            SecondValue=tmodel.getValueAt(irow,1).toString();

            setVisible(false);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getSecondValue() {
        return SecondValue;
    }

    public void setSecondValue(String SecondValue) {
        this.SecondValue = SecondValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JComboBox cbosearchin;
    private javax.swing.JComboBox cbosearchmth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
    
}
