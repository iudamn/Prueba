package modelo;

import java.util.Date;

public class Profesor extends Usuario {
	private String cuentaBancaria;
	private String unidad;

	public Profesor(String correo, String contraseña, String run, Date nacimiento,
					String nacionalidad, String celular, String domicilio, String cuentaBancaria) {
		super(correo, contraseña, run, nacimiento, nacionalidad, celular, domicilio);
		this.cuentaBancaria = cuentaBancaria;
	}
}