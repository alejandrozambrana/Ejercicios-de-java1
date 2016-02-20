/**
 * 
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
 * 
 * @author Alejandro Zambrana Naranjo
 */
package Ejercicios;

import Funciones.Calculos;
 
import java.util.Scanner;

public class Ejercicio1quitarPorDelante {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    int numero = Integer.parseInt(s.nextLine());

    System.out.println(Funciones.Calculos.quitaPorDelante(numero));
    
    
    
  }
}