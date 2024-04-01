package ejercicio;

public class Rectangulo extends FiguraGeometrica {

    double [] arrayRectangulo = new double[5];


    @Override
    public double calcularArea() {
        return super.calcularArea();
    }


    public void consultarRectangulo(){
        System.out.println("EL AREA DEL RECTANGULO ES" + getArea());
        System.out.println("LA ALTURA DEL RECTANGULO ES " + getAlto());
        System.out.println("EL ANCHO DEL DEL RECTANGULO ES " +getAncho());
        System.out.println("El PERIMETRO DEL RECTANGULO ES " + getPerimetro());
        System.out.println("LA HIPOTENUSA DEL RECTANGULO ES " + getHipotenusa());

        System.out.println("Almacenando los datos del rectangulo espere...");
        arrayRectangulo[0] = getAlto();
        arrayRectangulo[1] = getAncho();
        arrayRectangulo[2] = getArea();
        arrayRectangulo[3] = getPerimetro();
        arrayRectangulo[4] = getHipotenusa();
    }

    public double[] getArrayRectangulo() {
        return arrayRectangulo;
    }

    public void setArrayRectangulo(double[] arrayRectangulo) {
        this.arrayRectangulo = arrayRectangulo;
    }
}