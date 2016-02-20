package Ejercicios;

/**
 * 
 * Ejercicio 17 Escribe un programa que pase de binario a decimal.
 * 
 * @author Alejandro Zambrana Naranjo
 */
import Funciones.Calculos;
 
import java.util.Scanner;
 
public class Ejercicio17binarioDecimal {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numero = 0;
    
    System.out.print("introduzca un numero en binario: ");
    long binario = Long.parseLong(s.nextLine());
    
    int longitud = (Funciones.Calculos.digitos((int)binario));
    
    for(int i = 0; i < longitud; i++) {
      numero += Funciones.Calculos.potencia(2,i) * Funciones.Calculos.digitoN(binario, longitud - i - 1);
    }
    
    System.out.println("El numero en decimal es " + numero);
    
  }
}