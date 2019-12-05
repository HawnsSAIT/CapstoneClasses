package application.logic.managers;

import java.util.List;

import database.brokers.PhotoBroker;
import domain.photo.Photo;

/**
 * Manages the Photo objects.
 * 
 * @author 806547 Holly Harnack
 *
 */
public class PhotoManager {

	/**
	 * A list that contains the paths for all of the photos.
	 */
	private List<String> photoList;

	/**
	 *  Broker for the persistence of Photos in the database.
	 */
	private PhotoBroker broker;

	/**
	 * Method for inserting a photo to the database.
	 * 
	 * @param photo - photo to be inserted in the database.
	 * @return 0 if insert was successful, 1 otherwise.
	 */
	public int insert(Photo photo) {
		return 0;
	}

	/**
	 * Method for deleting a photo from the database.
	 * 
	 * @param idNumber - id number of the photo to delete
	 * @return 0 if insert was successful, 1 otherwise.
	 */
	public int delete(int idNumber) {
		return 0;
	}

	/**
	 * Method for retrieving a photo from the database.
	 * 
	 * @param idNumber - the id number of the photo to retrieve.
	 * @return the photo retrieved from the database.
	 */
	public Photo get(int idNumber) {
		return null;	
	}

	/**
	 * Method for updating the photo in the database.
	 * 
	 * @param photo - the photo to update in the database
	 * @return 0 if insert was successful, 1 otherwise.
	 */
	public int update(Photo photo) {
		return 0;
	}

	/**
	 * Method for uploading a photo to the database and adding to resources.
	 * 
	 * @param photo - photo to be uploaded to the database and resources.
	 * @return 0 if insert was successful, 1 otherwise.
	 */
	public int upload(Photo photo) {	
		return 0;
	}
}
