
package Ejercicio08;

public class Carta {
  private static String palos[] = {"Espadas", "Oro", "Bastos", "Copa"};  
  private static String numeros[] = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
  private String palo;
  private String numero;
  
  public Carta(){
    this.palo = palos[(int)(Math.random()*4)];
    this.numero = numeros[(int)(Math.random()*10)];    
  }
  
  public String getPalos(){
   return this.palo;
  }
  
  public String getNumero(){
   return this.numero;
  }
  
  @Override
  public String toString(){
    return this.numero + " " + this.palo;
  }
  
  @Override
  public boolean equals (Object objeto){
    boolean iguales = false;
    
    Carta obj = (Carta) objeto;
    
    if(((this.palo).equals(obj.palo)) && ((this.numero).equals(obj.numero))){
      iguales = true;
    } 
    
    return iguales;
  }
  
}
