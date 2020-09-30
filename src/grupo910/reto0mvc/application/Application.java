/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.application;

import grupo910.reto0mvc.controller.Controller;
import grupo910.reto0mvc.model.ModelFactory;
import grupo910.reto0mvc.view.ViewFactory;
import java.util.ResourceBundle;

/**
 * This is the application class for the hello world MVC app.
 * This is a new comment on the dev_martin Branch.
 * This is the third comment on the dev_main Branch.
 * @author Martin Valiente and Kerman Rodriguez.
 */
public class Application {
    
    

    /**
     * This Class will launch the Application.
     * It instances a ViewFactory, ModelFactory
     * and Controller and then calls the run
     * method on Controller and passes the view 
     * and the model as parameters.
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
        
        ResourceBundle configFile;
        String viewOption;
        String modelOption;
        
        configFile = ResourceBundle.getBundle("grupo910.reto0mvc.application.config");
        viewOption = configFile.getString("Layout");
        modelOption = configFile.getString("Model");
        
        int chosenView = Integer.parseInt(viewOption);
        int chosenModel = Integer.parseInt(modelOption);
        
        ViewFactory view = new ViewFactory();
        
        ModelFactory model = new ModelFactory();
        
        Controller controller = new Controller();
        
        controller.run(view.getView(chosenView), model.getModel(chosenModel));
    }
    
}
