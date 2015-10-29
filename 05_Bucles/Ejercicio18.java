/**
 * Ejercicio 18
 * Escribe un programa que obtenga los números enteros comprendidos entre dos 
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio18 {
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA OBTIENE LOS NUMEROS ENTEROS COMPRENDIDOS ENTRE DOS NUMEROS");
    
    int numero1;
    int numero2;

    //se poden dos numeros y se valida que sean distintos 
    do {
      System.out.print("Introduzca un numero entero : ");
      numero1 = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el otro numero entero : ");
      numero2 = Integer.parseInt(System.console().readLine());
     
      if (numero1 == numero2){
        System.out.println("El numero introducido no es correcto.");
      }
    } while (numero1 == numero2);
      
    // si el primer número es mayor que el segundo, se intercambian los valores
    if (numero1 > numero2) {
      int aux = numero1;
      numero1 = numero2;
      numero2 = aux; 
    }
      
    for (int i = numero1; i <= numero2; i = i + 7) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}


