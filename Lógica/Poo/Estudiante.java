package poo;

import java.util.Scanner;

public class Estudiante extends Persona {

   private String tipoEstudiante;

   // COnstructor


   public Estudiante(){
      super();
   }


   //getter and setters

   public String getTipoEstudiante() {
      return tipoEstudiante;
   }

   public void setTipoEstudiante(String tipoEstudiante) {
      this.tipoEstudiante = tipoEstudiante;
   }


   // Ahora traemos el metodo registrar usuario:


   @Override
   public void registrarUsuario() {
      super.registrarUsuario();
      System.out.println("Ingrese el tipo de estudiante: ");
      tipoEstudiante = sc.nextLine();
   }

   @Override
   public void consultarUsuario(boolean iniciarSesion) {
      super.consultarUsuario(iniciarSesion);
      if(iniciarSesion == true){
      System.out.println("Tipo: " + tipoEstudiante);
      }
   }

   @Override
   public boolean iniciarSesion() {
      return super.iniciarSesion();
   }
}
