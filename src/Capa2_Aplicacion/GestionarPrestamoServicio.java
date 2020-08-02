
package Capa2_Aplicacion;

import Capa3_Dominio.Prestamo;
import Capa4_Persistencia.PrestamoDAO_Postgre;
import Capa4_Persistencia.GestorJDBC;
import Capa4_Persistencia.GestorJDBCPostgre;

public class GestionarPrestamoServicio {
    private GestorJDBC gestorJDBC;
    private PrestamoDAO_Postgre prestamoDAO_Postgre;
    
    public GestionarPrestamoServicio(){
        gestorJDBC = new GestorJDBCPostgre();
        prestamoDAO_Postgre = new PrestamoDAO_Postgre(gestorJDBC);
    }
    
    public int crearPrestamo(Prestamo prestamo) throws Exception{
       gestorJDBC.abrirConexion();
       int registros_afectados = prestamoDAO_Postgre.ingresar(prestamo);
       gestorJDBC.cerrarConexion();
       return registros_afectados;
    }
}
