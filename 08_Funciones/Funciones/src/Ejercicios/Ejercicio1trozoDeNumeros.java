/**
 * 
 * 13. trozoDeNumero: Toma como parámetros las posiciones inicial y final 
 * dentro de un número y devuelve el trozo correspondiente.
 * 
 * @author Alejandro Zambrana Naranjo
 */
package Ejercicios;

import Funciones.Calculos;
 
import java.util.Scanner;

public class Ejercicio1trozoDeNumeros {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca un numero entero que marque el inicio: ");
    int inicio = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca un numero entero que marque el final: ");
    int fin = Integer.parseInt(s.nextLine());
    System.out.println(Funciones.Calculos.trozoDeNumero(numero,inicio,fin));
    
    
    
  }
}