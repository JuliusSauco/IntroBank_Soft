
package Capa2_Aplicacion;

import Capa3_Dominio.Cliente;
import Capa4_Persistencia.ClienteDAO_Postgre;
import Capa4_Persistencia.GestorJDBC;
import Capa4_Persistencia.GestorJDBCPostgre;
import java.util.List;
        
public class GestionarClienteServicio {
    private GestorJDBC gestorJDBC;
    private ClienteDAO_Postgre clienteDao;
    
    public GestionarClienteServicio(){
        gestorJDBC = new GestorJDBCPostgre();
        clienteDao = new ClienteDAO_Postgre(gestorJDBC);
    }
    
    public Cliente buscarDniCliente(String dni) throws Exception{     
        gestorJDBC.abrirConexion();        
        Cliente cliente = clienteDao.buscarPorDNI(dni);
        gestorJDBC.cerrarConexion();
        return cliente;
    }
    
    public Cliente verificarPrestamo(int idcliente) throws Exception{     
        gestorJDBC.abrirConexion();        
        Cliente cliente = clienteDao.validarCliente(idcliente);
        gestorJDBC.cerrarConexion();
        return cliente;
    }
    
    public Cliente buscarCodigo(int idcliente) throws Exception{     
        gestorJDBC.abrirConexion();        
        Cliente cliente = clienteDao.buscarPorId(idcliente);
        gestorJDBC.cerrarConexion();
        return cliente;
    }
    
    public List<Cliente> buscarClientes(String nombre) throws Exception{             
        gestorJDBC.abrirConexion();        
        List<Cliente> clientes = clienteDao.buscarListaClientes(nombre);
        gestorJDBC.cerrarConexion();
        return clientes;
    }
    
    public int insertarCliente(Cliente cliente) throws Exception{             
        gestorJDBC.abrirConexion();        
        int registros_afectados = clienteDao.ingresarCliente(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
    public int modificarCliente(Cliente cliente) throws Exception{             
        gestorJDBC.abrirConexion();        
        int registros_afectados = clienteDao.modificarCliente(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
    public int eliminarCliente(Cliente cliente) throws Exception{
        gestorJDBC.abrirConexion();        
        int registros_afectados = clienteDao.eliminarCliente(cliente);
        gestorJDBC.cerrarConexion();
        return registros_afectados;
    }
    
}
