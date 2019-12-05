package domain.testimonial;

import domain.user.Customer;

/**
 * Contains the attributes and methods for a Testimony object.
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public class Testimonial {

	/**
	 * 
	 */
	private int idNumber;
	
	/**
	 * The Customer object under which the testimony will be sent. Cannot be null
	 * and conforms to the rules of the user.domain.Customer class.
	 */
	private Customer author;

	/**
	 * The message which the Feedback object will contain. Cannot be null or contain
	 * more than 300 characters.
	 */
	private String message;

	/**
	 * 
	 */
	private boolean isApproved;
}
