package modelo;


import java.util.ArrayList;
import java.util.Date;


public class Usuario {
	private String correo;
	private String contraseña;

	public ArrayList<Asignatura> asignatura = new ArrayList<Asignatura>();

	public Usuario(String correo, String contraseña) {
		this.correo= correo;
		this.contraseña= contraseña;
	}

	public Usuario(){}


	public String getCorreo() {
		return correo;
	}

	public String getContraseña() {
		return contraseña;
	}


}