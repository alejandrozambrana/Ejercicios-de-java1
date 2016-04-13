
package Ejercicio1;

import java.util.Scanner;

public class ProbarGato {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    String nombre;
    Sexo sexo = Sexo.HERMAFRODITA;
    String sex;
    int edad;
    String raza;
    
    Gato[] gatito = new Gato[3];
    
    for(int i = 0; i < gatito.length; i++){
      System.out.print("Introduce los datos del gato");
      System.out.print("\nNombre: ");
      nombre = s.next();
      System.out.print("Sexo: ");
      sex = s.next();
        if(sex.equals("macho")){
          sexo = Sexo.MACHO;
        }else if (sex.equals("hembra")){
          sexo = Sexo.HEMBRA;
        }else if (sex.equals("hermafrodita")){
          sexo = Sexo.HERMAFRODITA;
        }
      System.out.print("Edad: ");
      edad = s.nextInt();
      System.out.print("Raza: ");
      raza = s.next();
      gatito[i] = new Gato(nombre, sexo, edad, raza);
    }
    
    System.out.println("Datos de los gatos");
    System.out.println("------------------");
    
    for(int i = 0; i < gatito.length; i++){
      System.out.println(gatito[i]);

    }
  }
  
}
