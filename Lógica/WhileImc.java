package Ejercicios;

import java.util.Objects;
import java.util.Scanner;

public class WhileImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "david";
        String phone = "123";
        String password = "abc";
        String username = null;
        String userphone = null;
        String userpasword = null;
        int counter = 0;
        int clasificacion = 0;
        String opc2  = "si";


        while (!Objects.equals(userpasword, password) && !Objects.equals(username, user) && !Objects.equals(userphone, phone)){
            System.out.println("Ingrese la opción para iniciar sesion 1.Usuario 2.Telefono 3.Salir");
            int opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    System.out.println("ingrese su usuario");
                    username = sc.nextLine();
                    break;
                case 2:
                    System.out.println("ingrese su telefono");
                    phone = sc.nextLine();
                    break;

                case 3:
                    System.out.println("saliendo");
                    System.exit(0);
                    break;

                default:
                    System.out.println("ingrese una opcion valida");

            }
            System.out.println("ingrese la contraseña");
            userpasword = sc.nextLine();
        }
        System.out.println("Bienvenido");
        while (counter <= 2 && opc2.equals("si")){
                System.out.println("ingrese su peso en kilogramos");
                double weight = sc.nextDouble();
                System.out.println("ingrese su altura en metros");
                double height = sc.nextDouble();
                double Imc = weight / Math.pow(height, 2);
                System.out.println("Su imc es" + Imc);

                if (Imc < 18.5) {
                    clasificacion = 1;
                } else if (Imc > 18.5 && Imc <= 24.4) {
                    clasificacion = 2;

                }else if (Imc >= 25.0 && Imc <= 29.9) {
                    clasificacion = 3;

                } else if (Imc >= 30.0 && Imc <= 34.9) {
                    clasificacion = 4;

                } else if (Imc >= 35.9 && Imc <= 39.9) {
                    clasificacion = 5;

                } else if (Imc >= 40.0) {
                    clasificacion = 6;

                }

                switch (clasificacion){
                    case 1:
                        System.out.println("La clasificacion es Bajo de peso y el estado nutricional es Delgadez");
                        break;
                    case 2:
                        System.out.println("La clasificacion es Normal de peso y el estado nutricional es Peso saludable");
                        break;
                    case 3:
                        System.out.println("La clasificacion es sobrepeso y el estado nutricional es Sobrepeso");
                        break;
                    case 4:
                        System.out.println("La clasificacion es obesidad clase 1 y el estado nutricional es Obesidad leve");
                        break;
                    case 5:
                        System.out.println("La clasificacion es obesidad clase 2 y el estado nutricional es obesidad moderada");
                        break;
                    case 6:
                        System.out.println("La clasificacion es obesidad clase 3 y el estado nutricional es obesidad grave o morbida");
                        break;
                }
                counter++;

                while(counter == 2){
                    System.out.println("desa continuar? escriba si o escriba salir para salir");
                    sc.nextLine();
                    opc2 = sc.nextLine();
                    counter = 0;



                }

        }
        System.out.println("hasta pronto");

    }
}