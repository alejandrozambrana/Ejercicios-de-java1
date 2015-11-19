/**
 * 
 * Ejercicio 8
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
 * determinado año y que muestre a continuación un diagrama de barras horizontales con
 * esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
 * carácter.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio8 {

  public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA PIDE LA TEMPERATURA MEDIA Y PINTA UN DIAGRAMA");
    
    String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
      "Agosto","Septiembre","Octubre","Noviembre","Diciembre",};
    
    //Pide la temperatura media del mes
    System.out.print("Temperatura media de " + ( mes[0]) + " es: ");
    mes[1] = System.console().readLine();

  }
}
