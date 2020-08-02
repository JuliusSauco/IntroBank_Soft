
package Capa4_Persistencia;

import Capa5_Excepciones.ExcepcionSQLConsulta;
import Capa3_Dominio.Cliente;
import Capa3_Dominio.Prestamo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Capa5_Excepciones.ExcepcionJDBC;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO_Postgre {
    
    GestorJDBC gestorJDBC;
    
    public ClienteDAO_Postgre (GestorJDBC gestorJDBC){
            this.gestorJDBC = gestorJDBC;
    }
    
    public Cliente validarCliente(int clienteid) throws SQLException, ExcepcionSQLConsulta {
        Cliente cliente = null;
        Prestamo prestamo;
        ResultSet resultado;
        String sentenciaSQL;

        sentenciaSQL = "SELECT c.id_cliente, p.monto_prestado FROM public.cliente AS c\n" +
                       "INNER JOIN public.prestamo p ON p.id_cliente = c.id_cliente\n" +
                       "WHERE c.id_cliente =  '"+clienteid+"'";
        
        resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
        if(resultado.next()){            
            cliente = new Cliente();
            cliente.setId_cliente(resultado.getInt("id_cliente"));
            prestamo = new Prestamo();
            prestamo.setMontoprestado(resultado.getDouble("monto_prestado"));
        }
        resultado.close();
        return cliente;  
    }

    public Cliente buscarPorDNI(String dni) throws SQLException, ExcepcionSQLConsulta {
        Cliente cliente = null;
        ResultSet resultadoCliente;
        String sentenciaSQL;

        sentenciaSQL = "SELECT id_cliente, nombre, apellido, dni\n" +
        "FROM cliente WHERE dni = '"+dni+"'";
        
        resultadoCliente = gestorJDBC.ejecutarConsulta(sentenciaSQL);
        if(resultadoCliente.next()){            
            cliente = new Cliente();
            cliente.setId_cliente(resultadoCliente.getInt("id_cliente"));
            cliente.setNombre(resultadoCliente.getString("nombre"));
            cliente.setApellido(resultadoCliente.getString("apellido"));
            cliente.setDni(resultadoCliente.getString("dni"));
           
        }        
        resultadoCliente.close();
        
        return cliente; 
    }
    
    public List<Cliente> buscarListaClientes(String nombre) throws SQLException, ExcepcionSQLConsulta{
        ArrayList<Cliente> clientes = new ArrayList();
        Cliente cliente;
        ResultSet resultado;
        String sentenciaSQL;

        sentenciaSQL = "SELECT id_cliente, nombre, apellido, dni\n" +
                       "FROM cliente WHERE nombre like '%" + nombre + "%' ORDER BY id_cliente";
                
        resultado = gestorJDBC.ejecutarConsulta(sentenciaSQL);
        while(resultado.next()){            
            cliente = new Cliente();
            cliente.setId_cliente(resultado.getInt("id_cliente"));
            cliente.setNombre(resultado.getString("nombre"));
            cliente.setApellido(resultado.getString("apellido"));
            cliente.setDni(resultado.getString("dni"));
            clientes.add(cliente);
        }
        resultado.close();
        return clientes;    
    }
    
    public Cliente buscarPorId(int idcliente) throws SQLException, ExcepcionSQLConsulta {
        Cliente cliente = null;
        ResultSet resultadoCliente;
        String sentenciaSQL;

        sentenciaSQL = "SELECT id_cliente, nombre, apellido, dni\n" +
        "FROM cliente WHERE id_cliente = '"+idcliente+"'";
        
        resultadoCliente = gestorJDBC.ejecutarConsulta(sentenciaSQL);
        if(resultadoCliente.next()){            
            cliente = new Cliente();
            cliente.setId_cliente(resultadoCliente.getInt("id_cliente"));
            cliente.setNombre(resultadoCliente.getString("nombre"));
            cliente.setApellido(resultadoCliente.getString("apellido"));
            cliente.setDni(resultadoCliente.getString("dni"));
           
        }        
        resultadoCliente.close();
        
        return cliente; 
    }
    
    public int ingresarCliente(Cliente cliente) throws SQLException, ExcepcionJDBC {
        String sentenciaSQL = "INSERT INTO public.cliente(\n" +
                            "	nombre, apellido, dni)\n" +
                            "	VALUES (?, ?, ?)";        
        
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, cliente.getNombre());
        sentencia.setString(2, cliente.getApellido());
        sentencia.setString(3, cliente.getDni());
        return sentencia.executeUpdate();
    }
    
    public int modificarCliente(Cliente cliente) throws SQLException, ExcepcionJDBC {
        String sentenciaSQL = "UPDATE public.cliente\n" +
                            "	SET nombre=?, apellido=?, dni=?\n" +
                            "	WHERE id_cliente = ?";

        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setString(1, cliente.getNombre());
        sentencia.setString(2, cliente.getApellido());
        sentencia.setString(3, cliente.getDni());
        sentencia.setInt(4, cliente.getId_cliente());
        return sentencia.executeUpdate();
    }    

    public int eliminarCliente(Cliente cliente) throws SQLException, ExcepcionJDBC {
        String sentenciaSQL = "DELETE FROM public.cliente\n" +
                              "	WHERE id_cliente = ?";
        
        PreparedStatement sentencia = gestorJDBC.prepararSentencia(sentenciaSQL);
        sentencia.setInt(1, cliente.getId_cliente());
        return sentencia.executeUpdate();
    }
    
    
}
