/**
 * 
 * Ejercicio 1
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también 
 * la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio1 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA LA TIRADA DE TRES DADOS");

    int dados;
    int suma = 0; 
    
    for(int i = 1; i <= 3; i++){
      dados = (int)(Math.random()*6) + 1;
      System.out.print(dados + " ");
      suma = suma + dados;
    }
      
    System.out.println("La Suma de los tres dados es: " + suma);
    
  }
}
