
package Capa4_Persistencia;

import Capa3_Dominio.Prestamo;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrestamoDAO_Postgre {
    
    GestorJDBC gestorJDBC;
    
    public PrestamoDAO_Postgre (GestorJDBC gestorJDBC){
            this.gestorJDBC = gestorJDBC;
    }
    
    public int ingresar(Prestamo prestamo) throws SQLException {
        String sentenciaSQL = "INSERT INTO public.prestamo(id_prestamo, monto_prestado, tea, total_periodos, id_cliente) VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setString(1, prestamo.getId_prestamo());
            sentencia.setDouble(2, prestamo.getMontoprestado());
            sentencia.setDouble(3, prestamo.getTea());
            sentencia.setInt(4, prestamo.getTotal_periodos());
            sentencia.setInt(5, prestamo.getCliente().getId_cliente());
            return sentencia.executeUpdate();
        }
        catch(Exception e){
            throw new SQLException("No se pudo registrar el préstamo.\n"
                    + "Intente de nuevo o consulte con el Administrador.  ");
        }
    }   
}
