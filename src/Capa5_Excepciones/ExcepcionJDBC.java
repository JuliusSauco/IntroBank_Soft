
package Capa5_Excepciones;

public class ExcepcionJDBC extends Exception {

    private final String MENSAJE_DE_USUARIO = "Ocurrio un error de conexión a datos.\n"
                + "Intente en otro momento o consulte con el administrador.";        
    
    public ExcepcionJDBC(Throwable err) {
        super(err);
    }    

    @Override
    public String getMessage() {
        return MENSAJE_DE_USUARIO;
    }
    
}
