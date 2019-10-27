
/**
 * Class for handling the processing of payments.
 * @author Levon Rose (553185)
 * 
 */
public class Billing {

	/**
	 * Identification number for the transaction. Cannot be null or negative.
	 * Must be a unique number.
	 */
	private String transactionID;
	
	/**
	 * The appointment for the transaction.
	 */
	private Appointment appointment;
	
	/**
	 * The price of the transaction. Must be a number between 0 and 10000.
	 * Must have two digits after the decimal place.
	 */
	private double price;
	
	/**
	 * Method for forwarding information to Paypal for processing.
	 */
	private void forwardToPaypal() {
		
	}
}
