package mx.com.gm.ventas;

public class Orden {

	private int idOrden;
	private Producto productos[];
	private static int contadorOrdenes;
	static int MAX_PRODUCTOS = 10;
	
	public Orden() {
		this.MAX_PRODUCTOS +=1;
	}
	public void agregarProducto(Producto producto) {
		
	}
	public double calcularTotal() {
		return 0.1;
	}
	public void mostarOrden() {
		
	}
	
}
