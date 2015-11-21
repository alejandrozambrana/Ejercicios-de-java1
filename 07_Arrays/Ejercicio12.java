/**
 * 
 * Ejercicio 12
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
 * que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
 * colocar el número de la posición inicial en la posición final, rotando el resto de números
 * para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 * Por ejemplo, para inicial = 3 y final = 7:
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio12 {

  public static void main(String[] args) {

    System.out.println("ESTE PROGRAMA CAMBIA DE POSICION EL ARRAY");
    
    int[] numero = new int[10];
    int[] ordenado = new int[10];
    
    System.out.println("Introduze 10 numeros enteros: ");
    
    for(int i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    //genera y muestra el array original
    System.out.println("Array original:");
    for(int i = 0; i < 10; i++) {
      System.out.print(numero[i] + " " ); 
    }
    System.out.println();
    
    System.out.println("Introduze la posicion que quieres cambiar: ");
      int posicionInicial = Integer.parseInt(System.console().readLine());
    System.out.println("Introduze la posicion donde quiere insertarlo: ");
      int posicionFinal = Integer.parseInt(System.console().readLine());
      
    if ((posicionInicial < posicionFinal) && (posicionInicial >= 0) && (posicionInicial <= 10) && (posicionFinal >= 0) && (posicionFinal <= 10)){
      ordenado[posicionFinal] = numero[posicionInicial];
      ordenado[0] = numero[9];
      
      for (int i = 0; i < 10; i++) {
        ordenado[i] = numero[i];
      }
    
      ordenado[posicionFinal] = numero[posicionInicial];
    
      for (int i = posicionFinal + 1; i < 10; i++){
        ordenado[i] = numero[i - 1];
      }
      ordenado[0] = numero[9];
    
      for (int i = 0; i < posicionInicial; i++){
        ordenado[i + 1] = numero[i];
      }
    }
     
    //Muestra Resultado
    System.out.println("Array Con posiciones cambiadas:");
    for (int i = 0; i < 10; i++) {
      System.out.print(ordenado[i] + " ");
    }
  }
}
