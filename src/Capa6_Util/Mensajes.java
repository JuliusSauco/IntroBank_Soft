
package Capa6_Util;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Mensajes {
    private static final String validarMonto_Mensaje ="Solo montos entre 1000 a 30 000 soles";
    private static final String validarTea_Mensaje ="El periodo tiene que ser mayor a 2 meses y menor que 24 meses";
    private static final String validarPeriodo_Mensaje ="Solo TEA entre 0.1 a 0.2";
    private static final String afirmacionPrestamoGenerado = "El prestamo fue generado con éxito";
    private static final String errorPrestamoGenerado = "El prestamo no se pudo generar.\n"
            +"Verifique los datos del préstamo.\n"
            + "Intente nuevamente o consulte con el Administrador.";
    private static final String advertenciaCliente_NoRegistrado = "El cliente no se pudo encontrar.\n"
            +"Verifique los datos ingresados y vuelva a intentarlo";
    private static final String errorConsultaCliente = "Error de sistema al buscar el cliente.\n"
            +"Contacte con el administrador del Software";
    private static final String advertenciaClientePrestamo = "El cliente tiene un préstamo pendiente.\n"
            +"Verifique los datos o realize el prestamo a otro cliente";
    private static final String afirmacionCreacionCronograma = "El préstamo se registró correctamente";
    private static final String clienteNoSelecionado = "Seleccione un cliente";
    private static final String clienteErrorFila = "El cliente no se ha encontrado.\n"
            +"Actualize la base de datos de los clientes.\n"
            +"Comuníquese con el administrador del Software";
    private static final String eliminarCliente = "¿Esta seguro que desea eliminar al cliente seleccionado?";
    private static final String afirmacionDeEliminacion = "El cliente fue eliminado.";
    private static final String advertenciaDeEliminacion = "El cliente no puede ser eliminado.\n"
            +"Verifique datos del cliente"
            +"o cliente con préstamo pendiente";
    private static final String errorDeEliminacion = "No se pudo eliminar al cliente.\n"
            + "intente de nuevo o consulte con el Administrador.";
    private static final String clienteRegistrado = "El cliente fue registrado con éxito";
    private static final String clienteNoRegistrado = "El cliente no se pudo registrar.\n"
            +"Verifique los datos del cliente.";
    private static final String clienteErrorRegistro = "El cliente no fue registrado.\n"
            +"Verifique los datos del cliente.\n"
            +"Comuniquese con el administrador.";
    private static final String afirmacionDeActualizacion = "Los datos fueron actualizados.";
    private static final String advertenciaDeActualizacion = "Los datos no fueron actualizados, verifique.";
    private static final String errorDeActualizacion = "No se pudieron actualizar los datos.\n"
            + "Verifique los datos obligatorios y únicos.\n"
            + "intente de nuevo o consulte con el Administrador.";
    private static final String errorGuardarCronograma = "El cronograma del prestamo no se pudo guardar.\n"
            +"Verifique los datos del cronograma.\n"
            +"Comuniquese con el administrador";

    //METODOS
    public static void mostrarErrorMonto(JDialog dialogo){
            JOptionPane.showMessageDialog(dialogo,validarMonto_Mensaje,"IntroBank: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarErrorTea(JDialog dialogo){
            JOptionPane.showMessageDialog(dialogo,validarTea_Mensaje,"IntroBank: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarErrorPeriodo(JDialog dialogo){
            JOptionPane.showMessageDialog(dialogo,validarPeriodo_Mensaje,"IntroBank: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarAfirmacionPrestamoGenerado(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,afirmacionPrestamoGenerado,"IntroBank: Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void mostrarErrorA_PrestamoGenerado(JDialog dialogo){
            JOptionPane.showMessageDialog(dialogo,errorPrestamoGenerado,"IntroBank: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarAdvertenciaCliente(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,advertenciaCliente_NoRegistrado,"IntroBank: Advertencia",JOptionPane.WARNING_MESSAGE);
    }
    
    public static void mostrarErrorClienteBuscado(JDialog dialogo){
            JOptionPane.showMessageDialog(dialogo,errorConsultaCliente,"IntroBank: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarAdvertenciaClientePrestamo(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,advertenciaClientePrestamo,"IntroBank: Advertencia",JOptionPane.WARNING_MESSAGE);
    }
    
    public static void mostrarAfirmacionCronograma(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,afirmacionCreacionCronograma,"IntroBank: Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void mostrarFilaNoSeleccionada(JDialog dialog){
        JOptionPane.showMessageDialog(dialog, clienteNoSelecionado, "Introbank: Mensaje", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void mostrarFilaNoExiste(JDialog dialog){
        JOptionPane.showMessageDialog(dialog, clienteErrorFila, "IntroBank: Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public static boolean mostrarPreguntaDeEliminacion(JDialog dialogo){
        int respuesta = JOptionPane.showConfirmDialog(dialogo,eliminarCliente,"IntroBank: Eliminar Cliente",JOptionPane.YES_NO_OPTION);
        return ( respuesta == JOptionPane.YES_OPTION );
    }
    
    public static void mostrarAfirmacionDeEliminacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,afirmacionDeEliminacion,"IntroBank: Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarAdvertenciaDeEliminacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,advertenciaDeEliminacion,"IntroBank: Advertencia",JOptionPane.WARNING_MESSAGE);
    }

    public static void mostrarErrorDeEliminacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,errorDeEliminacion,"IntroBank: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarAfirmacionDeCreacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,clienteRegistrado,"IntroBank: Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void mostrarAdvertenciaDeCreacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,clienteNoRegistrado,"IntroBank: Advertencia",JOptionPane.WARNING_MESSAGE);
    }

    public static void mostrarErrorDeCreacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,clienteErrorRegistro,"IntroBank: Error",JOptionPane.ERROR_MESSAGE);
    }

    public static void mostrarAfirmacionDeActualizacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,afirmacionDeActualizacion,"AteneaSoft: Mensaje",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void mostrarAdvertenciaDeActualizacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,advertenciaDeActualizacion,"AteneaSoft: Advertencia",JOptionPane.WARNING_MESSAGE);
    }

    public static void mostrarErrorDeActualizacion(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,errorDeActualizacion,"AteneaSoft: Error",JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostrarErrorCronograma(JDialog dialogo){
        JOptionPane.showMessageDialog(dialogo,errorGuardarCronograma,"AteneaSoft: Error",JOptionPane.ERROR_MESSAGE);
    }
 
}
