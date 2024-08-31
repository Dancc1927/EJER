package Ejercicios;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio9 extends JFrame {
      JPanel Panel;
    private JTextField txtPalabra1;
    private JTextField txtPalabra2;
    private JButton btnConcatena;
    private JLabel etiTexto;

    public Ejercicio9() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        getContentPane().setBackground(Color.CYAN);
        txtPalabra1 = new JTextField();
        txtPalabra2 = new JTextField();
        btnConcatena = new JButton("Concatena");
        etiTexto = new JLabel("Texto");

        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 9");

        txtPalabra1.setBounds(50, 30, 100, 30);
        txtPalabra2.setBounds(50, 70, 100, 30);
        btnConcatena.setBounds(50, 110, 100, 30);
        etiTexto.setBounds(50, 150, 300, 30);

        add(txtPalabra1);
        add(txtPalabra2);
        add(btnConcatena);
        add(etiTexto);

        btnConcatena.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palabra1 = txtPalabra1.getText();
                String palabra2 = txtPalabra2.getText();
                etiTexto.setText(palabra1 + palabra2);
            }
        });
    }

    public static void main(String[] args) {

        new Ejercicio9().setVisible(true);
    }
}
