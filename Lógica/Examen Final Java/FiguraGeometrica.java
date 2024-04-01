package ejercicio;

import java.util.Scanner;
public class FiguraGeometrica{
    private Scanner sc = new Scanner(System.in);
    private double alto;
    private double ancho;
    private double area;
    private double perimetro;
    private double hipotenusa;


    public double calcularArea(){
        System.out.println("Ingrese el alto");
        alto = sc.nextDouble();
        System.out.println("Ingrese el ancho");
        ancho = sc.nextDouble();
        System.out.println("Iniciando app...");
        System.out.println();
        area = ancho * alto;

        return area;
    }


    public double calcularPermitro(){
        System.out.println("calculando" + "\n");
        perimetro = (ancho * 2) + (alto*2);

        return perimetro;
    }


    public double calcularHipotenusa(){
        System.out.println("Ya casi esta..."+ "\n");
        hipotenusa = Math.pow(alto,2) + Math.pow(ancho, 2);
        hipotenusa = Math.sqrt(hipotenusa);

        return hipotenusa;

    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
}