package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Persona extends Usuario{
    protected String run;
    protected Date nacimiento;
    protected String nacionalidad;
    protected String celular;
    protected String domicilio;
    public ArrayList<Asignatura> asignatura = new ArrayList<Asignatura>();

    public Persona(String correo, String contraseña, String run, Date nacimiento, String nacionalidad,
                   String celular, String domicilio) {
        super(correo, contraseña);
        this.run= run;
        this.nacimiento= nacimiento;
        this.nacionalidad= nacionalidad;
        this.celular= celular;
        this.domicilio= domicilio;

    }

    public Persona(String correo, String contraseña) {

    }
}