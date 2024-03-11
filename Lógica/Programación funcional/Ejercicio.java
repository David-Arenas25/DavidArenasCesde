package Ejercicios;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("el numero es par");
        }else {
            System.out.println("el numero es impar");
        }
    }
}