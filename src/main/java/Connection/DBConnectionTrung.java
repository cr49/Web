package Connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnectionTrung {
    private final String serverName = "localhost";
    private final String dbName = "OnlineStore";
    private final String portNumber = "1433";
    private final String instance = "";// MSSQLSERVER LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "";
    private final String password = "";


    //Káº¿t ná»‘i SQL Server vá»›i Windows Authentication
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance
                + ";integratedSecurity=true;databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";integratedSecurity=true;databaseName="
                    + dbName;
//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

    //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String dbURL = "jdbc:sqlserver://localhost\\sqlexpress;user=sa;password=secret";

    public static void main(String[] args) {
        try {
            System.out.println(new DBConnectionTrung().getConnection());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
