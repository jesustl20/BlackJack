package controlador;

import modelo.Carta;
import modelo.Juego;
import vista.Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

import static javax.imageio.ImageIO.*;

public class Controlador implements ActionListener {
    public Vista vista;
    public Juego juego = new Juego();

    public Controlador(Vista vista) {
        this.vista = vista;
        this.vista.pedir.addActionListener(this);
        this.vista.plantarse.addActionListener(this);;
        this.vista.start.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.pedir) {
            boolean derrota = false;

            Carta cartaJugador = juego.cartaParaJugador();
            mostrarCarta(cartaJugador, vista.jlabelsJugador);

            if(juego.comprobarDerrota(juego.jugador) ) {
                vista.pedir.setEnabled(false);
                derrota = true;
            }

            if(!derrota) {
                Carta cartaDealer = juego.turnoDealer();
                mostrarCarta(cartaDealer, vista.jlabelsDealer);

                if( juego.comprobarDerrota(juego.dealer)) {
                    vista.pedir.setEnabled(false);
                }
            }
        }

        if (e.getSource() == vista.plantarse) {
            juego.turnoDealerSiJugadorSePlanta();
            juego.comprobarVictoria();
        }

        if (e.getSource() == vista.start) {
            juego.iniciarJuego();
            List<Carta> cartasJugador = juego.jugador.cartas;
            List<Carta> cartasDealer = juego.dealer.cartas;

            for (Carta carta : cartasJugador) {
                mostrarCarta(carta, vista.jlabelsJugador);
            }

            for (Carta carta : cartasDealer) {
                mostrarCarta(carta, vista.jlabelsDealer);
            }
        }
    }

    private void mostrarCarta(Carta cartaJugador, List<JLabel> jlabels) {
        for (JLabel jlabel: jlabels) {
            if(jlabel.getIcon() == null){
                setImage(cartaJugador, jlabel);
                break;
            }
        }
    }

    private void setImage(Carta carta, JLabel jLabel) {
        try {
            Image imagenEscalada = new ImageIcon(read(new File(carta.path)))
                    .getImage()
                    .getScaledInstance(127, 180, Image.SCALE_DEFAULT);

            jLabel.setIcon(new ImageIcon(imagenEscalada));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
