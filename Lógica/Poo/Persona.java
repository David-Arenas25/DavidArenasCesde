package poo;

import java.util.Scanner;

public class Persona {

    Scanner sc = new Scanner(System.in);


    // Vamos a crear los atributos de la clase

    int id;
    String nombre;
    String apellido;
    String correo;
    String contrasena;
    boolean login;

    // Vamos a crear un metodo

    public void registrarUsuario() {

        String usuarios [] = new String[5];

        System.out.println("Primero que todo debes registrarte");
        System.out.println();
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
    public boolean iniciarSesion() {
        System.out.println();
        System.out.println("Inicie sesion");
        System.out.println();
        System.out.println("Ingrese el usuario registrado:");
        String usuario = sc.nextLine();
        System.out.println(" Ingrese la contraseña registrada: ");
        String claveUsuario = sc.nextLine();


        if (usuario.equals(correo) && claveUsuario.equals(contrasena)) {
            System.out.println("Bienvenido");
            login = true;
        } else {
            System.out.println("Valide sus credenciales");
            login = false;

        }
        return login;
    }

    public void consultarUsuario(boolean iniciarSesion) {

        if (iniciarSesion == true) {
            System.out.println("Id: " + id + "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Apellido: " + apellido + "\n" +
                    "Correo: " + correo + "\n");
        } else {
            System.out.println("Debe iniciar sesion para ver este contenido");
        }
    }





    }
