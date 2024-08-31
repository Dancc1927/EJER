package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio6 extends JFrame {

    private JLabel etiNombre;
    private JButton btnEsquina;
    private JButton btnCentro;
    private JButton btnAgrandar;
    private JButton btnAchicar;

    public Ejercicio6() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        etiNombre = new JLabel("Nombre");
        etiNombre.setBounds(150, 30, 100, 30);
        etiNombre.setBackground(Color.YELLOW);
        etiNombre.setOpaque(true);
        add(etiNombre);


        btnEsquina = new JButton("Esquina");
        btnEsquina.setBounds(50, 100, 100, 30);
        btnEsquina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                etiNombre.setLocation(0, 0);
            }
        });
        add(btnEsquina);


        btnCentro = new JButton("Centro");
        btnCentro.setBounds(160, 100, 100, 30);
        btnCentro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int x = (getWidth() - etiNombre.getWidth()) / 2;
                int y = (getHeight() - etiNombre.getHeight()) / 2;
                etiNombre.setLocation(x, y);
            }
        });
        add(btnCentro);


        btnAgrandar = new JButton("Agrandar");
        btnAgrandar.setBounds(270, 100, 100, 30);
        btnAgrandar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Agrandar el tamaño de la etiqueta
                etiNombre.setSize(etiNombre.getWidth() + 20, etiNombre.getHeight() + 20);
            }
        });
        add(btnAgrandar);


        btnAchicar = new JButton("Achicar");
        btnAchicar.setBounds(50, 150, 100, 30);
        btnAchicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Achicar el tamaño de la etiqueta
                etiNombre.setSize(etiNombre.getWidth() - 20, etiNombre.getHeight() - 20);
            }
        });
        add(btnAchicar);

        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 6");
    }

    public static void main(String[] args) {
        new Ejercicio6().setVisible(true);
    }
}
