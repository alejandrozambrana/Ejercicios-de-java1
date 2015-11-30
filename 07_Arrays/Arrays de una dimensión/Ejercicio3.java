/**
 * 
 * EEjercicio 3 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre 
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio3 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA UN ARRAYS INVERSO DE 10 NUMEROS");

    int[] num = new int [10];
    
    for(int i = 0; i < 10; i++ ){
      System.out.print("Introduzca el numero " + (i + 1) + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int n = 9; n >= 0; n--){
      System.out.print(num[n] + " ");
    }
  }
}
