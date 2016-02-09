/**
 * 
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que se 
 * pasa como parámetro.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio1siguientePrimo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero: ");
    int n = Integer.parseInt(s.nextLine());
    
    
    System.out.println("El siguiente primo a " + n + " es " + Funciones.Calculos.siguientePrimo(n));
    
    
    
  }
}
