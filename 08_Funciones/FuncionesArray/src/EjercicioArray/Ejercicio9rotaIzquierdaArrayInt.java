/*
 * 8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
 *
 * @autor: Alejandro Zambrana Naranjo
 */        
package EjercicioArray;

import funcionesarray.FuncionesArrayUnaDimension;

import java.util.Scanner;

public class Ejercicio9rotaIzquierdaArrayInt {
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
      
      System.out.print("Numero de posiciones que quieres rotar el array: ");
       int posiciones = Integer.parseInt(s.nextLine());
      
      System.out.println("Array rotado a la izquierda:");
      
      FuncionesArrayUnaDimension.rotaDerechaArrayInt(a, posiciones );
      FuncionesArrayUnaDimension.muestraArrayInt(FuncionesArrayUnaDimension.rotaIzquierdaArrayInt(a, posiciones));
      
    }
}
