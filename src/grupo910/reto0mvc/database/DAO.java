package grupo910.reto0mvc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Class that manages the database using different methods.
 *
 * @author Kerman Rodríguez and Martín Valiente
 */
public class DAO {
    // Attributes

    private Connection con = null;
    private Properties props;
    private Statement stmt = null;

    // The next attributes are used to gather values of the configuration file
    private ResourceBundle configFile;
    private String driverBD;
    private String urlDB;
    private String userBD;
    private String passwordDB;
    private String greeting;
    private int chosen_greeting;

    public DAO() {

        // We will use the file config (control package) for the connection
        this.configFile = ResourceBundle.getBundle("grupo910.reto0mvc.application.config");
        this.driverBD = this.configFile.getString("Driver");
        this.urlDB = this.configFile.getString("Conn");
        this.userBD = this.configFile.getString("DBUser");
        this.passwordDB = this.configFile.getString("DBPass");
        this.greeting = this.configFile.getString("Greeting");
        chosen_greeting = Integer.parseInt(greeting);
    }

    /**
     * Method to start the connection to the database
     *
     * @throws Exception
     */
    private void connect() throws Exception {
        try {
            Class.forName(this.driverBD);
            con = DriverManager.getConnection(this.urlDB, this.userBD, this.passwordDB);
            stmt = con.createStatement();
        } catch (SQLException e) {
            throw new Exception("SQL error" + e.getMessage());
        }
    }

    /**
     * Method to stop the connection to the database
     *
     * @throws Exception
     */
    private void disconnect() throws Exception {
        try {
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            throw new Exception("SQL error" + e.getMessage());
        }
    }

    /**
     * A simple method that searches the database for the greeting
     *
     * @return the needed greeting
     * @throws Exception
     */
    public String selectGreeting() throws Exception {
        String selected_greeting = "";
        this.connect();
        String select = "SELECT * FROM Greeting ORDER BY greeting LIMIT 1 OFFSET " + (chosen_greeting - 1) + ";";
        ResultSet rs = stmt.executeQuery(select);

        while (rs.next()) {
            selected_greeting = rs.getString(1);
        }

        this.disconnect();
        return selected_greeting;
    }
}
