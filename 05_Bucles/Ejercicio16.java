/**
 * Ejercicio 16
 * Escribe un programa que diga si un número introducido por teclado es o no 
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la 
 * unidad.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio16 {
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA DICE SI UN NUMERO ES PRIMO");
    System.out.println("Introduzca un numero entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    boolean primo = true;
    
      for (int x = 2; x < numero; x++) {
        if((numero % x) == 0){
         primo = false;
        }
      }
      
      if (primo) {
        System.out.println("El numero es primo");
        } else {
          System.out.println("El numero no es primo");
          }
    
  }
}

