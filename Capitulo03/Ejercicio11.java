/**
 * Ejercicio 11
 * Realiza un conversor de Kb a Mb.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Conversor de Kb a Mb");
    System.out.print("Introduzca los Kb: ");
    double kb = Double.parseDouble( System.console().readLine());
    
    double total = kb / 1024;

      System.out.println(kb + "Kb Son "+ total + " Mb");
  }
}
