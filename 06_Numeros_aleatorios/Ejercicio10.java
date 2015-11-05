/**
 * Ejercicio 10
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
 * El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno 
 * de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud 
 * aleatoria entre 1 y 40 caracteres.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio10 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA 10 LINEAS FORMADAS POR CARACTERES CON LONGITUD ALEATORIA");
    
    String caracteres = "";
    
    for (int i = 0; i < 10; i++){
       int numCaracter = (int)(Math.random()*6)+1;
        switch (numCaracter){
          case 1:
            caracteres = "*";
            break;
          case 2:
            caracteres = "-";
            break;
          case 3:
            caracteres = "=";
            break;
          case 4:
            caracteres = ".";
            break;
          case 5:
            caracteres = "|";
            break;
          case 6:
            caracteres = "@";
            break;
          default:
        }
        
      int longitud = (int)(Math.random()*40)+1;
      for(int x = 1; x < longitud;x++){
        System.out.print(caracteres);
      }
      
      System.out.println();
    }
  }
}
