package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conexion = null;
    String usuario = "sa";
    String contrasena = "111";
    String db = "sistemaVentas";
    String puerto = "1433";

    public Connection getConnection() {
        try {
            String cadena = "jdbc:sqlserver://DESKTOP-IRB59E3: " + puerto + ";" + "databaseName=" + db;
            conexion = DriverManager.getConnection(cadena, usuario, contrasena);
            //JOptionPane.showMessageDialog(null,"Conexion Exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexion no exitosa"+e.toString());
        }
        return conexion;

    
}

}
