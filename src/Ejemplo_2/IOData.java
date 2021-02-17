package Ejemplo_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOData {

	public static void guardarDatos(String rutaFichero, Pass[] datos) {
		
		// Devolvere un vector de Password
		File f = new File("pass.dat");

		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileOutputStream fo = new FileOutputStream(f); 
			DataOutputStream escribir = new DataOutputStream(fo)) {
			
			for (Pass p : datos) {
				if (p!=null) {
					
					escribir.writeUTF(p.getUsuario());
					escribir.writeInt(p.getPass());
					escribir.writeBoolean(p.isSave());
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
	
	
	
	public static Pass[] leerDatos(String rutaFichero) {
		int cont=0, pass;
		String usuario;
		boolean save;
		Pass[] vPass = new Pass[10];
		
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 DataInputStream leer = new DataInputStream(fi);){
				
				while (true) {
					System.out.println();
					System.out.println();
				usuario = leer.readUTF();
				pass = leer.readInt();
				save = leer.readBoolean();
				
				Pass p = new Pass(usuario, pass, save);
				vPass[cont] = p;
				cont++;
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				System.out.println("");
			}
		
		return vPass;
	}

	public static void guardarObjetos(String rutaFichero, Pass[] datos) {
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 ObjectOutputStream escribir = new ObjectOutputStream(fo);){
			
			for (Pass p : datos) {
				if (p!=null) {
					escribir.writeObject(p);
				}
			}
			
			//escribir.writeObject(datos);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public static Pass[] leerobjetos(String rutaFichero) {
		int cont=0;
		Pass[] vPass = new Pass[10];
		
		File f = new File(rutaFichero);
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try (FileInputStream fi = new FileInputStream(f);
			 ObjectInputStream leer = new ObjectInputStream(fi);){
				
				while (true) {
					
					vPass[cont] = (Pass) leer.readObject();//leer solo
				
					cont++;
				}
				
				//vPass = (Pass[])leer.readObject();//leer todo el vector
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e1) {
				System.out.println("");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return vPass;
	}
	
}
