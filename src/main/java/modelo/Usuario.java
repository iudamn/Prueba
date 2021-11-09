package modelo;

import java.util.ArrayList;
import java.util.Date;

import modelo.Asignatura;

public class Usuario {
	private String correo;
	private String contraseña;
	private String run;
	private Date nacimiento;
	private String nacionalidad;
	private String celular;
	private String domicilio;
	public ArrayList<Asignatura> _asignatura = new ArrayList<Asignatura>();
}