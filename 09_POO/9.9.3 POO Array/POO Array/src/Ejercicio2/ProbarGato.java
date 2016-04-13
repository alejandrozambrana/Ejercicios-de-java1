
package Ejercicio2;

import java.util.Scanner;

public class ProbarGato {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Gato[] gatito = new Gato[2];

    gatito[0] = new Gato("Garfield", Sexo.MACHO , 3 , "siames", "Marron");
    gatito[1] = new Gato("Pepe", Sexo.HERMAFRODITA , 5 , "angora" , "gris");
    
    System.out.println("Datos de los gatos");
    System.out.println("------------------");
    
    for(int i = 0; i < gatito.length; i++){
      System.out.println(gatito[i]);

    }
  }
  
}
