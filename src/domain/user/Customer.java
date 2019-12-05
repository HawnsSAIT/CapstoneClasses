package domain.user;

import java.util.ArrayList;

import application.logic.managers.AppointmentManager;
import domain.user.dog.Dog;
import domain.veterinarian.Veterinarian;

/**
 * Class used to model a customer.
 * 
 * @author 703174 Hans Cabrera
 *
 */
public class Customer extends User {

	/**
	 * The customer's veterinarian. Conforms to the rules of the veterinarian class.
	 */
	private Veterinarian veterinarian;

}
