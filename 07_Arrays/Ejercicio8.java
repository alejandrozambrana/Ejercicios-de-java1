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
    
    int numeroMes = 12;
    
    String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
      "Agosto","Septiembre","Octubre","Noviembre","Diciembre",};
      
    int[] temperatura = new int[12]; 
    
    String azul = "\033[34m";
    
    //Pide la temperatura media del mes
    for(int i = 0; i < numeroMes; i++){
      System.out.print("Temperatura media de " + ( mes[i]) + " es: ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    for(int i = 0; i < numeroMes; i++){
      System.out.printf("%13s", mes[i] + " | ");
        for(int n = 0; n < temperatura[i]; n++){
          System.out.print("▄");
        }
      System.out.printf("%6s", temperatura[i] + "ºC\n");
    }
  }
}
