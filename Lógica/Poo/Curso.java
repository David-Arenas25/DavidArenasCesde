package poo;

public class Curso extends Persona {

    int idCurso;
    String nombreCurso;
    int creditos;

    String horario;

    String profesor;


    //metodos

    public void crearCurso(){
        System.out.println("Ingrese la id del curso");
        idCurso = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre del curso");
        nombreCurso = sc.nextLine();
        System.out.println("Ingrese los creditos del curso");
        creditos = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el profesor");
        profesor = sc.nextLine();




    }

    public void consultarCurso(){

        System.out.println("El curso registrado es el siguiente");
        System.out.println("id del curso " + idCurso);
        System.out.println("Nombre del curso "+ nombreCurso);
        System.out.println("Creditos del curso " + creditos);
        System.out.println("Profesor "+ profesor);


    }
}
