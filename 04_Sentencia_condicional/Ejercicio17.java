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
    long numero = Long.parseLong(System.console().readLine());
    //para que no aparezca el menos en numeros negativos cuando muestre la ultima cifra
    if (numero < 0) {
      numero = -numero;
    }
    System.out.println("La última cifra del número introducido es el " + (numero % 10));
  }
}
