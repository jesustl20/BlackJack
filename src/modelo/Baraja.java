package modelo;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
    public List<Carta> cartas = new ArrayList<>();

    public Carta sacarCartaAleatoria() {
        int random = (int) (Math.random()* cartas.size()); // TODO resolver bug
        Carta cartaAleatoria = cartas.get(random);
        cartas.remove(random);

        return cartaAleatoria;
    }
}
