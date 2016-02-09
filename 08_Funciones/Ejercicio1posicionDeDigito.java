/**
 * 
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito 
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 * @author Alejandro Zambrana Naranjo
 */
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
