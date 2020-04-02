/*
 * To change this setting_financial_rpt_detail2, choose Tools | Templates
 * and open the setting_financial_rpt_detail2 in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class setting_financial_rpt_detail2cls implements Serializable {

    private Integer docentry;
    private Integer lineno;
    private Integer linenodetail;
    private String textformulation;

    public setting_financial_rpt_detail2cls() {
    }
    
    public Integer getdocentry() {
        return docentry;
    }
    public void setdocentry(Integer docentry) {
        this.docentry = docentry;
    }

    public Integer getlineno() {
        return lineno;
    }
    public void setlineno(Integer lineno) {
        this.lineno = lineno;
    }

    public Integer getlinenodetail() {
        return linenodetail;
    }
    public void setlinenodetail(Integer linenodetail) {
        this.linenodetail = linenodetail;
    }

    public String gettextformulation() {
        return textformulation;
    }
    public void settextformulation(String textformulation) {
        this.textformulation = textformulation;
    }


}
