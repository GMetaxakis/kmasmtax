/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package kmasmtax;

/**
 *
 * @author MeTaXaS4
 */
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDriverInformation {
	static String userid="admin", password ="admin";
        static String url = "jdbc:derby:tax";
        
	static Connection con = null;
	public static void main(String[] args) throws Exception {
	    Connection con = getOracleJDBCConnection();
	    if(con!= null){
	       System.out.println("Got Connection.");
	       DatabaseMetaData meta = con.getMetaData();
	       System.out.println("Driver Name : "+meta.getDriverName());
	       System.out.println("Driver Version : "+meta.getDriverVersion());

	    }else{
		    System.out.println("Could not Get Connection");
	    }
	}

	public static Connection getOracleJDBCConnection(){
		try {
		   con = DriverManager.getConnection(url, userid, password);
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}

		return con;
	}
}