package Ejemplo_2;

import java.io.Serializable;

public class Pass implements Serializable {
	
	// nombre usuario contraseña segura
	
	private String usuario;
	private int pass=0;
	private boolean save = false;
	
	
	public Pass(String usuario, int pass, boolean save) {
		this.usuario = usuario;
		this.pass = pass;
		this.save = save;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public int getPass() {
		return pass;
	}


	public void setPass(int pass) {
		this.pass = pass;
	}


	public boolean isSave() {
		return save;
	}


	public void setSave(boolean save) {
		this.save = save;
	}


	@Override
	public String toString() {
		return "Usuario " + usuario + " pass " + pass + " save " + save;
	}
	
}
