/**
 * Ejercicio 12
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) 
 * con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para 
 * convertir un entero en un carácter.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio12 {

	public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA MUESTRA NOTAS AL AZAR");
      
      
      for(int i = 0; i == 0;){
        char caracter =(char)((int)((Math.random()*95)+32));
        System.out.print("\033[32m" +caracter + "\t");
    }
  }
}
