
package Capa2_Aplicacion;

import Capa3_Dominio.Cronograma;
import Capa4_Persistencia.CronogramaDAO_Postgre;
import Capa4_Persistencia.GestorJDBC;
import Capa4_Persistencia.GestorJDBCPostgre;

public class GestionarCronogramaServicio {
    private GestorJDBC gestorJDBC;
    private CronogramaDAO_Postgre cronogramaDAO_Postgre;
    
    public GestionarCronogramaServicio(){
        gestorJDBC = new GestorJDBCPostgre();
        cronogramaDAO_Postgre = new CronogramaDAO_Postgre(gestorJDBC);
    }
    
    public int crearPrestamo(Cronograma cronograma) throws Exception{
       gestorJDBC.abrirConexion();
       int registros_afectados = cronogramaDAO_Postgre.ingresarCronograma(cronograma);
       gestorJDBC.cerrarConexion();
       return registros_afectados;
    }
}
