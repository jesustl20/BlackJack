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

import static javax.imageio.ImageIO.*;

public class Controlador implements ActionListener {
    public Vista vista;
    public Juego juego = new Juego();

    public Controlador(Vista vista) {
        this.vista = vista;
        this.vista.pedir.addActionListener(this);
        this.vista.plantarse.addActionListener(this);
        juego.iniciarJuego();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.pedir) {
            Carta carta = juego.cartaParaJugador();
            juego.turnoDealer();
            setImage(carta);

        }

        if (e.getSource() == vista.plantarse) {
            juego.turnoDealerSiJugadorSePlanta();
            juego.comprobarVictoria();
        }
    }

    private void setImage(Carta carta) {
        try {
            vista.lbl1.setIcon(
                    new ImageIcon(
                            new ImageIcon(
                                    read(new File(carta.path))
                            )
                                    .getImage()
                                    .getScaledInstance(127, 180, Image.SCALE_DEFAULT))
            );
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
