package Ejercicios;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        double salario;
        double ahorro = 0;
        System.out.println("indique su salario");
        salario = sc.nextDouble();
        System.out.println("Seleccione una opcion: \n "+
                "1. Ahorro 5% \n"+
                "2. Ahorro 7% \n"+
                "3. Ahorro 10% \n"+
                "4. Ahorro voluntario");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc){

            case 1:
                System.out.println("Ahorro del 5%");
                ahorro = salario * 0.05;

                break;
            case 2:
                System.out.println("Ahorro del 7%");
                ahorro = salario * 0.07;
                break;
            case 3:
                System.out.println("Ahorro del 10%");
                ahorro = salario * 0.10;
                break;
            case 4:
                System.out.println("Ahorro voluntario");
                System.out.println("ingrese el porcentaje de ahorro voluntario:");
                double porcentaje = sc.nextDouble();
                ahorro = salario * (porcentaje/100);
                break;
            default:
                System.out.println("seleccione una opcion valida");
                break;

        }
        System.out.println("ahorro = " + ahorro);

    }
}

///tarea calcular IMC con switch y con if y con inicio de sesion