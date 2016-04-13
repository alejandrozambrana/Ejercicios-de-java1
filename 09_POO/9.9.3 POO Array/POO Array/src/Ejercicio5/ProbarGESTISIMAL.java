
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
    int precioCompraIntroducido;
    int precioVentaIntroducido;
    int stockIntroducido;
    int opcion;
    int posicionVacia;
    
    
    do{
      System.out.println("\nGESTION SIMPLIFICADA DE ALMACEN");
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
          
          
          System.out.println("\nAñadir Articulo");
          System.out.println("-----------------");
          
          System.out.print("Codigo: ");
          codigoIntroducido = s.next();
          articulo[posicionVacia].setCodigo(codigoIntroducido);
          
          System.out.print("Descripcion: ");
          descripcionIntroducida = s.next();
          articulo[posicionVacia].setDescripcion(descripcionIntroducida);
          
          System.out.print("Precio de Compra: ");
          precioCompraIntroducido = s.nextInt();
          articulo[posicionVacia].setPrecioCompra(precioCompraIntroducido);
          
          System.out.print("Precio de Venta: ");
          precioVentaIntroducido = s.nextInt();
          articulo[posicionVacia].setPrecioVenta(precioVentaIntroducido);
          
          System.out.print("Stock: ");
          stockIntroducido = s.nextInt();
          articulo[posicionVacia].setPrecioStock(stockIntroducido);
          
          break;
        case 3: 
          break;
        case 4: 
          break;
        case 5: 
          break;
        case 6: 
          break;
        default:   
      }
    }while(opcion != 7);
  }
  
}
