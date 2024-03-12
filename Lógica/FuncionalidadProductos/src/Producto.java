import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);
    String nombre;
    String sabor;
    String presentacion;

    public Producto(Scanner sc, String nombre, String sabor, String presentacion) {
        this.sc = sc;
        this.nombre = nombre;
        this.sabor = sabor;
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
