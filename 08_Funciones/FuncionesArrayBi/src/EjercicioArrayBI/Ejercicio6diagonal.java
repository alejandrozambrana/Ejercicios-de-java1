/*
 * 6. diagonal: Devuelve un array que contiene una de las diagonales del
 * array bidimensional que se pasa como parámetro. Se pasan como
 * parámetros fila, columna y dirección. La fila y la columna determinan
 * el número que marcará las dos posibles diagonales dentro del array. La
 * dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
 * cadena “nose” indica que se elige la diagonal que va del noroeste hacia
 * el sureste, mientras que la cadena “neso” indica que se elige la diagonal
 * que va del noreste hacia el suroeste.
 *
 *@author Alejandro Zambrana Naranjo
 *
 */        
package EjercicioArrayBI;

import funcionesarraybi.FuncionesArrayBi;


import java.util.Scanner;

public class Ejercicio6diagonal {
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
      
    System.out.print("\nFila: ");
      int fila = Integer.parseInt(s.nextLine());
    System.out.print("Columna: ");
      int columna = Integer.parseInt(s.nextLine());
    System.out.print("DirecciÃ³n (nose/neso): ");
      String direccion = s.nextLine();
    System.out.print("\nDiagonal: ");
    FuncionesArrayBi.diagonal(a, fila, columna, direccion);
    FuncionesArrayBi.muestraArrayInt(FuncionesArrayBi.diagonal(a, fila, columna, direccion));
    }
}
