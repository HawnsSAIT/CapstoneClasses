package dog.domain;

import java.util.ArrayList;
import java.util.Date;

/**
 * Contains the attributes and methods for a Dog object.
 * 
 * @author 703174 Hans Cabrera
 *
 */
public class Dog {

	/**
	 * Dog's ID number to identify it in the database. Cannot be null or be a
	 * negative value.
	 */
	private int idNumber;

	/**
	 * Dog's weight. Cannot be null and must be greater than zero.
	 */
	private double weight;

	/**
	 * Dog's name. Cannot be null or contain non-alphabetical characters.
	 */
	private String name;

	/**
	 * Dog's date of birth. Cannot be null or later than the current date.
	 */
	private Date dateOfBirth;

	/**
	 * Dog's breed. Cannot be null or contain non-alphabetical characters.
	 */
	private String breed;

	/**
	 * If the dog has been spayed or neutered.
	 */
	private boolean spayedNeutered;

	/**
	 * Name of veterinarian.
	 */
	private String veterinarian;

	/**
	 * List of dog's medications.
	 */
	private ArrayList<String> medications;

	/**
	 * List of dog's allergies
	 */
	private ArrayList<String> allergies;

	/**
	 * List of dog's vaccines.
	 */
	private ArrayList<String> vaccines;

	/**
	 * If the dog is comfortable around strangers.
	 */
	private boolean strangerComfortable;

	/**
	 * If the dog is friendly towards other large dogs.
	 */
	private boolean largeDogFriendly;

	/**
	 * If the dog is friendly towards other small dogs.
	 */
	private boolean smallDogFriendly;

	/**
	 * If the dog is friendly towards newborn dogs.
	 */
	private boolean puppyFriendly;

}
