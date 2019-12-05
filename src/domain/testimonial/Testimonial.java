package domain.testimonial;

import domain.user.Customer;

/**
 * Contains the attributes and methods for a Testimonial object.
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public class Testimonial {

	/**
	 * The unique identifier for each testimonial. This attribute is automatically
	 * assigned when a new testimonial object is queried into the database.
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
	 * If the testimonial has been approved by an administrator an can be posted on
	 * the testimonial page of the website
	 */
	private boolean isApproved;
}
