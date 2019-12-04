package application.logic.managers;
import java.util.List;

import database.brokers.TestimonyBroker;
import domain.testimony.Testimony;

/**
 * The class to manipulate the list of the Feedback objects
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public class TestimonyManager {

	/**
	 * The list to contain the Feedback objects
	 */
	private List<Testimony> feedbackList;

	/**
	 * 
	 */
	private TestimonyBroker broker;
	
	/**
	 * 
	 * @param testimony
	 * @return
	 */
	public int insert(Testimony testimony) {
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
	public List<Testimony> getAll() {
		return null;
	}
}
