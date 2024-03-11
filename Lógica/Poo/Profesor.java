package poo;

public class Profesor extends  Persona{

    String especialidad;


    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("Registre la especialidad del docente: ");
        especialidad = sc.nextLine();
    }

    @Override
    public void consultarUsuario(boolean iniciarSesion) {
        super.consultarUsuario(iniciarSesion);
    }

    @Override
    public boolean iniciarSesion() {
        return super.iniciarSesion();
    }
}
