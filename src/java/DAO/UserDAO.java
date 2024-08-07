
package DAO;

import Bean.Userbean;

/**
 * Data Access Object (DAO) interface for User.
 * This interface defines the contract for interacting with the User data.
 * It provides methods for user registration, credential validation,
 * and retrieval of user details.
 * Author - Chiranjeev Singh , Khushpreet Kaur
 */
public interface UserDAO {
    
    /**
     * Registers a new user with the provided details.
     *
     * @param username  The username of the new user.
     * @param firstName The first name of the new user.
     * @param lastName  The last name of the new user.
     * @param password  The password of the new user.
     * @param userType  The type of the new user (e.g., Retailer, Consumer, Charitable Consumer).
     * @return A String indicating the result of the registration process.
     */
    public String registerUser(String username, String firstName, String lastName, String password, String userType);
    
    /**
     * Registers a new user using a Userbean object.
     *
     * @param user The Userbean object representing the new user.
     * @return A String indicating the result of the registration process.
     */
    public String registerUser(Userbean user);
    
    /**
     * Checks if a username is already registered.
     *
     * @param UserName The username to check.
     * @return A boolean indicating whether the username is already registered (true) or not (false).
     */
    public boolean isRegistered(String UserName);
    
    /**
     * Validates the user's login credentials.
     *
     * @param UserName The username to validate.
     * @param password The password to validate.
     * @return A String indicating the result of the validation (e.g., "valid" for successful validation, or an error message for failure).
     */
    public String isValidCredential(String UserName, String password);
    
    /**
     * Retrieves the details of a user based on their username and password.
     *
     * @param UserName The username of the user.
     * @param password The password of the user.
     * @return A Userbean object representing the user's details, or null if the credentials are invalid.
     */
    public Userbean getUserDetails(String UserName, String password);
    
    /**
     * Retrieves the first name of a user based on their username.
     *
     * @param UserName The username of the user.
     * @return A String representing the user's first name.
     */
    public String getFName(String UserName);
    
    /**
     * Retrieves the type of a user based on their username.
     *
     * @param username The username of the user.
     * @return A String representing the user's type.
     */
    public String getUserType(String username);
}
