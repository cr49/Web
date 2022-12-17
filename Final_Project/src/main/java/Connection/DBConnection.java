package Connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {

	private final String serverName = "MSI";
	private final String dbName = "OnlineStore";
	private final String portNumber = "1433";
	private final String instance = "";// MSSQLSERVER LEAVE THIS ONE 
	private final String userID = "";
	private final String password = "";
	
	// Kết nối SQL Server với Windows Authentication
	public Connection getConnectionW() throws Exception {
	String url = "jdbc:sqlserver://" + serverName + ":" + portNumber
	+ "\\" + instance + ";integratedSecurity=true;databaseName=" + 
	dbName;
	if (instance == null || instance.trim().isEmpty())
	url = "jdbc:sqlserver://" + serverName + ":" + portNumber + 
	";integratedSecurity=true;databaseName=" + dbName;
	//DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	return DriverManager.getConnection(url, userID, password);
	}
	
	String dbURL = 
			"jdbc:sqlserver://localhost\\sqlexpress;user=sa;password=secret"
			;
	
	public static void main(String[] args) {
		try {
		System.out.println(new DBConnection().getConnectionW());
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
	
}
