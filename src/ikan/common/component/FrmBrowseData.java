/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ikan.common.component;

/**
 *
 * @author mistian
 */
public class FrmBrowseData extends common.component.FrmBrowseData {

    public FrmBrowseData(String data,String Filter) {
        super(data, Filter);
    }

    @Override
    protected void SetFieldInCombo() {
        //in_brand
        if (datatoshow.equalsIgnoreCase("master_brand")){
            Tbl="master_brand";
            colModel.Insert();
            colModel.getColModel().setColName("kodebrand");
            colModel.getColModel().setColDesc("Kode Brand");
            colModel.getColModel().setColWidth(1000);
            colModel.add(colModel.getColModel());
            colModel.Insert();
            colModel.getColModel().setColName("namabrand");
            colModel.getColModel().setColDesc("Nama Brand");
            colModel.getColModel().setColWidth(3000);
            colModel.add(colModel.getColModel());
        }

        Integer i=new Integer(0);
        for(i=0;i<colModel.size();i++){
            cbosearchin.addItem(colModel.get(i).getColDesc());
        }
        txtsearch.setText("");
    }


}
