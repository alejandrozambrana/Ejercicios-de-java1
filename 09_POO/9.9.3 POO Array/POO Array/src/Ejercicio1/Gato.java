
package Ejercicio1;

public class Gato {
  
  //atributos
  private String nombre;
  private Sexo sexo;
  private int edad;
  private String raza;
  
  
  public Gato(String nombre, Sexo sexo, int edad, String raza){
    this.nombre = nombre;
    this.sexo = sexo;
    this.edad = edad;
    this.raza = raza;
  }
  
  public String getNombre(){
    return this.nombre;
  }
  
  public Sexo getSexo(){
    return this.sexo;
  }
  
  public int getEdad(){
    return this.edad;
  }
  
  public String getRaza(){
    return this.raza;
  }
  
  public void maulla(){
    System.out.println("Miauuuuuu");
  }
  
  public void come(){
    System.out.println("ñam ñam ñam ñaam");
  }
  
  public void ronronea(){
    System.out.println("grgrgrgrgrgr");
  }
  
  @Override
  public String toString(){
    return "Nombre: " + this.nombre + "\nSexo: " + this.sexo + 
           "\nEdad: " + this.edad + "\nRaza: " + this.raza;
  }
  
}
