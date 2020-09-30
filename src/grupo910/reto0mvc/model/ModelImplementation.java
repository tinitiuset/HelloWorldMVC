/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.model;

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
        String greeting = "Fortnite la Hostia";
        return greeting;
    }
}
