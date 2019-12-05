package domain.user.dog;

import java.util.Date;

/**
 * Contains the Vaccine for the Dog object.
 * 
 * @author 806547 Holly Harnack
 *
 */
public class Vaccine {

	/**
	 * The name of the vaccine. Cannot be null.
	 */
	private String vaccine;
	
	/**
	 * The date this vaccine expires. Cannot be earlier or equal to the current date.
	 */
	private Date expirationDate;
	
}
