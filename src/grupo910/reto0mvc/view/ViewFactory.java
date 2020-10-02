package grupo910.reto0mvc.view;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    /**
     * Method that returns a ViewImplementation for the use of the app
     * @param option to choose if you want a text, Swing or JavaFX window
     * @return the implementation of the view (text, Swing or JavaFX) 
     */
    public View getView(int option) {
        switch (option) {
            case 1:
                return new ViewImplementation();
            case 2:
                return new SwingViewImplementation();
            default:
                return new JavaFXViewImplementation();
        }

    }
}
