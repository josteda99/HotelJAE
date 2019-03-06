
package data;

public class Recepcionista extends Administrador{

    public Recepcionista(String sucursal, String puestoTrabajo, String horarioTrabajo, String nombre, String id, String contraseña) {
        super(sucursal, puestoTrabajo, horarioTrabajo, nombre, id, contraseña);
    }

    
    public Recepcionista() {
    }

    
    public void hacerReservacion(){
     
    }
    public void recibirPago(){
     
    }
    
    public void cancelarReservacion(){
    
    }
    
    @Override
    public void habitacionesDisponibles() {
        
    }

    @Override
    public void solicitarDatos() {
        
    }
    
}
