/*
 * 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
 *
 * @autor: Alejandro Zambrana Naranjo
 */        
package EjercicioArray;

import funcionesarray.FuncionesArrayUnaDimension;

import java.util.Scanner;

public class Ejercicio5estaEnArrayInt {
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
      
      System.out.print("Introduce el numero que quieres saber si esta en el array: ");
       int comprueba = Integer.parseInt(s.nextLine());
       
      if(FuncionesArrayUnaDimension.estaEnArrayInt(a, comprueba) == true) {
        System.out.println("El numero " + comprueba + " esta en el array");
      } else {
       System.out.println("El numero " + comprueba + " no esta en el array");
      }
      
    }
}
