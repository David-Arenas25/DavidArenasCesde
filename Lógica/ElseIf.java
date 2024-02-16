package Ejercicios;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        /// en caso de que una trabajador gana un salario mínimo ahorra el 5%
        /// en caso de que gane dos salarios mínimos ahorra el 7%
        /// en caso de que gane 3 salarios minimos ahorra el 10%
        /// en caso de que sea mayor es voluntario

        Scanner sc = new Scanner(System.in);

        double salarioMínimo = 1300000;
        System.out.println("ingrese el salario del empleado a evaluar");
        double salarioEmpleado = sc.nextDouble();

        if (salarioEmpleado >= salarioMínimo && salarioEmpleado < (salarioMínimo * 2)){
            double ahorro = salarioEmpleado * 0.05;
            System.out.println("El ahorro del 5 % es" + ahorro);
        } else if (salarioEmpleado >= (salarioMínimo*2) && salarioEmpleado < (salarioMínimo * 3)) {
            double ahorro = salarioEmpleado * 0.07;
            System.out.println("El ahorro del 7 % es" + ahorro);

        } else if (salarioEmpleado >= (salarioEmpleado*3) && salarioEmpleado < (salarioEmpleado *4)) {
            double ahorro = salarioEmpleado * 0.10;
            System.out.println("El ahorro del  10% es" + ahorro);

        }

        else {
            System.out.println("Indique el porcentaje que desea ahorrar");
            double ahorroVoluntario = sc.nextDouble();
            double ahorro = salarioEmpleado * ahorroVoluntario / 100;
            System.out.println("El ahorro del " + ahorroVoluntario + " % es de " + ahorro);

        }

    }
}
