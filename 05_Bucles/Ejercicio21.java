/**
 * Ejercicio 21 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 * negativo y nos diga cuantos números se han introducido, la media de los impares 
 * y el mayor de los pares. El número negativo sólo se utiliza para indicar el 
 * final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * @author Alejandro Zambrana Naranjo
 */
 
public class Ejercicio21 {
  public static void main(String[] args) {
     
    System.out.println("MUESTRA CUANTOS NUMEROS HAS INTRODUCIDO, LA MEDIA DE LOS IMPARES Y EL NUMERO MAYOR DE LOS PARES");
     
    int numeroIntroducido;
    int numeros = 0;
    int pares = 0;
    double impares = 0;
    int suma = 0;
      
    System.out.println("Introduzca numeros (para parar introduce un numero negativo) : ");
      
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros++;
      
      //media impares
      if ((numeroIntroducido % 2) == 1){
         suma = suma + numeroIntroducido;
         impares++;
      } else {
        //numero mayos pares
        if (numeroIntroducido > pares){
          pares = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);
    
    System.out.println("Ha introducido " + (numeros - 1) + " numeros"); 
    System.out.println("La media de los impares es: " + suma/impares); 
    System.out.println("El numero mayor de los pares es: " + pares);
    
     
  }
}


