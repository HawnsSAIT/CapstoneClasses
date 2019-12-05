package database.brokers;

import java.util.List;

import database.connection.DatabaseConnection;
import domain.user.User;

/**
 * Broker class for interacting with users in the 
 * database.
 *
 * @author Levon Rose (553185)
 * 
 */
public class UserBroker {

	/**
	 * Database connection used for communicating with database.
	 */
	private DatabaseConnection connection;
	
	/**
	 * Method for getting user from database.
	 * 
	 * @param username - username used to identify a 
	 * user in the database.
	 * @return user which was retrieved from database.
	 */
	public User get(String username) {
		return null;
	}
	
	/**
	 * Method for adding a user to the database. 
	 * 
	 * @param user - user to be added to database.
	 * @return 0 if insert was successful, 1 otherwise.
	 * @throws NullPointerException if user is null.
	 */
	public int insert(User user) throws NullPointerException {
		return 0;
	}
	
	/**
	 * Method for updating information for user in database.
	 * 
	 * @param user - user to be updated in database.
	 * @return 0 if update was successful, 1 otherwise.
	 * @throws NullPointerException if user is null.
	 */
	public int update(User user) throws NullPointerException {
		return 0;
	}
	
	/**
	 * Method for deleting user from database.
	 * 
	 * @param username - username used to identify a 
	 * user in the database.
	 * @return 0 if delete was successful, 1 otherwise.
	 */
	public int delete(String username) {
		return 0;
	}
	
	/**
	 * Method for getting list of all users from the database.
	 * 
	 * @return list of users that were retrieved from database. 
	 */
	public List<User> getAll(){
		return null;
	}
}
