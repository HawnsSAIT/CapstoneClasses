import java.util.ArrayList;

/**
 * Contains the attributes and methods of the customer objects.
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

	/**
	 * Presents the contents of the petList attribute.
	 */
	public void viewPets() {
		
	}
	
	/**
	 * Adds a pet to the petList. Constraints are handled by the pet class.
	 */
	public void addPet() {
		
	}
	
	/**
	 * Removes a pet from the petList. Pet must exist in the list.
	 */
	public void removePet() {
		
	}
}
