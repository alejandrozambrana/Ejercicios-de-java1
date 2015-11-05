/**
 * Ejercicio 13 
 * Escribe un programa que simule la tirada de dos dados. El programa 
 * deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los 
 * dos dados tengan el mismo valor.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio13 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA LA TIRADA DE DOS DADOS HASTA QUE SALGA EL MISMO VALOR");
    
    int dados1 = 0;
    int dados2 = 0;
    
    do{
      dados1 = (int)(Math.random()*6) + 1;
      dados2 = (int)(Math.random()*6) + 1;
      System.out.println("El numero del dado 1 es: " + dados1);
      System.out.println("El numero del dado 2 es: " + dados2);
    }while (dados1 != dados2);
  }
}
