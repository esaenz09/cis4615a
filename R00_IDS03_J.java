import java.util.logging.Logger;

public class R00_IDS03_J {
    private static final Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    
    public static void main(String[] args) {
        String username = "";
        Boolean loginSuccessful = true;

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
