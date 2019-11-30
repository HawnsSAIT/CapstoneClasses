package user.domain;

/**
 * Class used to model an administrator.
 * @author Levon Rose (553185)
 * 
 */
public class Administrator extends User {
	
	/**
	 * Specifier to to state if the administrator is the main administrator super
	 * user. This gives them extra access not granted to other administrators.
	 */
	private boolean isMainAdmin;
}
