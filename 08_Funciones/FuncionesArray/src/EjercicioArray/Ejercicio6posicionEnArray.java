/*
 * 6. posicionEnArray: Busca un número en un array y devuelve la posición 
 * (el índice) en la que se encuentra.
 *
 * @autor: Alejandro Zambrana Naranjo
 */        
package EjercicioArray;

import funcionesarray.FuncionesArrayUnaDimension;

import java.util.Scanner;

public class Ejercicio6posicionEnArray {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int minimo = 0;
      
      System.out.print("Introduce la longitud del array: ");
       int longitud = Integer.parseInt(s.nextLine());
      System.out.print("Introduce por que numero quieres que empieze el array: ");
       int inicio = Integer.parseInt(s.nextLine());
      System.out.print("Introduce por que numero quieres que sea el maximo: ");
       int fin = Integer.parseInt(s.nextLine());
             
       int[] a = FuncionesArrayUnaDimension.generaArrayInt(longitud, inicio, fin);
      FuncionesArrayUnaDimension.muestraArrayInt(a);
      
      
      System.out.print("Introduce el numero que quieres saber la posicion: ");
       int comprueba = Integer.parseInt(s.nextLine());
       
       if (FuncionesArrayUnaDimension.posicionEnArray(a, comprueba) < 0){
          System.out.println("El numero introducido no esta en el array ");
       }else{
         System.out.println("El numero introducido esta en la posicion " + FuncionesArrayUnaDimension.posicionEnArray(a, comprueba));
       }
      
      
    }
}
