package labcodeinspection;

import java.util.Locale;

public class Email {

	private final String m_firstName;
	private final String m_lastName; 
	private  String password;
	private String department;
	private final int defaultpasswordLength = 8;
	private String email;
	

	/**
     * Constructor for the Email class.
     *
     * @param firstName The first name of the user.
     * @param lastName  The last name of the user.
     */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}
 
	/**
     * Displays user information.
     */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	 /**
     * Sets the user's department based on choice.
     *
     * @param depChoice The department choice: 1 for sales, 2 for development, 3 for accounting.
     */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
        case 1:
            this.department = "sales";
            break;
        case 2:
            this.department = "dev";
            break;
        case 3:
            this.department = "acct";
            break;
        default:
            this.department = "unknown";
            break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}


    /**
     * Generates the user's email and a random password.
     */
	public void generateEmail() {
        this.password = this.randomPassword(this.defaultpasswordLength);
        this.email = this.m_firstName.toLowerCase(Locale.getDefault()) + 
                     this.m_lastName.toLowerCase(Locale.getDefault()) + 
                     "@" + this.department + ".espol.edu.ec";
    }
}
