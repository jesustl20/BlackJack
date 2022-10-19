package modelo;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;

import static java.nio.file.Files.*;

public class Juego {
    public static Baraja baraja = new Baraja();
    private Jugador jugador = new Jugador();
    private Jugador dealer = new Jugador();

    public void iniciarJuego() {
        rellenarBaraja();
        repartirCartas();
    }

    public void rellenarBaraja() {
        try {
            Path path = Path.of(getClass().getResource("/resources").toURI()); // URL de la carpeta resources EJEMPLO XEXU/ESCRITORIO/PROYECTO/RESOURCES/
            walk(path, 2) // Recorremos lo que hay en esa carpeta EJEMPLO (file.png, caca.png, carpetaX)
                    .filter(p -> new File(String.valueOf(p)).isFile()) // Solo dejamos pasar los directorios que sean archivos (NO QUEREMOS CARPETAS) miramos si tiene un punto en la URL porque solo los archivos tienen puntos
                    .forEach(file -> { // En este foreach vamos a rellenar la baraja de cartas con sus directorios y valores para pintarlas mas facilmente
                        String fileString = file.toString(); // Para no repetir codigo
                        int cardValue = Integer.parseInt(fileString.replaceAll("[^0-9]", ""));

                        if (cardValue > 10) { // Si es la sota el caballo o el rey vale 10 igualmente
                            cardValue = 10;
                        }

                        baraja.cartas.add( // Vamos a rellenar la baraja
                                new Carta(
                                        fileString, // Le ponemos como primer atributo el path a la imagen (xexu/escritorio/proyect/corazon9.png)
                                        cardValue //como el path tiene el número de la carta nos quedamos con el número
                                )
                        );
                    });
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
    }

    public void repartirCartas() {
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

    public String turnoDealer() {
        int totalPuntos = getTotalPuntos(dealer);

        if (totalPuntos < 17) {
            cartaParaDealer();
            return "Sigo";
        } else {
            return "Planto";
        }
    }

    public void turnoDealerSiJugadorSePlanta() {
        while (getTotalPuntos(dealer) < 17){
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
