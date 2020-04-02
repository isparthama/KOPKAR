/*
 * To change this setting_financial_rpt_detail1, choose Tools | Templates
 * and open the setting_financial_rpt_detail1 in the editor.
 */

package kopkar.gl.objectclasses;

import java.io.Serializable;

/**
 *
 * @author mtgmis30
 */
public class setting_financial_rpt_detail1cls implements Serializable {

    private Integer id;
    private Integer docentry;
    private Integer lineno=0;
    private Integer rowno;
    private String columntype;
    private Integer levelno;
    private String textheader;
    private String allowformulation;
    private String summary="";
    private String textformulation;
    private Integer visorder;
    private String showdata;

    public setting_financial_rpt_detail1cls() {
    }
    
    public Integer getid() {
        return id;
    }
    public void setid(Integer id) {
        this.id = id;
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

    public Integer getrowno() {
        return rowno;
    }
    public void setrowno(Integer rowno) {
        this.rowno = rowno;
    }

    public String getcolumntype() {
        return columntype;
    }
    public void setcolumntype(String columntype) {
        this.columntype = columntype;
    }

    public Integer getlevelno() {
        return levelno;
    }
    public void setlevelno(Integer levelno) {
        this.levelno = levelno;
    }

    public String gettextheader() {
        return textheader;
    }
    public void settextheader(String textheader) {
        this.textheader = textheader;
    }

    public String getallowformulation() {
        return allowformulation;
    }
    public void setallowformulation(String allowformulation) {
        this.allowformulation = allowformulation;
    }

    public String getsummary() {
        return summary;
    }
    public void setsummary(String summary) {
        this.summary = summary;
    }

    public String gettextformulation() {
        return textformulation;
    }
    public void settextformulation(String textformulation) {
        this.textformulation = textformulation;
    }

    public Integer getvisorder() {
        return visorder;
    }
    public void setvisorder(Integer visorder) {
        this.visorder = visorder;
    }

    public String getshowdata() {
        return showdata;
    }
    public void setshowdata(String showdata) {
        this.showdata = showdata;
    }


}
