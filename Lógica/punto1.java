package Ejercicios;

import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String nombre = "David";
        byte numeroHijos = 5;
        long bonificacion;
        byte horasExtra = 0;



        System.out.println("ingrese el valor de la hora");
        short valorHora = sc.nextShort();


        System.out.println("ingrese el numero de horas trabajadas");
        byte horasTrabajadas = sc.nextByte();

        long valorHoras = horasTrabajadas * valorHora;


        if (numeroHijos > 3){
            bonificacion = 10 * valorHora * numeroHijos;
        }else {
            bonificacion = 5L * valorHora * numeroHijos;

        }

        if (horasTrabajadas > 47){
            horasExtra = (byte) (horasTrabajadas - 47);

        }

        double recargo = 0.35 * valorHora;
        double valorExtras = valorHora + recargo * horasExtra;
        double devengado = valorExtras + valorHoras;
        double neto = devengado + bonificacion;

        System.out.println("Nombre: " + nombre +
                ", Número de hijos: " + numeroHijos +
                ", Bonificación por hijos: " + bonificacion +
                ", Valor hora: " + valorHora +
                ", Horas trabajadas: " + horasTrabajadas +
                ", Valor de las horas: " + valorHoras +
                ", Horas extra: " + horasExtra +
                ", Valor de las extras: " + valorExtras +
                ", Devengado: " + devengado +
                ", Neto: " + neto);

    }

    }

