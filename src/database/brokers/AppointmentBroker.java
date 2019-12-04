package database.brokers;

import java.util.List;

import database.connection.DatabaseConnection;
import domain.appointments.Appointment;

/**
 * Broker class for interacting with appointments in the 
 * database.
 *
 * @author Levon Rose (553185)
 * 
 */
public class AppointmentBroker {
	

	/**
	 * Database connection used for communicating with database.
	 */
	private DatabaseConnection connection;
	
	/**
	 * Method for getting appointment from database.
	 * 
	 * @param idNumber - id number used to identify an
	 * appointment in the database.
	 * @return dog which was retrieved from database.
	 */
	public Appointment get(int idNumber) {
		return null;
	}
	
	/**
	 * Method for adding an appointment to the database. 
	 * 
	 * @param appointment - appointment to be added to database.
	 * @return 0 if insert was successful, 1 otherwise.
	 */
	public int insert(Appointment appointment) {
		return 0;
	}
	
	/**
	 * Method for updating information for appointment in database.
	 * 
	 * @return 0 if update was successful, 1 otherwise.
	 */
	public int update(Appointment appointment) {
		return 0;
	}
	
	/**
	 * Method for deleting appointment from database.
	 * 
	 * @param idNumber - id number used to identify an
	 * appointment in the database.
	 * @return 0 if delete was successful, 1 otherwise.
	 */
	public int delete(int idNumber) {
		return 0;
	}
	
	/**
	 * Method for getting list of appointment from database belonging
	 * to certain user.
	 * 
	 * @param username - username of user whose appointments are to be 
	 * retrieved.
	 * @return list of appointments that were retrieved from database. 
	 */
	public List<Appointment> getUserAppt(String username){
		return null;
	}
	
	/**
	 * Method for getting list of all appointments from the database.
	 * 
	 * @return list of appointments that were retrieved from database. 
	 */
	public List<Appointment> getAll(){
		return null;
	}
}
