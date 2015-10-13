/**
 * Ejercicio 20 
 * Realiza un programa que diga si un número entero positivo introducido por 
 * teclado es capicúa. Se permiten números de hasta 5 cifras.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio20 {
  public static void main(String[] args) {
        
    System.out.println("INDICA SI UN NUMERO ES CAPICUA");
        
    System.out.print("Introduce un numero entero con no mas de 5 cifras: ");
    int n = Integer.parseInt(System.console().readLine());
    
    // número de una cifra
    if (n < 10) {
      System.out.print("Este numero es capicua ");
    } 
    
    // número de dos cifras
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        System.out.print("Este numero es capicua ");
      } else {
        System.out.println("El número introducido no es capicúa.");
      }
    }

    // número de tres cifras
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        System.out.print("Este numero es capicua ");
      } else {
        System.out.println("El número introducido no es capicúa.");
      }
    }

    // número de cuatro cifras
    if ((n >= 1000) && (n < 10000)) {
      if (((n /1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
        System.out.print("Este numero es capicua ");
      } else {
        System.out.println("El número introducido no es capicúa.");
      }
    }
    
    // número de cinco cifras
    if (n >= 10000) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
        System.out.print("Este numero es capicua ");
      } else {
        System.out.println("El número introducido no es capicúa.");
      }
    }
  }
}
