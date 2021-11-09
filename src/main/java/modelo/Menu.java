package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ArrayList<Usuario> usuarios_ = new ArrayList<>();
		menuLogin();
	}

	public static void menuLogin(){
		System.out.println("[1] Ingresar");
		System.out.println("[2] Salir");
		int opcion = 0;
		opcion = validateInput("12");
		menuSwitch(opcion);
	}


	public static void menuSwitch(int option) {
		switch (option) {
			case 1:
				Usuario();
				break;
			case 2:
				break;
		}
	}

	public static void Usuario(){
		String correo = getInput("Ingrese correo: ");
		String contraseña = getInput("Ingrese contraseña: ");

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