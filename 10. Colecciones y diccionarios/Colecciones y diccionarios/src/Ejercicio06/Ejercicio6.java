/*
* Ejercicio 6
* Implementa el control de acceso al área restringida de un programa. Se debe
* pedir un nombre de usuario y una contraseña. Si el usuario introduce los
* datos correctamente, el programa dirá “Ha accedido al área restringida”. El
* usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
* el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
* de usuario con sus correspondientes contraseñas deben estar almacenados
* en una estructura de la clase HashMap .
*/
package Ejercicio06;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Crea el diccionario
    HashMap <String, String> acceso = new HashMap <String, String>();
    
    acceso.put("Francis", "quillo");
    acceso.put("lola", "mento");
    acceso.put("enrique", "cido");
    
    String usuario;
    String contraseña;
    int intentos = 3;
    do{
      System.out.print("Introduce el usuario: ");
      usuario = s.nextLine();

      System.out.print("Introduce la contraseña: ");
      contraseña = s.nextLine();
    
      if(acceso.containsKey(usuario) == true){
        if(acceso.get(usuario).equals(contraseña)){
          System.out.println("Ha accedido al área restringida");
          intentos = 0;
        } else {
          System.out.println("Contraseña incorrecta");
          intentos--;
          System.out.println("Le quedan " + intentos + " intentos");
        }
      }else{
        System.out.println("El usuario no existe");
        intentos--;
        System.out.println("Le quedan " + intentos + " intentos");
      }
    } while (intentos > 0);
    
  }
  
}
