package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
	ArrayList<Usuario> usuarios_ = new ArrayList<Usuario>();

	public void menuLogin(){
		System.out.println("[1] Ingresar");
		System.out.println("[2] Salir");
		int opcion = 0;
		opcion = validateInput("12");
		menuSwitch(opcion);
	}


	public void menuSwitch(int option) {
		switch (option) {
			case 1:
				crearUsuario();
				break;
			case 2:
				break;
		}
	}

	public void crearUsuario(){
		String correo = getInput("Ingrese correo: ");
		String contraseña = getInput("Ingrese contraseña: ");

		if(correo.equals(this.usuarios_.getCorreo)){

		}
	}

	public static String getInput(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		return scanner.next();
	}

	public static int validateInput(String validacion) {
		while (true) {
			String input = getInput("Seleccione una opción:");
			if (validacion.indexOf(input) >= 0) {
				int option = Integer.parseInt(input);
				if (0 < option && option < 3) {
					return option;
				}
			}
			else {
				System.out.println("Opción inválida");
			}
		}
	}

	public void menuEstudiante() {
		throw new UnsupportedOperationException();
	}

	public void menuProfesor() {
		throw new UnsupportedOperationException();
	}
}