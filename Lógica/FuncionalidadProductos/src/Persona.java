
import java.util.Scanner;

public class Persona {

    privagte Scanner sc = new Scanner(System.in);

     private int id;
     private String nombre;
     private String apellido;
     private String correo;
     private String contrasena;

    public void registrarUsuario(){

        System.out.println("Registre su id:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Registre su nombre:");
        nombre = sc.nextLine();
        System.out.println("Registre su apellido:");
        apellido = sc.nextLine();
        System.out.println("Registre su correo:");
        correo = sc.nextLine();
        System.out.println("Registre su contraseña:");
        contrasena = sc.nextLine();
    }

    public void consultarUsuario( boolean iniciarSesion){

        if(iniciarSesion == true) {
            System.out.println("Id: " + id + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellido: " + apellido + "\n" +
                    "Correo: " + correo + "\n");
        }else{
            System.out.println("Debe iniciar sesión para continuar su procesode compra");
        }
    }

    public boolean iniciarSesion(){

        System.out.println("Ingrese el usuario registrado:");
        String usuario = sc.nextLine();
        System.out.println(" Ingrese la contraseña registrada: ");
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