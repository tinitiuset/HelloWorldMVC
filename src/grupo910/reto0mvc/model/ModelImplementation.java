package grupo910.reto0mvc.model;

import grupo910.reto0mvc.database.DAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Model implementation for getting the greeting from a properties file.
 * @author Martin Valiente and Kerman Rodríguez
 */
public class ModelImplementation implements Model {
    /**
     * Method that gets the greeting from the database
     * @return Returns the greeting.
     */
    @Override
    public String getGreeting() {
        DAO dao = new DAO();
        String greeting = null;
        try {
            greeting = dao.selectGreeting();
        } catch (Exception ex) {
            Logger.getLogger(ModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return greeting;
    }
}
