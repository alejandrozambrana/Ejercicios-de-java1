/**
 * Ejercicio 11
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio11{
  public static void main(String[] args) {
     
    System.out.println("MUESTRA EL CUADRADO, EL CUBO Y LOS 5 PRIMEROS NUMEROS ENTEROS DEL NUMERO");
    System.out.println("Introduce un numero entero");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    
    System.out.println("Enteros Cuadrado Cubo");
    for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++)
      //mi forma de acerlo
      //System.out.printf("%4d |%8d |%7d\n", n , n * n, n * n * n);
  
      //Forma del maestro
      System.out.printf("%4d |%8d |%7d\n", n , (int)Math.pow(n, 2), (int)Math.pow(n, 3));
  }
}

