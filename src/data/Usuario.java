package data;

public class Usuario extends Persona {

    private int nHabitaciones;
    private String formaPago;
    private String peticion;
    private int nPersonas;
    private String correo;

    public Usuario() {
    }

    public Usuario(int nHabitaciones, String formaPago) {
        this.nHabitaciones = nHabitaciones;
        this.formaPago = formaPago;
    }

    public Usuario(int nHabitaciones, String formaPago, String nombre, String id, String contraseña) {
        super(nombre, id, contraseña);
        this.nHabitaciones = nHabitaciones;
        this.formaPago = formaPago;
    }

    public Usuario(int nHabitaciones, String formaPago, String peticion, int nPersonas, String correo, String nombre, String id, String contraseña) {
        super(nombre, id, contraseña);
        this.nHabitaciones = nHabitaciones;
        this.formaPago = formaPago;
        this.peticion = peticion;
        this.nPersonas = nPersonas;
        this.correo = correo;
    }

    public String getPeticion() {
        return peticion;
    }

    public int getnPersonas() {
        return nPersonas;
    }

    public String getCorreo() {
        return correo;
    }

    public void setPeticion(String peticion) {
        this.peticion = peticion;
    }

    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void pagar() {

    }

    public void darInformacion() {

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

    @Override
    public String toString() {
        return "Nombre y Apellido: " + this.getNombre() + '\n'
                + "Identificacion: " + this.getId() + '\n'
                + "Correo: " + this.getCorreo() + '\n'
                + "Numero de Personas: " + this.getnPersonas() + '\n'
                + "Habitacion: " + this.getnHabitaciones() + '\n'
                + "Forma de pago: " + this.getFormaPago() + '\n'
                + "Peticiones Adicionales: " + this.getPeticion() + '\n';
    }

}
