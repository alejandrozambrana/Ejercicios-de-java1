package Ejercicios;

/**
 * 
 * Ejercicio 17 Escribe un programa que pase de binario a decimal.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio18decimalBinario {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("introduzca un numero entero: ");
    long decimal = Long.parseLong(s.nextLine());
    
   System.out.println("El numero en binario: " + decimalBinario(decimal));
    
  }
  
    /**
   * 
   * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param num un nÃºmero entero
   * @return quita una cifra al numero
   */ 
  public static long decimalBinario(long num) {
    
    if (num == 0) {
      return 0;
    }
    
    int binario = 1;
    
    do{
      binario = Funciones.Calculos.pegaPorDetras(binario, (int)num % 2);
      num = num / 2;
     }while (num > 0);
    long binarioFinal = 0;
    
    binarioFinal = Funciones.Calculos.voltea((long)binario);
    binarioFinal = Funciones.Calculos.quitaPorDetras((int)binarioFinal, 1);
    return binarioFinal;
  }
}