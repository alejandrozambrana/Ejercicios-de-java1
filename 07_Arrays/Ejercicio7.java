/**
 * 
 * Ejercicio 7
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
 * y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
 * la lista generada anteriormente. Los números que se han cambiado deben aparecer
 * entrecomillados.
 * 
 * @author Alejandro Zambrana Naranjo
 */
public class Ejercicio7 {

  public static void main(String[] args) {

    int[] numero = new int [100];
    int aleatorios = 0;
    int d = 0;
        
    System.out.println("ESTE PROGRAMA CAMBIA LA OCURRENCIA DEL PRIMER VALOR");

    //genera numero aleatorio
    for (int i = 0; i < 100; i++){
      numero[i] = (int)(Math.random()*21);
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    //Pide un valor por teclado
    System.out.print("Introduce un valor: ");
    int valor1 = Integer.parseInt(System.console().readLine());

    System.out.print("Introduce un segundo valor: ");
    int valor2 = Integer.parseInt(System.console().readLine());
    
    //Cambia el numero aleatorio por el introducido
    for (int i = 0; i < 100; i++){
       if (numero[i] == valor1){
          numero[i] = valor2;
          System.out.print("\"" + numero[i] + "\" " );
        } else{
          System.out.print(numero[i] + " ");
        }
    }
  }
}
