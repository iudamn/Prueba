package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Menu2 {
    public void main(String[] args) {
        Menu menu2= new Menu();

        menu2.usuarios_.add(new Usuario("ccartes", "a", "ya", new Date(2026, 1, 23),
                "jsdjsjd", "a", "ok"));
        menu2.menuLogin();
    }
}
