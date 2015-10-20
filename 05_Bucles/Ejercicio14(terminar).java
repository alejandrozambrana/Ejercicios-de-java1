/**
 * Ejercicio 14
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio14{
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA CALCULA POTENCIAS");
    System.out.println("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
        
    double resultado = 1;
    
    while ( exponente > 0 ) {
      exponente *= base;
    }
      resultado = 1/resultado;
    System.out.println(base + "^" + exponente + " = " + resultado);
  }
}

