package domain.photo;

/**
 * 
 * Class description: Class for representation of the photo.
 *
 * @author Viktoriia Davydova (769217)
 *
 */
public class Photo {
	/**
	 * Photo ID number. Can not be null.
	 */
	private int idNumber;

	/**
	 * Description of the photo. The size of the string should not be longer than 50
	 * characters.
	 */
	private String description;

	/**
	 * Path to the file storing the photo in the data base. Can not be null.
	 */
	private String filePath;
}
