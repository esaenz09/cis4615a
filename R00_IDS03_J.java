import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
    }
    public void main(String[] args) {
        String username = "";
        Boolean loginSuccessful = true;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }

}
