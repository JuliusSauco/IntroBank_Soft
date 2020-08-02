
package Capa3_Dominio;

public class Prestamo {
    public String id_prestamo;
    public double montoprestado;
    public double tea;
    public int total_periodos;
    public Cliente cliente;

    public Prestamo() {
    }

    public Prestamo(Cliente cliente) {
        this.cliente = cliente;
    }

    public Prestamo(String id_prestamo, double montoprestado, double tea, int total_periodos, Cliente cliente) {
        this.id_prestamo = id_prestamo;
        this.montoprestado = montoprestado;
        this.tea = tea;
        this.total_periodos = total_periodos;
        this.cliente = cliente;
    }

    public double getMontoprestado() {
        return montoprestado;
    }

    public void setMontoprestado(double montoprestado) {
        this.montoprestado = montoprestado;
    }

    public String getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(String id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public double getTea() {
        return tea;
    }

    public void setTea(double tea) {
        this.tea = tea;
    }

    public int getTotal_periodos() {
        return total_periodos;
    }

    public void setTotal_periodos(int total_periodos) {
        this.total_periodos = total_periodos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //VALIDACION Y METODOS DEL PRESTAMO
    public double validarMonto(){
        if(montoprestado >= 1000 && montoprestado <= 30000){
            return montoprestado;
        }
        else{
            return 0;
        }
    }
    
    public double validarTEA(){
        if(tea >= 0.10 && tea <= 0.20){
            return tea;
        }
        else{
            return 0;
        }
    }
    
    public int validarPeriodo(){
        if(total_periodos >= 3 && total_periodos <= 24){
            return total_periodos;
        }
        else{
            return 0;
        }
    }
            
}
