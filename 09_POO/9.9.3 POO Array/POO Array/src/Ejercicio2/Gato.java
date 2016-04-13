
package Ejercicio2;

public class Gato {
  
  //atributos
  private String nombre;
  private Sexo sexo;
  private int edad;
  private String raza;
  private String color;
  
   public Gato(String nombre, Sexo sexo, int edad, String raza, String color){
    this.nombre = nombre;
    this.sexo = sexo;
    this.edad = edad;
    this.raza = raza;
    this.color = color;
  }
    
  public String getNombre(){
    return this.nombre;
  }
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public void setSexo(Sexo sexo){
      this.sexo = Sexo.HERMAFRODITA;
  }
  
  public Sexo getSexo(){
    return this.sexo;
  }
  
  public void setEdad(int edad){
      this.edad = edad;
  }
  
  public int getEdad(){
    return this.edad;
  }
  
  public void setRaza(String raza){
      this.raza = raza;
  }
  
  public String getRaza(){
    return this.raza;
  }
  
  public String getColor(){
    return this.color;
  }
  
  public void setColor(String color){
      this.color = color;
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
           "\nEdad: " + this.edad + "\nRaza: " + this.raza + "\nColor: " + this.color 
            + "\n--------------------------------------------" ;
  }
  
}
