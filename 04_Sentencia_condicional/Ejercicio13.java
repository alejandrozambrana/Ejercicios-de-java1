/**
 * EEjercicio 13 
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio13 {
  public static void main(String[] args) {
    
    System.out.println("ORDENAR NUMEROS");
    
    int aux;
        
    System.out.print("Introduce el primer numero: ");
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el segundo numero: ");
    int b = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el tercer numero: ");
    int c = Integer.parseInt(System.console().readLine());

    // ordenación de los dos primeros números
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    // ordenación de los dos últimos números
    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }
    
    // se vuelven a ordenar los dos primeros
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
    
    System.out.println("Los números ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
     }
    }

