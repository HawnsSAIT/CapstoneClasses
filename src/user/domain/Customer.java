package user.domain;
import java.util.ArrayList;

import dog.domain.Dog;
import managers.domain.AppointmentManager;

/**
 * Class used to model a customer.
 * @author 703174 Hans Cabrera
 *
 */
public class Customer extends User {

	/**
	 * Contains a list of all pets owned by the customer.
	 */
	private ArrayList<Dog> dogList;
	
	/**
	 * Used to book, edit, and cancel appointments.
	 */
	private AppointmentManager apptManager;
	
	/**
	 * Method to view pets in the customer's dogList.
	 */
	public void viewPets() {
		
	}
	
	/**
	 * Method to add pets to the customer's dogList.
	 */
	public void addPets() {
		
	}
	
	/**
	 * Method to remove pets from the customer's dogList.
	 */
	public void removePet() {
		
	}

}
