package database.brokers;

import java.util.List;

import database.connection.DatabaseConnection;
import domain.user.dog.Dog;

/**
 * Broker class for interacting with dogs in the 
 * database.
 *
 * @author Levon Rose (553185)
 * 
 */
public class DogBroker {

	/**
	 * Database connection used for communicating with database.
	 */
	private DatabaseConnection connection;
	
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
	 * Method for adding a dog to the database. 
	 * 
	 * @param dog - dog to be added to database.
	 * @return 0 if insert was successful, 1 otherwise.
	 * @throws NullPointerException if dog is null.
	 */
	public int insert(Dog dog) throws NullPointerException {
		return 0;
	}
	
	/**
	 * Method for updating information for dog in database.
	 * 
	 * @return 0 if update was successful, 1 otherwise.
	 * @throws NullPointerException if dog is null.
	 */
	public int update(Dog dog) throws NullPointerException {
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
	 * Method for getting list of all dogs from the database.
	 * 
	 * @return list of dogs that were retrieved from database. 
	 */
	public List<Dog> getAll(){
		return null;
	}
}
