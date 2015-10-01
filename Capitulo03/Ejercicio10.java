/**
 * Ejercicio 10
 * Realiza un conversor de Mb a Kb.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("Conversor de Mb a Kb");
    System.out.print("Introduzca los Mb: ");
    double mb = Double.parseDouble( System.console().readLine());
    
    double total = mb * 1024;

      System.out.println(mb + "Mb Son "+ total + " Kb");
  }
}
