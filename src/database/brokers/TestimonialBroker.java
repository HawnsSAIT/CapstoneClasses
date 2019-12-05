package database.brokers;

import java.util.List;

import database.connection.DatabaseConnection;
import domain.photo.Photo;
import domain.testimonial.Testimonial;

/**
 * Broker class for interacting with testimonials in the 
 * database.
 *
 * @author Levon Rose (553185)
 * 
 */
public class TestimonialBroker {

	/**
	 * Database connection used for communicating with database.
	 */
	private DatabaseConnection connection;
	
	/**
	 * Method for adding a testimonial to the database. 
	 * 
	 * @param testimonial - testimonial to be added to database.
	 * @return 0 if insert was successful, 1 otherwise.
	 * @throws NullPointerException if testimonial is null.
	 */
	public int insert(Testimonial testimonial) throws NullPointerException {
		return 0;
	}
	
	/**
	 * Method for updating information for testimonial in database.
	 * 
	 * @param idNumber - id number used to identify a 
	 * testimonial in the database.
	 * @return 0 if update was successful, 1 otherwise.
	 */
	public int update(int idNumber) {
		return 0;
	}
	
	/**
	 * Method for deleting testimonial from database.
	 * 
	 * @param idNumber - id number used to identify a 
	 * testimonial in the database.
	 * @return 0 if delete was successful, 1 otherwise.
	 */
	public int delete(int idNumber) {
		return 0;
	}
	
	/**
	 * Method for getting list of all testimonials from the database.
	 * 
	 * @return list of testimonials that were retrieved from database. 
	 */
	public List<Photo> getAll(){
		return null;
	}
}
