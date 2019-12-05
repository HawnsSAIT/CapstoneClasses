package application.logic.managers;

import java.util.List;

import database.brokers.UserBroker;
import domain.user.User;

/**
 * Contains methods to manipulate the list of User objects.
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public class UserManager {

	/**
	 * The list of all the users of the system.
	 */
	private List<User> userList;

	/**
	 * Instance of broker class to persist users to the database
	 */
	private UserBroker broker;

	/**
	 * Gets a single user object from the DB by username
	 * @param username username of the user
	 * @return user User object 
	 */
	public User get(String username) {
		return null;
	}

	/**
	 * deletes a user from the system by username
	 * @param username username of the user
	 * @return value returned to indicated if the delete worked or not
	 */
	public int delete(String username) {
		return 0;
	}
	
	/**
	 * Method to insert a new user into the DB
	 * @param user user object to be inserted
	 * @return value returned to indicate if the insert worked or not
	 */
	public int insert(User user) {
		return 0;
	}
	
	/**
	 * Method to update the information of an existing user
	 * @param user user object containing the information to be updated
	 * @return value returned to indicate if the insert worked or not
	 */
	public int update(User user) {
		return 0;
	}
	
	/**
	 * Method to get all user existing withing the DB
	 * @return list User list returned 
	 */
	public List<User> getAll() {
		return null;
	}
	
	/**
	 * Method to login a user, confirming if the username and password combination exists within the system,
	 * returns the user object if a match is found
	 * @param username username to be searched for
	 * @param password password to be searched for
	 * @return user User object to be returned, can be null if no match was found
	 */
	public User login(String username, String password) {
		return null;
	}
	
	/**
	 * Method to search the database for a matching email to the parameter, if a match is found, a password reset
	 * request is sent to the provided email for the password of the matching user object
	 * @param email Email to be searched for
	 */
	public void sendRecovery(String email) {
		
	}
}
