
package Bean;

import java.io.Serializable;

/**
 * Data Transfer Object (DTO) class for User.
 * This class is used to encapsulate user details and facilitate
 * the transfer of user data between different layers of the application.
 * It implements Serializable for object serialization.
 * Author- Chiranjeev Singh , Khushpreet Kaur
 */
@SuppressWarnings("serial")
public class Userbean implements Serializable {

    // Fields to store user details
    private int UserId;           // Unique identifier for the user
    private String username;      // Username of the user
    private String firstName;     // First name of the user
    private String lastName;      // Last name of the user
    private String password;      // Password of the user
    private String userType;      // Type of the user (e.g., Retailer, Consumer, Charitable Consumer)

    /**
     * Default constructor.
     * Initializes a new instance of the Userbean class without setting any fields.
     */
    public Userbean() {
        // No-arg constructor
    }

    /**
     * Parameterized constructor.
     * Initializes a new instance of the Userbean class with the provided values.
     *
     * @param username  Username of the user
     * @param firstName First name of the user
     * @param lastName  Last name of the user
     * @param password  Password of the user
     * @param userType  Type of the user
     */
    public Userbean(String username, String firstName, String lastName, String password, String userType) {
        super();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userType = userType;
    }

    // Getter and setter methods for each field

    /**
     * Gets the first name of the user.
     *
     * @return First name of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName First name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the user.
     *
     * @return Last name of the user
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName Last name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the user ID.
     *
     * @return User ID
     */
    public int getId() {
        return UserId;
    }

    /**
     * Sets the user ID.
     *
     * @param id User ID
     */
    public void setId(int id) {
        this.UserId = id;
    }

    /**
     * Gets the username.
     *
     * @return Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username Username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the password of the user.
     *
     * @return Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password Password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the type of the user.
     *
     * @return User type
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the type of the user.
     *
     * @param userType User type
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }
}
