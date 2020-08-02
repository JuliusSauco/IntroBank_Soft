package Capa4_Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Capa5_Excepciones.ExcepcionJDBC;
import Capa5_Excepciones.ExcepcionSQLConsulta;

public abstract class GestorJDBC {

    protected Connection conexion;

    public abstract void abrirConexion() throws ExcepcionJDBC;

    public void cerrarConexion() throws ExcepcionJDBC {
        try {
            conexion.close();
        } catch (SQLException e) {
            throw new ExcepcionJDBC(e);
        }
    }

    public void iniciarTransaccion() throws ExcepcionJDBC {
        try {
            conexion.setAutoCommit(false);
        } catch (SQLException e) {
            throw new ExcepcionJDBC(e);
        }
    }

    public void terminarTransaccion() throws ExcepcionJDBC {
        try {
            conexion.commit();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (SQLException e) {
            throw new ExcepcionJDBC(e);
        }
    }

    public void cancelarTransaccion() throws ExcepcionJDBC {
        try {
            conexion.rollback();
            conexion.setAutoCommit(true);
            conexion.close();
        } catch (SQLException e) {
            throw new ExcepcionJDBC(e);
        }
    }

    public PreparedStatement prepararSentencia(String sql) throws ExcepcionJDBC {
        try {
            return conexion.prepareStatement(sql);
        } catch (SQLException e) {
            throw new ExcepcionJDBC(e);
        }
    }

    public ResultSet ejecutarConsulta(String sql) throws ExcepcionSQLConsulta {
        try {
            Statement sentencia;
            ResultSet resultado;
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);
            return resultado;
        } catch (SQLException e) {
            throw new ExcepcionSQLConsulta(e);
        }
    }
}
