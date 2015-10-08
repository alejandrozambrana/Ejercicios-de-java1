/**
 * Ejercicio 7
 * Escribe un programa que calcule el total de una factura a partir de la
 * base imponible.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio7 {
  public static void main(String[] args) {
    
    String linea;

    System.out.print("Por favor, Introduzca la base imponible: ");
    linea = System.console().readLine();
    double baseImponible;
    baseImponible = Double.parseDouble( linea );
    
    System.out.print("Introduce el IVA, por favor: ");
    linea = System.console().readLine();
    int iva;
    iva = Integer.parseInt( linea );
    
    double total;
    total = baseImponible + (baseImponible * iva / 100);

      System.out.println("Base imponible es: " + baseImponible);
      System.out.println("El IVA es: " + iva);
      System.out.println("El Total es: " + total);
  }
}
