package Ejercicios;

import java.util.Scanner;

public class Inicializacion {
    public static void main(String[] args) {
        String email = "pepito@gmail.com";
        String phone = "300700500500";
        int password = 123456;
        int opc;
        String emailUser = "";
        String phoneUser = "";

        System.out.println("selecciona una opcion");
        Scanner sc = new Scanner(System.in);
        opc = sc.nextInt();
        sc.nextLine();




        int passuser = 0;
        if (opc == 1) {
            System.out.println("Ingrese su email");
            emailUser = sc.nextLine();
        } else if (opc == 2) {
            System.out.println("Ingrese su telefono");
            phoneUser = sc.nextLine();

        }
        else {
            System.out.println("seleccione una opcion valida");}

        System.out.println("ingrese su contraseña");
        passuser = sc.nextInt();



        if (email.equals(emailUser)  || phoneUser == phone && password == passuser) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("valide sus credenciales");
        }


    }
}
