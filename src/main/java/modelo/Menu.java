package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
	ArrayList<Usuario> usuarios_ = new ArrayList<Usuario>();
	Asignatura calculo = new Asignatura();
	Asignatura edo = new Asignatura();
	Asignatura fisica = new Asignatura();

	public void menuLogin() {
		System.out.println("[1] Ingresar");
		System.out.println("[2] Salir");
		int opcion = 0;
		opcion = validateInput("12");
		menuSwitch(opcion);
	}
	public void menuEstudiante(){
		throw new UnsupportedOperationException();
	}

		public void menuProfesor () {
			System.out.println("-------------");
			System.out.println("[1] Ingresar Nota a una asignatura");
			System.out.println("[2] Ver notas de una asignatura");
			System.out.println("[0] Salir (S/N)");
		}
		public void menuSwitch ( int option){
			switch (option) {
				case 1:
					crearUsuario();
					break;
				case 2:
					break;
			}
		}
		public void menuSwitchProfesor ( int option) throws IOException {
			switch (option) {
				case 1:
					String asignatura = getInput("Ingrese asignatura a la que desea ingresar notas.");
					if (asignatura.equalsIgnoreCase(this.calculo.getNombre())) {
						this.calculo.verNotas();
					} else if (asignatura.equalsIgnoreCase(this.edo.getNombre())) {
						this.edo.verNotas();
					} else if (asignatura.equalsIgnoreCase(this.fisica.getNombre())) {
						this.fisica.verNotas();
					} else {
						System.out.println("Asignatura no encontrada");
					}
					break;
				case 2:
					asignatura = getInput("Ingrese asignatura que desea ver.");
					if (asignatura.equalsIgnoreCase(this.calculo.getNombre())) {
						int matricula = Integer.parseInt(getInput("Ingrese matricula del alumno"));
						double nota = Double.parseDouble(getInput("Ingrese nota."));
						int modulo = Integer.parseInt(getInput("Ingrese modulo."));
						this.calculo.agregarNota(nota, modulo, matricula);
					} else if (asignatura.equalsIgnoreCase(this.edo.getNombre())) {
						int matricula = Integer.parseInt(getInput("Ingrese matricula del alumno"));
						double nota = Double.parseDouble(getInput("Ingrese nota."));
						int modulo = Integer.parseInt(getInput("Ingrese modulo."));
						this.edo.agregarNota(nota, modulo, matricula);
					} else if (asignatura.equalsIgnoreCase(this.fisica.getNombre())) {
						int matricula = Integer.parseInt(getInput("Ingrese matricula del alumno"));
						double nota = Double.parseDouble(getInput("Ingrese nota."));
						int modulo = Integer.parseInt(getInput("Ingrese modulo."));
						this.fisica.agregarNota(nota, modulo, matricula);
					} else {
						System.out.println("Asignatura no encontrada");
					}
					break;
				case 0:
					exit();
					break;
			}
		}

		public void crearUsuario () {
			String correo = getInput("Ingrese correo: ");
			String contraseña = getInput("Ingrese contraseña: ");
			for(int i=0; i<this.usuarios_.size();i++) {
				if (correo.equals(this.usuarios_.get(i).getCorreo())) {

				}
			}
		}
			public void exit () {
				String respuesta = getInput("Desea salir del programa? S/N");
				respuesta = respuesta.toLowerCase();
				if (respuesta.contains("s")) {
					System.exit(0);
				} else if (respuesta.contains("n")) {
					System.out.println("");
				}
			}
			public static String getInput (String message){
				Scanner scanner = new Scanner(System.in);
				System.out.println(message);
				return scanner.next();
			}

			public static int validateInput(String validacion){
				while (true) {
					String input = getInput("Seleccione una opción:");
					if (validacion.indexOf(input) >= 0) {
						int option = Integer.parseInt(input);
						if (0 < option && option < 3) {
							return option;
						}
					} else {
						System.out.println("Opción inválida");
					}
				}
			}
}