import java.util.Date;

/**
 * Superclass to the Training, Boarding, and Grooming subclasses. Appointment
 * contains the attributes of an appointment placed by the user.
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public abstract class Appointment {

	/**
	 * The start date and time of appointment. Cannot be later than the appointment
	 * end date and time.
	 */
	private Date aptStartTime;

	/**
	 * The end date and time of appointment. Cannot be earlier than the appointment
	 * start date and time. 
	 */
	private Date aptEndTime;

	/**
	 * The current customer who booked the appointment.
	 */
	private Customer customer;
	
	/**
	 * The pet that is associated with the appointment.
	 */
	private Pet pet; 

}
