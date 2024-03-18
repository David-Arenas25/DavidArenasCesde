package poo;

public class Administrativo extends Persona {


    private String area;

    public Administrativo(){
        super();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("INgrese el area a la que pertenece el empleado: ");
        area = sc.nextLine();
    }


    @Override
    public void consultarUsuario(boolean iniciarSesion) {
        super.consultarUsuario(iniciarSesion);
        System.out.println("Area: "  + area);
    }

    @Override
    public boolean iniciarSesion() {
        return super.iniciarSesion();
    }
}
