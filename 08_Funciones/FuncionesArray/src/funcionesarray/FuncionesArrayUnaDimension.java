package funcionesarray;
public class FuncionesArrayUnaDimension {
    /**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
  
  /**
  * 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
  * cuyo intervalo (mínimo y máximo) se indica como parámetro.
  * 
  * 
  * @param n
  * @param minimo
  * @param maximo
  * @return  array de una dimension con numeros aleatorios 
  */
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int []x = new int[n];
    
     for(int i = 0; i < n; i++){
      x[i] = (int)(Math.random() * (maximo - minimo + 1)) + minimo;
     }
     return x;    
  }
   
}
