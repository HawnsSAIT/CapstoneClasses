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
	 * 
	 */
	private UserBroker broker;

	/**
	 * 
	 * @param username
	 * @return
	 */
	public User get(String username) {
		return null;
	}

	/**
	 * 
	 * @param username
	 * @return
	 */
	public int delete(String username) {
		return 0;
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public int insert(User user) {
		return 0;
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	public int update(User user) {
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<User> getAll() {
		return null;
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public User login(String username, String password) {
		return null;
	}
	
	/**
	 * 
	 * @param email
	 */
	public void sendRecovery(String email) {
		
	}
}
