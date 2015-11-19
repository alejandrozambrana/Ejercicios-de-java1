/**
 * 
 * Ejercicio 1 
 * Define un array de 12 números enteros con nombre num y asigna los valores 
 * según la tabla que se muestra a continuación. Muestra el contenido de todos 
 * los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio1 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA UN ARRAYS DE 12 NUMEROS");

    int[] num = new int [12];
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    //Recorre el array Sirve para mostrar los valores del array
    for (int n : num){
    System.out.print(n + "|");
    }
  }
}
