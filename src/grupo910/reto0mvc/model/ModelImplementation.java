/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.model;

import grupo910.reto0mvc.database.DAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Model implementation for getting the greeting from a properties file.
 * @author Martin Valiente Ainz
 */
public class ModelImplementation implements Model {
    /**
     * 
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
