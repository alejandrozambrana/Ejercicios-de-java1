/**
 * Ejercicio 17
 * Realiza un programa que sume los 100 números siguientes a un número entero 
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio17 {
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA LOS 100 NUMEROS SIGUENTES AL INTRODUCIDO");
    
     int total = 0;
     int numero = 0;
     
      do {
        System.out.println("Introduzca un numero entero positivo: ");
         numero = Integer.parseInt(System.console().readLine());
      } while (numero < 0);
      
      for (int i = 0; i < numero + 100;i++) {
      total = total * numero;
      }
      
      System.out.print("La suma de los 100 siguientes numeros de " + numero);
      System.out.print(" es de " + total);
    
  }
}

