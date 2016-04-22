
package Ejercicio12;

import Ejercicio09.*;

public class Carta implements Comparable <Carta>{
  private static String palos[] = {"Espadas", "Oro", "Bastos", "Copa"};  
  private static String numeros[] = {"as", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
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
  public int compareTo(Carta car){
    if((this.palo).equals(car.getPalos())){
      return  (this.numero).compareTo(car.getNumero());
    } else{
      return (this.palo).compareTo(car.getPalos());
    }
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
