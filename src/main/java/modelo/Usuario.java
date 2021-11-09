package modelo;


import java.util.ArrayList;
import java.util.Date;


public class Usuario {
	private String correo;
	private String contraseña;
	private String run;
	private Date nacimiento;
	private String nacionalidad;
	private String celular;
	private String domicilio;
	public ArrayList<Asignatura> asignatura = new ArrayList<Asignatura>();

	public Usuario(String correo, String contraseña, String run, Date nacimiento, String nacionalidad,
				   String celular, String domicilio) {
		this.correo= correo;
		this.contraseña= contraseña;
		this.run= run;
		this.nacimiento= nacimiento;
		this.nacionalidad= nacionalidad;
		this.celular= celular;
		this.domicilio= domicilio;

	}

	public String getCorreo() {
		return correo;
	}


}