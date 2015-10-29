/**
 * Ejercicio 29
 * Escribe un programa que muestre por pantalla todos los números enteros positivos 
 * menores a uno leído por teclado que no sean divisibles entre otro también leído 
 * de igual forma.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio29 {
  public static void main(String[] args) {
     
  System.out.println("ESTE PROGRAMA MUESTRA LOS NUMEROS ENTEROS DIVISIBLES ENTRE OTRO");

    System.out.print("Introduzca un número entero positivo (Grande): ");
    int numerog = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un número entero positivo (Pequeño): ");
    int numerop = Integer.parseInt(System.console().readLine());
    
    int suma = 0;
    int cuenta = 0;
    
    for (int i = 1; i < numerog; i++ ){
      if ((i % numerop) != 0){
        System.out.print(i + " ");
      }
    }
  }
}


