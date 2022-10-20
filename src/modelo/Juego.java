package modelo;

import java.awt.event.WindowStateListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import static java.nio.file.Files.*;

public class Juego {
    public static Baraja baraja = new Baraja();
    public Jugador jugador = new Jugador();
    public Jugador dealer = new Jugador();

    public void iniciarJuego() {
        rellenarBaraja();
        repartirCartas();
    }

    private void rellenarBaraja() {
        try {
            Path recursos = Path.of(getClass().getResource("/resources").toURI()); // URL de la carpeta resources EJEMPLO XEXU/ESCRITORIO/PROYECTO/RESOURCES/

            List<Path> paths = walk(recursos, 2).collect(Collectors.toList()); // De Stream a Lista

            for (Path path : paths) {
                File archivo = new File(String.valueOf(path));
                if (archivo.isFile()) {
                    String fileString = path.toString();

                    int cardValue = Integer.parseInt(fileString.replaceAll("[^0-9]", ""));

                    if (cardValue > 10) { // Si es la sota el caballo o el rey vale 10 igualmente
                        cardValue = 10;
                    }

                    baraja.cartas.add(new Carta(fileString, cardValue));
                }
            }

        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    private void repartirCartas() {
        cartaParaJugador();
        cartaParaDealer();
        cartaParaJugador();
        cartaParaDealer();
    }

    public Carta cartaParaJugador() {
        Carta carta = baraja.sacarCartaAleatoria();
        jugador.cartas.add(carta);
        comprobarDerrota(jugador);

        return carta;
    }

    public Carta cartaParaDealer() {
        Carta carta = baraja.sacarCartaAleatoria();
        dealer.cartas.add(carta);
        comprobarDerrota(dealer);

        return carta;
    }

    public boolean comprobarDerrota(Jugador jugador) {
        int total = getTotalPuntos(jugador);

        return total > 21;
    }

    public String comprobarVictoria() {
        int puntosJugador = getTotalPuntos(jugador);
        int puntosDealer = getTotalPuntos(dealer);

        if (puntosJugador > puntosDealer) {
            return "Jugador";
        } else if (puntosDealer > puntosJugador) {
            return "Dealer";
        } else {
            return "Empate";
        }
    }

    public Carta turnoDealer() {
        int totalPuntos = getTotalPuntos(dealer);

        if (totalPuntos < 17) {
            return cartaParaDealer();
        } else {
            return null;
        }
    }

    public void turnoDealerSiJugadorSePlanta() {
        while (getTotalPuntos(dealer) < 17) {
            cartaParaDealer();
        }
    }

    private int getTotalPuntos(Jugador jugador) {
        int total = 0;

        for (Carta carta : jugador.cartas) {
            total += carta.valor;
        }
        return total;
    }
}
