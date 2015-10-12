/**
 * Ejercicio 17 
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.println("ULTIMAS CIFRAS DE UN NUMERO");
        
    System.out.print("Introduce un numero entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (numero % 10));
  }
}
