package ex1;

import java.util.ArrayList;
import java.util.List;

public class Telefon {
    private ModulGPS modulGPS;
    private List<Tasta> tasta;

    Telefon() {
        modulGPS = new ModulGPS();
        tasta = new ArrayList<>();

        Utilizator utilizator = new Utilizator();
    }
}
