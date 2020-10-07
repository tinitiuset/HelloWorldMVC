/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.view;

/**
 * Class that displays the greeting in a text type UI.
 * 
 * @author Martin Valiente and Kerman Rodríguez View implementation that shows
 * 
 */
public class ViewImplementation implements View {

    /**
     * Shows a greeting in UI.
     *
     * @param greeting A String containing the greeting to be shown.
     */
    @Override
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
