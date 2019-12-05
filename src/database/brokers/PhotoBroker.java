package database.brokers;

import java.util.List;

import database.connection.DatabaseConnection;
import domain.photo.Photo;

/**
 * Broker class for interacting with photos in the 
 * database.
 *
 * @author Levon Rose (553185)
 * 
 */
public class PhotoBroker {

	/**
	 * Database connection used for communicating with database.
	 */
	private DatabaseConnection connection;
	
	/**
	 * Method for adding a photo to the database. 
	 * 
	 * @param photo - photo to be added to database.
	 * @return 0 if insert was successful, 1 otherwise.
	 * @throws NullPointerException if photo is null.
	 */
	public int insert(Photo photo) throws NullPointerException {
		return 0;
	}
	
	/**
	 * Method for updating information for photo in database.
	 * 
	 * @return 0 if update was successful, 1 otherwise.
	 * @throws NullPointerException if photo is null.
	 */
	public int update(Photo photo) throws NullPointerException {
		return 0;
	}
	
	/**
	 * Method for deleting photo from database.
	 * 
	 * @param idNumber - id number used to identify a 
	 * photo in the database.
	 * @return 0 if delete was successful, 1 otherwise.
	 */
	public int delete(int idNumber) {
		return 0;
	}
	
	/**
	 * Method for getting list of all photos from the database.
	 * 
	 * @return list of photos that were retrieved from database. 
	 */
	public List<Photo> getAll(){
		return null;
	}
}
