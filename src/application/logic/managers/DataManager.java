package application.logic.managers;

/**
 * Manages data operations.
 * @author Levon Rose (553185)
 * 
 */
public class DataManager {

	/**
	 * Method for creating a backup for system information.
	 * 
	 * @param filepath - String representing the file path where the backup
	 * will be stored.
	 * @return true if the backup was created successfully, false otherwise.
	 */
	public boolean backup(String filepath) {
		return false;
	}
	
	/**
	 * Method for restoring system information from a previously created
	 * backup file.
	 * 
	 * @param restorePoint - String representing the path where the 
	 * backup to be restored resides.
	 * @return true if system information was restored successfully, false
	 * otherwise.
	 */
	public boolean restore(String restorePoint) {
		return false;
	}
	
}
