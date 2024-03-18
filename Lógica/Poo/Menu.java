package poo;

import java.sql.SQLOutput;

public class Menu extends Persona {
    int opc = 0;
    public int  Menu(){

        while (opc !=4){

            System.out.println("Bienvenido a la app Notas");
            System.out.println("Elija una opción");
            System.out.println("1.Estudiante 2.Profesor 3.Administrador 4.Salir");
            opc = sc.nextInt();

            if (opc >0 && opc <4){
                break;
            }else if (opc <0 && opc >=5){
                System.out.println("elija una opcion válida");
            }else {
                System.out.println("Hasta pronto");

            }


        }
        return opc;

    }
}
