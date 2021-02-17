package Ejercicio_1;

public class Venta {
	
	String cliente;
	int producto,cantidad;
	double precioUnitario;
	
	public Venta(String cliente, int producto, int cantidad, double precioUnitario) {
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getProducto() {
		return producto;
	}

	public void setProducto(int producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Venta cliente " + cliente + " producto " + producto + " cantidad " + cantidad + " precioUnitario "+ precioUnitario;
	}
	
	
	
}
