package ejercicio;

public class Cuadrado extends FiguraGeometrica {

    double [] arrayCuadrado = new double[5];


    @Override
    public double calcularArea() {
        return super.calcularArea();
    }


    public void consultarCuadrado(){
        System.out.println("EL AREA DEL CUADRADO ES " + getArea());
        System.out.println("LA ALTURA DEL CUADRADO ES " + getAlto());
        System.out.println("EL ANCHO DEL CUADRADO ES " +getAncho());
        System.out.println("El PERIMETRO DEL CUADRADO ES " + getPerimetro());
        System.out.println("LA HIPOTENUSA DEL CUADRADO ES " + getHipotenusa());

        System.out.println("Almacenando los datos del cuadrado espere...");
        arrayCuadrado[0] = getAlto();
        arrayCuadrado[1] = getAncho();
        arrayCuadrado[2] = getArea();
        arrayCuadrado[3] = getPerimetro();
        arrayCuadrado[4] = getHipotenusa();
    }

    public double[] getArrayCuadrado() {
        return arrayCuadrado;
    }

    public void setArrayCuadrado(double[] arrayCuadrado) {
        this.arrayCuadrado = arrayCuadrado;
    }
}