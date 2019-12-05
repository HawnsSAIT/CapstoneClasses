package application.logic.managers;
import java.util.List;

import database.brokers.TestimonialBroker;
import domain.testimonial.Testimonial;

/**
 * The class to manipulate the list of the Feedback objects
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public class TestimonialManager {

	/**
	 * The list to contain the Feedback objects
	 */
	private List<Testimonial> feedbackList;

	/**
	 * 
	 */
	private TestimonialBroker broker;
	
	/**
	 * 
	 * @param testimony
	 * @return
	 */
	public int insert(Testimonial testimony) {
		return 0;
	}
	
	/**
	 * 
	 * @param idNumber
	 * @return
	 */
	public int update(int idNumber) {
		return 0;
	}
	
	/**
	 * 
	 * @param idNumber
	 * @return
	 */
	public int delete(int idNumber) {
		return 0;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Testimonial> getAll() {
		return null;
	}
}
