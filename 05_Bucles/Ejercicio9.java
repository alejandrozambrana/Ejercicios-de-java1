/**
 * Ejercicio 9 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio9{
  public static void main(String[] args) {
    
    
    System.out.println("MUESTRA CUANTOS DIGITOS TIENE EL NUMERO INTRODUCIDO");
      
    System.out.print("Introduzca un numero entero: ");
    int numero = Math.abs(Integer.parseInt(System.console().readLine()));
        
    int digitos = 1;
    int n = numero;
    
    while (n > 9) {
      n = n/10;
      digitos++;
      }
     
      System.out.println(numero + " tiene " + digitos + " digitos ");
    }
  }


