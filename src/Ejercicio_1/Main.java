package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		Venta[] vVentas;
		
		/*
		vVentas[0] = new Ventas("Javier", 4, 5, 5);
		vVentas[1] = new Ventas("Pedro", 4, 5, 5);
		vVentas[2] = new Ventas("Juan", 4, 5, 5);
		vVentas[3] = new Ventas("Pepe", 4, 5, 5);
		*/
		
		//IODatos.guardarDatos("Ventas.dat", vVenta);
		
		vVentas = IOData.cargarDatos("ventas.dat");
	}
	
	
	private static int calcularTotal(Venta[] vVentas, String cliente) {
		
		int suma = 0;
		
		for (Venta ventas : vVentas) {
			if (cliente.equalsIgnoreCase(ventas.getCliente())) {
				suma += ventas.getPrecio()*ventas.getUniVendidas();
			}
		}
		
		return suma;
	}
	
	private static int contarClientes(Venta[] vVenta, String cliente) {
		
		int total = 0;
		String clientes;
		
		for (Venta ventas : vVenta) {
			if (ventas.getCliente().equalsIgnoreCase(cliente)) {
				total++;
			}
		}
		
		
		
		return total;
	}

}
