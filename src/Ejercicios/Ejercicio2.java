package Ejercicios;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio2 extends JFrame {

    private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;

    public Ejercicio2() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        txtTexto = new JTextField();
        etiTexto1 = new JLabel();
        etiTexto2 = new JLabel();
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa2 = new JButton("Traspasa 2");

        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 2");

        txtTexto.setBounds(50, 30,300, 30);
        etiTexto1.setBounds(50, 70, 300, 30);
        etiTexto2.setBounds(50, 110, 300, 30);
        btnTraspasa1.setBounds(50, 150, 150, 30);
        btnTraspasa2.setBounds(210, 150, 150, 30);

        add(txtTexto);
        add(etiTexto1);
        add(etiTexto2);
        add(btnTraspasa1);
        add(btnTraspasa2);

        btnTraspasa1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto1.setText(txtTexto.getText());
            }
        });

        btnTraspasa2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiTexto2.setText(txtTexto.getText());
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio2().setVisible(true);
    }
}

