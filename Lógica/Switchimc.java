
package Ejercicios;

import java.util.Scanner;


public class Switchimc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String user = "abc";
        String phone = "456";
        String password = "123";
        String username = "";
        String userphone = "";
        int clasificacion = 0;
        double Imc;
        int opc = 0;
        
        while (opc != 3){
            System.out.println("ingrese una opcion 1.Usuario 2.telefono 3.salir");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.println("ingrese su usuario");
                    username = sc.nextLine();
                    break;
                case 2:
                    System.out.println("ingrese su telefono");
                    userphone = sc.nextLine();
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;}

                System.out.println("ingrese su contraseña");
                String userpassword = sc.nextLine();

                if (user.equals(username) & password.equals(userpassword)|| phone.equals(userphone) && password.equals(userpassword)) {
                    System.out.println("Bienvenido");
                    System.out.println("ingrese su peso en kilogramos");
                    double weight = sc.nextDouble();
                    System.out.println("ingrese su altura en metros");
                    double height = sc.nextDouble();
                    Imc = weight / Math.pow(height, 2);
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


                }else{
                    System.out.println("valide sus credenciales");}


                    }
                }
            }
