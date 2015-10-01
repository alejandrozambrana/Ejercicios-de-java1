/**
 * Ejercicio 5
 * Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio5 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Calcula el area de un rectangulo");
    System.out.print("Por favor, introduce la base (cm): ");
    linea = System.console().readLine();
    int b;
    b = Integer.parseInt( linea );
    
    System.out.print("Introduce la altura, por favor(cm): ");
    linea = System.console().readLine();
    int h;
    h = Integer.parseInt( linea );

    int area;
    area = b * h;

      System.out.println("La base es: " + b + " y la altura es: " + h);
      System.out.println("El area del rectangulo es: " + area + " cm²");
  }
}
