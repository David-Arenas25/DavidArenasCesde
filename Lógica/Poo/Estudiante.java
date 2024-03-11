package poo;


public class Estudiante extends Persona {

   String tipoEstudiante;


   // Ahora traemos el metodo registrar usuario:


   @Override
   public void registrarUsuario() {
      System.out.println("Ingrese el tipo de estudiante: ");
      tipoEstudiante = sc.nextLine();
   }

   @Override
   public void consultarUsuario(boolean iniciarSesion) {
      if (iniciarSesion == true) {
         System.out.println("Tipo: " + tipoEstudiante);
      }
   }

}
