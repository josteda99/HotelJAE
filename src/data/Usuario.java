
package data;

public class Usuario extends Persona{

    private int nHabitaciones;
    private String formaPago;

    public Usuario() {
    }
    
    
    public Usuario( int nHabitaciones, String formaPago) {
        this.nHabitaciones = nHabitaciones;
        this.formaPago = formaPago;
    }

    public Usuario(int nHabitaciones, String formaPago, String nombre, String id, String contraseña) {
        super(nombre, id, contraseña);
        this.nHabitaciones = nHabitaciones;
        this.formaPago = formaPago;
    }
    
    
    
    public void pagar(){
    
    }
    
    public void darInformacion(){
    
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    
}
