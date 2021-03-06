/**
 * 
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio1Potencia {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base: ");
    int base = Math.abs(Integer.parseInt(s.nextLine()));
    System.out.print("Introduzca un exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    
    System.out.println(base + "^" + exponente + " = " + Funciones.Calculos.potencia(base, exponente));
    
    
    
  }
}