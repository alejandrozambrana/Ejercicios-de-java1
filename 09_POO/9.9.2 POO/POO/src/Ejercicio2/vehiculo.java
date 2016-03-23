package Ejercicio2;

public abstract class vehiculo {
 
// atributos de clase
 private static int vehiculosCreados = 0;
 private static int kilometrosTotales = 0;

 // atributos de instancia
  private int kilometrosRecorridos;
 
  public vehiculo() {
    this.kilometrosRecorridos = 0;
  }
  
 public vehiculo(int kilometrosRecorridos){
     this.kilometrosRecorridos = kilometrosRecorridos;
 }
 
 public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
  public int getKilometrosTotales() {
    return kilometrosTotales;
  }
  
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    kilometrosTotales += k;
  }
 
}
