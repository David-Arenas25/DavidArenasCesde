import java.util.Scanner;

public class Producto {

    private Scanner sc = new Scanner(System.in);
    private String nombre;
    private String sabor;
    private String presentacion;



    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Producto() {

    }

    public void Registro() {

        System.out.println("Ingrese el nombre del producto");
        nombre = sc.nextLine();
        System.out.println("Ingrese los sabores del producto");
        sabor = sc.nextLine();
        System.out.println("Ingrese la presentación del producto");
        presentacion = sc.nextLine();



        }

    }
