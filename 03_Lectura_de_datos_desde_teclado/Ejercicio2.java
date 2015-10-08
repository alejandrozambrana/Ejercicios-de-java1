/**
 * Ejercicio 2
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
 * convertir debe ser introducida por teclado.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio2 {
  public static void main(String[] args) {
    
    String linea;

    System.out.print("Por favor, Introduce la cantidad de euros a convertir: ");
    linea = System.console().readLine();
    
    int euros;
    euros = Integer.parseInt( linea );
    
    int pesetas; 
    pesetas = (int)(euros * 166.386);
      
      System.out.println("La cantidad de euros introducida " + euros);
      System.out.print("El resultado de la conversion es: ");
      System.out.print(pesetas);

  }
}
