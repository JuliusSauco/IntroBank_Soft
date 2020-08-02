
package Capa5_Excepciones;

public class ExcepciionSQLTransaccion extends Exception {
    
    private final String MENSAJE_DE_USUARIO = "No se pudo realizar la operación.\n"
                + "Intente en otro momento o consulte con el administrador.";  

    public ExcepciionSQLTransaccion(Throwable err) {
        super(err);
    }    

    @Override
    public String getMessage() {
        return MENSAJE_DE_USUARIO;
    }
    
}
