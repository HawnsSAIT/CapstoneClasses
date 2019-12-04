package domain.user.address;
/**
 * Class for storing address information.
 *
 * @author Carsen Johns (640195)
 *
 */
public class Address {
	
	/**
	 * Street name. Cannot be null.
	 */
	private String street;
	
	/**
	 * Postal code. Cannot be null.
	 */
	private String postal;
	
	/**
	 * City name. Cannot be null and must be a valid city name.
	 */
	private String city;
	
	/**
	 * Province name. Cannot be null and must be a valid province.
	 */
	private String province;
	
	/**
	 * Country name. Cannot be null and must be a valid country.
	 */
	private String country;

	/**
	 * Return a concatenated string of each address component. Format: Street City, Province, Country, Postal.
	 * @return the address in format: Street City, Province, Country, Postal.
	 */
	public String getAddress() {
		return "";
	}
}