package modelo;

import java.util.Date;

public class Estudiante extends Persona {
	private String matricula;
	private String carrera;

	public Estudiante(String correo, String contraseña, String run, Date nacimiento, String nacionalidad,
					  String celular, String domicilio, String matricula, String carrera) {
		this.correo= correo;
		this.contraseña= contraseña;
		this.matricula = matricula;
		this.carrera = carrera;
		this.run = run;
		this.nacimiento = nacimiento;
		this.nacionalidad = nacionalidad;
		this.celular = celular;
		this.domicilio = domicilio;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCarrera() {
		return carrera;
	}
}