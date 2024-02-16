package Ejercicios;

import java.util.Scanner;

public class Tarea{
    public static void main(String[] args) {

        /*CÁLCULO CDT VIRTUAL*

        se importa escaner y se inicializan variables para el inicio*/
        Scanner sc = new Scanner(System.in);
        String user = "david";
        String usering;
        String userphone;
        String phone = "321";
        String password = "abc";
        String passwording;
        String option = "0";



        /* se inicializan variables para el cálculo del CDT VIRTUAL */
        double inversion = 0;
        int days = 0;
        double interests = 1;
        double benefit;
        double[] myarray = new double[6];
        int probablydays = 60;
        double totalinterests;
        boolean login = false;




        /*El ciclo while evalua el estado del login y lee la opción del usuario*/
        System.out.println("Bienvenido seleccione una opción para ingresar al sistema");
        while (login == false) {
            System.out.println("1.Para usuario");
            System.out.println("2.Para teléfono");
            option = sc.nextLine();


            /* Se evalua la opcion del usuario con un switch y un condicional para el estado del login*/
            switch (option) {

                /*Ingresa con usuario y se verifican las credenciales para confirmar el login*/
                case "1":
                    System.out.println("Ingrese su usuario");
                    usering = sc.nextLine();
                    System.out.println("ingrese su contraseña");
                    passwording = sc.nextLine();

                    if (usering.equals(user) && passwording.equals(password)) {
                        login = true;
                    } else {
                        System.out.println("valide sus credenciales");
                        login = false;
                    }break;

                /*Ingresa con telefono*/
                case "2":
                    System.out.println("ingrese su telefono");
                    userphone = sc.nextLine();
                    System.out.println("ingrese su contraseña");
                    passwording = sc.nextLine();
                    if (userphone.equals(phone) && passwording.equals(password)) {
                        login = true;
                    } else {
                        System.out.println("valide sus credenciales");
                        login = false;
                    }break;

                /* opción ingresada no es valida*/
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
        }

        /*mientras el login sea verdadero se procede con el calculo CDT VIRTUAL*/
        while (login == true) {
            System.out.println("Bienvendido al CDT VIRTUAL");
            System.out.println("presione 1.Para simular inversion virtual");
            System.out.println("presione 2.Para salir");
            option = sc.nextLine();
            if (option.equals("2")) {
                System.out.println("saliendo hasta pronto");
                break;
            } else if (option.equals("1")) {
                System.out.println("Un momento por favor");
                System.out.println("...");

            } else {
                System.out.println("ingrese una opcion válida");
            }


            /* mientras el usuario elija la opcion 1 se lee el monto y los dias de inversión*/
            if (option.equals("1")) {
                System.out.println("INVERSIÓN CDT VIRUTAL");
                System.out.println("Cuanto vas a invertir");
                inversion = sc.nextDouble();
                System.out.println("A cuantos dias vas a hacer la inversión? minimo 60 días máximo 360 días");
                days = sc.nextInt();
                sc.nextLine();

                /* se calculan los intereses teniendo en cuanta los dias de inversioon*/
                if (days > 360) {
                    interests = 0;
                    System.out.println("elija una opcion valida");
                } else if (days >= 60) {
                    interests = 0.05;
                } else if (days >= 120) {
                    interests = 0.0650;

                } else if (days >= 180) {
                    interests = 0.0750;

                } else if (days >= 240) {
                    interests = 0.0850;

                } else if (days >= 300) {
                    interests = 0.09;

                } else if (days == 360) {
                    interests = 0.0950;

                }

                /*se evaluan las condiciones días e intereses y se calcula en base a los días*/
                if (days > 0 && interests != 0) {
                    benefit = inversion + (inversion * interests);
                    totalinterests = (inversion * interests);

                /* se agregan los datos al array*/
                    myarray[0] = inversion + (inversion * 0.05);
                    myarray[1] = inversion + (inversion * 0.0650);
                    myarray[2] = inversion + (inversion * 0.0750);
                    myarray[3] = inversion + (inversion * 0.0850);
                    myarray[4] = inversion + (inversion * 0.09);
                    myarray[5] = inversion + (inversion * 0.0950);

                    /* se imprimie el resultado*/

                    System.out.println( "Su inversion a un plazo de " + "dias"+ days + "y un monto de " + inversion + " será $ "+ benefit + "y los intereses serían " + totalinterests);

                    /* se imprimen los resultados para los dias disponibles y probablydays va aumentando +60 hasta llegar a 360*/
                    for (int i = 0; i < myarray.length; i++) {

                        System.out.println("para un plazo de " + probablydays + " el total seria " + myarray[i]);
                        probablydays += 60;


                    }

                    /*fin*/

                    }

                }
            }
        }
    }










