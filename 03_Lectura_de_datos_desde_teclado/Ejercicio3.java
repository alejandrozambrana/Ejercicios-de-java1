/**
 * Ejercicio 3
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se
 * quiere convertir debe ser introducida por teclado.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    String linea;

    System.out.print("Por favor, Indica la cantidad de pesetas a convertir: ");
    linea = System.console().readLine();
    
    int pesetas;
    pesetas = Integer.parseInt( linea );
    
    double euros; 
    euros = pesetas / 166.386;
      
      System.out.println("La cantidad de pesetas introducida es: " + pesetas);
      System.out.print("El resultado de la conversion es: ");
      System.out.printf( "%.2feuros",euros);

  }
}
