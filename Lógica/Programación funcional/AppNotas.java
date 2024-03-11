import java.util.Scanner;

public class AppNotas {

    static Scanner sc = new Scanner(System.in);
    static String nombre;
    static String apellido;
    static String documento;
    static String correoIng;
    static String contrasenaIng;
    static boolean login = false;
    static double suma = 0;
    static double promedio = 0;


    public static void menu(){
        System.out.println("que desea hacer \n 1.Registrarse\n" +
                "2.Iniciar sesion\n" +
                "3.Salir");

        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 1){
            Registro();
        } else if (opc == 2) {
            InicioSesion();

        }else{
            System.out.println("hasta pronto");
        }
    }

    public static void Registro(){

        System.out.println("ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println( "ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("ingrese su numero de documento");
        documento = sc.nextLine();
        System.out.println("ingrese su correo");
        correoIng = sc.nextLine();
        System.out.println("cree una contraseña");
        contrasenaIng = sc.nextLine();
        InicioSesion();

        }


    public static boolean InicioSesion() {

        while (login == false) {
            System.out.println("inicie sesion");
            System.out.println("ingrese su correo");
            correoIng = sc.nextLine();
            System.out.println("ingrese su contraseña");
            contrasenaIng = sc.nextLine();

            if (correoIng.equals(correoIng) && contrasenaIng.equals(contrasenaIng)) {
                login = true;
                RegistroNotas();
                return login;


            } else {
                login = false;
                System.out.println("valide sus credenciales");
                return login;
            }


        }
        return login;
    }

    public static void RegistroNotas(){
        String [] registro = new String [4];
        registro[0] = nombre;
        registro[1] = apellido;
        registro[2] = documento;
        registro[3] = correoIng;

        System.out.println("el usuario");
        for (int i = 0; i < registro.length; i++) {
            System.out.println(registro[i]);

        }

        System.out.println("cuantas notas va a ingresar");
        int notas = sc.nextInt();
        sc.nextLine();
        double [] calificaciones = new double [notas];

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("ingrese la nota " + (i+1));
            calificaciones[i] = sc.nextDouble();

            suma += calificaciones[i];

            promedio = suma/notas;




        }System.out.println("tiene un promedio de " + promedio);

    }


    public static void main(String[] args) {

        menu();

    }



    }