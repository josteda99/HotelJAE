/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Asus-PC
 */
public abstract class Administrador extends Persona{
   
    private String sucursal;
    private String puestoTrabajo;
    private String horarioTrabajo;
   
    public abstract void habitacionesDisponibles();
    public abstract void solicitarDatos();

    public Administrador() {
    }

    public Administrador(String sucursal, String puestoTrabajo, String horarioTrabajo) {
        this.sucursal = sucursal;
        this.puestoTrabajo = puestoTrabajo;
        this.horarioTrabajo = horarioTrabajo;
    }

    public Administrador(String sucursal, String puestoTrabajo, String horarioTrabajo, String nombre, String id, String contraseña) {
        super(nombre, id, contraseña);
        this.sucursal = sucursal;
        this.puestoTrabajo = puestoTrabajo;
        this.horarioTrabajo = horarioTrabajo;
    }

    
    public String getSucursal() {
        return sucursal;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    
    
}
