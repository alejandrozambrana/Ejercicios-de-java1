package Ejercicio1;
public class caballo {
 
 private String nombre;
 private int fechNacimiento;
 private String sexo;
 private String raza;
 private String color;
 
 public caballo(String nombre){
     this.nombre = nombre;
 }
 
   public String getNombre() {
    return this.nombre;
  }
 
 public void relincha(){
    System.out.println("yiiiiuuuuufff");
 }
 
 public void trota(){
    System.out.println("quicu quicu quicu");
 }
  
 public void come(){
    System.out.println("ñan ñan ñan ñan");
 }
 
 public void bebe(){
    System.out.println("glu glu glu glu");
 }
 
}
