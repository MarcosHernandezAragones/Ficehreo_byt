package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		Venta[] vVentas;
		
<<<<<<< Updated upstream
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
=======
		Venta vVenta[]= new Venta[10];
		vVenta[0]= new Venta("Juan", 1, 10, 10);
		vVenta[1]= new Venta("Juan", 2, 3, 2);
		vVenta[2]= new Venta("Juan", 3, 3, 20);
		vVenta[3]= new Venta("Juan", 4, 1, 5);
		vVenta[4]= new Venta("Pepe", 1, 2, 10);
		vVenta[5]= new Venta("Pepe", 2, 3, 2);
		vVenta[6]= new Venta("Pepe", 3, 3, 2);
		vVenta[7]= new Venta("Juan", 5, 3, 2);
		vVenta[8]= new Venta("Pedro", 1, 3, 10);
		vVenta[9]= new Venta("Pedro", 2, 3, 2);
		vVenta[10]= new Venta("Pedro", 3, 3, 2);
		
		IOData.guardarDatos("Ventas.dat", vVenta);
>>>>>>> Stashed changes
	}

}
