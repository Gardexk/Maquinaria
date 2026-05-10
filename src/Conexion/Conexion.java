package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String DEFAULT_URL = "jdbc:postgresql://localhost:5432/constructora";
    private static final String DEFAULT_USER = "postgres";
    private static final String DEFAULT_PASSWORD = "1234";

    // conexion local
    public static Connection conectar() {
        String url = System.getProperty("db.url", System.getenv().getOrDefault("DB_URL", DEFAULT_URL));
        String user = System.getProperty("db.user", System.getenv().getOrDefault("DB_USER", DEFAULT_USER));
        String password = System.getProperty("db.password", System.getenv().getOrDefault("DB_PASSWORD", DEFAULT_PASSWORD));

        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error en la conexion local " + e);
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos constructora.");
        }
        return null;
    }
}
