/**
 * Ejercicio 9 
 * Escribe un programa que calcule el volumen de un cono según la
 * fórmula V = 1/3 πr*2 h
 *
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio9 {
  public static void main(String[] args) {
    
    System.out.println("Volumen de un cono");
    System.out.print("Introduzca el radio (cm): ");
    double radio = Double.parseDouble( System.console().readLine());
    
    System.out.print("Introduzca la altura (cm): ");
    double altura = Double.parseDouble( System.console().readLine());
    
    double total = (1.0/3.0) * Math.PI * radio * radio * altura;

      System.out.println("El volumen del cono es: " + total + " cm3");
  }
}
