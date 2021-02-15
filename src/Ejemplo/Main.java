package Ejemplo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args){
		
		File f = new File("Ejemplo.dat");
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		try ( FileOutputStream fo = new FileOutputStream(f);
			  DataOutputStream escritura = new DataOutputStream(fo)){
			
			
			escritura.writeInt(1);
			escritura.writeUTF("Marcos");
			escritura.writeUTF("Si");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try (FileInputStream fi = new FileInputStream(f);
			 DataInputStream lectura = new DataInputStream(fi);){
			
			while (true) {
				System.out.println(lectura.readInt());
				System.out.println(lectura.readUTF());
				System.out.println(lectura.readUTF());
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Fin de lectura");
		}
		
		
		
	}

}
