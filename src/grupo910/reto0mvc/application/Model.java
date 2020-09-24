/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.application;

/**
 *
 * @author Martin Valiente Ainz
 * 
 * Contains the get methods to be used by a model.
 * 
 */
public interface Model {
    /**
     * Gets the greeting from the Database.
     * @param greeting A String containing the greeting.
     */
    public void getGreeting(String greeting);
}
