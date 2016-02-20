/**
 * 
 * 5. digitos: Cuenta el nÃºmero de dÃ­gitos de un nÃºmero entero.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio1Digito {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un numero entero: ");
    int n = Integer.parseInt(s.nextLine());
    
    System.out.println("La cantidad de digitos del numero introducido es " + Funciones.Calculos.digitos(n));
    
    
    
  }
}
