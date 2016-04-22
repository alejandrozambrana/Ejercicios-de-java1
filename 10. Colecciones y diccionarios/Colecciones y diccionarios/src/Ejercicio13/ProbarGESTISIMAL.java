/**
 * Ejercicio 13
 * Modifica el programa Gestisimal realizado anteriormente añadiendo las
 * siguientes mejoras:
 *  • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
 *  • Comprueba la existencia del código en el alta, la baja y la modificación
 *    de artículos para evitar errores.
 *  • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción
 *    permitirá hacer una venta de varios artículos y emitir la factura correspondiente.
 *    Se debe preguntar por los códigos y las cantidades de cada
 *    artículo que se quiere comprar. Aplica un 21% de IVA.
 */
package Ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class ProbarGESTISIMAL {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Array de objeto
    ArrayList <Articulo> articulo = new ArrayList<Articulo>();
    
    ArrayList <String> venta = new ArrayList<String>();
   
    String codigoIntroducido;
    String descripcionIntroducida;
    String modificarCodigo;
    int cantidad;
    int precioCompraIntroducido;
    int precioVentaIntroducido;
    int stockIntroducido;
    int opcion;
    int opcionModificar;
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
      System.out.println("6. Venta de mercancía");
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
          System.out.println("\nAñadir Articulo");
          System.out.println("-----------------");
          
          //comprueba que el codigo no se repita
           codigoExiste = true;
           do{
             codigoExiste = false;
             System.out.print("Codigo: ");
             codigoIntroducido = s.next();
             for(int j = 0; j < articulo.size(); j++){
               if((articulo.get(j).getCodigo()).equals(codigoIntroducido)){
                 System.out.println("Debe introducir otro codigo ese ya existe.");
                 codigoExiste = true;
               } 
             }
           } while (codigoExiste);
                  
          System.out.print("Descripcion: ");
          descripcionIntroducida = s.nextLine();
          descripcionIntroducida = s.nextLine();
          
          System.out.print("Precio de Compra: ");
          precioCompraIntroducido = s.nextInt();
          
          System.out.print("Precio de Venta: ");
          precioVentaIntroducido = s.nextInt();
          
          System.out.print("Stock: ");
          stockIntroducido = s.nextInt();
          
          articulo.add(new Articulo(codigoIntroducido, descripcionIntroducida, precioCompraIntroducido,
                  precioVentaIntroducido, stockIntroducido));
          
          System.out.println();
          
          break;
          //borrar Articulo
        case 3: 
          
          System.out.println("\nBORRAR ARTICULO");
          System.out.println("-----------------");
          
          //comprueba que el codigo Existe
           codigoExiste = true;
           do{
             codigoExiste = false;
             System.out.print("¿Que articulo quieres dar de baja? Introduce el codigo:");
             codigoIntroducido = s.next();
             for(int j = 0; j < articulo.size(); j++){
               if(!(articulo.get(j).getCodigo()).equals(codigoIntroducido)){
                 System.out.println("Debe introducir otro codigo ese codigo no existe.");
                 codigoExiste = true;
               } 
             }
           } while (codigoExiste);
          
          for(int i = 0; i < articulo.size(); i++){
            if((articulo.get(i).getCodigo()).equals(codigoIntroducido)){
              articulo.remove(i);
            }
          }          
          
          System.out.println("Articulo dado de baja.");
          System.out.println();

          break;
          //modifica Articulo
        case 4: 
          System.out.println("\nMODIFICAR ARTICULO");
          System.out.println("--------------------");
          
          //comprueba que el codigo Existe
           codigoExiste = true;
           do{
             codigoExiste = false;
             System.out.print("Introduce el codigo del disco que quiere modificar: ");
             modificarCodigo = s.next();
             for(int j = 0; j < articulo.size(); j++){
               if(!(articulo.get(j).getCodigo()).equals(modificarCodigo)){
                 System.out.println("Debe introducir otro codigo ese codigo no existe.");
                 codigoExiste = true;
               } 
             }
           } while (codigoExiste);
          
          int i = -1;
          do{
            i++;
          } while (!((articulo.get(i).getCodigo()).equals(modificarCodigo)));
          
          System.out.println("¿Que quieres modificar? ");
          System.out.print("1. Codigo ");
          System.out.print("\n2. Descripcion ");
          System.out.print("\n3. Precio de Compra ");
          System.out.print("\n4. Precio de Venta ");
          System.out.print("\n5. Stock ");
          System.out.print("\n6. Salir ");
          System.out.print("\nIntroduce una opcion: ");
          opcionModificar = s.nextInt();
          
          switch(opcionModificar){
              case 1:
                System.out.print("Introduce el nuevo codigo: ");
                  codigoIntroducido = s.next();
                  articulo.get(i).setCodigo(codigoIntroducido);
                  System.out.println("Se ha modificado correctamente");
                  System.out.println();
                break;
                
              case 2:
                System.out.print("Introduce una descripcion nueva: ");
                  descripcionIntroducida = s.next();
                  articulo.get(i).setDescripcion(descripcionIntroducida);
                  System.out.println("Se ha modificado correctamente");
                  System.out.println();
                break;
                        
              case 3:
                System.out.print("Introduce el nuevo precio de compra ");
                  precioCompraIntroducido = s.nextInt();
                  articulo.get(i).setPrecioCompra(precioCompraIntroducido);
                  System.out.println("Se ha modificado correctamente");
                  System.out.println();
                break;
                        
              case 4:
                System.out.print("Introduce el nuevo precio de venta ");
                  precioVentaIntroducido = s.nextInt();
                  articulo.get(i).setPrecioVenta(precioVentaIntroducido);
                  System.out.println("Se ha modificado correctamente");
                  System.out.println();
                break;
                           
              case 5:
                System.out.print("Introduce el stock ");
                  stockIntroducido = s.nextInt();
                  articulo.get(i).setStock(stockIntroducido);
                  System.out.println("Se ha modificado correctamente");
                  System.out.println();
                break;
              case 6:
                System.out.println();
                break;
          }
          
          break;
          //Añadir mercancia
        case 5: 
          System.out.println("\nENTRADA DE MERCANCIA");
          System.out.println("----------------------");
          
          System.out.print("Introduce el codigo del articulo al que le quieres añadir mercancia: ");
          codigoIntroducido = s.next();
          
          for(int j = 0; j < articulo.size(); j++){
            if(articulo.get(j).getCodigo().equals(codigoIntroducido)){
              System.out.print("¿Cuanta mercancia entra?:");
              anadirMercancia = s.nextInt();
              articulo.get(j).setStock(articulo.get(j).getStock() + anadirMercancia);
              System.out.println("Se ha añadido " + anadirMercancia + " articulos mas.");
            }
          }
          System.out.println();
          break;
          
          //salida mercancia
        case 6: 
          System.out.println("\nVENTA DE MERCANCIA");
          System.out.println("----------------------");
          
          System.out.print("¿Cuantos articulos quieres comprar?:");
           cantidad = s.nextInt();
           
          for(int l = 0; l < cantidad; l++){
            System.out.print("Introduce el codigo del articulo a comprar: ");
            codigoIntroducido = s.next();

            System.out.print("Introduce la cantidad que quieres comprar: ");
            quitarMercancia = s.nextInt();

            for(i = 0; i < articulo.size();i++){
              if(articulo.get(i).getCodigo().equals(codigoIntroducido)){
                articulo.get(i).setStock((articulo.get(i).getStock() - quitarMercancia));
                System.out.println("\nFACTURA");
                System.out.println("Codigo: " + codigoIntroducido);
                System.out.println("Cantidad de articulos vendidos: " + quitarMercancia);
                System.out.println("Precio sin IVA: " + articulo.get(i).getPrecioVenta());
                System.out.println("precio con IVA(21%): " + ((articulo.get(i).getPrecioVenta() * 0.21) + articulo.get(i).getPrecioVenta()));
                System.out.println("Precio Total con IVA: " + (((articulo.get(i).getPrecioVenta() * 0.21) + articulo.get(i).getPrecioVenta()) * quitarMercancia) );
              }
            }
          }
            
          System.out.println();
          break;
        case 7:
          System.out.println("Hasta luego bacalao");
          break;
        default:   
      }
    }while(opcion != 7);
  }
}
