/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.model;

/**
 *
 * @author TINI
 */
public class ModelImplementation implements Model {

    /**
     * Method that gets the greeting from the database
     *
     * @return Returns the greeting.
     */
    @Override
    public String getGreeting() {
        String greeting;
        greeting = "Hola Mundo";
        return greeting;
    }
}
