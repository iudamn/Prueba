package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Menu2 {
    public static void main(String[] args) {
        Menu menu2= new Menu();
        menu2.usuarios_.add(new Usuario("ccartes", "a"));
        menu2.usuarios_.add(new Usuario("ccartes2", "a2"));

        menu2.estudiantes_.add(new Estudiante("ccartes", "a", "ya",
                new Date(2026, 1, 23), "ajsjasj", "a", "sjdjsd",
                "sjdjsd","asd"));
        menu2.profesores_.add(new Profesor("ccartes2", "a2", "ya", new Date(2026, 1, 23),
                "jsdjsjd", "a", "ok","cuenta","unidad"));
        menu2.menuLogin();
    }
}
