/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generator.objects;

import file.filecls;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import jdbc.DbBean;
import utils.appsettinghandler;

/**
 *
 * @author mtgmis30
 */
public class tablecls implements Serializable {
    private String tablename;
    private BufferedWriter out;
    filecls o=new filecls();
    private CharSequence REMARK_GET_CONTAIN="//getdeklarasi";
    private CharSequence REMARK_END_GET_CONTAIN="//getdeklarasiend";
    private CharSequence REMARK_GET_GETTERSETTER="//getgettersetter";
    private CharSequence REMARK_END_GET_GETTERSETTEREND="//getgettersetterend";
    private CharSequence REMARK_GET_PARAMETER="//getparameter";
    private CharSequence REMARK_END_GET_PARAMETER="//getparameterend";
    private CharSequence REMARK_GET_FILLME="//getfillme";
    private CharSequence REMARK_END_GET_FILLME="//getfillmeend";
    private CharSequence REMARK_GET_SCREEN="//GetScreen";
    private CharSequence REMARK_END_GET_SCREEN="//GetScreenend";
    private CharSequence REMARK_GET_INITCOMPONENT="//getinitcomponents";
    private CharSequence REMARK_END_GET_INITCOMPONENT="//getinitcomponentsend";
    private CharSequence REMARK_GET_PROPERTIES="//getproperties";
    private CharSequence REMARK_END_GET_PROPERTIES="//getpropertiesend";
    private CharSequence REMARK_GET_VARIABLEDECLARATION="//getvariabledeclaration";
    private CharSequence REMARK_END_GET_VARIABLEDECLARATION="//getvariabledeclarationend";
    private CharSequence REMARK_GET_CLEARFIELD="//getclearfield";
    private CharSequence REMARK_END_GET_CLEARFIELD="//getclearfieldend";
    private CharSequence REMARK_GET_SHOWDATA="//getshowdata";
    private CharSequence REMARK_END_GET_SHOWDATA="//getshowdataend";
    private CharSequence REMARK_GET_SETDATA="//getsetdata";
    private CharSequence REMARK_END_GET_SETDATA="//getsetdataend";
    private String key;
    private CharSequence REMARK_GET_FILLMECOL="//getfillmecol";
    private CharSequence REMARK_END_GET_FILLMECOL="//getfillmecolend";
    private CharSequence REMARK_GET_GETTFIELD="//getfield";
    private CharSequence REMARK_END_GET_GETFIELDEND="//getfieldend";
    private CharSequence REMARK_GET_GETPARAMINSERT="//getparaminsert";
    private CharSequence REMARK_END_GET_GETPARAMINSERTEND="//getparaminsertend";
    private CharSequence REMARK_GET_GETPARAMUPDATE="//getparamupdate";
    private CharSequence REMARK_END_GET_GETPARAMUPDATEEND="//getparamupdateend";
    private CharSequence REMARK_GET_PHP_Setdata="//getsetdata";
    private CharSequence REMARK_END_GET_PHP_Setdata="//getsetdataend";
    private CharSequence REMARK_GET_PHP_FIELDLAYAR="//getfieldlayar";
    private CharSequence REMARK_END_GET_PHP_FIELDLAYAR="//getfieldlayarend";
    private CharSequence REMARK_GET_PHP_FILLMECOL="//getPHP_fillmecol";
    private CharSequence REMARK_END_GET_PHP_FILLMECOL="//getPHP_fillmecolend";
    private CharSequence REMARK_GET_FOCUSGAINEVENT="//getfocusgainedevent";
    private CharSequence REMARK_END_GET_FOCUSGAINEVENT="//getfocusgainedeventend";
    private DbBean db;


    public tablecls(DbBean db){
        this.db=db;
    }
    /**
     * @return the tablename
     */
    public String getTablename() {
        return tablename;
    }

    /**
     * @param tablename the tablename to set
     */
    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public void generate(boolean isdesktop,boolean bclass, boolean bextclass,boolean bextclasscol, boolean bform, boolean bstoreprocedures, boolean bdropstoreprocedures) {
        if (bstoreprocedures){
            o=new filecls();
            if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/storeprocedures/sp_template_get")){
                procedure_creator pc=new procedure_creator(this);
                if (bdropstoreprocedures)  pc.dropprocedure("sp_"+this.getTablename()+"_get");
                pc.createprocedure(o);
            }
            if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/storeprocedures/sp_template_insert")){
                procedure_creator pc=new procedure_creator(this);
                if (bdropstoreprocedures) pc.dropprocedure("sp_"+this.getTablename()+"_insert");
                pc.createprocedure(o);
            }
            if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/storeprocedures/sp_template_update")){
                procedure_creator pc=new procedure_creator(this);
                if (bdropstoreprocedures) pc.dropprocedure("sp_"+this.getTablename()+"_update");
                pc.createprocedure(o);
            }
            if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/storeprocedures/sp_template_delete")){
                procedure_creator pc=new procedure_creator(this);
                if (bdropstoreprocedures) pc.dropprocedure("sp_"+this.getTablename()+"_delete");
                pc.createprocedure(o);
            }
        }
        if (isdesktop){
            if (bclass){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/templatecls.java")){
                    this.createfilecls(appsettinghandler.getAppPath());
                }
            }
            if (bextclass){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/templateext.java")){
                    this.createfileext(appsettinghandler.getAppPath());
                }
            }
            if (bextclasscol){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/templateextcol.java")){
                    this.createfileextcol(appsettinghandler.getAppPath());
                }
            }
            if (bextclass){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/templateextcol.java")){
                    this.createfileextcol(appsettinghandler.getAppPath());
                }
            }
            if (bform){
                 o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/FrmTemplate.form")){
                    this.createfileform(appsettinghandler.getAppPath());
                }
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/FrmTemplate.java")){
                    this.createfileformjava(appsettinghandler.getAppPath());
                }
            }
        }else{
            if (bclass){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/web/templatecls.php")){
                    this.createfileclsphp(appsettinghandler.getAppPath());
                }
            }
            if (bextclass){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/web/update_template.php")){
                    this.createPHP_fileupdatetable(appsettinghandler.getAppPath());
                }
            }
            if (bextclasscol){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/web/templatecolcls.php")){
                    this.createPHP_filecolcls(appsettinghandler.getAppPath());
                }
            }
            if (bform){
                o=new filecls();
                if (o.ReadLocalFile(appsettinghandler.getAppPath()+"/template/web/templatefrm.php")){
                    this.createPHP_form(appsettinghandler.getAppPath());
                }
            }
        }
    }

    private Boolean createfilecls(String sFilePath){
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/"+this.getTablename()+"cls.java"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_CONTAIN)&!breplace){
                        of.writegenerate(out,of.DEKLARASI);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_CONTAIN)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_GETTERSETTER)&!breplace){
                        of.writegenerate(out,of.GETTERSETTER);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_GETTERSETTEREND)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }

                        out.write(c);
                        out.write("\r\n");
                    }
                }
            
                out.flush();
                out.close();
                status=true;
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }
    private Boolean createfileclsphp(String sFilePath){
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/"+this.getTablename()+"cls.php"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_CONTAIN)&!breplace){
                        of.writegeneratephp(out,of.DEKLARASI);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_CONTAIN)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_GETTERSETTER)&!breplace){
                        of.writegeneratephp(out,of.GETTERSETTER);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_GETTERSETTEREND)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_GETTFIELD)&!breplace){
                        of.writegeneratephp(out,of.GETFIELD);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_GETFIELDEND)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_GETPARAMINSERT)&!breplace){
                        of.writegeneratephp(out,of.GETPARAMINSERT);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_GETPARAMINSERTEND)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_GETPARAMUPDATE)&!breplace){
                        of.writegeneratephp(out,of.GETPARAMUPDATE);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_GETPARAMUPDATEEND)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }

                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }
    private Boolean createfileext(String sFilePath) {
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/"+this.getTablename()+"ext.java"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_PARAMETER)&!breplace){
                        of.writegenerate(out,of.PARAMETER);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_PARAMETER)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_FILLME)&!breplace){
                        of.writegenerate(out,of.FILLME);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_FILLME)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                       if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }
                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }

    private Boolean createfileextcol(String sFilePath) {
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/"+this.getTablename()+"extcol.java"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_FILLMECOL)&!breplace){
                        of.writegenerate(out,of.FILLMECOL);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_FILLMECOL)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }
                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }

    private Boolean createPHP_fileupdatetable(String sFilePath) {
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/update_"+this.getTablename()+".php"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_PHP_Setdata)&!breplace){
                        of.writegeneratephp(out,of.PHP_Setdata);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_PHP_Setdata)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }
                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }

    private Boolean createPHP_form(String sFilePath) {
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/"+this.getTablename()+"frm.php"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_PHP_FIELDLAYAR)&!breplace){
                        of.writegeneratephp(out,of.PHP_FIELDLAYAR);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_PHP_FIELDLAYAR)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }
                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }
    private Boolean createPHP_filecolcls(String sFilePath) {
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/"+this.getTablename()+"colcls.php"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_PHP_FILLMECOL)&!breplace){
                        of.writegeneratephp(out,of.PHP_FILLMECOL);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_PHP_FILLMECOL)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }
                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }
    private Boolean createfileform(String sFilePath) {
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/Frm"+this.getTablename()+".form"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_SCREEN)&!breplace){
                        of.writegenerate(out,of.SCREEN);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_SCREEN)){
                        breplace=false;
                        bskip=true;
                    }
                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }
                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }
    private Boolean createfileformjava(String sFilePath) {
        Boolean status=false;
        String c;

        try {
            tablefieldscolcls of=new tablefieldscolcls(this.db,tablename);
            if (of.initdata()){
                this.setKey(of.getkey());
                out = new BufferedWriter(new FileWriter(sFilePath+"/src/generator/generated/Frm"+this.getTablename()+".java"));
                int i=0;
                Boolean breplace = false;
                for (i=0;i<o.getcontainsize();i++){
                    c=o.getcontain(i);
                    boolean bskip=false;
                    if (c.contains(this.REMARK_GET_INITCOMPONENT)&!breplace){
                        of.writegenerate(out,of.INITCOMPONENT);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_INITCOMPONENT)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_PROPERTIES)&!breplace){
                        of.writegenerate(out,of.PROPERTIES);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_PROPERTIES)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_VARIABLEDECLARATION)&!breplace){
                        of.writegenerate(out,of.VARIABLEDECLARATION);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_VARIABLEDECLARATION)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_CLEARFIELD)&!breplace){
                        of.writegenerate(out,of.CLEARFIELD);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_CLEARFIELD)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_SHOWDATA)&!breplace){
                        of.writegenerate(out,of.SHOWDATA);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_SHOWDATA)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_SETDATA)&!breplace){
                        of.writegenerate(out,of.SETDATA);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_SETDATA)){
                        breplace=false;
                        bskip=true;
                    }
                    if (c.contains(this.REMARK_GET_FOCUSGAINEVENT)&!breplace){
                        of.writegenerate(out,of.FOCUSGAINEVENT);
                        breplace=true;
                    }
                    if (c.contains(this.REMARK_END_GET_FOCUSGAINEVENT)){
                        breplace=false;
                        bskip=true;
                    }

                    if (!breplace&!bskip){
                        if (c.contains("template")){
                            String a=c.replace("template", tablename);
                            c=a;
                        }
                        if (c.contains("Template")){
                            String a=c.replace("Template", tablename);
                            c=a;
                        }
                        if (c.contains("KEY")){
                            String a=c.replace("KEY", this.key);
                            c=a;
                        }
                        out.write(c);
                        out.write("\r\n");
                    }
                }

                out.flush();
                out.close();
                status=true;
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return status;
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    DbBean getdb() {
        return this.db;
    }




}
