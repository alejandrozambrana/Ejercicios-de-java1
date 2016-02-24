/*
 * 3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se pasa como parámetro.
 *
 *@author Alejandro Zambrana Naranjo
 *
 */        
package EjercicioArrayBI;

import funcionesarraybi.FuncionesArrayBi;


import java.util.Scanner;

public class Ejercicio3columnaDeArrayBiInt {
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
       
      System.out.print("Que columna quieres extraer: ");
        int extraer = Integer.parseInt(s.nextLine());
        
      FuncionesArrayBi.muestraArrayInt(FuncionesArrayBi.columnaDeArrayBiInt(a, extraer));
      
    }
}
