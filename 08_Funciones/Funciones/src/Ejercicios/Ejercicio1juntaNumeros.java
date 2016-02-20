/**
 * 
 * 14. juntaNumeros: Pega dos números para formar uno.
 * 
 * @author Alejandro Zambrana Naranjo
 */
package Ejercicios;

import Funciones.Calculos;
 
import java.util.Scanner;

public class Ejercicio1juntaNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca otro numero entero : ");
    int numero2 = Integer.parseInt(s.nextLine());
    System.out.println(Funciones.Calculos.juntaNumeros(numero,numero2));
    
    
    
  }
}