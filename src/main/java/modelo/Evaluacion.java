package modelo;

import java.util.ArrayList;
import java.util.Date;

import modelo.DetalleNota;

public class Evaluacion {
	private Date fecha;
	private double ponderacion;
	public ArrayList<DetalleNota> _notas = new ArrayList<DetalleNota>();
	public Asignatura _asignatura;
}