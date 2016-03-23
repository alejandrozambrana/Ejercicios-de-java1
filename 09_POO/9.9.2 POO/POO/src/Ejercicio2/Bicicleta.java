package Ejercicio2;

public class Bicicleta extends vehiculo {
 
  private String color; 
  
  public Bicicleta(String p) {
    super();
    this.color = p;
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
    System.out.print("--------------------------------");
  }
}
