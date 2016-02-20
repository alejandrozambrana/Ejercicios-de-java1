/**
 * 
 * 8. posicionDeDigito: Da la posiciÃ³n de la primera ocurrencia de un dÃ­gito 
 * dentro de un nÃºmero entero. Si no se encuentra, devuelve -1.
 * 
 * @author Alejandro Zambrana Naranjo
*/

package Ejercicios;

import Funciones.Calculos;
 
import java.util.Scanner;

public class Ejercicio1posicionDeDigito {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca un digito del numero anterior: ");
    int p = Integer.parseInt(s.nextLine());
    
    System.out.print("Contando de izquierda a derecha, el " + p + " aparece en las siguientes posiciones: ");
    System.out.println(Funciones.Calculos.posicionDeDigito(n,p));
    
    
    
  }
}
