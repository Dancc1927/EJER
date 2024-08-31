package Ejercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio7 extends JFrame {

    private JLabel etiTexto;
    private JButton btnAzul;
    private JButton btnRojo;
    private JButton btnVerde;
    private JButton btnFondoAzul;
    private JButton btnFondoRojo;
    private JButton btnFondoVerde;
    private JButton btnTransparente;
    private JButton btnOpaca;

    public Ejercicio7() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        getContentPane().setBackground(Color.pink);
        etiTexto = new JLabel("Texto");
        etiTexto.setBounds(50, 30, 300, 30);
        add(etiTexto);


        btnAzul = new JButton("Azul");
        btnAzul.setBounds(50, 70, 100, 30);
        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.BLUE);
            }
        });
        add(btnAzul);


        btnRojo = new JButton("Rojo");
        btnRojo.setBounds(160, 70, 100, 30);
        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.RED);
            }
        });
        add(btnRojo);


        btnVerde = new JButton("Verde");
        btnVerde.setBounds(270, 70, 100, 30);
        btnVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setForeground(Color.GREEN);
            }
        });
        add(btnVerde);


        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoAzul.setBounds(50, 110, 100, 30);
        btnFondoAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.BLUE);
            }
        });
        add(btnFondoAzul);


        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoRojo.setBounds(160, 110, 100, 30);
        btnFondoRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.RED);
            }
        });
        add(btnFondoRojo);

        btnFondoVerde = new JButton("Fondo Verde");
        btnFondoVerde.setBounds(270, 110, 100, 30);
        btnFondoVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setBackground(Color.GREEN);
            }
        });
        add(btnFondoVerde);

        btnTransparente = new JButton("Transparente");
        btnTransparente.setBounds(50, 150, 150, 30);
        btnTransparente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(false);
            }
        });
        add(btnTransparente);

        btnOpaca = new JButton("Opaca");
        btnOpaca.setBounds(220, 150, 150, 30);
        btnOpaca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto.setOpaque(true);
            }
        });
        add(btnOpaca);

        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 7");
    }

    public static void main(String[] args) {

        new Ejercicio7().setVisible(true);
    }
}
