package poo;

import java.util.Scanner;

public class Persona {

    Scanner sc = new Scanner(System.in);


    // Vamos a crear los atributos de la clase

    protected int id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contrasena;

    // Metodo constructor

    public Persona(){

    }

    public Persona(int id, String nombre, String apellido, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Metodos Getters and Setters

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    // Vamos a crear un metodo

    public void registrarUsuario(){

        System.out.println("Registre el id del usuario:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Registre el nombre del usuario:");
        nombre = sc.nextLine();
        System.out.println("Registre el apellido del usuario:");
        apellido = sc.nextLine();
        System.out.println("Registre el correo del usuario:");
        correo = sc.nextLine();
        System.out.println("Registre la contraseña del usuario:");
        contrasena = sc.nextLine();
    }

    public void consultarUsuario( boolean iniciarSesion){

        if(iniciarSesion == true) {
            System.out.println("Id: " + id + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellido: " + apellido + "\n" +
                    "Correo: " + correo + "\n");
        }else{
            System.out.println("Debe iniciar sesion para ver este contenido");
        }
    }

    public boolean iniciarSesion(){

        System.out.println("Ingrese el usuario registrado:");
        String usuario = sc.nextLine();
        System.out.println(" INgrese la contraseña registrada: ");
        String claveUsuario = sc.nextLine();

        if ( usuario.equals(correo) && claveUsuario.equals(contrasena)){
            System.out.println("Bienvenido");
            return true;
        }else{
            System.out.println("Valide sus credenciales");
            return false;
        }
    }
}
