package grupo910.reto0mvc.model;

/**
 * Class used to create the model objects
 *
 * @author Kerman Rodríguez y Martín Valiente
 */
public class ModelFactory {

    /**
     * Method that returns a ModelImplementation for the use of the app
     *
     * @param option to choose if you want to use the database or a file
     * @return the implementation of the model (database or file based)
     */
    public Model getModel(int option) {
        if (option == 1) {
            return new ModelImplementation();
        } else {
            return new DaoModelImplementation();
        }
    }
}
