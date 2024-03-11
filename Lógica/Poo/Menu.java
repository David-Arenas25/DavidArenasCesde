package poo;
public class Menu extends Persona {

    Estudiante estudiante = new Estudiante();
    Profesor profesorCesde = new Profesor();
    Persona persona = new Persona();
    Administrativo adm = new Administrativo();

    Curso curso = new Curso();
    public int myMenu() {
        int opc = 0;
        while (opc != 4) {
            System.out.println("Bienvenido ingrese una opción");
            System.out.println("1.Estudiante 2.Administrador 3.Profesor");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Elijio estudiante");
                    estudiante.registrarUsuario();
                    break;
                case 2:
                    System.out.println("Elijio administrador");
                    adm.registrarUsuario();
                    break;
                case 3:
                    System.out.println("Elijio profesor");
                    profesorCesde.registrarUsuario();
                    break;

                default:
                    System.out.println("ingrese una opción valida");
                    break;
            }
            persona.registrarUsuario();
            persona.iniciarSesion();
            persona.consultarUsuario(persona.login);
            if (opc == 2){
                System.out.println("Cree un curso");
                System.out.println();
                curso.crearCurso();
                System.out.println("El curso creado fue...");
                curso.consultarCurso();

            }



        }
        return opc;

    }


}