/**
 * Ejercicio 7
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio7 {
  public static void main(String[] args) {
  
    System.out.println("CALCULA LA MEDIA DE TRES NOTAS ");
  System.out.print("Introduce la primera nota: ");
    double primera = Double.parseDouble(System.console().readLine());
  System.out.print("Introduce la segunda nota: ");
    double segunda = Double.parseDouble(System.console().readLine());
  System.out.print("Introduce la tercera nota: ");
    double tercera = Double.parseDouble(System.console().readLine());
    
  double suma = primera + segunda + tercera;
  double media = suma/3;
  
  System.out.println("La nota media es: " + media);

  }
}
