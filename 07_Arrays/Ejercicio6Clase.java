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
public class Ejercicio6Clase {

  public static void main(String[] args) {

    int[] numero = new int [15];
    
    System.out.println("ESTE PROGRAMA INTERCAMBIA POSICION EN EL ARRAY");

    //pide 15 numeros y los almacena en el array
    for (int i = 0; i < 15; i++){
      System.out.print("Introduce el " + (i + 1) + " numero: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    //Cambiar numeros de posicion en el array
    int ultimo = numero[14];
    for(int i = 14; i > 0; i--){
      numero[i]= numero[i - 1];
    }
    //pinta el ultimo numero en la posicion 0
    numero[0] = ultimo;
    //Muestra los 15 numeros
    for(int n = 0; n < 15; n++){
      System.out.print(numero[n] + " ");      
    }
  }
}
