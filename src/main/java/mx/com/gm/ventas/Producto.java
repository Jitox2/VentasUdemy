package mx.com.gm.ventas;

public class Producto {

	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	public Producto(){
		 this.idProducto = ++Producto.contadorProductos;
	}
	
	public Producto(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public int getidProducto()
	{
		return this.idProducto;
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
	
	@Override
	public String toString() {
	
		return "Producto {"+"idProducto ="+this.idProducto+" Nombre = "+this.nombre+" Precio= "+this.precio+"}";
		
	}

	
}
