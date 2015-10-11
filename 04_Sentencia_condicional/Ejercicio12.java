/**
 * Ejercicio 12 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto.
 * El programa mostrará al final la calificación obtenida. Pásale el
 * minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal 
 * andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    
    int puntos = 0;
    String pregunta;
    
    System.out.println("CUESTIONARIO ");
        
    System.out.println("01-¿double permite meter numeros con decimales? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("si")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
    
    System.out.print("02-¿Si en la clase no pones el mismo nombre del documento,");
    System.out.println(" el programa compila? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("no")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
    
    System.out.println("03-¿El operador && significa o? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("no")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
    
    System.out.println("04-¿El operador != significa distinto? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("si")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
      
    System.out.println("05-¿El archivo .class es el archivo sin compilar? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("no")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
    
    System.out.println("06-¿string se utiliza para poner numeros enteros? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("no")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
    
    System.out.println("07-¿println hace un salto de linea? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("si")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
      
    System.out.println("08-¿break en un switch inicializa el switch? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("no")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
      
    System.out.println("09-¿string establece una variable? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("si")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
      
    System.out.println("10-¿con el comando ls cambiamos de directorio? si/no: ");
    pregunta = System.console().readLine();
      if (pregunta.equals("no")) {
        System.out.println("La respuesta es Correcta");
        puntos++;
      } else {
        System.out.println("La respuesta es incorrecta");
      }
      
      System.out.println("Puntuacion obtenida es de " + puntos + " puntos.");
     }
    }

