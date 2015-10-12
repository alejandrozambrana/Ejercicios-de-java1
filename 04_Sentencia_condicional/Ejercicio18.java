/**
 * Ejercicio 18 
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio18 {
  public static void main(String[] args) {
    
    int primera = 0; 
    
    System.out.println("PRIMERA CIFRAS DE UN NUMERO");
        
    System.out.print("Introduce un numero entero con no mas de 5 cifras: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero < 10 ) {
     primera = numero;
     System.out.println("La primera cifra del numero  es " + primera);
    }
    if ((numero >= 10 ) && (numero < 100)) {
     primera = numero / 10;
     System.out.println("La primera cifra del numero  es " + primera);
    }
    if ((numero >= 100 ) && (numero < 1000)) {
     primera = numero / 100;
     System.out.println("La primera cifra del numero  es " + primera);
    }
    if ((numero >= 1000 ) && (numero < 10000)) {
     primera = numero / 1000;
     System.out.println("La primera cifra del numero  es " + primera);
    }
    if ((numero >= 10000 ) && (numero < 100000)) {
     primera = numero / 10000;
     System.out.println("La primera cifra del numero  es " + primera);
    } 
    if (numero > 99999) {
    System.out.println("El numero introducido no es valido ");
    }
  }
}
