/**
 * 
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número entero.
 *  Se empieza contando por el 0 y de izquierda a derecha.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio1digitoN {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    int n = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca una posicion: ");
    int p = Integer.parseInt(s.nextLine());
    
    System.out.print("Contando de izquierda a derecha, en la " + p + " posicion aparece: ");
    System.out.println(Funciones.Calculos.digitoN(n,p));
    
    
    
  }
}
