package application.logic.managers;

import java.util.ArrayList;
import java.util.List;

import database.brokers.AppointmentBroker;
import domain.appointments.Appointment;

/**
 * Manages appointment objects.
 * 
 * @author 703174 Hans Cabrera
 *
 */
public class AppointmentManager {

	/**
	 * List of existing appointments in the database.
	 */
	private ArrayList<Appointment> appointmentList;

	/**
	 * Broker used for persistence of appointments.
	 */
	private AppointmentBroker broker;

	/**
	 * Used for adding appointments to the database.
	 * 
	 * @param appointment the appointment to be added to the database.
	 * @return 0 if the query was successful.
	 */
	public int insert(Appointment appointment) {
		return 0;
	}

	/**
	 * Used for updating existing appointments in the database.
	 * 
	 * @param appointment the appointment to be updated in the database.
	 * @return 0 if the query was successful.
	 */
	public int update(Appointment appointment) {
		return 0;
	}

	/**
	 * Used for deleting appointments within the database.
	 * 
	 * @param idNumber the id number associated with the appointment to delete.
	 * @return 0 if the query was successful.
	 */
	public int delete(int idNumber) {
		return 0;
	}

	/**
	 * Used to retrieve a single appointment from the database.
	 * 
	 * @param idNumber the id number associated with the appointment to retrieve.
	 * @return 0 if the query was successful.
	 */
	public int get(int idNumber) {
		return 0;
	}

	/**
	 * Calculates the amount owing.
	 * 
	 * @param total      The total cost of the appointment.
	 * @param amountPaid The amount currently paid.
	 * @return The amount owing.
	 */
	public double getAmountOwing(double total, double amountPaid) {
		return 0;
	}

	/**
	 * Used to retrieve a list of appointments belonging to the specified user.
	 * 
	 * @param username The specified user.
	 * @return A list of appointments belonging to the specified user.
	 */
	public List<Appointment> getUserAppt(String username) {
		return null;
	}

	/**
	 * Used to retrieve a list of all appointments within the database.
	 * 
	 * @return A list of all appointments within the database.
	 */
	public List<Appointment> getAll() {
		return null;
	}
}
