/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.controller;

import grupo910.reto0mvc.model.Model;
import grupo910.reto0mvc.model.ModelImplementation;
import grupo910.reto0mvc.view.View;
import grupo910.reto0mvc.view.ViewImplementation;

/**
 * Class that contains the logic of the project.
 * @author Martin Valiente and Kerman Rodriguez
 */
public class Controller {
    /**
     * This Method will display the greeting that the model has gotten beforehand.
     * @param View Parameter coming from the ViewImplementation.
     * @param Model Parameter coming from the ModelImplementation.
     */
    public void run(View View, Model Model) {
        View.showGreeting(Model.getGreeting());
    }
}
