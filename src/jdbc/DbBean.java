/*
 * DbBean.java
 *
 * Created on July 10, 2007, 3:04 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 *
 *
 * Koneksi ke database SQL (apa aja)
 */

package jdbc;

import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.appsettinghandler;


/**
 *
 * @author sandy
 */
public class DbBean extends javax.swing.JInternalFrame {
    private Boolean beginTransaction=false;
    PreparedStatement stmt=null;
    /* ORACLE CONNECTION
    private String driver ="oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin@10.10.1.56:1521:xe"; 
    */
    
    /* MYSQL CONNECTION
    private String driver ="com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://10.10.1.5:3306/salesinventory"; 
     */
    
    private String driver ="";
    private String url = ""; 
    
    private String username = appsettinghandler.getUsername();
    private String password = appsettinghandler.getPassword();
    
    private Connection connection;
    private Statement statement;

    private Boolean onconnect=false;
    private final String dbname;
    
    /** Creates a new instance of DbBean */
    public DbBean(String dbname) {
        this.dbname=dbname;
        if (!dbname.equalsIgnoreCase("")){
            appsettinghandler.setDatabaseName(dbname);
        }
//        switch (m.getDBType()){
//            case 1:
//                driver ="oracle.jdbc.driver.OracleDriver";
//                url = "jdbc:oracle:thin@" + appsettinghandler.getServerIP() + ":1521:xe";
//                break;
//            case 2:
                driver ="com.mysql.jdbc.Driver";
                url = "jdbc:mysql://" + appsettinghandler.getServerIP() + ":3306/" + appsettinghandler.getDatabaseName()+"?characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull" ;
                //System.out.println("curdir: "+m.getCurrentdir());
//                break;
//            case 3:
//                driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
//                url = "jdbc:sqlserver://" + appsettinghandler.getServerIP() + ";databaseName=" + appsettinghandler.getDatabaseName() ;
//                break;
//        }
    }   
    
    public void connect() throws SQLException, ClassNotFoundException{
        Class.forName(driver);
        connection=DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        onconnect=true;
        registerConnection();
        System.out.println("Connected to "+appsettinghandler.getServerIP()+" dabatase "+appsettinghandler.getDatabaseName());
    }

    public Boolean registerConnection(){
        ResultSet rs=null;
        String squery="";
        try {
            rs = this.executeQuery("SELECT CONNECTION_ID() as conid");
            if (rs.next()){
                appsettinghandler.setConnectionid(rs.getInt("conid"));

                rs=this.executeQuery("show tables like 'connectionlist'");
                if (!rs.next()){
                    squery="CREATE TABLE connectionlist ( "+
                           "\n    id      	int(11) AUTO_INCREMENT NOT NULL, "+
                           "\n     conid   	int(11) NULL, "+
                           "\n     emplcode	varchar(25) NULL, "+
                           "\n     regdate 	datetime NULL, "+
                           "\n     PRIMARY KEY(id) "+
                           "\n ) "+
                           "\n ENGINE = MyISAM";
                    this.execute(squery);
                }

                squery="insert into connectionlist (conid,emplcode,regdate) "
                        + "values ('"+appsettinghandler.getConnectionid()+"','"+appsettinghandler.getEmployeeid()+"',now())";
                this.execute(squery);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public void close() throws SQLException{
        statement.close();
        connection.close();
        setCursor(null);
        onconnect=false;
    }
    
    public boolean execute(String query) throws SQLException{
        System.out.println(query);
        statement.execute(query);
        return true;
    }
    
    public boolean executewolog(String query) throws SQLException{
        System.out.println(query);
        statement.execute(query);
        return true;
    }

    private Boolean isconnected(){
        try {
            statement.executeQuery("select 1");
            return true;
        } catch (SQLException ex) {
            System.out.println("System disconnected from "+appsettinghandler.getServerIP());
            try {
                this.connect();
                return true;
            } catch (SQLException ex1) {
                Logger.getLogger(DbBean.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (ClassNotFoundException ex1) {
                Logger.getLogger(DbBean.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
         return false;
    }
    public ResultSet executeQuery(String query) throws SQLException{
        if (isconnected()){
            System.out.println(query);
            return statement.executeQuery(query);
        }
        return null;
    }

    public Connection getConnection() {
        return connection;
    }

    public Boolean BeginTransaction() {
        Boolean status=false;
        try {
            getConnection().setAutoCommit(false);
            System.out.println("Transaction Begin");
            beginTransaction=true;
            status=true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return status;
    }
    
    public Boolean CommitTransaction(){
        Boolean status=false;
        if (beginTransaction==true){
            try {
                getConnection().commit();
                onconnect=false;
                System.out.println("Transaction Commited");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return status;
    }
    
    public Boolean RollBackTransaction(){
        Boolean status=false;
        if (beginTransaction==true){
            try {
                getConnection().rollback();
                onconnect=false;
                System.out.println("Transaction rolled back");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return status;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    } 
    
    public void changeconnection(String serverip,String dbname){
        url = "jdbc:mysql://" + serverip + ":3306/" + dbname ; 
    }
    
    public void changeconnectiontosql(String serverip,String dbname){
        driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        url = "jdbc:sqlserver://" + serverip + ";databaseName=" + dbname; 
    }

    /**
     * @return the onconnect
     */
    public Boolean getOnconnect() {
        return onconnect;
    }

    /**
     * @param onconnect the onconnect to set
     */
    public void setOnconnect(Boolean onconnect) {
        this.onconnect = onconnect;
    }

    public void setRedirect(String serverip,String database){
        driver ="com.mysql.jdbc.Driver";
        url = "jdbc:mysql://" + serverip + ":3306/" + database ;
    }

    public ResultSet getrsfromsp(String squery) {
        CallableStatement cs=null;
        ResultSet rs=null;
        try {
            System.out.println(squery);
            cs = connection.prepareCall(squery);
            cs.execute();
            rs=cs.getResultSet();
        } catch (SQLException ex) {
            Logger.getLogger(DbBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    /**
     * @return the dbname
     */
    public String getDbname() {
        return dbname;
    }
}