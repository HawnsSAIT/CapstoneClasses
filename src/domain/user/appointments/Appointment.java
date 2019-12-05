package domain.user.appointments;

import java.util.Date;

/**
 * Superclass to the Training and Boarding subclasses. Appointment contains the
 * attributes of an appointment placed by the user.
 * 
 * @author Viktoriia Davydova (769217)
 *
 */
public abstract class Appointment {

	/**
	 * ID number of the appointment. Can not be null.
	 */
	private int IdNumber;

	/**
	 * Costumer's username. Can not be null.
	 */
	private String username;

	/**
	 * The start date and time of appointment. Cannot be later than the appointment
	 * end date and time. Cannot be less than the current date and time.
	 */
	private Date startTime;

	/**
	 * The end date and time of appointment. Cannot be earlier than the appointment
	 * start date and time. Cannot be earlier than the current date and time.
	 */
	private Date endTime;

	/**
	 * The total amount paid for the specific appointment.
	 */
	private double total;

	/**
	 * The amount paid for the specific appointment.
	 */
	private double amountPaid;

	/**
	 * Is true if the appointment was approved. False otherwise.
	 */
	private boolean isApproved;

	/**
	 * Is true if the appointment was cancelled. False otherwise.
	 */
	private boolean isCancelled;

	/**
	 * Is true if the appointment was paid. False otherwise.
	 */
	private boolean isPaid;

	/**
	 * String to hold additional comments if necessary.
	 */
	private String additionalComments;
}
