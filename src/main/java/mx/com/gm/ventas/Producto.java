package mx.com.gm.ventas;

public class Producto {

	private int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	public Producto(){
		contadorProductos +=1;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getidProducto()
	{
		return this.idProducto;
	}
	public void setidProducto(int idProducto) {
		this.idProducto = idProducto;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getprecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
	
	this.precio = precio;
	}
	
}
