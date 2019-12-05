package application.logic.managers;

import java.util.List;

import database.brokers.TestimonialBroker;
import domain.testimonial.Testimonial;

/**
 * The class to manipulate the list of the Testimonial objects.
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public class TestimonialManager {

	/**
	 * List of existing testimonials in the database.
	 */
	private List<Testimonial> testimonialList;

	/**
	 * Broker used for persistence of testimonials.
	 */
	private TestimonialBroker broker;

	/**
	 * Method for adding testimonial to database.
	 * 
	 * @param testimonial
	 *            - testimonial to be added to database.
	 * @return 0 if insert was successful, 1 otherwise.
	 */
	public int insert(Testimonial testimonial) {
		return 0;
	}

	/**
	 * Method for updating information for testimonial in database.
	 * 
	 * @param idNumber
	 *            id number of the testimonial.
	 * @return 0 if update was successful, 1 otherwise.
	 */
	public int update(int idNumber) {
		return 0;
	}

	/**
	 * Method for deleting testimonial from database.
	 * 
	 * @param idNumber
	 *            - id number used to identify a testimonial in the database.
	 * @return 0 if delete was successful, 1 otherwise.
	 */
	public int delete(int idNumber) {
		return 0;
	}

	/**
	 * Method for getting list of testimonials from database.
	 * 
	 * @return the list of the testimonials that were retrieved from database.
	 */
	public List<Testimonial> getAll() {
		return null;
	}
}
