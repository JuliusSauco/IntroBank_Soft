package Capa4_Persistencia;

import Capa5_Excepciones.ExcepcionJDBC;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;


public class GestorJDBCPostgre extends GestorJDBC {

    @Override
    public void abrirConexion() throws ExcepcionJDBC {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/introbank_db";
            conexion = DriverManager.getConnection(url, "postgres", "123456");
        } catch (SQLException | ClassNotFoundException e) {
            throw new ExcepcionJDBC(e);
        } 
    }

}
