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
	 * cannot be null. The username must be 4-25 characters long and only contain letters,
	 * numbers and underscores.
	 */
	private String username;
	
	/**
	 * The password for the user associated with their account. the password 
	 */
	private String password;
	private String email;
	private Address address;

	/**
	 * Encrypts the entered password and sets the password for the user to the new password.
	 */
	public void changePassword() {

	}

}
