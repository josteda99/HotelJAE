
package data;

public class Habitacion implements Hotel{
    private double precio;
    private boolean ocuapado;
    private String servicios;
    private String disponibilidad;
    private int capacidad;
    private int numeroCamas;
    private int numeroHabitaciones;
    private int numeroCuarto;

    public Habitacion() {
    }

    public Habitacion(double precio,  String servicios, String disponibilidad, int capacidad, int numeroCamas, int numeroHabitaciones, int numeroCuarto) {
        this.precio = precio;
        this.servicios = servicios;
        this.disponibilidad = disponibilidad;
        this.capacidad = capacidad;
        this.numeroCamas = numeroCamas;
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroCuarto = numeroCuarto;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isOcuapado() {
        return ocuapado;
    }

    public String getServicios() {
        return servicios;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public int getNumeroCuarto() {
        return numeroCuarto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setOcuapado(boolean ocuapado) {
        this.ocuapado = ocuapado;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public void setNumeroCuarto(int numeroCuerto) {
        this.numeroCuarto = numeroCuerto;
    }

    @Override
    public String toString() {
        return "No de la habitacion: " + numeroCuarto + '\n' + 
                "Disponibilidad: " + disponibilidad + '\n' +
                "Precio: " + precio + " $ por noche" + '\n' +
                "Serivicios: " + servicios + '\n' +
                "No Habitaciones: " + numeroHabitaciones + '\n'+
                "No Camas: " + numeroCamas + " camas" + '\n' + 
                "Capacidad: " + capacidad + " personas " + '\n'; 
    }

   

    
    @Override
    public void obtenerDireccion() {
       
    }

    @Override
    public void obtenerCalificacion() {
        
    }
    
}
