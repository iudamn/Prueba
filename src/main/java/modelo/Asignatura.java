package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;
import modelo.Evaluacion;

public class Asignatura {
	private String codigo;
	private int año;
	private int semestre;
	private String nombre;
	private String grado;
	public ArrayList<Usuario> usuario = new ArrayList<Usuario>();
	public ArrayList<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();

	public void agregarNota(double nota, int modulo, int matricula) {
		throw new UnsupportedOperationException();
	}

	public List verNotas() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return nombre;
	}
}