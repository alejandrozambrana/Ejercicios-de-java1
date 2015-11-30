/**
 * 
 * Ejercicio 6 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
 * los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
 * 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 * posición 0. Finalmente, muestra el contenido del array.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio6 {

  public static void main(String[] args) {

    int[] numero = new int [15];
    
    System.out.println("ESTE PROGRAMA INTERCAMBIA POSICION EN EL ARRAY");

    for (int i = 0; i < 15; i++){
      System.out.print("Introduce el " + (i + 1) + " numero: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    for(int n = 1; n < numero.length; n++){
      System.out.print(numero[n] + " ");      
    }
    System.out.print(numero[0]);
  }
}
