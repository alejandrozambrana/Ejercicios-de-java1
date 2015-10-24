/**
 * Ejercicio 12
 * Escribe un programa que muestre los n primeros términos de la serie de 
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo 
 * es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos
 * que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El 
 * número n se debe introducir por teclado.
 * 
 * @author Alejandro Zambrana Naranjo
 */

public class Ejercicio12{
  public static void main(String[] args) {
     
    System.out.println("ESTE PROGRAMA MUESTRA LOS PRIMEROS NUMEROS DE LA SERIE DE FIBONACCI");
    System.out.print("Introduce la cantidad de numeros que quieres ver: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int n = 0;
    int numero1 = 0;
    int numero2 = 1;
    int suma;
    
    if (numeroIntroducido == 1){
      System.out.println("0");
      } else {
      System.out.print(numero1 +" ");
      //hecho con for
      /*for (int i = 1; i < numeroIntroducido; i++){
        System.out.print(numero2 +" ");
        suma = numero1 + numero2;
        numero1 = numero2;
        numero2 = suma;
      } */
      
      //hecho con do while
      int i = 1;
      do {
        System.out.print(numero2 +" ");
        suma = numero1 + numero2;
        numero1 = numero2;
        numero2 = suma;
        i++;
      } while (i < numeroIntroducido);
/*      
    while (n <= numeroIntroducido) {
      suma = numero1;
      numero1 = numero2;
      numero2 = numero1 + aux;
      n++;
      System.out.print(suma + ", ");
    }
    */
    }
  }
}

