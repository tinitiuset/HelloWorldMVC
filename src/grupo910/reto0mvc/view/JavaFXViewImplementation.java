/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo910.reto0mvc.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Class that opens the graphical view of the project using JavaFX
 *
 * @author Martin Valiente and Kerman Rodriguez
 */
public class JavaFXViewImplementation extends Application implements View {

    Label lbl;

    @Override
    public void start(Stage primaryStage) {

        lbl = new Label();

        StackPane root = new StackPane();
        root.getChildren().add(lbl);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * public static void main(String[] args) { launch(args); }
     *
     */
    @Override
    public void showGreeting(String greeting) {
        launch();
    }
}
