/**
 * Ejercicio 10 Escribe un programa que nos diga el horóscopo a partir del
 * día y el mes de nacimiento.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio10 {
  public static void main(String[] args) {
  
    System.out.println("HOROSCOPO ");
        
    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
      
    double ecuacion = ;
    
    System.out.println("La nota media es: " + media);
    
    if (media < 5) {
      System.out.println("Insuficiente");
      }
    if ((media >= 5) && (media < 6)) {
      System.out.print("Suficiente");
      }
    if ((media >= 6) && (media < 7)) {
      System.out.print("Bien");
      }
    if ((media >= 7) && (media < 9)) {
      System.out.print("Notable");
      }
    if (media >= 9) {
      System.out.print("Sobresaliente");
      }

  }
}
