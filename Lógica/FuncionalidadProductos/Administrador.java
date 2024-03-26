public class Administrador extends Persona {
    private String credenciales = " ";
    private String departamento = " ";
    @Override
    public void registrarUsuario() {
        super.registrarUsuario();
        System.out.println("ingrese sus credenciales");
        credenciales = sc.nextLine();
        System.out.println("Ingrese el departamento al que pertenece");
        departamento = sc.nextLine();

    }

    @Override
    public void consultarUsuario(boolean iniciarSesion) {
        super.consultarUsuario(iniciarSesion);
        System.out.println("El usuario pertenece a " + departamento);
        System.out.println("Sus credenciales son " + credenciales);

    }
}
