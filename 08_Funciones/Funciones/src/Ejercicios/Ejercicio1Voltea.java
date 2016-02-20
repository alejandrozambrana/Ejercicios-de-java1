/**
 * 
 * 6. voltea: Le da la vuelta a un nÃºmero.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio1Voltea {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    long n = Integer.parseInt(s.nextLine());
    
    System.out.println("El numero volteado es " + Funciones.Calculos.voltea(n));
    
    
    
  }
}
