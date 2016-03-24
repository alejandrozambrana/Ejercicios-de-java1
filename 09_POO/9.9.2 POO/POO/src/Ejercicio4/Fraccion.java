
package Ejercicio4;

public class Fraccion {
  
  private int signo; 
  private int numerador;
  private int denominador;
  
  public Fraccion(int nume, int deno){
    if (deno == 0) {
      System.out.println("Una fracción no puede tener como denominador el número 0");
    } else {
      if (nume * deno < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(nume);
      this.denominador = Math.abs(deno);
    }
  }
  
  int getnumerador(){
    return this.numerador;
  }
  
  int getdenominador(){
    return this.denominador;
  }
  
  public String toString(){
    if(signo == -1){
      return "-" + this.numerador + "/" + this.denominador;
    }else{
      return this.numerador + "/" + this.denominador;
    }
  }
  
  public Fraccion invierte(){
    int aux = 0;
    aux = this.denominador;
    this.denominador = this.numerador;
    this.numerador = aux;
    return new Fraccion(this.signo * this.numerador,  this.denominador); 
  }
  
  public Fraccion multiplica(int i){
    return new Fraccion(this.signo * this.numerador * i, this.denominador);
  }
  
  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getnumerador(), this.denominador * f.getdenominador());
  }
  
  public Fraccion divide(int n) {
    return new Fraccion(this.signo * this.numerador, this.denominador * n);
  }
  
  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getdenominador(), denominador * f.getnumerador());
  }
  
  public Fraccion simplifica() {
    
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;
      
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }

    return new Fraccion(s * n, d);
  }
}
