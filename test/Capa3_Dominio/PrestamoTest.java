
package Capa3_Dominio;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrestamoTest {
    
    public PrestamoTest() {
    }

    //Cuando el monto es menor a lo permitido
    @Test
    public void test1ValidarMonto() {
        System.out.println("validarMonto1");
        Prestamo prestamo = new Prestamo();
        prestamo.setMontoprestado(20);
        double expResult = 0;
        double result = prestamo.validarMonto();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando el monto es mayor a lo permitido
    @Test
    public void test2ValidarMonto() {
        System.out.println("validarMonto2");
        Prestamo prestamo = new Prestamo();
        prestamo.setMontoprestado(899999);
        double expResult = 0;
        double result = prestamo.validarMonto();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando el monto es negativo
    @Test
    public void test3ValidarMonto() {
        System.out.println("validarMonto3");
        Prestamo prestamo = new Prestamo();
        prestamo.setMontoprestado(-1220);
        double expResult = 0;
        double result = prestamo.validarMonto();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando el monto es aceptado
    @Test
    public void test4ValidarMonto() {
        System.out.println("validarMonto4");
        Prestamo prestamo = new Prestamo();
        prestamo.setMontoprestado(5600);
        double expResult = 5600;
        double result = prestamo.validarMonto();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando la Tea es menor a lo aceptada
    @Test
    public void test1ValidarTEA() {
        System.out.println("validarTEA1");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(0.03);
        double expResult = 0;
        double result = prestamo.validarTEA();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando la Tea es mayor a lo aceptada
    @Test
    public void test2ValidarTEA() {
        System.out.println("validarTEA2");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(0.36);
        double expResult = 0;
        double result = prestamo.validarTEA();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando la Tea es negativa
    @Test
    public void test3ValidarTEA() {
        System.out.println("validarTEA3");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(-0.16);
        double expResult = 0;
        double result = prestamo.validarTEA();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando la Tea es aceptada
    @Test
    public void test4ValidarTEA() {
        System.out.println("validarTEA4");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(0.15);
        double expResult = 0.15;
        double result = prestamo.validarTEA();
        assertEquals(expResult, result, 0.0);
    }
    
    //Cuando el periodo es menor
    @Test
    public void test1ValidarPeriodo() {
        System.out.println("validarPeriodo1");
        Prestamo prestamo = new Prestamo();
        prestamo.setTotal_periodos(2);
        int expResult = 0;
        int result = prestamo.validarPeriodo();
        assertEquals(expResult, result);
    }
    
    //Cuando el periodo es mayor
    @Test
    public void test2ValidarPeriodo() {
        System.out.println("validarPeriodo2");
        Prestamo prestamo = new Prestamo();
        prestamo.setTotal_periodos(40);
        int expResult = 0;
        int result = prestamo.validarPeriodo();
        assertEquals(expResult, result);
    }
    
    //Cuando el periodo es negativo
    @Test
    public void test3ValidarPeriodo() {
        System.out.println("validarPeriodo3");
        Prestamo prestamo = new Prestamo();
        prestamo.setTotal_periodos(-5);
        int expResult = 0;
        int result = prestamo.validarPeriodo();
        assertEquals(expResult, result);
    }
    
    //Cuando el periodo es aceptado
    @Test
    public void test4ValidarPeriodo() {
        System.out.println("validarPeriodo4");
        Prestamo prestamo = new Prestamo();
        prestamo.setTotal_periodos(10);
        int expResult = 10;
        int result = prestamo.validarPeriodo();
        assertEquals(expResult, result);
    }
    
}
