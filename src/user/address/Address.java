package user.address;
/**
 * Class for storing address information.
 *
 * @author Carsen Johns (640195)
 *
 */
public class Address {
	
	/**
	 * Street name. Cannot be null and must be valid.
	 */
	private String street;
	
	/**
	 * Postal code. Cannot be null and must be valid.
	 */
	private String postal;
	
	/**
	 * City name. Cannot be null and must be valid.
	 */
	private String city;
	
	/**
	 * Province name. Cannot be null and must be valid.
	 */
	private String province;
	
	/**
	 * Country name. Cannot be null and must be valid.
	 */
	private String country;

	/**
	 * Return a concatenated string of each address component.
	 * @return the address
	 */
	public String getAddress() {
		return "";
	}
}