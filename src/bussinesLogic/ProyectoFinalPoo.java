package bussinesLogic;

import GUI.GUI;
import GUI.VentanaAdministrador;
import data.Recepcionista;
import data.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Asus-PC
 */
public class ProyectoFinalPoo implements Serializable{

//    public ProyectoFinalPoo() {
//        HashMap<String, Recepcionista> administradores = new HashMap<>();
//        obtener(administradores);
//
//    }
    
    public static void mostrarCliente(){
    try{
       File myFile = new File("Cliente.txt");
       FileReader fileReader = new FileReader(myFile);
       BufferedReader reader = new BufferedReader(fileReader);
       String line = null;
       
       while((line = reader.readLine() )!= null) {
           System.out.println(line);
       }
       reader.close();
        }catch(Exception ecx){
            System.out.println("algo ha ");
        }  
    }
    
    public static void gurdarClientes(String nombreApellido, String id, String correo, String peticion, int numeroPersonas, int numeroCuarto, String formaPago , int i) throws IOException{
        FileWriter writer = null;
        Usuario[] usuarioArray = new Usuario[10];
        
        for(int j = 0; j < 10;j++){
            usuarioArray[j] = new Usuario(0, " ", " ", 0, " ", " ", " ", " ");
        }
        
        try{
     
            usuarioArray[i] = new Usuario(numeroCuarto, formaPago, peticion, numeroPersonas, correo, nombreApellido, id, " ");
            System.out.println( i + "si se paso el objeto" + usuarioArray[i].toString());
            writer = new FileWriter("Cliente.txt");
            
            writer.write(usuarioArray[1].toString() + usuarioArray[2].toString());

            
            

            writer.close();
            
        }catch(FileNotFoundException ex){
            System.out.println("el archivo no existe");
        }catch(IOException exe){
            System.out.println("Algo salio mal");
        }
    }
    
    public static void obtenerDatos(HashMap<String, Recepcionista> administradores) {
        Recepcionista marina = new Recepcionista("Cartagena", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "Marina", "1019153478", "123");
        Recepcionista juanAndres = new Recepcionista("Cartagena", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "JuanAndres", "1019153478", "contrasenna");
        //SEDE Bogotá
        Recepcionista jhon = new Recepcionista("Bogotá", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "Jhon", "1019153478", "contrasennaJhon");
        Recepcionista valeria = new Recepcionista("Bogotá", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "Valeria", "1019153478", "contrasennaValeria");

        administradores.put(marina.getContraseña(), marina);
        administradores.put(juanAndres.getContraseña(), juanAndres);
        administradores.put(jhon.getContraseña(), jhon);
        administradores.put(valeria.getContraseña(), valeria);
    }

    public static void main(String[] args) {

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        Recepcionista marina = new Recepcionista("Cartagena", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "Marina", "1019153478", "contrasennaMarina");
        Recepcionista juanAndres = new Recepcionista("Cartagena", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "JuanAndres", "1019153478", "contrasenna");

        //SEDE Bogotá
        Recepcionista jhon = new Recepcionista("Bogotá", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "Jhon", "1019153478", "contrasennaJhon");
        Recepcionista valeria = new Recepcionista("Bogotá", "recepcion principal",
                "lunes a domingo - 9:00 am a 12:00 pm",
                "Valeria", "1019153478", "contrasennaValeria");

       // administradores.put(marina.getContraseña(), marina);
//        administradores.put(juanAndres.getContraseña(), juanAndres);
//        administradores.put(jhon.getContraseña(), jhon);
//        administradores.put(valeria.getContraseña(), valeria);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);

            }
        });

        cargarDatos();
        System.out.println("LECTURA DE DATOS");
        leerDatos();

    }

    private static void cargarDatos() {
        FileWriter escritor = null;
        FileWriter archivoRe = null;
        try {

            escritor = new FileWriter("Usuarios.txt");
        //archivoRe = new FileWriter("Recepcion.txt");
            //leer los archivos
            //archivoRe.write(); 
            //Escriiir los datos de los usuarios que se creen en un arraylist o hash map 
            //for(Usuario done: listaUsuarios){
            // escritor.write(listaUsurios);

            //}
            escritor.close();

            // jasdf
//        escritor.write(c1.getDocumento());
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ERROR");

        }
    }

    public static void leerDatos() {
        try {
            File cargar = new File("Usuarios.txt");
            FileReader lectorArchivo = new FileReader(cargar);
            BufferedReader lector = new BufferedReader(lectorArchivo);
            //Lector datos Recepcionistas
            File administradores = new File("Recepcion.txt");
            FileReader lectorAdmin = new FileReader(administradores);
            BufferedReader lector1 = new BufferedReader(lectorAdmin);

            String line = null;
            while ((line = lector.readLine()) != null) {
                System.out.println(line);
            }

            lector.close();
            //ARCHIVOS RECEPCIONISTAS
            String line2 = null;
            while ((line2 = lector1.readLine()) != null) {
                System.out.println(line2);
            }
//        for(int i = 0; line2.length()==4 ;i++ ){

            //      }
            lector1.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

  

    private void pedirDatos() {
        System.out.println("Por favor ingrese los siguientes datos");
        System.out.println("Nombre:");
        System.out.println("");
    }

}
