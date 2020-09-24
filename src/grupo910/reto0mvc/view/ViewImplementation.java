/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.view;

import grupo910.reto0mvc.application.View;

/**
 * @author Martin Valiente Ainz
 * View implementation that shows the greeting in a text type UI.
 */
public class ViewImplementation implements View{
    /** 
     * Shows a greeting in UI.
     * @param greeting A String containing the greeting to be shown.
     */
    @Override
    public void showGreeting (String greeting){
        System.out.println(greeting);
    }
}
