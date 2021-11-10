package modelo;

import java.util.Date;

public class Profesor extends Persona {
	private String cuentaBancaria;
	private String unidad;

	public Profesor(String correo, String contraseña, String run, Date nacimiento,
					String nacionalidad, String celular, String domicilio, String cuentaBancaria, String unidad) {
		this.correo= correo;
		this.contraseña= contraseña;
		this.run = run;
		this.nacimiento = nacimiento;
		this.nacionalidad = nacionalidad;
		this.celular = celular;
		this.domicilio = domicilio;
		this.cuentaBancaria = cuentaBancaria;
		this.unidad = unidad;
	}
}