
package Ejercicio3;

import java.util.Scanner;

public class ProbarColeccion {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Array de Disco
    Disco[] cd = new Disco[4];
    
    // Crea los discos
    for(int i = 0; i < cd.length; i++) {
      cd[i] = new Disco();
    }
    
    //Variables
    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    int duracionIntroducida;
    int posicionVacia;
    String codigoModificar;
    String opcionModificar;
    
    
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
        case 1: 
          System.out.println("\nCOLECCION");
          System.out.println("---------");
          for (Disco album : cd) {
            if (!album.getCodigo().equals("VACIO")) {
            System.out.print(album);
            }
          }
          break;

        case 2:
          posicionVacia = -1;
          do{
            posicionVacia++;
          } while (!((cd[posicionVacia].getCodigo()).equals("VACIO")));
         
          System.out.println("\nAñadir Disco");
          System.out.println("------------");
          
          System.out.print("Codigo: ");
          codigoIntroducido = s.next();
          cd[posicionVacia].setCodigo(codigoIntroducido);
          
          System.out.print("Autor: ");
          autorIntroducido = s.next();
          cd[posicionVacia].setAutor(autorIntroducido);
          
          System.out.print("Titulo: ");
          tituloIntroducido = s.next();
          cd[posicionVacia].setTitulo(tituloIntroducido);
          
          System.out.print("Genero: ");
          generoIntroducido = s.next();
          cd[posicionVacia].setGenero(generoIntroducido);
          
          System.out.print("Duracion: ");
          duracionIntroducida = s.nextInt();
          cd[posicionVacia].setDuracion(duracionIntroducida);
          System.out.println();
          break;

        case 3:
          System.out.println("\nModificar Disco");
          System.out.println("---------------");
          System.out.println("Introduce el codigo del disco que quiere modificar: ");
          codigoModificar = s.next();
          
          int i = -1;
          do{
            i++;
          } while (!((cd[i].getCodigo()).equals(codigoModificar)));
         
          System.out.println("¿Que quieres modificar? ");
          System.out.print("Codigo ");
          System.out.print("\nAutor ");
          System.out.print("\nTitulo ");
          System.out.print("\nGenero ");
          System.out.print("\nDuracion ");
          System.out.print("\nIntroduce una opcion: ");
          opcionModificar = s.next();
          if(opcionModificar.equals("codigo")){
            System.out.print("Introduce el nuevo Codigo: ");
            codigoIntroducido = s.next();
            cd[i].setCodigo(codigoIntroducido);
          }
          
          if(opcionModificar.equals("autor")){
            System.out.print("Introduce el nuevo Autor: ");
            autorIntroducido = s.next();
            cd[i].setAutor(autorIntroducido);
          }
          
          if(opcionModificar.equals("titulo")){
            System.out.print("Introduce el nuevo Titulo: ");
            tituloIntroducido = s.next();
            cd[i].setTitulo(tituloIntroducido);
          }
          
          if(opcionModificar.equals("genero")){
            System.out.print("Introduce el nuevo Genero: ");
            generoIntroducido = s.next();
            cd[i].setGenero(generoIntroducido);
          }
          
          if(opcionModificar.equals("duracion")){
            System.out.print("Introduce la nueva Duracion: ");
            duracionIntroducida = s.nextInt();
            cd[i].setDuracion(duracionIntroducida);
          }
          
          break;

        case 4:
          System.out.println("\nBorrar Disco");
          System.out.println("------------");
          
          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = s.next();

          i = -1;
          do {
            i++;
          } while (!((cd[i].getCodigo()).equals(codigoIntroducido)));
          
          cd[i].setCodigo("VACIO");
          System.out.println("CD borrado.");
          
          break;
        default:

      }
    } while (opcion != 5);
  }
  
}
