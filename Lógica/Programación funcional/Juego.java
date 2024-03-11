package Ejercicios;

import java.util.Objects;
import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nombre del jugador 1");
        String player1 = sc.nextLine();
        System.out.println("ingrese nombre del jugador 2");
        String player2 = sc.nextLine();
        int player1Points = 0;
        int player2Points = 0;

        while (player1Points <3 && player2Points <3) {
            System.out.println("Turno de " + player1 + " , piedra, papel o tijera?");
            String player1opc = sc.nextLine();
            System.out.println("Turno de " + player2 + " , piedra, papel o tijera?");
            String player2opc = sc.nextLine();
            if (Objects.equals(player1opc, player2opc)) {
                System.out.println("Empate");
            } else if (Objects.equals(player1opc, "piedra") && Objects.equals(player2opc, "tijera") || Objects.equals(player1opc, "tijera") && Objects.equals(player2opc, "papel") || Objects.equals(player1opc, "papel") && Objects.equals(player2opc, "piedra")) {
                System.out.println("gana " + " " + player1);
                player1Points++;
                System.out.println("puntos de " + player1 + " " + player1Points);
            }else if (Objects.equals(player2opc, "piedra") && Objects.equals(player1opc, "tijera") || Objects.equals(player2opc, "tijera") && Objects.equals(player1opc, "papel") || Objects.equals(player2opc, "papel") && Objects.equals(player1opc, "piedra")) {
                System.out.println("gana " + player2);
                player2Points++;
                System.out.println("puntos de " + player2 + " " + player2Points);
            } else {
                System.out.println("No ingreso una opcion valida");
            }
        }

        System.out.println("Resultado "+ player1 + " " + player1Points + " puntos" );
        System.out.println("Resultado "+ player2 + " " +player2Points + " puntos" );

        if (player1Points > player2Points){
            System.out.println(player1 + " Gana!");
        }else{
            System.out.println(player2 +" Gana");
        }
    }

}
