package Ejercicios;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio1 extends JFrame {
      JPanel Panel;
    private JLabel etiNombre;
    private JLabel etiCiudad;
    private JButton btnOcultarNombre;
    private JButton btnVisuNombre;
    private JButton btnOcultarCiudad;
    private JButton btnVisuCiudad;

    public Ejercicio1() {
        iniciarComponentes();
        setLayout(null);
        getContentPane().setBackground(Color.blue);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 1: Nombres");
    }

    private void iniciarComponentes() {
        etiNombre = new JLabel("Nombre");
        etiCiudad = new JLabel("Ciudad");
        btnOcultarNombre = new JButton("Ocultar Nombre");
        btnVisuNombre = new JButton("Visualizar Nombre");
        btnOcultarCiudad = new JButton("Ocultar Ciudad");
        btnVisuCiudad = new JButton("Visualizar Ciudad");




        etiNombre.setBounds(50, 30, 100, 30);
        etiCiudad.setBounds(50, 70, 100, 30);
        btnOcultarNombre.setBounds(50, 110, 150, 30);
        btnVisuNombre.setBounds(210, 110, 150, 30);
        btnOcultarCiudad.setBounds(50, 150, 150, 30);
        btnVisuCiudad.setBounds(210, 150, 150, 30);

        add(etiNombre);
        add(etiCiudad);
        add(btnOcultarNombre);
        add(btnVisuNombre);
        add(btnOcultarCiudad);
        add(btnVisuCiudad);

        btnOcultarNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setVisible(false);
            }
        });

        btnVisuNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiNombre.setVisible(true);
            }
        });

        btnOcultarCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiCiudad.setVisible(false);
            }
        });

        btnVisuCiudad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiCiudad.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio1().setVisible(true);
    }
}
