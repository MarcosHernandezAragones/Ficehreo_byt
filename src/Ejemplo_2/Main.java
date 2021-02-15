package Ejemplo_2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File f = new File("pass.dat");
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		try (FileOutputStream fo = new FileOutputStream(f);
			 DataOutputStream escribir = new DataOutputStream(fo);){
			
			Scanner leer = new Scanner(System.in);
			
			String nom,pass,des;
			
			System.out.println("Dime el nombre de usuario");
			nom = leer.next();
			escribir.writeUTF(nom);
			
			System.out.println("Dime la contraseña");
			pass= leer.next();
			escribir.writeUTF(cambiarContraseña(pass));
			
			System.out.println("Dime la web para registrarte");
			des = leer.next();
			escribir.writeUTF(des);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try (FileInputStream fi = new FileInputStream(f);
			 DataInputStream leer = new DataInputStream(fi);){
			
			
			while (true) {
				System.out.println();
				System.out.println();
			System.out.println("El usuario "+leer.readUTF());
			System.out.println("Con contraseña "+leer.readUTF());
			System.out.println("De la pagina "+leer.readUTF());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			System.out.println("");
		}
		
	}
	
	private static String cambiarContraseña(String pass) {
		
		String contrasena="";
		for (int i = 0; i < pass.length(); i++) {
			contrasena +="*";
		}
		return contrasena;
		
	}

}
