package poo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        Profesor profesorCesde = new Profesor();
        Administrativo adm = new Administrativo();
        Curso curso = new Curso();
        Menu menu = new Menu();

        //System.out.println("INgrese el nombre del estudiante");
        estudiante.id= 1;
        //estudiante.nombre = sc.nextLine();
        estudiante.apellido = "Perez";
        estudiante.setTipoEstudiante("Regular");

        System.out.println(estudiante.getTipoEstudiante());

        profesorCesde.id = 1;
        profesorCesde.nombre = "Luis";
        //profesorCesde.especialidad = "Móviles";

        adm.id = 1;
        adm.nombre = "Fernando";
        //adm.area = "Escuela de Nuevas Tecnologías";



        System.out.println("Nombre: " + estudiante.nombre);
        System.out.println("Apellido: " + estudiante.apellido);


        menu.Menu();

        switch (menu.opc){
            case 1:
                estudiante.registrarUsuario();
                estudiante.iniciarSesion();
                estudiante.consultarUsuario(estudiante.iniciarSesion());
                break;
            case 2:
                profesorCesde.registrarUsuario();
                profesorCesde.iniciarSesion();
                profesorCesde.consultarUsuario(profesorCesde.iniciarSesion());

            case 3:
                adm.registrarUsuario();
                adm.iniciarSesion();
                adm.consultarUsuario(adm.iniciarSesion());
                curso.crearCurso();
                curso.consultarCurso();


        }




    }




}
