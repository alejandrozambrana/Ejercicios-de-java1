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
    int base = Math.abs(Integer.parseInt(System.console().readLine()));
    System.out.println("Introduzca un exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
        
    int potencia = 1;
    
    if (exponente >= 0) {
      for (int n = 1; n <= exponente; n++){
        
        potencia = potencia * base;
      }
      System.out.println(base + "^" + exponente + " = " + potencia);
    } else {
        System.out.println("El exponente introducido es negatico");
      }
  }
}

