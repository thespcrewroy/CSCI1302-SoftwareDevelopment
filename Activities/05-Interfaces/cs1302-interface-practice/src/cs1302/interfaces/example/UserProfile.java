package cs1302.interfaces.example;

/** A user profile with a simulated save operation. */
public class UserProfile implements Savable {
    /** User's account name. */
    private String username;
    /** User's email address. */
    private String email;

    /**
     * Creates a user profile.
     * @param username the account name
     * @param email the email address
     */
    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
    } // UserProfile

    /** Prints a message simulating persistence of this profile. */
    @Override
    public void save() {
        // Logic to persist user data
        System.out.println("User profile for " + username + " has been updated and saved.");
    } // save
} // UserProfile
