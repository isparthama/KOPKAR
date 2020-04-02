/*
 * filecls.java
 *
 * Created on June 4, 2009, 8:13 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author isparthama
 */
public class filecls {
    private String filename;
    private String path;
    containcol ocontain=new containcol();
    /** Creates a new instance of filecls */
    public filecls() {
    }
    public Boolean deletefile(String source){
           if (deleteLocalFile(source)){
               return true;
           }
        return false;
    }
    private Boolean deleteLocalFile(String source){
        Boolean result=false;
        String fileName = source;
        // A File object to represent the filename
        File f = new File(fileName);

        // Make sure the file or directory exists and isn't write protected
        if (!f.exists())
          //throw new IllegalArgumentException(              "Delete: no such file or directory: " + fileName);

        if (!f.canWrite())
          //throw new IllegalArgumentException("Delete: write protected: "              + fileName);

        // If it is a directory, make sure it is empty
        if (f.isDirectory()) {
          String[] files = f.list();
          //if (files.length > 0){throw new IllegalArgumentException(    "Delete: directory not empty: " + fileName);
        }

        // Attempt to delete it
        boolean success = f.delete();

        if (!success){
          //throw new IllegalArgumentException("Delete "+fileName+": deletion failed");
        } else  {
            result=true;
        }
        return result;
    }
    public Boolean copyTo(String source,String dest){
                return copyLocalToLocal(source,dest);
    }
    private Boolean copyLocalToLocal(String source,String dest){
        FileInputStream in;
        try {
            File sourcefile=new File(source);
            if (sourcefile.length()>0){
                in=new FileInputStream(source);
                FileOutputStream out;
                String desttmp=dest.replace(".txt",".tmp");
                desttmp=desttmp.replace(".TXT",".tmp");
                out=new FileOutputStream(new File(desttmp));
                byte[] b=new byte[8192];
                int n;
                while ((n=in.read(b))>0){
                    out.write(b,0,n);
                }
                out.flush();
                out.close();
                in.close();

                File filetmp=new File(desttmp);
                File fileto=new File(dest);
                if (fileto.isFile()){
                    fileto.delete();
                }
                filetmp.renameTo(fileto);
                return true;
            }
            return false;
        } catch (FileNotFoundException ex) {
            //ex.printStackTrace();
            return false;
        }  catch (IOException ex) {
            //ex.printStackTrace();
            return false;
        }
    }
    public Boolean isExists(String namafile){
        if (namafile.contains("smb://")){

        } else {
            
        }
        return false;
    }
    private Boolean fillcontain(String str){
        ocontain.Insert();
        ocontain.getCa().setContain(str);
        ocontain.add(ocontain.getCa());
        return true;
    }
    public Boolean ReadLocalFile(String source){
        try {
            BufferedReader in = new BufferedReader(new FileReader(source));
            String str;
            try {
                str = in.readLine();
                if (str!=null){
                    ocontain=new containcol();
                    if (fillcontain(str)){
                        while (str!=null){
                            str=in.readLine();
                            if (str!=null){
                                if (fillcontain(str)){

                                }
                            }
                        }
                    }
                }
                if (ocontain.size()>0){
                    in.close();
                    return true;
                }
                in.close();
            } catch (IOException ex) {
                //ex.printStackTrace();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public Boolean readfile(String source){
            return ReadLocalFile(source);
    }
    

    
    public Boolean renamefile(String source,String dest){
            return RenameLocalFile(source,dest);
    }
    
    
    private Boolean RenameLocalFile(String source,String dest){
        File file=new File(source);
        File fileto=new File(dest);
        if (fileto.isFile()){
            fileto.delete();
        }
        file.renameTo(fileto);
        return true;
    }
    public Integer getcontainsize(){
        return ocontain.size();
    }
    public Integer find(Integer linenum){
        int i=0;
        for (i=0;i<this.ocontain.size();i++){
            String str[]=ocontain.get(i).toString().split("\t");
            if (str.length>0){
                String lineno=str[24];
                if (lineno.trim()==linenum.toString().trim()){
                    return i;
                }
            }
        }
        return -1;
    }
    public String getcontain(Integer i){
        if (ocontain.size()==0){
            return "";
        }
        return ocontain.get(i).getContain();
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @return the temp
     */
    
    
}
