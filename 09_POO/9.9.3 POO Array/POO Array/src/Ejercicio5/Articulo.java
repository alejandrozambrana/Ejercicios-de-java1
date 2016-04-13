
package Ejercicio5;

public class Articulo {
  //atributo
  private String codigo = "VACIO"; 
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  
  public String getCodigo(){
    return this.codigo;
  }
  
  public void setCodigo(String codigo){
    this.codigo = codigo;
  }
  
  public String getDescripcion(){
    return this.descripcion;
  }
  
  public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
  }
  
  public double getPrecioCompra(){
    return this.precioCompra;
  }
  
  public void setPrecioCompra(double precioCompra){
    this.precioCompra = precioCompra;
  }
  
  public double getPrecioVenta(){
    return this.precioVenta;
  }
  
  public void setPrecioVenta(double precioVenta){
    this.precioVenta = precioVenta;
  }
  
  public int getStock(){
    return this.stock;
  }
  
  public void setPrecioStock(int stock){
    this.stock = stock;
  }
  
  @Override
  public String toString(){
    return "Codigo: " + this.codigo + "\nDescripcion: " + this.descripcion + 
            "\nPrecio de la compra: " + this.precioCompra +
            "\nPrecio de la Venta: " + this.precioVenta + "\nStock: " + this.stock + "\n \n"; 
  }
}
