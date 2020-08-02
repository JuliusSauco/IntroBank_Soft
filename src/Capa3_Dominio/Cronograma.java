
package Capa3_Dominio;

public class Cronograma {
    public int id_cronograma;
    public int periodo;
    public double saldo;
    public double amortizacion;
    public double interes;
    public double cuota;
    public double tem;
    public Prestamo prestamo;

    public Cronograma() {
    }

    public Cronograma(int periodo, double saldo, double amortizacion, double interes, double cuota, double tem, Prestamo prestamo) {
        
        this.periodo = periodo;
        this.saldo = saldo;
        this.amortizacion = amortizacion;
        this.interes = interes;
        this.cuota = cuota;
        this.tem = tem;
        this.prestamo = prestamo;
    }

    public Cronograma(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public int getId_cronograma() {
        return id_cronograma;
    }

    public void setId_cronograma(int id_cronograma) {
        this.id_cronograma = id_cronograma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getTem() {
        return tem;
    }

    public void setTem(double tem) {
        this.tem = tem;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "Cronograma{" + "id_cronograma=" + id_cronograma + ", periodo=" + periodo + ", saldo=" + saldo + ", amortizacion=" + amortizacion + ", interes=" + interes + ", cuota=" + cuota + ", tem=" + tem + ", prestamo=" + prestamo + '}';
    }
    
    //METODOS
    public double tasaEfectivaMensual(){
        double pot = 12;
        double tea1 = prestamo.getTea() + 1;
        tem = (Math.pow(tea1, 1/pot))-1;
        return tem;
    }
    
    public double CuotaFijaMensual(){
        double i = tasaEfectivaMensual();
        double P = prestamo.getMontoprestado();
        double n = prestamo.getTotal_periodos();
        double A;
        A = (P/(1-(Math.pow((1+i), -n))))*i;
        return A;
    } 
    
    /*public void calcularDatos(){
        
    }*/

}
