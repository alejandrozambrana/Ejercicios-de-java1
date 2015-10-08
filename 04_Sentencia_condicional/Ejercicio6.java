/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto 
 * desde una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio6 {
  public static void main(String[] args) {
    System.out.println("Calcula el tiempo que tarda en caer un objento desde una altura ");
    System.out.print("Introduce el valor h: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double tiempo = Math.sqrt ((2*h)/9.81);
    
    System.out.println("El tiempo que tarda en caer seria " + tiempo);
    }
  }

