package poo;

public class Profesor extends  Persona{

    private String especialidad;

    // COnstructor


    public Profesor(){

        super();
    }

    // Getters and setters


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

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
