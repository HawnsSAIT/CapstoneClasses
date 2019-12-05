package domain.user;

import domain.user.address.Address;
import domain.veterinarian.Veterinarian;

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
	 * The username for the user associated with their account. The username must be
	 * unique and cannot be null unless they are inactive customers. The username
	 * must be 4-25 characters long and only contain letters, numbers and
	 * underscores.
	 */
	private String username;

	/**
	 * The password for the user associated with their account. The password must be
	 * at least 8 characters, contain numbers and characters and cannot be things
	 * like 'password' or '12345678'. The password must be unique and cannot be null
	 * unless they are inactive customers.
	 */
	private String password;

	/**
	 * First name of the user. Cannot be null or contain numbers.
	 */
	private String firstName;

	/**
	 * Last name of the user. Cannot be null or contain numbers.
	 */
	private String lastName;

	/**
	 * The address of the user. Cannot be null and conforms to the rules of the
	 * user.address.Adress class.
	 */
	private Address address;

	/**
	 * The email address for the user associated with the account. The email must be
	 * a valid email following the correct email format.
	 */
	private String email;
	

	/**
	 * The user's phone number. Cannot be null or contain alphabetical or symbol
	 * characters. Must be 10 digits long, including area code.
	 */
	private String phoneNumber;

	/**
	 * if the account is actively being used or not. If users want to use the service via phone and not the web-site, the admin
	 * can still do her administration through an account by making one for them. The account is then active, but disabled and cant be used to log in.
	 */
	private boolean isActive;

	/**
	 * If the user account is able to log in or not, essentially a "soft delete". If set to true the account cannot
	 * login, and is active is also automatically set to false.
	 */
	private boolean isDisabled;

}
