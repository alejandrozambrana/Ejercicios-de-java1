/**
 * 
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 
 * @author Alejandro Zambrana Naranjo
 */
package Ejercicios;

import Funciones.Calculos;
 
import java.util.Scanner;

public class Ejercicio1pegaPorDetras {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca un numero entero que quieras añadir (del 0 al 9): ");
    int añadido = Integer.parseInt(s.nextLine());
    System.out.println(Funciones.Calculos.pegaPorDetras(numero,añadido));
    
    
    
  }
}