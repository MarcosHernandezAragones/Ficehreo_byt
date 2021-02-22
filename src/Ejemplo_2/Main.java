package Ejemplo_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		boolean a�adir, save;
		String usuario;
		int pass;

	/*	Pass vPass[] = new Pass[10];
		vPass[0] = new Pass("Juan", 1, false);
		vPass[1] = new Pass("Pepe", 2, true);
		vPass[2] = new Pass("Adelin", 3, true);
		vPass[3] = new Pass("Jordi", 4, false);
/*
		for (int i = 0; i < vPass.length; i++) {
			añadir = false;
			try {
				if (vPass[i] == null) {
					System.out.println("Quieres añadir usuarios?");
					añadir = leer.nextBoolean();
					if (añadir == true) {
						System.out.println("Dime el nombre de usuario");
						usuario = leer.next();
						System.out.println("Dime su contraseña");
						pass = leer.nextInt();
						System.out.println("Dime si es segura");
						save = leer.nextBoolean();

						vPass[i] = new Pass(usuario, pass, save);

						añadir = false;
					}else {
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
*/
		//IOData.guardarDatos("pass.dat", vPass);
		//IOData.guardarObjetos("objetosDatos2.dat", vPass);
		
		Pass vPass[] = IOData.leerobjetos("objetosDatos2.dat");
		
		for (Pass p : vPass) {
			if (p != null) {
				System.out.println(p.toString());
			}
		}
		
		

	}

}
