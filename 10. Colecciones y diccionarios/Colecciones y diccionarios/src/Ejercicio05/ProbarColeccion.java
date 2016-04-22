/*
* Ejercicio 5
* Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
* una lista para almacenar la información sobre los discos en lugar de un array
* convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
* ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
* programa hecho con una lista?
*/
package Ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProbarColeccion {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //crea el array
    ArrayList <Disco> cd = new ArrayList <Disco>();
    
    //Variables
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int opcion;
    int duracionIntroducida;
    
    do{
      System.out.println("\nCOLECCION DE DISCOS");
      System.out.println("--------------------");
      System.out.println("1. Ver la coleccion");
      System.out.println("2. Añadir disco");
      System.out.println("3. Modificar disco");
      System.out.println("4. Borrar disco");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opcion: ");
      opcion = s.nextInt();

      switch (opcion) {
        //ver coleccion
        case 1:
           System.out.println("\nLISTADO");
           System.out.println("--------- ");
           
          for(Disco disk : cd){
            System.out.println("" + disk + " ");
          }
          
          System.out.print("---------\n ");
          
          break;
          
        //añadir disco
        case 2:
            System.out.println("\nAñadir Disco");
            System.out.println("------------");
            
            System.out.print("Codigo: ");
            codigoIntroducido = s.next();
            
            while (cd.contains(new Disco(codigoIntroducido, "", "", "", 0))){
              System.out.print("El codigo introducido ya existe. \nIntroduzca otro codigo: ");
              codigoIntroducido = s.next();
            }
            
            System.out.print("Autor: ");
            autorIntroducido = s.next();

            System.out.print("Titulo: ");
            tituloIntroducido = s.next();
            
            System.out.print("Genero: ");
            generoIntroducido = s.next();
            
            System.out.print("Duracion: ");
            duracionIntroducida = s.nextInt();
            System.out.println();
            
            // Crea los discos
            cd.add(new Disco( codigoIntroducido, autorIntroducido, 
                    tituloIntroducido, generoIntroducido, duracionIntroducida));
          break;
        //Modificar disco
       case 3:
          System.out.println("\nModificar Disco");
          System.out.println("---------------");
          System.out.print("Introduce el codigo del disco que quiere modificar: ");
          codigoIntroducido = s.next();
          
          int posicion;
          
          while (!cd.contains(new Disco(codigoIntroducido, "", "", "", 0))){
              System.out.print("El codigo introducido no existe. \nIntroduzca otro codigo: ");
              codigoIntroducido = s.next();
            }
          
          posicion = cd.indexOf(new Disco(codigoIntroducido, "", "", "", 0));
          
          System.out.println("Introduzca los nuevos datos del disco o pulsa INTRO si no quieres modificar.");
          
          System.out.print("Introduce el nuevo Codigo: [" + cd.get(posicion).getCodigo() + "] ");
          codigoIntroducido = s.nextLine();
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
            cd.get(posicion).setCodigo(codigoIntroducido);
          }


          System.out.print("Introduce el nuevo Autor: [" + cd.get(posicion).getAutor() + "] ");
          autorIntroducido = s.nextLine();
          if (!autorIntroducido.equals("")) {
            cd.get(posicion).setAutor(autorIntroducido);
          }


          System.out.print("Introduce el nuevo Titulo: [" + cd.get(posicion).getTitulo() + "] ");
          tituloIntroducido = s.nextLine();
          if (!tituloIntroducido.equals("")) {
            cd.get(posicion).setTitulo(tituloIntroducido);
          }


          System.out.print("Introduce el nuevo Genero: [" + cd.get(posicion).getGenero() + "] ");
          generoIntroducido = s.nextLine();
          if (!generoIntroducido.equals("")) {
            cd.get(posicion).setGenero(generoIntroducido);
          }


          System.out.print("La duracion es: [" + cd.get(posicion).getDuracion() + "] ");
          System.out.println("¿Quieres modificar la duracion? s/n: ");
          String modificar = s.nextLine();
          if(modificar.equalsIgnoreCase("s")){
            System.out.println("Introduce la nueva duracion: ");
            duracionIntroducida = s.nextInt();
            cd.get(posicion).setDuracion(duracionIntroducida);
          }
          
          
          
          break;
        //Borrar disco
        case 4:
          System.out.println("\nBorrar Disco");
          System.out.println("------------");
          
          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = s.next();
          
          if(!cd.contains(new Disco(codigoIntroducido,"", "", "", 0))){
            System.out.println("Lo siento, el codigo introducido no existe.");
          } else {
            cd.remove(cd.indexOf(new Disco(codigoIntroducido,"", "", "", 0)));
            System.out.println("El album borrado");
          }
         
          break;
        default:
      }
    } while (opcion != 5);
  }
  
}
