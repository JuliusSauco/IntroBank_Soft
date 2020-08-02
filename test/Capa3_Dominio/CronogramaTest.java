
package Capa3_Dominio;

import org.junit.Test;
import static org.junit.Assert.*;

public class CronogramaTest {
    
    public CronogramaTest() {
    }
    
    //TEST PARA CASO DE PRUEBA CON LOS VALORES MINIMOS

    /**
     * Test of tasaEfectivaMensual method, of class Cronograma.
     */
    @Test
    public void test1TasaEfectivaMensual() {
        System.out.println("tasaEfectivaMensual");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(0.1);
        Cronograma cronograma = new Cronograma(prestamo);
        double expResult = 0.007974140428903764;
        double result = cronograma.tasaEfectivaMensual();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of CuotaFijaMensual method, of class Cronograma.
     */
    @Test
    public void test1CuotaFijaMensual() {
        System.out.println("CuotaFijaMensual1");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(0.1);
        prestamo.setTotal_periodos(3);
        prestamo.setMontoprestado(1000.0);
        Cronograma cronograma = new Cronograma(prestamo);
        double expResult = 338.6635011890369;
        double result = cronograma.CuotaFijaMensual();
        assertEquals(expResult, result, 0.0);
    }
    
    //TEST PARA CASO DE PRUEBA CON LOS VALORES MÁXIMO

    /**
     * Test of tasaEfectivaMensual method, of class Cronograma.
     */
    @Test
    public void test2TasaEfectivaMensual() {
        System.out.println("tasaEfectivaMensual");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(0.2);
        Cronograma cronograma = new Cronograma(prestamo);
        double expResult = 0.015309470499731193;
        double result = cronograma.tasaEfectivaMensual();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of CuotaFijaMensual method, of class Cronograma.
     */
    @Test
    public void test2CuotaFijaMensual() {
        System.out.println("CuotaFijaMensual");
        Prestamo prestamo = new Prestamo();
        prestamo.setTea(0.2);
        prestamo.setTotal_periodos(24);
        prestamo.setMontoprestado(30000.0);
        Cronograma cronograma = new Cronograma(prestamo);
        double expResult = 1503.1116490645193;
        double result = cronograma.CuotaFijaMensual();
        assertEquals(expResult, result, 0.0);
    }
    
}
