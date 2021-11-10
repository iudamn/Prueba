package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Menu2 {
    public static void main(String[] args) {
        Menu menu2= new Menu();
        menu2.usuarios_.add(new Usuario("ccartes", "a"));
        menu2.usuarios_.add(new Usuario("ccartes2", "a2"));

        System.out.println("usuarios_"+menu2.usuarios_.get(0).getCorreo());
        System.out.println(menu2.usuarios_.get(0).getContraseña());
        System.out.println(menu2.usuarios_.get(1).getCorreo());
        System.out.println(menu2.usuarios_.get(1).getContraseña());

        menu2.estudiantes_.add(new Estudiante("ccartes", "a", "ya",
                new Date(2026, 1, 23), "ajsjasj", "a", "sjdjsd",
                "sjdjsd","asd"));
        System.out.println("estudiantes_"+menu2.estudiantes_.get(0).getCorreo());
        System.out.println(menu2.estudiantes_.get(0).getContraseña());

        menu2.profesores_.add(new Profesor("ccartes2", "a2", "ya", new Date(2026, 1, 23),
                "jsdjsjd", "a", "ok","cuenta","unidad"));
        System.out.println("profesor"+menu2.profesores_.get(0).getCorreo());
        System.out.println(menu2.profesores_.get(0).getContraseña());
        menu2.menuLogin();
    }
}
