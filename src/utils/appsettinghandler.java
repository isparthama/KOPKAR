/*
 * appsettinghandler.java
 *
 * Created on June 29, 2009, 6:59 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import jdbc.DbBean;


/**
 *
 * @author sakho
 */
public class appsettinghandler {
    private static String appPath;
    private static String serverIP;
    private static String databaseName;
    private static String databaseNameIns;
    private static String username;
    private static String password;
    private static String employeeid;
    private static String employeename;

    private static String Cmpnyname="";
    private static String Address1 = "";
    private static String Phone1 = "";
    private static String Printerport="";
    private static String counter="";
    private static Integer connectionid=new Integer(0);

    private static Boolean inf8mode=false;
    private static Boolean isLogin=false;
    static File dir1 = new File (".");
    static File dir2 = new File ("..");
    static String str="";

    public static DbBean db=null;
    public static DbBean dbcom=null;
    /**
     * @return the db
     */


    /**
     * @return the inf8mode
     */
    public static Boolean getInf8mode() {
        return inf8mode;
    }

    /**
     * @param aInf8mode the inf8mode to set
     */
    public static void setInf8mode(Boolean aInf8mode) {
        inf8mode = aInf8mode;
    }

    /**
     * @return the Cmpnyname
     */
    public static String getCmpnyname() {
        return Cmpnyname;
    }

    /**
     * @param aCmpnyname the Cmpnyname to set
     */
    public static void setCmpnyname(String aCmpnyname) {
        Cmpnyname = aCmpnyname;
    }

    /**
     * @return the Address1
     */
    public static String getAddress1() {
        return Address1;
    }

    /**
     * @param aAddress1 the Address1 to set
     */
    public static void setAddress1(String aAddress1) {
        Address1 = aAddress1;
    }

    /**
     * @return the Phone1
     */
    public static String getPhone1() {
        return Phone1;
    }

    /**
     * @param aPhone1 the Phone1 to set
     */
    public static void setPhone1(String aPhone1) {
        Phone1 = aPhone1;
    }

    /**
     * @return the Printerport
     */
    public static String getPrinterport() {
        return Printerport;
    }

    /**
     * @param aPrinterport the Printerport to set
     */
    public static void setPrinterport(String aPrinterport) {
        Printerport = aPrinterport;
    }

    /**
     * @return the dbInsysCommon
     */

    /**
     * @return the databaseNameIns
     */
    public static String getDatabaseNameIns() {
        return databaseNameIns;
    }

    /**
     * @param aDatabaseNameIns the databaseNameIns to set
     */
    public static void setDatabaseNameIns(String aDatabaseNameIns) {
        databaseNameIns = aDatabaseNameIns;
    }

    /**
     * @return the counter
     */
    public static String getCounter() {
        return counter;
    }

    /**
     * @param aCounter the counter to set
     */
    public static void setCounter(String aCounter) {
        counter = aCounter;
    }

    /**
     * @return the connectionid
     */
    public static Integer getConnectionid() {
        return connectionid;
    }

    /**
     * @param aConnectionid the connectionid to set
     */
    public static void setConnectionid(Integer aConnectionid) {
        connectionid = aConnectionid;
    }

    private static void setindevelopment(String b) {
        if (b.equalsIgnoreCase("true")){
            indevelopment=true;
        }
    }
    private static void setbackground_image(String b) {
            background_image=b;
    }
    private static Boolean indevelopment=false;
    private static String background_image="/images/layout-aplikasi-accounting.jpg";

    public static boolean getisindevelopment() {
        return indevelopment;
    }

    public static String getbackground_image() {
        return background_image;
    }

    private static void setwhscode(String awhscode) {
        whscode=awhscode;
    }

    public static String getwhscode(){
        return whscode;
    }
    private static String whscode="";
    /** Creates a new instance of appsettinghandler */
    public appsettinghandler() {
    }

    public static Boolean getAppDir(){
        Boolean result=false;
        
         try {
             appsettinghandler.appPath=dir1.getCanonicalPath().replace("\\","/");
             java.lang.System.out.println(appPath);
             return true;
           }
         catch(IOException e) {
            try {
                appsettinghandler.appPath=dir2.getCanonicalPath().replace("\\","/");
                return true;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
             
           }
        return false;
    }
    
    public static Boolean InitConnection(){
        if (getAppDir()){
            Boolean status=false;
            BufferedReader in=null;
            try {
                //Properties systemProp = System.getProperties();

                in=new BufferedReader(new FileReader(appPath+"/Server.txt"));
                try {
                    java.lang.System.out.println("File System setting ("+appPath+"/Server.txt"+") found");
                    str=in.readLine();
                    if (str!=null){
                        if (!str.contains("//")){
                            if (str.contains("server")){
                                appsettinghandler.setServerIP(str.substring(7));
                            }
                        }
                    }
                    while (str!=null){
                        str=in.readLine();
                        if (str!=null){
                            if (!str.contains("//")){
                                if (str.contains("server")){
                                    appsettinghandler.setServerIP(str.substring(7));
                                }
                                if (str.contains("database")){
                                    appsettinghandler.databaseName=str.substring(9);
                                }
                                if (str.contains("insys_db")){
                                    appsettinghandler.databaseNameIns=str.substring(9);
                                }
                                if (str.contains("username")){
                                    appsettinghandler.username=str.substring(9);
                                }
                                if (str.contains("password")){
                                    appsettinghandler.password=str.substring(9);
                                }
                                if (str.contains("printerport")){
                                    appsettinghandler.Printerport=str.substring(12);
                                }
                                if (str.contains("counter")){
                                    appsettinghandler.setCounter(str.substring(8));
                                }
                                if (str.contains("whscode")){
                                    appsettinghandler.setwhscode(str.substring(8));
                                }
                                if (str.contains("indevelopment")){
                                    appsettinghandler.setindevelopment(str.substring(14));
                                }
                                if (str.contains("background_image")){
                                    appsettinghandler.setbackground_image(str.substring(17));
                                }
                            }
                        }
                    }
                    java.lang.System.out.println(serverIP);
                    appsettinghandler.dbcom=new DbBean("");
                    in.close();
                    return true;
                } catch (IOException ex) {
                        ex.printStackTrace();
                        try {
                            in.close();
                        } catch (IOException exp) {
                            exp.printStackTrace();
                        }
                }
            } catch (FileNotFoundException ex) {
                java.lang.System.out.println("File System setting ("+appPath+"/Server.txt"+") not found");
            }
        }
        return false;
    }

    public static String getServerIP() {
        return serverIP;
    }

    public static void setServerIP(String aServerIP) {
        serverIP = aServerIP;
    }

    public static String getDatabaseName() {
        return databaseName;
    }

    public static void setDatabaseName(String aDatabaseName) {
        databaseName = aDatabaseName;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String aUsername) {
        username = aUsername;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String aPassword) {
        password = aPassword;
    }

    public static String getAppPath() {
        return appPath;
    }

    public static void setAppPath(String aAppPath) {
        appPath = aAppPath;
    }

    public static String getEmployeeid() {
        return employeeid;
    }

    public static void setEmployeeid(String aEmployeeid) {
        employeeid = aEmployeeid;
    }

    public static String getEmployeename() {
        return employeename;
    }

    public static void setEmployeename(String aEmployeename) {
        employeename = aEmployeename;
    }

    /**
     * @return the isLogin
     */
    public static Boolean getIsLogin() {
        return isLogin;
    }

    /**
     * @param isLogin the isLogin to set
     */
    public static void setIsLogin(Boolean aisLogin) {
        isLogin = aisLogin;
    }

    
    
    
}
