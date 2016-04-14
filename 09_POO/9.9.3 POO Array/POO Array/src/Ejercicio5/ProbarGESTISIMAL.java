
package Ejercicio5;

import java.util.Scanner;

public class ProbarGESTISIMAL {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Array de objeto
    Articulo[] articulo = new Articulo[4]; 
    
    // Crea los articulos
    for(int i = 0; i < articulo.length; i++) {
      articulo[i] = new Articulo();
    }
    
    String codigoIntroducido;
    String descripcionIntroducida;
    String modificarCodigo;
    int precioCompraIntroducido;
    int precioVentaIntroducido;
    int stockIntroducido;
    int opcion;
    int opcionModificar;
    int posicionVacia;
    int contador = 0;
    int anadirMercancia;
    int quitarMercancia;
    boolean codigoExiste;
    
    do{
      System.out.println("GESTION SIMPLIFICADA DE ALMACEN");
      System.out.println("-------------------------------");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Seleccione una opcion: ");
      opcion = s.nextInt();
      
      switch (opcion) {
        //muestra articulos
        case 1: 
          System.out.println("\nLISTADO");
          System.out.println("-------");
          for (Articulo art : articulo) {
            if (!((art.getCodigo()).equals("VACIO"))) {
              System.out.println(art);
            }
          }
          break;
          //añade articulos
        case 2: 
          posicionVacia = -1;
          do{
            posicionVacia++;
          } while (!((articulo[posicionVacia].getCodigo()).equals("VACIO")));
          
          //pone un limite de cds
          if(contador < 3){
            contador++;
          System.out.println("\nAñadir Articulo");
          System.out.println("-----------------");
          
          //comprueba que el codigo no se repita
           codigoExiste = true;
           do{
             codigoExiste = false;
             System.out.print("Codigo: ");
             codigoIntroducido = s.next();
             for(int j = 0; j < articulo.length; j++){
               if((articulo[j].getCodigo()).equals(codigoIntroducido)){
                 System.out.println("Debe introducir otro codigo ese ya existe.");
                 codigoExiste = true;
               } 
             }
           } while (codigoExiste);
        
          articulo[posicionVacia].setCodigo(codigoIntroducido);
          
          System.out.print("Descripcion: ");
          descripcionIntroducida = s.nextLine();
          descripcionIntroducida = s.nextLine();
          articulo[posicionVacia].setDescripcion(descripcionIntroducida);
          
          System.out.print("Precio de Compra: ");
          precioCompraIntroducido = s.nextInt();
          articulo[posicionVacia].setPrecioCompra(precioCompraIntroducido);
          
          System.out.print("Precio de Venta: ");
          precioVentaIntroducido = s.nextInt();
          articulo[posicionVacia].setPrecioVenta(precioVentaIntroducido);
          
          System.out.print("Stock: ");
          stockIntroducido = s.nextInt();
          articulo[posicionVacia].setStock(stockIntroducido);
          
          }else {
            System.out.println("No caben mas articulos. Almacen lleno");
          }
          break;
          //borrar Articulo
        case 3: 
          
          System.out.println("\nBORRAR ARTICULO");
          System.out.println("-----------------");
          
          System.out.print("¿Que articulo quieres dar de baja? Introduce el codigo:");
          codigoIntroducido = s.next();
          
          for(int i = 0; i < articulo.length; i++){
            if((articulo[i].getCodigo()).equals(codigoIntroducido)){
              articulo[i].setCodigo("VACIO");
            }
          }          
          
          System.out.println("Articulo dado de baja.");
          
          contador--;
          break;
          //modifica Articulo
        case 4: 
          System.out.println("\nMODIFICAR ARTICULO");
          System.out.println("--------------------");
          System.out.println("Introduce el codigo del disco que quiere modificar: ");
          modificarCodigo = s.next();
          
          int i = -1;
          do{
            i++;
          } while (!((articulo[i].getCodigo()).equals(modificarCodigo)));
          
          System.out.println("¿Que quieres modificar? ");
          System.out.print("1. Codigo ");
          System.out.print("\n2. Descripcion ");
          System.out.print("\n3. Precio de Compra ");
          System.out.print("\n4. Precio de Venta ");
          System.out.print("\n5. Stock ");
          System.out.print("\nIntroduce una opcion: ");
          opcionModificar = s.nextInt();
          
          switch(opcionModificar){
              case 1:
                System.out.print("Introduce el nuevo codigo: ");
                  codigoIntroducido = s.next();
                  articulo[i].setCodigo(codigoIntroducido);
                  System.out.println("Se ha modificado correctamente");
                break;
                
              case 2:
                System.out.print("Introduce una descripcion nueva: ");
                  descripcionIntroducida = s.next();
                  articulo[i].setDescripcion(descripcionIntroducida);
                  System.out.println("Se ha modificado correctamente");
                break;
                        
              case 3:
                System.out.print("Introduce el nuevo precio de compra ");
                  precioCompraIntroducido = s.nextInt();
                  articulo[i].setPrecioCompra(precioCompraIntroducido);
                  System.out.println("Se ha modificado correctamente");
                break;
                        
              case 4:
                System.out.print("Introduce el nuevo precio de venta ");
                  precioVentaIntroducido = s.nextInt();
                  articulo[i].setPrecioVenta(precioVentaIntroducido);
                  System.out.println("Se ha modificado correctamente");
                break;
                           
              case 5:
                System.out.print("Introduce el stock ");
                  stockIntroducido = s.nextInt();
                  articulo[i].setStock(stockIntroducido);
                  System.out.println("Se ha modificado correctamente");
                break;
          }
          
          break;
          //Añadir mercancia
        case 5: 
          System.out.println("\nENTRADA DE MERCANCIA");
          System.out.println("----------------------");
          
          System.out.print("Introduce el codigo del articulo al que le quieres añadir mercancia: ");
          codigoIntroducido = s.next();
          
          for(int j = 0; j < articulo.length; j++){
            if(articulo[j].getCodigo().equals(codigoIntroducido)){
              System.out.print("¿Cuanta mercancia entra?:");
              anadirMercancia = s.nextInt();
              articulo[j].setStock(articulo[j].getStock() + anadirMercancia);
              System.out.println("Se ha añadido " + anadirMercancia + " articulos mas.");
            }
          }
          break;
          //salida mercancia
        case 6: 
          System.out.println("\nSALIDA DE MERCANCIA");
          System.out.println("----------------------");
          
          System.out.print("Introduce el codigo del articulo que va a salir: ");
          codigoIntroducido = s.next();
          
          for(int j = 0; j < articulo.length; j++){
            if(articulo[j].getCodigo().equals(codigoIntroducido)){
              System.out.print("¿Cuanta mercancia sale?:");
              quitarMercancia = s.nextInt();
                           
              if((articulo[j].getStock() - quitarMercancia) > 0){
                articulo[j].setStock(articulo[j].getStock() - quitarMercancia);
                System.out.println("han salido " + quitarMercancia + " articulos.");
              }
              if((articulo[j].getStock() - quitarMercancia)< 0){
                System.out.println("El stock no puede ser menos de 0");
              }
            }
          }
          break;
        case 7:
          System.out.println("Hasta luego bacalao");
          break;
        default:   
      }
    }while(opcion != 7);
  }
  
}
