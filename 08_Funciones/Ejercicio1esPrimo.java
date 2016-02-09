/**
 * 
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro 
 * es primo y falso en caso contrario.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio1esPrimo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el numero que quiere saber si es primo: ");
    int n = Integer.parseInt(s.nextLine());
    
    if(Funciones.Calculos.esPrimo(n)){
      System.out.println("Es Primo ");
    }else{
      System.out.println("No es Primo ");
    }
    
    
  }
}
