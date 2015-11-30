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
public class Ejercicio10sinaux {

  public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA ALMACENA NUMEROS PARES AL PRINCIPIO DE UN ARRAY Y IMPARES AL FINAL");
    
    int[] numeros;
    numeros = new int[20];
    int numImpares = 19;
    int indice=0;
    int aux=0;
    int aux2=0;
    
    System.out.print("Array original ");
    for (int i=0; i<numeros.length;i++){
      numeros[i] = (int)(Math.random()*101);
      System.out.print(numeros[i]+" ");
    }
    
    do{
      if (numeros[indice] % 2 == 0){
        indice++;
      }else{
        aux = numeros[indice];
        aux2 = numeros[numImpares];
        numeros[indice] w= aux2;
        numeros[numImpares] = aux;
        numImpares--;
      }
    }while(indice!=numImpares);
    
    System.out.println();
    System.out.print("Array cambiado ");
    for (int i=0; i<20; i++){
      System.out.print(numeros[i]+" ");
    }
  }
}
