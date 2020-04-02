/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ikan.common.component;

import common.objectclasses.Mastercompany;
import common.objectclasses.extended.Mastercompanycols;
import javax.swing.table.DefaultTableModel;
import utils.CodeException;
import utils.GlobalModel;

/**
 *
 * @author mistian
 */
public class FrmMastergroup extends common.component.FrmMastergroup{

    FrmMainFrameIkan mf ;

     public FrmMastergroup() throws CodeException {
        inisialisasicomponents();
    }

    public FrmMastergroup(FrmMainFrameIkan mf) throws CodeException{
        this.mf = mf;

        inisialisasicomponents();

        tmodel=(DefaultTableModel) jtblGroupDetail.getModel();
        setCmbAccess();
        jtblGroupDetail.setAutoCreateRowSorter(true);

        GlobalModel.showTable(jtblGroupDetail, tmodel);

        GlobalModel.clearRow(tmodel);

        try {
            Mastercompanycols mastercompanys  = new Mastercompanycols();
            if (mastercompanys.initdata()){
                int i=0;
                for(i=0;i<mastercompanys.size();i++) {
                       Mastercompany m = mastercompanys.get(i);
                       jcmbCompany.addItem(m.getCompany());

                       if (m.getSelected()==1) {
                           jcmbCompany.setSelectedIndex(jcmbCompany.getItemCount()-1);
                       }
                }
            }
        }catch(Exception e) {

        }

    }

}
