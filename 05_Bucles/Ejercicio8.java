/**
 * Ejercicio 8
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println("MUESTRA LA TABLA DE MULTIPLICAR");
      
    System.out.print("Introduzca que tabla de multiplicar quieres ver: ");
    int tabla = Integer.parseInt(System.console().readLine());
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(tabla + " x " + i + " = " + (tabla * i));
      // otra manera System.out.println("%6d x %2d = %6d\n", tabla, i,(tabla * i));
    }
  }
}

