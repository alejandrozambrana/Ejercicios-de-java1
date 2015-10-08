/**
 * Ejercicio 5 
 * Realiza un programa que resuelva una ecuación de primer grado 
 * (del tipo ax + b = 0).
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("CALCULAR ECUACION DE PRIMER GRADO");
    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0) {
    System.out.println("No tiene solucion. ");
    }
    else {
    System.out.println("X =" + (-b/a));
    }
  }
}
