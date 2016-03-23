package Ejercicio2;

public class coche extends vehiculo {
 
  private int color; 
  
  public coche(int p) {
    super();
    this.color = p;
  }

  public void QuemaRueda() {
    System.out.println("EL coche quema rueda");
    System.out.print("--------------------------------");
  }
}
 
