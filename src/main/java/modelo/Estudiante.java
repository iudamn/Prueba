package modelo;

import java.util.Date;

public class Estudiante extends Persona {
	private String matricula;
	private String carrera;

	public Estudiante(String correo, String contraseña, String run, Date nacimiento, String nacionalidad,
					  String celular, String domicilio, String matricula, String carrera) {
		super(correo, contraseña, run, nacimiento, nacionalidad, celular, domicilio);
		this.matricula = matricula;
		this.carrera = carrera;
	}

}