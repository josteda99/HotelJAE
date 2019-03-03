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
public abstract class Administrador implements Hotel{
    private String nombre;
    private String id;
    private String contraseña;
    private String sucursal;
    private String puestoTrabajo;
    private String horarioTrabajo;
   
    public abstract void habitacionesDisponibles();
    public abstract void solicitarDatos();

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getContraseña() {
        return contraseña;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
