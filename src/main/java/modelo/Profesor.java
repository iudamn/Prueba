package modelo;

import java.util.Date;

public class Profesor extends Persona {
	private String cuentaBancaria;
	private String unidad;

	public Profesor(String correo, String contraseña, String run, Date nacimiento,
					String nacionalidad, String celular, String domicilio, String cuentaBancaria, String unidad) {
		super(correo, contraseña, run, nacimiento, nacionalidad, celular, domicilio);
		this.cuentaBancaria = cuentaBancaria;
		this.unidad = unidad;
	}
}