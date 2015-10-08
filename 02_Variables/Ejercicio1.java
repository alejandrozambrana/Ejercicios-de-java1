/**
 * Ejercicio 1
 * Escribe un programa en el que se declaren las variables enteras x e y . 
 * Asignales los valores 144 y 999 respectivamente. A continuación, muestra 
 * por pantalla el valor de cada variable, la suma, la resta, la división y la 
 * multiplicación.
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio1 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;
    
    System.out.println("El valor de mis variables x es " + x);
    
    System.out.println("El valor de mis variables y es " + y);
    
    int sum = x + y;
    System.out.println("La suma de mis variables es " + sum);
    
    int res = x - y;
    System.out.println("La resta de mis variables es " + res);
    
    int divi = x / y;
    System.out.println("La division de mis variables es " + divi);
    
    int mul = x * y;
    System.out.println("La multiplicación de mis variables es " + mul);   
  }
}
