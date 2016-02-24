/*
 * 5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, 
 * mínimo en su fila y máximo en su columna.
 *
 *@author Alejandro Zambrana Naranjo
 *
 */        
package EjercicioArrayBI;

import funcionesarraybi.FuncionesArrayBi;


import java.util.Scanner;

public class Ejercicio5esPuntoDeSilla {
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
      
      for(int i = 0; i <  a.length; i++) {
        for(int j = 0; j <  a[0].length; j++) {
          if(FuncionesArrayBi.esPuntoDeSilla(a)){
            System.out.println("fila " + i + ", columna " + j + " -> "  + a[i][j]);
          }
        }
      }
    }
}
