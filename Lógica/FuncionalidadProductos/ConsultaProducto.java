public class ConsultaProducto extends Producto {
     private String[] myArray = new String[1];
     private String id;
     private int stock;
     double precio;

    public ConsultaProducto(String[] myArray, String id, int stock, double precio) {
        this.myArray = myArray;
        this.id = id;
        this.stock = stock;
        this.precio = precio;
    }

    public ConsultaProducto() {
        super();
        this.myArray = myArray;
        this.id = id;
        this.stock = stock;
        this.precio = precio;
    }

    @Override
    public void Registro() {
        super.Registro();


        System.out.println("ingrese el id del producto");
        id = sc.nextLine();
        System.out.println("Ingrese stock");
        stock = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el precio");


        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = "id " + id + " nombre: " + nombre + ", precio: " + String.valueOf(precio) + ", presentación: " + presentacion + ", stock: " + String.valueOf(stock) + ", sabor: " + sabor;
        }

        for (String a: myArray) {
            System.out.println("Producto registrado con exito!");
            System.out.println("El producto registrado es el siguiente:");
            System.out.println(a);
        }
    }
}