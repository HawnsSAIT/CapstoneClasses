package managers.domain;
import java.util.ArrayList;

import appointments.domain.Appointment;

/**
 * Manages appointment objects.
 * @author 703174 Hans Cabrera
 *
 */
public class AppointmentManager {
	/**
	 * List of existing appointments in the database.
	 */
	ArrayList<Appointment> appointmentList;
	
	/**
	 * Creates a new appointment object. Cannot book new appointment if start date is earlier than current date.
	 */
	public void bookNewAppointment() {
		
	}
	
	/**
	 * Edits an existing appointment. Cannot edit an appointment that has past it's end date.
	 */
	public void editAppointment() {
		
	}
	
	/**
	 * Removes an appointment from the appointmentList. Cannot cancel an appointment that has past it's end date.
	 */
	public void cancelAppointment() {
		
	}
	
	/**
	 * Gets the appointments that are wanting to be displayed and returns the list.
	 * @return a list of appointments to be display
	 */
	public ArrayList<Appointment> displayAppointments() {
		return null;
	}
}
