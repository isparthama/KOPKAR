/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kopkar.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;
import kopkar.ap.objectclasses.ap_supplierext;
import kopkar.ar.objectclasses.ar_customerext;
import kopkar.in.objectclasses.in_brandext;
import kopkar.in.objectclasses.in_categoryext;
import kopkar.in.objectclasses.in_discountext;
import kopkar.in.objectclasses.in_functionext;
import kopkar.in.objectclasses.in_measureext;
import kopkar.in.objectclasses.in_priceext;
import kopkar.in.objectclasses.in_productext;
import kopkar.in.objectclasses.in_warehouseext;
import kopkar.ko.objectclasses.ko_departemenext;
import kopkar.ko.objectclasses.ko_jabatanext;
import kopkar.op.objectclasses.op_payment_termext;
import kopkar.op.objectclasses.op_salesmanext;
import utils.CodeException;

/**
 *
 * @author solution
 */
public class findcontroller {
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
    public String ko_departemen="ko_departemen";
    public String ko_jabatan="ko_jabatan";

    private ar_customerext oar_customer;
    private in_brandext oin_brand;
    private in_productext oin_product;
    private ap_supplierext oap_supplier;
    private in_categoryext oin_category;
    private in_measureext oin_measure;
    private in_functionext oin_function;
    private op_payment_termext oop_payment_term;
    private op_salesmanext oop_salesman;
    private in_priceext oin_price;
    private in_discountext oin_discount;
    private in_warehouseext oin_warehouse;
    private ko_departemenext oko_departemen;
    private ko_jabatanext oko_jabatan;


    public void find(String what,JTextField txtcode,JLabel txtdesc){
        try {
            if (what.equalsIgnoreCase(this.ar_customer)){
                oar_customer=new ar_customerext();
                if (oar_customer.initdata(txtcode.getText())) {
                    txtdesc.setText(oar_customer.getcustomer_name());
                }
            }
//    in_warehouse
            if (what.equalsIgnoreCase(this.in_warehouse)){
                oin_warehouse=new in_warehouseext();
                if (oin_warehouse.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_warehouse.getwarehouse_name());
                }
            }
//    in_discount
            if (what.equalsIgnoreCase(this.in_discount)){
                oin_discount=new in_discountext();
                if (oin_discount.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_discount.getdiscount_desc());
                }
            }
//    in_price
            if (what.equalsIgnoreCase(this.in_price)){
                oin_price=new in_priceext();
                if (oin_price.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_price.getprice_desc());
                }
            }
//    op_salesman
            if (what.equalsIgnoreCase(this.op_salesman)){
                oop_salesman=new op_salesmanext();
                if (oop_salesman.initdata(txtcode.getText())) {
                    txtdesc.setText(oop_salesman.getsalesman_name());
                }
            }
//    op_payment_term
            if (what.equalsIgnoreCase(this.op_payment_term)){
                oop_payment_term=new op_payment_termext();
                if (oop_payment_term.initdata(txtcode.getText())) {
                    txtdesc.setText(oop_payment_term.getterm_desc());
                }
            }
//    in_function
            if (what.equalsIgnoreCase(this.in_function)){
                oin_function=new in_functionext();
                if (oin_function.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_function.getfunction_name());
                }
            }
//    in_measure
            if (what.equalsIgnoreCase(this.in_measure)){
                oin_measure=new in_measureext();
                if (oin_measure.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_measure.getuom_desc());
                }
            }
//    in_category
            if (what.equalsIgnoreCase(this.in_category)){
                oin_category=new in_categoryext();
                if (oin_category.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_category.getcategory_name());
                }
            }
//    in_brand
            if (what.equalsIgnoreCase(this.in_brand)){
                oin_brand=new in_brandext();
                if (oin_brand.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_brand.getbrand_name());
                }
            }
//    in_product
            if (what.equalsIgnoreCase(this.in_product)){
                oin_product=new in_productext();
                if (oin_product.initdata(txtcode.getText())) {
                    txtdesc.setText(oin_product.getproduct_name());
                }
            }
//    ap_supplier
            if (what.equalsIgnoreCase(this.ap_supplier)){
                oap_supplier=new ap_supplierext();
                if (oap_supplier.initdata(txtcode.getText())) {
                    txtdesc.setText(oap_supplier.getsupplier_name());
                }
            }
//    ko_departemen
            if (what.equalsIgnoreCase(this.ko_departemen)){
                oko_departemen=new ko_departemenext();
                if (oko_departemen.initdata(txtcode.getText())) {
                    txtdesc.setText(oko_departemen.getnama_departemen());
                }
            }
//    ko_jabatan
            if (what.equalsIgnoreCase(this.ko_jabatan)){
                oko_jabatan=new ko_jabatanext();
                if (oko_jabatan.initdata(txtcode.getText())) {
                    txtdesc.setText(oko_jabatan.getnama_jabatan());
                }
            }
        } catch (CodeException ex) {
            Logger.getLogger(findcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void find(String what, JTextField txtcode, JTextField txtdesc) {
        try {
            //    ko_departemen
            if (what.equalsIgnoreCase(this.ko_departemen)){
                oko_departemen=new ko_departemenext();
                if (oko_departemen.initdata(txtcode.getText())) {
                    txtdesc.setText(oko_departemen.getnama_departemen());
                }
            }
        //    ko_jabatan
            if (what.equalsIgnoreCase(this.ko_jabatan)){
                oko_jabatan=new ko_jabatanext();
                if (oko_jabatan.initdata(txtcode.getText())) {
                    txtdesc.setText(oko_jabatan.getnama_jabatan());
                }
            }
        } catch (CodeException ex) {
            Logger.getLogger(findcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
