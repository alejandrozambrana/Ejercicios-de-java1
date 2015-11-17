/**
 * 
 * Ejercicio 5
 * Escribe un programa que pida 10 números por teclado y que luego muestre los 
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del 
 * máximo y del mínimo respectivamente.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio5 {

  public static void main(String[] args) {

    int[] numero = new int [10];
    int numMax = Integer.MIN_VALUE;
    int numMin = Integer.MAX_VALUE;
    
    System.out.println("ESTE PROGRAMA MUESTRA EL NUMERO MAXIMO Y MINIMO Introducido");

    for (int i = 0; i < 10; i++){
      System.out.print("Introduce el " + (i + 1) + " numero: ");
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if(numero[i] > numMax){
        numMax = numero[i];
      }
      
      if(numero[i] < numMin){
        numMin = numero[i];
      }
    
    }
    for(int n : numero){
      System.out.print(n + " ");      
    }
    System.out.println();
    System.out.println("Numero Maximo: " + numMax);
    System.out.println("Numero Minimo: " + numMin);
  }
}
