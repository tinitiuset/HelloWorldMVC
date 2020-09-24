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
 * Contains view methods to be used by a controller.
 * 
 */
public interface View {
    /**
     * Shows a greeting in UI.
     * @param greeting A String containing the greeting to be shown.
     */
    public void showGreeting (String greeting);
}
