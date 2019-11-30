package user.domain;
import user.address.Address;

/**
 * Class Description: This class represents the user using the system
 * 
 * @author 806547 Holly Harnack
 */
public abstract class User {

	/**
	 * The id number of the user. This id must be unique and cannot be null.
	 */
	private int idNumber;
	
	/**
	 * First name of the user. The first name cannot be null.
	 */
	private String firstName;
	
	/**
	 * Last name of the user. The last name cannot be null.
	 */
	private String lastName;
	
	/**
	 * The username for the user associated with their account. The username must be unique and 
	 * cannot be null unless they are inactive customers. The username must be 4-25 characters long and only contain letters,
	 * numbers and underscores.
	 */
	private String username;
	
	/**
	 * The password for the user associated with their account. The password must be at 
	 * least 8 characters, contain numbers and characters and cannot be things like 
	 * 'password' or '12345678'. The password must be unique and cannot be null unless 
	 *  they are inactive customers.
	 */
	private String password;
	
	/**
	 * The email address for the user associated with the account. The email must be a valid
	 * email following a correct email format. 
	 */
	private String email;
	
	/**
	 * The address of the user.
	 */
	private Address address;


}
