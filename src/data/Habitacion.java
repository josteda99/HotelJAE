
package data;

public class Habitacion implements Hotel{
    private double precio;
    private boolean ocuapado;
    private String servicios;
    private String disponibilidad;
    private int capacidad;
    private int numeroCamas;
    private int numeroHabitaciones;

    @Override
    public void obtenerDireccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void obtenerCalificacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
