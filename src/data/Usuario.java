
package data;

public class Usuario {
    private String nombre;
    private String id;
    private int nHabitaciones;
    private String formaPago;

    public Usuario() {
    }

    public Usuario(String nombre, String id, int nHabitaciones, String formaPago) {
        this.nombre = nombre;
        this.id = id;
        this.nHabitaciones = nHabitaciones;
        this.formaPago = formaPago;
    }
    
    public void pagar(){
    
    }
    
    public void darInformacion(){
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    
    
}
