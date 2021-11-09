package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;
import modelo.Evaluacion;

public class Asignatura {
	private String codigo;
	private int anio;
	private int semestre;
	private String nombre;
	private String grado;
	public ArrayList<Usuario> _usuario = new ArrayList<Usuario>();
	public ArrayList<Evaluacion> _evaluaciones = new ArrayList<Evaluacion>();

	public void agregarNota(Object double_nota, Object int_modulo) {
		throw new UnsupportedOperationException();
	}

	public List verNotas() {
		throw new UnsupportedOperationException();
	}
}