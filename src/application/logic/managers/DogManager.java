package application.logic.managers;

import java.util.List;

import database.brokers.DogBroker;
import domain.dog.Dog;

/**
 * Manages Dog objects.
 * @author Levon Rose (553185)
 * 
 */
public class DogManager {

	/**
	 * List of existing dogs in the database.
	 */
	private List<Dog> dogList;
	
	/**
	 * Broker used for persistence of dogs.
	 */
	private DogBroker broker;
	
	/**
	 * Method for adding dog to database. 
	 * 
	 * @param dog - dog to be added to database.
	 * @return 0 if insert was successful, 1 otherwise.
	 */
	public int insert(Dog dog) {
		return 0;
	}
	
	/**
	 * Method for deleting dog from database.
	 * 
	 * @param idNumber - id number used to identify a
	 * dog in the database.
	 * @return 0 if delete was successful, 1 otherwise.
	 */
	public int delete(int idNumber) {
		return 0;
	}
	
	/**
	 * Method for getting dog from database.
	 * 
	 * @param idNumber - id number used to identify a
	 * dog in the database.
	 * @return dog which was retrieved from database.
	 */
	public Dog get(int idNumber) {
		return null;
	}
	
	/**
	 * Method for updating information for dog in database.
	 * 
	 * @return 0 if update was successful, 1 otherwise.
	 */
	public int update(Dog dog) {
		return 0;
	}
	
	/**
	 * Method for getting list of dogs from database belonging
	 * to certain user.
	 * 
	 * @param username - username of user who owns dogs to be 
	 * retrieved.
	 * @return list of dogs that were retrieved from database. 
	 */
	public List<Dog> getAll(String username){
		return null;
	}
}
