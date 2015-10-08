/**
 * Ejercicio 9
 * Realiza un programa que resuelva una ecuación de segundo grado 
 * (del tipo ax2 + bx + c = 0).
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio9 {
  public static void main(String[] args) {
  
    System.out.println("RESUELVE ECUACION DE SEGUNDO GRADO ");
    System.out.println("ax^2 + bx + c = 0");
    
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
