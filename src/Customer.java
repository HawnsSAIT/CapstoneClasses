import java.util.ArrayList;

/**
 * 
 * @author 703174 Hans Cabrera
 *
 */
public class Customer extends User {

	/**
	 * Contains a list of all pets owned by the customer.
	 */
	private ArrayList<Pet> petList;
	
	/**
	 * User to book, edit, and cancel appointments.
	 */
	private AppointmentManager apptManager;

}
