package poo;

public class Administrativo extends Persona {


    String area;

    @Override
    public void registrarUsuario() {
        System.out.println("Ingrese el area a la que pertenece el empleado: ");
        area = sc.nextLine();
    }


    @Override
    public void consultarUsuario(boolean iniciarSesion) {
        System.out.println("Area: "  + area);
    }

    @Override
    public boolean iniciarSesion() {
        return super.iniciarSesion();
    }
}
