/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ikan.common.component;

import utils.CodeException;

/**
 *
 * @author mistian
 */
public class FrmCompany extends common.component.FrmCompany{

    FrmMainFrameIkan mf ;

    public FrmCompany() throws CodeException {
        inisialisasicomponents();
    }

    public FrmCompany(FrmMainFrameIkan mf) throws CodeException{
        this.mf = mf;
        inisialisasicomponents();
    }

}
