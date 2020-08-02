
package Capa5_Excepciones;

public class ExcepcionSQLConsulta extends Exception {
    
    private final String MENSAJE_DE_USUARIO = "No se pudo ejecutar la consulta.\n"
                + "Intente en otro momento o consulte con el administrador.";  

    public ExcepcionSQLConsulta(Throwable err) {
        super(err);
    }    

    @Override
    public String getMessage() {
        return MENSAJE_DE_USUARIO;
    }

}
