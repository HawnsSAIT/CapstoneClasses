package domain.veterinarian;

/**
 * Contains information about the Customer's dog's veterinarian.
 * 
 * @author 703174 Hans Cabrera
 *
 */
public class Veterinarian {

	/**
	 * The name of the customer's veterinarian. Cannot be null or contain numbers.
	 */
	private String name;

	/**
	 * The name of the clinic the veterinarian belongs to. Cannot be null.
	 */
	private String clinic;

	/**
	 * The phone number of the veterinarian. Cannot be null, or contain letters, and
	 * must be 10 digits long.
	 */
	private String phoneNumber;

}
