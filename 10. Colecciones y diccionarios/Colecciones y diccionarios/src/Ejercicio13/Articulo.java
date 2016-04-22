
package Ejercicio13;

public class Articulo {
  //atributo
  private String codigo = "VACIO"; 
  private String descripcion;
  private Integer precioCompra;
  private Integer precioVenta;
  private int stock;
  
  public Articulo( String codigo, String descripcion, Integer precioCompra, Integer precioVenta, int stock){
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }
  
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
  
  public void setPrecioCompra(Integer precioCompra){
    this.precioCompra = precioCompra;
  }
  
  public double getPrecioVenta(){
    return this.precioVenta;
  }
  
  public void setPrecioVenta(Integer precioVenta){
    this.precioVenta = precioVenta;
  }
  
  public int getStock(){
    return this.stock;
  }
  
  public void setStock(int stock){
    this.stock = stock;
  }
  
  @Override
  public String toString(){
    return "Codigo: " + this.codigo + "\nDescripcion: " + this.descripcion + 
            "\nPrecio de la compra: " + this.precioCompra +
            "\nPrecio de la Venta: " + this.precioVenta + "\nStock: " + this.stock + "\n"; 
  }

}
