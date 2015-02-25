/**
 * 
 */
package com.nemshek.contactmanager.jdbchelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author nemshek
 *
 */
public class JDBCConnectionManager {
	private static final String DATABASE_NOT_FOUND = "Unknown database";
	private static final String DATABASE_NAME = "contact_manager";
	private static Connection connection;

	public static Connection getJDBCConnection() throws Exception {
		if (connection == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/contact_manager", "root",
						"root");
			} catch (Exception e) {
				if (e.getMessage().contains(DATABASE_NOT_FOUND)) {
					Connection tmpConnection = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/", "root", "root");
					createDatabase(tmpConnection);
					connection = getJDBCConnection();
					tmpConnection.close();
				}
			}
			if (connection == null) {
				return null;
			}
		}

		return connection;
	}

	private static void createDatabase(Connection tmpConnection)
			throws SQLException {
		String createDatabaseQuery = "create database " + DATABASE_NAME + ";";
		Statement stmt = tmpConnection.createStatement();
		stmt.executeUpdate(createDatabaseQuery);
		stmt.close();
		closeJDBCConnection(tmpConnection);
	}

	/**
	 * Closing jdbc connection after task is done
	 * 
	 * @param con
	 * @throws Exception
	 */
	public static void closeJDBCConnection(Connection con) throws SQLException {
		con.close();
	}
}
