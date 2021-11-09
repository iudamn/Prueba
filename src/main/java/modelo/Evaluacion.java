package modelo;

import java.util.ArrayList;
import java.util.Date;


public class Evaluacion {
	private Date fecha;
	private double ponderacion;
	public ArrayList<DetalleNota> notas = new ArrayList<DetalleNota>();
	public Asignatura asignatura;
}