
package Ejercicio5;

public class Pizza {
  
// atributos de clase
  private static int totalPizzasPedidas = 0;
  private static int totalPizzasServidas = 0;

// atributos de instancia
  private String tamaño;
  private String tipo;
  private String estado;
  
  public Pizza(String Tamaño, String Tipo){
    this.tipo = Tipo;
    this.tamaño = Tamaño;
    this.estado = "Pedida";
    Pizza.totalPizzasPedidas++;
  }
  
  @Override
  public String toString(){
    return "Pizza " + this.tipo + ", " + this.tamaño + ", " + this.estado;
  }
  
  public static int getTotalPizzasPedidas(){
    return Pizza.totalPizzasPedidas;
  }
  
  public static int getTotalPizzasServidas(){
    return Pizza.totalPizzasServidas;
  }
  
  public void sirve(){
    if(this.estado.equals("Pedida")){
      this.estado = "Servida";
      Pizza.totalPizzasServidas++;
    }else{
     System.out.println("Esta pizza ha sido servida"); 
    }
  }
}