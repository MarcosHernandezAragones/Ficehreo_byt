package Ejercicio_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOData {
	
	public static void guardarDatos(String rutaFichero, Venta vVenta[]) {
		
		File f = new File(rutaFichero);
	
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try (FileOutputStream fo = new FileOutputStream(f);
				DataOutputStream escribir = new DataOutputStream(fo)){
			
			for (Venta v : vVenta) {
				if (v != null) {
					escribir.writeUTF(v.getCliente());
					escribir.writeInt(v.getCodProducto());
					escribir.writeInt(v.getUniVendidas());
					escribir.writeDouble(v.getPrecio());
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("Has terminado de leer el fichero");
		}	
	}
	
	public static Venta[] cargarDatos(String rutaFichero) {
		
		Venta[] vector = new Venta[10];
		int cont = 0;
		
		File f = new File(rutaFichero);
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
				DataInputStream leer = new DataInputStream(fi)){
			
			while(true) {
				String cliente = leer.readUTF();
				int codProducto = leer.readInt();
				int uniVendidas = leer.readInt();
				double precio = leer.readDouble();
				
				Venta v = new Venta(cliente, codProducto, uniVendidas, precio);
				
				vector[cont] = v;
				cont++;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return vector;
	}
	
	
	
}
