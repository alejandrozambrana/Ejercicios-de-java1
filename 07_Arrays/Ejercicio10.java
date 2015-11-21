/**
 * 
 * Ejercicio 10
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 * almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
 * primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
 * restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio10 {

  public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA ALMACENA NUMEROS PARES AL PRINCIPIO DE UN ARRAY Y IMPARES AL FINAL");
    
    int[] aleatorio = new int[20];
    int[] par = new int[20]; 
    int[] impar = new int[20]; 
    int pares = 0;
    int impares = 0;
    int i;
    
    //genera numeros alearotios y los guarda en un array y muestra el array original
    System.out.println("Array original:");
    for(i = 0; i < 20; i++) {
      aleatorio[i] = (int)(Math.random()*101);
      System.out.print(aleatorio[i] + " " ); 
      //mete los numeros pares en un array de pares y los impares en un array de impares
      if (aleatorio[i] % 2 == 0) {
        par[pares++] = aleatorio[i];
      } else {
        impar[impares++] = aleatorio[i];
      }
    }
    System.out.println();
    
    //Pone los pares primeros
    for (i = 0; i < pares; i++){
      aleatorio[i] = par[i];
    }
    
    //meter los impares luego
    for (i = pares; i < 20; i++) {
      aleatorio[i] = impar[i - pares];
    }
    
    System.out.println("Array Con pares primeros y impares despues:");
    for (i = 0; i < 20; i++) {
      System.out.print(aleatorio[i] + " ");
    }
  }
}
