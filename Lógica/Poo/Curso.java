package poo;

public class Curso extends Persona {

    int idCurso;
    String nombreCurso;
    int creditos;

    String horario;

    String profesor;

    String [] cursos = new String[5];


    //metodos

    public void crearCurso() {

        System.out.println("ingrese el id del curso");
        idCurso = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el nombre del curso");
        nombreCurso = sc.nextLine();
        System.out.println("ingrese numero de creditos");
        creditos = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el horario");
        horario = sc.nextLine();
        System.out.println("Ingrese el profesor");
        profesor = sc.nextLine();


        cursos[0] = String.valueOf(idCurso);
        cursos[1] = nombreCurso;
        cursos[2] = String.valueOf(creditos);
        cursos[3] = horario;
        cursos[4] =profesor;



    }

    public void consultarCurso(){

        for (String i : cursos){
            System.out.println(i);
        }


    }
}
