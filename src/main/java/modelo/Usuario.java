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
}