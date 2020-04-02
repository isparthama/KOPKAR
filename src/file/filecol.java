/*
 * consignmentdetail1col.java
 *
 * Created on September 10, 2007, 8:43 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package file;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class filecol extends ArrayList<filecls>{
    private String currentdir;
    private filecls ca;
    /** Creates a new instance of consignmentdetail1col */
    public Boolean getFiles(String sourcefolder){
        Boolean result=false;
            readlocalfolder(sourcefolder);
            return true;
    }
    
    private Boolean readlocalfolder(String path){
        Boolean result=false;
        if (path!=""){
            File dir = new File(path);

            String[] children = dir.list();
            if (children == null) {
                // Either dir does not exist or is not a directory
            } else {
                for (int i=0; i<children.length; i++) {
                    // Get filename of file or directory
                    String filename = children[i];
                    if (filename.contains(".txt")||filename.contains(".TXT")||
                    filename.contains(".csv")||filename.contains(".CSV")){
                        setCa(new filecls());
                        getCa().setFilename(filename);
                        getCa().setPath(path);
                        this.add(getCa());
                    }
                }
            }
        }
        return result;
    }

   
   
    public Integer Find(String name){
        Integer i=0;
        Integer ipos=-1;
        for(i=0;i<=this.size()-1;i++){
            if (this.get(i).getFilename().equals(name)){
                ipos=i;
                break;
            }
        }
        System.out.println("ketemu at:" + ipos);
        return ipos;
    }
    public filecls getCa() {
        return ca;
    }

    public void setCa(filecls ca) {
        this.ca = ca;
    }
    
    public void Insert(){
        setCa(new filecls());
    }

    public String getCurrentdir() {
        return currentdir;
    }

    public void setCurrentdir(String currentdir) {
        this.currentdir = currentdir;
    }
}
