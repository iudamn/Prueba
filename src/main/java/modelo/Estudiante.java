package modelo;

import java.util.Date;

public class Estudiante extends Usuario {
	private String matricula;
	private Object carrera;

	public Estudiante(String correo, String contraseña, String run, Date nacimiento, String nacionalidad,
					  String celular, String domicilio, String matricula) {
		super(correo, contraseña, run, nacimiento, nacionalidad, celular, domicilio);
		this.matricula = matricula;
	}
}