package ejercicio;

public class Triangulo extends FiguraGeometrica {

    double [] arrayTriangulo = new double[5];


    @Override
    public double calcularArea() {
        return super.calcularArea();
    }


    public void consultarTriangulo(){
        System.out.println("EL AREA DEL TRIANGULO ES" + getArea());
        System.out.println("LA ALTURA DEL TRIANGULO ES " + getAlto());
        System.out.println("EL ANCHO DEL DEL TRIANGULO ES " +getAncho());
        System.out.println("El PERIMETRO DEL TRIANGULO ES " + getPerimetro());
        System.out.println("LA HIPOTENUSA DEL TRIANGULO ES " + getHipotenusa());

        System.out.println("Almacenando los datos del TRIANGULO espere...");
        arrayTriangulo[0] = getAlto();
        arrayTriangulo[1] = getAncho();
        arrayTriangulo[2] = getArea();
        arrayTriangulo[3] = getPerimetro();
        arrayTriangulo[4] = getHipotenusa();
    }

    public double[] getArrayTriangulo() {
        return arrayTriangulo;
    }

    public void setArrayTriangulo(double[] arrayTriagnulo) {
        this.arrayTriangulo = arrayTriagnulo;
    }
}