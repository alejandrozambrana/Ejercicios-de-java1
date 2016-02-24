/*
 * 7. volteaArrayInt: Le da la vuelta a un array.
 *
 * @autor: Alejandro Zambrana Naranjo
 */        
package EjercicioArray;

import funcionesarray.FuncionesArrayUnaDimension;

import java.util.Scanner;

public class Ejercicio7volteaArrayInt {
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
      
      System.out.println("Array volteado:");
      
      FuncionesArrayUnaDimension.volteaArrayInt(a);
      FuncionesArrayUnaDimension.muestraArrayInt(FuncionesArrayUnaDimension.volteaArrayInt(a));
      
    }
}
