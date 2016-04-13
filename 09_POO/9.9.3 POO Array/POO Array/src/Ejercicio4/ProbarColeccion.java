
package Ejercicio4;

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
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String codigoModificar;
    String opcionModificar;
    int opcion;
    int duracionIntroducida;
    int posicionVacia;
    int contador = 0;
    int opcionListado = 0;
    int limiteInferior;
    int limiteSuperior;
    boolean codigoExiste = true;
    
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
          do{
            System.out.println("\nCOLECCION");
            System.out.println("---------");
            System.out.println("1. Completo");
            System.out.println("2. Por autor");
            System.out.println("3. Por genero");
            System.out.println("4. En un rango de duracion");
            System.out.println("5. Menu principal");
            System.out.print("Introduzca una opcion: ");
            opcionListado = s.nextInt();    
            
            switch (opcionListado) {
            //listado Completo
            case 1:
              System.out.println("\nLISTADO");
              System.out.println("-------");
              for (Disco album : cd) {
                if (!album.getCodigo().equals("VACIO")) {
                System.out.print(album);
                }
              }
              break;
            //ordenar por autor
            case 2:
              System.out.print("Introduzca el autor: ");
              autorIntroducido = s.next();
                
              for (Disco album : cd) {
                if ( (!album.getCodigo().equals("VACIO")) && (album.getAutor().equals(autorIntroducido)) ){
                  System.out.print(album);
                }
              }
              break;
              //ordenar por genero
            case 3:
              System.out.print("Introduzca el genero: ");
              generoIntroducido = s.next();
             
              for (Disco album : cd) {
                if ((!album.getCodigo().equals("VACIO")) && (album.getGenero().equals(generoIntroducido)) ){
                  System.out.print(album);
                }
              }
              break;
              //ordenar por duracion
            case 4 :
              System.out.println("Establezca el intervalo para la duracion");
              System.out.print("Introduzca el limite inferior de duracion en minutos: ");
              limiteInferior = s.nextInt();
              System.out.print("Introduzca el limite superior de duracion en minutos: ");
              limiteSuperior = s.nextInt();
              
              for (Disco album : cd) {
                if ( (!album.getCodigo().equals("VACIO")) && (album.getDuracion() <= limiteSuperior) && (album.getDuracion() >= limiteInferior) ){
                  System.out.print(album);
                }
              }
            }
          } while (opcionListado != 5);
          break;
        //añadir disco
        case 2:
          posicionVacia = -1;
          do{
            posicionVacia++;
          } while (!((cd[posicionVacia].getCodigo()).equals("VACIO")));
          //pone un limite de cds
          if(contador < 3){
            contador++;
            System.out.println("\nAñadir Disco");
            System.out.println("------------");
            //comprueba que el codigo no se repita
            codigoExiste = true;
            do{
              codigoExiste = false;
              System.out.print("Codigo: ");
              codigoIntroducido = s.next();
              for(int j = 0; j < cd.length; j++){
                if((cd[j].getCodigo()).equals(codigoIntroducido)){
                  System.out.println("Debe introducir otro codigo ese ya existe.");
                  codigoExiste = true;
                } 
              }
            } while (codigoExiste);
              
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
          } else{
            System.out.println("No caben mas disco borra alguno");
          }
          break;
        //Modificar disco
        case 3:
          System.out.println("\nModificar Disco");
          System.out.println("---------------");
          System.out.println("Introduze el codigo del disco que quiere modificar: ");
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
          System.out.print("\nIntroduze una opcion: ");
          opcionModificar = s.next();
          if(opcionModificar.equals("codigo")){
            System.out.print("Introduze el nuevo Codigo: ");
            codigoIntroducido = s.next();
            cd[i].setCodigo(codigoIntroducido);
          }
          
          if(opcionModificar.equals("autor")){
            System.out.print("Introduze el nuevo Autor: ");
            autorIntroducido = s.next();
            cd[i].setAutor(autorIntroducido);
          }
          
          if(opcionModificar.equals("titulo")){
            System.out.print("Introduze el nuevo Titulo: ");
            tituloIntroducido = s.next();
            cd[i].setTitulo(tituloIntroducido);
          }
          
          if(opcionModificar.equals("genero")){
            System.out.print("Introduze el nuevo Genero: ");
            generoIntroducido = s.next();
            cd[i].setGenero(generoIntroducido);
          }
          
          if(opcionModificar.equals("duracion")){
            System.out.print("Introduze la nueva Duracion: ");
            duracionIntroducida = s.nextInt();
            cd[i].setDuracion(duracionIntroducida);
          }
          
          break;
        //Borrar disco
        case 4:
          System.out.println("\nBorrar Disco");
          System.out.println("------------");
          
          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = s.next();
             
          for(int j = 0; j < cd.length; j++){
            if(!((cd[j].getCodigo()).equals(codigoIntroducido))){
              System.out.print("El codigo introduzido no existe. ");
              break;
            } else {
            i = -1;
            do {
              i++;
            } while (!((cd[i].getCodigo()).equals(codigoIntroducido)));
          
            cd[i].setCodigo("VACIO");
            System.out.println("CD borrado.");
            contador--;
            }
          }
          break;
        default:

      }
    } while (opcion != 5);
  }
  
}
