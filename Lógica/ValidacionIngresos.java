package Ejercicios;

import java.util.Objects;
import java.util.Scanner;

public class ValidacionIngresos {
    public ValidacionIngresos() {
    }

    public static void main(String[] args) {
        String user = null;
        String password = null;
        Scanner sc = new Scanner(System.in);

        do {
            if (!Objects.equals(user, (Object)null)) {
                System.out.println("Valide sus credenciales");
            }

            System.out.println("Ingrese su usuario");
            user = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            password = sc.nextLine();
        } while(!Objects.equals(user, "abc") && !Objects.equals(password, "123"));

        String repeat;
        do {
            System.out.println("Ingrese estatura mínima permitida");
            float allowedheight = sc.nextFloat();
            System.out.println("Ingrese edad mínima permitida");
            byte allowedage = sc.nextByte();
            System.out.println("Ingrese el nombre del usuario");
            String username = sc.nextLine();
            System.out.println("Ingrese altura del usuario");
            float userheight = sc.nextFloat();
            System.out.println("Ingrese edad del usuario");
            byte userage = sc.nextByte();
            if (allowedage > userage && !(allowedheight <= userheight)) {
                System.out.println("El usuario " + username + "no puede ingresar");
            } else {
                System.out.println("el usuario" + username + "puede ingresar");
            }

            System.out.println("Desea continuar? presione 0 para salir");
            repeat = sc.nextLine();
        } while(!Objects.equals(repeat, "0"));

    }
}