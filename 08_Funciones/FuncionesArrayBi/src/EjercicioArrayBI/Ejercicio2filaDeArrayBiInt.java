/*
 * 2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
 *
 *@author Alejandro Zambrana Naranjo
 *
 */        
package EjercicioArrayBI;

import funcionesarraybi.FuncionesArrayBi;


import java.util.Scanner;

public class Ejercicio2filaDeArrayBiInt {
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
       
      int a[][] = FuncionesArrayBi.generaArrayBiInt(columnas, filas, inicio, fin);
      FuncionesArrayBi.muestraArrayBiInt(a);
       
      System.out.print("Que fila quieres extraer: ");
        int extraer = Integer.parseInt(s.nextLine());
        
      FuncionesArrayBi.filaDeArrayBiInt(a, extraer);
      FuncionesArrayBi.muestraArrayInt(FuncionesArrayBi.filaDeArrayBiInt(a, extraer));
      
    }
}
