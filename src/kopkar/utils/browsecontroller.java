/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.utils;

import classinterface.NavigatorObjectInt;
import common.component.BrowseDocumentDetails;
import common.component.FrmBrowseData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import kopkar.ap.objectclasses.ap_purchase_dnoteext;
import kopkar.ap.objectclasses.ap_purchase_invoiceext;
import kopkar.ap.objectclasses.ap_purchase_orderext;
import kopkar.ap.objectclasses.ap_purchase_receiveext;
import kopkar.ap.objectclasses.ap_purchase_returnext;
import kopkar.ar.objectclasses.ar_sales_cnoteext;
import kopkar.ar.objectclasses.ar_sales_deliveryext;
import kopkar.ar.objectclasses.ar_sales_invoiceext;
import kopkar.ar.objectclasses.ar_sales_orderext;
import kopkar.ar.objectclasses.ar_sales_returnext;
import utils.CodeException;

/**
 *
 * @author solution
 */
public class browsecontroller {
    public String mastermodule="mastermodule";
    public String ar_customer="ar_customer";
    public String in_warehouse="in_warehouse";
    public String in_discount="in_discount";
    public String in_price="in_price";
    public String op_salesman="op_salesman";
    public String op_payment_term="op_payment_term";
    public String in_function="in_function";
    public String in_measure="in_measure";
    public String in_category="in_category";
    public String in_brand="in_brand";
    public String in_product="in_product";
    public String ap_supplier="ap_supplier";
    public String ap_purchase_order="ap_purchase_order";
    public String ap_purchase_return="ap_purchase_return";
    public String ap_purchase_receive="ap_purchase_receive";
    public String ar_sales_order="ar_sales_order";
    public String ar_sales_delivery="ar_sales_delivery";
    public String ar_sales_return="ar_sales_return";
    public String in_warehouse_type="in_warehouse_type";
    public String ar_pos_sales="ar_pos_sales";
    public String ko_departemen="ko_departemen";
    public String ko_jabatan="ko_jabatan";
    public String ko_transaksi_registrasi="ko_transaksi_registrasi";
    public String ko_anggota="ko_anggota";
    public String ko_transaksi_setor_simpanan="ko_transaksi_setor_simpanan";
    public String ko_transaksi_tarik_simpanan="ko_transaksi_tarik_simpanan";
    public String ko_transaksi_mohon="ko_transaksi_mohon";
    public String ko_pinjaman="ko_pinjaman";
    public String ko_pinjaman_tipe="ko_pinjaman_tipe";
    public String ko_transaksi_setuju="ko_transaksi_setuju";
    public String cm_employee="employee";
    public String in_so_sheet="in_so_sheet";
    public String in_so_entry="in_so_entry";
    public String in_so_process="in_so_process";
    public String ko_transaksi_bayar="ko_transaksi_bayar";
    public String in_goods_transfer="in_goods_transfer";
    public String in_goods_issue="in_goods_issue";
    public String in_goods_receipt="in_goods_receipt";
    public String gl_group="gl_group";
    public String gl_account="gl_account";
    public String gl_group_data_entry="gl_group_data_entry";
    public String gl_rab="gl_rab";
    public String gl_sumber_data="gl_sumber_data";
    public String gl_kalender="gl_kalender";
    public String gl_transaksi_rab="gl_transaksi_rab";
    public String ko_transaksi_cair_pinjaman="ko_transaksi_cair_pinjaman";
    public String ko_transaksi_revisi_simpanan="ko_transaksi_revisi_simpanan";
    public String ar_pos_return="ar_pos_return";
    public String ar_pos_open="ar_pos_open";
    public String ar_pos_counter="ar_pos_counter";
    public String ar_pos_close="ar_pos_close";
    public String ko_transaksi_tagihan="ko_transaksi_tagihan";
    public String ko_transaksi_lembar_tagihan="ko_transaksi_lembar_tagihan";
    public String ar_pos_chasier="ar_pos_chasier";
    public String ap_account_set="ap_account_set";
    public String ar_account_set="ar_account_set";
    public String in_account_set="in_account_set";
    public String ko_account_set="ko_account_set";
    public String gl_transaksi_journal="gl_transaksi_journal";
    public String setting_financial_rpt="setting_financial_rpt";
    public String ap_purchase_invoice="ap_purchase_invoice";
    public String ap_purchase_dnote="ap_purchase_dnote";
    public String ar_sales_invoice="ar_sales_invoice";
    public String ar_sales_cnote="ar_sales_cnote";
    public String masteruser="masteruser";
    public String mastergroup="mastergroup";
    public String mastercompany="mastercompany";
    public String ap_payment="ap_payment";
    public String op_bank="op_bank";
    public String ko_transaksi_bayar_toko="ko_transaksi_bayar_toko";
    public String setting_common_rpt="setting_common_rpt";
    public String ko_pendidikan="ko_pendidikan";

    String module_transaksi="ap_purchase_order,ap_purchase_return,ap_purchase_receive,ar_sales_order,ar_sales_delivery,ar_sales_return,ko_transaksi_registrasi,ko_transaksi_setor_simpanan,"
            + "ko_transaksi_tarik_simpanan,ko_transaksi_mohon,ko_transaksi_setuju,ko_transaksi_bayar,in_goods_transfer,in_goods_issue,in_goods_receipt,gl_transaksi_rab,ko_transaksi_cair_pinjaman,"
            + "ko_transaksi_revisi_simpanan,ko_transaksi_tagihan,ko_transaksi_lembar_tagihan,ko_transaksi_bayar_toko";
    
    public String report_category="report_category";


    public void showbrowser(String what,String filter,JTextField jtxtfirstvalue){
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter,1);

        if (module_transaksi.contains(what)){
            frmbrowse=new FrmBrowseData(what, filter,0);
        }

        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);
        
        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            jtxtfirstvalue.setText(frmbrowse.getValue());
        }
    }

    public void showbrowser(String what,String filter,JTextField jtxtfirstvalue,JTextField jtxtsecondvalue){
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            jtxtfirstvalue.setText(frmbrowse.getValue());
            jtxtsecondvalue.setText(frmbrowse.getSecondValue());
        }
    }

    public void showbrowser(String what,String filter,JTextField jtxtfirstvalue,JLabel jtxtsecondvalue){
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            jtxtfirstvalue.setText(frmbrowse.getValue());
            jtxtsecondvalue.setText(frmbrowse.getSecondValue());
        }
    }

    public void showbrowser(String what, String filter, JTable jtbldetail) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            jtbldetail.setValueAt(frmbrowse.getValue(), jtbldetail.getSelectedRow(), jtbldetail.getSelectedColumn());
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtfirstvalue, ap_purchase_receiveext obj, ap_purchase_returnext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ap_purchase_orderext obj, ap_purchase_returnext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ap_purchase_receiveext obj, ap_purchase_orderext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ap_purchase_returnext obj, ap_purchase_receiveext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ar_sales_orderext obj, ar_sales_returnext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ar_sales_deliveryext obj, ar_sales_orderext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ar_sales_returnext obj, ar_sales_deliveryext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ap_purchase_invoiceext obj, ap_purchase_receiveext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ap_purchase_dnoteext obj, ap_purchase_returnext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ar_sales_invoiceext obj, ar_sales_deliveryext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void showbrowser(String what, String filter, JTextField jtxtreference_number, ar_sales_cnoteext obj, ar_sales_returnext objref) {
        FrmBrowseData frmbrowse=new FrmBrowseData(what, filter);
        frmbrowse.setModal(true);
        frmbrowse.setVisible(true);

        if (!frmbrowse.getValue().equalsIgnoreCase("")){
            try {
                if (objref.initdata(frmbrowse.getValue())) {
                    BrowseDocumentDetails frmbrowsedetail=new BrowseDocumentDetails(objref);
                    frmbrowsedetail.setModal(true);
                    frmbrowsedetail.setVisible(true);

                    obj.retrieve(objref);
                }
            } catch (CodeException ex) {
                Logger.getLogger(browsecontroller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
