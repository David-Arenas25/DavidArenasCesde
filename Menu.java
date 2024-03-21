package ejercicio;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner (System.in);
    private double [] matriz = new double[3];
    private int opc = 0;
    Cuadrado cuadrado = new Cuadrado();
    Rectangulo rectangulo = new Rectangulo();
    Triangulo triangulo = new Triangulo();
    FiguraGeometrica figuraGeometrica = new FiguraGeometrica();

    public void menu(){
        while(opc != 5){
            System.out.println();
            System.out.println("BIENVENIDO AL CALCULO DE FIGURAS GEOMETRICAS");
            System.out.println("Seleccione una opción");
            System.out.println("1.Cuadrado 2.Rectangulo 3.Triangulo 4.Mostrar datos 5.Salir");
            System.out.println();
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    System.out.println();
                    System.out.println("Elijio cuadrado");
                    cuadrado.calcularArea();
                    cuadrado.calcularPermitro();
                    cuadrado.calcularHipotenusa();
                    cuadrado.consultarCuadrado();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Elijio rectangulo");
                    rectangulo.calcularArea();
                    rectangulo.calcularPermitro();
                    rectangulo.calcularHipotenusa();
                    rectangulo.consultarRectangulo();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Elijio triangulo");
                    triangulo.calcularArea();
                    triangulo.calcularPermitro();
                    triangulo.calcularHipotenusa();
                    triangulo.consultarTriangulo();
                    break;
                case 4:
                    System.out.println("Mostrando datos...");
                    consultarFiguras();
                case 5:
                    System.out.println("HASTA PRONTO!");
                default:
                    System.out.println("INGRESE UNA OPCION VALIDA");



            }

        }
    }

    public void consultarFiguras() {
        System.out.println("LAS FIGURAS FUERON LAS SIGUIENTES");
        System.out.println("CUADRADO");

        System.out.println("RECUERDE EL ORDEN ES ALTO ANCHO AREA PERIMETRO Y HIPOTENUSA"
        );
        for (double a: cuadrado.arrayCuadrado){
            System.out.println(a);
        }
        System.out.println("Rectangulo");
        for(double b : rectangulo.arrayRectangulo){
            System.out.println(b);
        }

        System.out.println("Triangulo");
        for (double c : triangulo.arrayTriangulo){
            System.out.println(c);
        }







    }

}
