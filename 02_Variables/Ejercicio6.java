/**
 * Ejercicio 6
 * Escribe un programa que calcule el total de una factura a partir de la base 
 * imponible (precio sin IVA). La base imponible estará almacenada 
 * en una variable.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    
    double precio = 15.99;
    double iva = 15.99 * 0.21;
    double total = iva + 15.99;
    

      System.out.println(" Precio sin IVA: " + precio);
      System.out.println(" Precio con IVA: " + total);

  }
}
