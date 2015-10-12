/**
 * Ejercicio 19 
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero
 * que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.println("ESTE PROGRAMA MUESTRAS DATOS SOBRE UN NUMERO");
        
    System.out.print("Introduce un numero entero con no mas de 5 cifras: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero >= 0) && (numero < 10 )) {
     System.out.println("El numero tiene 1 cifra y positivo");
    }
    if ((numero > -10 ) && (numero < 0)) {
     System.out.println("El numero tiene 1 cifra y Negativo");
    }
    if ((numero >= 10 ) && (numero < 100)) {
     System.out.println("El numero tiene 2 Cifras y positivo");
    }
    if ((numero <= -10 ) && (numero > -100)) {
     System.out.println("El numero tiene 2 Cifras y negativo");
    }
    if ((numero >= 100 ) && (numero < 1000)) {
     System.out.println("El numero tiene 3 Cifras y positivo");
    }
    if ((numero <= -100 ) && (numero > -1000)) {
     System.out.println("El numero tiene 3 Cifras y negativo");
    }
    if ((numero >= 1000 ) && (numero < 10000)) {
     System.out.println("El numero tiene 4 Cifras y positivo");
    }
    if ((numero <= -1000 ) && (numero > -10000)) {
     System.out.println("El numero tiene 4 Cifras y negativo");
    }
    if ((numero >= 10000 ) && (numero < 100000)) {
     System.out.println("El numero tiene 5 Cifras y positivo");
    } 
    if ((numero <= -10000 ) && (numero > -100000)) {
     System.out.println("El numero tiene 2 Cifras y negativo");
    }
    if (numero > 99999) {
    System.out.println("El numero introducido no es valido ");
    }
    if (numero < -99999) {
    System.out.println("El numero introducido no es valido ");
    } 
  }
}
