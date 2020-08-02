
package Capa4_Persistencia;

import Capa3_Dominio.Prestamo;
import Capa3_Dominio.Cronograma;
import Capa5_Excepciones.ExcepcionSQLConsulta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CronogramaDAO_Postgre {
    
    GestorJDBC gestorJDBC;
    
    public CronogramaDAO_Postgre (GestorJDBC gestorJDBC){
            this.gestorJDBC = gestorJDBC;
    }
    
    public int ingresarCronograma(Cronograma cronograma) throws SQLException {
        String sentenciaSQL = "INSERT INTO public.cronograma(\n" +
        "	periodo, saldo, amortizacion, interes, cuota, tem, id_prestamo)\n" +
        "	VALUES (?, ?, ?, ?, ?, ?, ?);";
        try{
            PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
            sentencia.setInt(1, cronograma.getPeriodo());
            sentencia.setDouble(2, cronograma.getSaldo());
            sentencia.setDouble(3, cronograma.getAmortizacion());
            sentencia.setDouble(4, cronograma.getInteres());
            sentencia.setDouble(5, cronograma.getCuota());
            sentencia.setDouble(6, cronograma.getTem());
            sentencia.setString(7, cronograma.getPrestamo().getId_prestamo());
            return sentencia.executeUpdate();
        }
        catch(Exception e){
            throw new SQLException("No se pudo registrar el cronograma.\n"
                    + "Intente de nuevo o consulte con el Administrador.  ");
        }
    }
    
    public List<Cronograma> buscarCronograma(String codigoPrestamo) throws SQLException, ExcepcionSQLConsulta {
        ArrayList<Cronograma> cronogramas = new ArrayList();
        Cronograma cronograma;
        Prestamo prestamo;
        ResultSet resultado;
        String sentenciaSQL;

        sentenciaSQL = "SELECT id_cronograma, periodo, saldo, amortizacion, interes, cuota, tem, id_prestamo\n" +
                       "	FROM public.cronograma WHERE id_prestamo = '"+codigoPrestamo+"'";
        
        resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
        while(resultado.next()){            
            prestamo = new Prestamo();
            prestamo.setId_prestamo(resultado.getString("id_prestamo"));
            cronograma = new Cronograma();
            cronograma.setPeriodo(resultado.getInt("periodo"));
            cronograma.setSaldo(resultado.getDouble("saldo"));
            cronograma.setAmortizacion(resultado.getDouble("amortizacion"));
            cronograma.setInteres(resultado.getDouble("interes"));
            cronograma.setCuota(resultado.getDouble("cuota"));
            cronograma.setTem(resultado.getDouble("tem"));
        }
        resultado.close();
        return cronogramas;  
    }
}
