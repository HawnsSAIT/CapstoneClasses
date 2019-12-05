package database.connection;

import java.sql.Connection;

import javax.sql.DataSource;

/**
 * This class contains the singleton pattern used to connect the brokers to the
 * database.
 * 
 * @author 703174 Hans Cabrera
 *
 */
public class DatabaseConnection {

	/**
	 * A reference of the DatabaseConnection class to enforce.
	 */
	private static DatabaseConnection databaseConnection;

	/**
	 * The database to connect to.
	 */
	private static DataSource dataSource;

	/**
	 * Used to enforce the singleton pattern.
	 */
	private DatabaseConnection() {

	}

	/**
	 * Used to get the instance of the DatabaseConnection class.
	 * 
	 * @return The single instance of the DatabaseConnection class.
	 */
	public static synchronized DatabaseConnection getInstance() {
		return databaseConnection;
	}

	/**
	 * Gets the connection to the database.
	 * 
	 * @return the connection to the database.
	 */
	public Connection getConnection() {
		return null;
	}

	/**
	 * Used to free the connection so more users can connect at once.
	 * 
	 * @param c The connection to the database.
	 */
	public void freeConnection(Connection c) {

	}

}
