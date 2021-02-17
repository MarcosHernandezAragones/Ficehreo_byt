package Ejercicio_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOData {
	
	public static void guardarDatos(String rutaFichero, Venta[] venta) {
		
		File f = new File("Ventas.dat");
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 DataOutputStream escribir = new DataOutputStream(fo);){
			
			for (Venta v : venta) {
				if (v!=null) {
					escribir.writeUTF(v.getCliente());
					escribir.writeInt(v.getProducto());
					escribir.writeInt(v.getCantidad());
					escribir.writeDouble(v.getPrecioUnitario());
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	public static Venta[] mostrarDatos() {
		
		Venta[] vVenta = new Venta[10];
		
		String cliente;
		int producto,cantidad;
		double precioUnitario;
		int cont =0;
		
		File f = new File("Ventas.dat");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 DataInputStream leer = new DataInputStream(fi);){
			
			while (true) {
				cliente=leer.readUTF();
				producto = leer.readInt();
				cantidad = leer.readInt();
				precioUnitario = leer.readDouble();
				
				Venta v = new Venta(cliente, producto, cantidad, precioUnitario);
				vVenta [cont]=v;
				cont++;
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return vVenta;
	}
	
	
	
}
