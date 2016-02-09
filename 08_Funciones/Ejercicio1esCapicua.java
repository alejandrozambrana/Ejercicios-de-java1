/**
 * 
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
 * es capicúa y falso en caso contrario.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio1esCapicua {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca el numero que quiere saber si es capicua: ");
    int n = Integer.parseInt(s.nextLine());
    
    if(Funciones.Calculos.esCapicua(n)){
      System.out.println("Es capicua ");
    }else{
      System.out.println("No es capicua ");
    }
    
    
  }
}
