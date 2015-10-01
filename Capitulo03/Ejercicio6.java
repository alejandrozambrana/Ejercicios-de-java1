/**
 * Ejercicio 6 
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    
    String linea;

    System.out.print("Por favor, introduce la base: ");
    linea = System.console().readLine();
    int b;
    b = Integer.parseInt( linea );
    
    System.out.print("Introduce la altura, por favor: ");
    linea = System.console().readLine();
    int h;
    h = Integer.parseInt( linea );

    int area;
    area = (b * h) / 2;

      System.out.println("La base es: " + b + " y la altura es: " + h);
      System.out.println("El area del triangulo es: " + area);
  }
}
