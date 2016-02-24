/*
 * 1. generaArrayBiInt: Genera un array de tamaño n x m con números 
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 *
 *@author Alejandro Zambrana Naranjo
 *
 */        
package EjercicioArrayBI;

import funcionesarraybi.FuncionesArrayBi;

import java.util.Scanner;

public class Ejercicio1generaArrayInt {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.print("Introduce numero de columnas: ");
       int columnas = Integer.parseInt(s.nextLine());
      System.out.print("Introduce numero de filas: ");
       int filas = Integer.parseInt(s.nextLine());
      System.out.print("Introduce por que numero quieres que empieze el array: ");
       int inicio = Integer.parseInt(s.nextLine());
      System.out.print("Introduce por que numero quieres que sea el maximo: ");
       int fin = Integer.parseInt(s.nextLine());
       
      int a[][] = funcionesarraybi.FuncionesArrayBi.generaArrayBiInt(columnas, filas, inicio, fin);
      funcionesarraybi.FuncionesArrayBi.muestraArrayBiInt(a);
       
      
    }
}
