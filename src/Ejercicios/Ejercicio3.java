package Ejercicios;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ejercicio3 extends JFrame {
  JPanel Panel;
    private JTextField txtTexto;
    private JLabel etiTexto;
    private JButton btnVaciar;

    public Ejercicio3() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        txtTexto = new JTextField();
        etiTexto = new JLabel();
        btnVaciar = new JButton("Vaciar");
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 3");

        txtTexto.setBounds(50, 30, 300, 30);
        etiTexto.setBounds(50, 70, 300, 30);
        btnVaciar.setBounds(50, 110, 100, 30);

        add(txtTexto);
        add(etiTexto);
        add(btnVaciar);

        txtTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                etiTexto.setText(txtTexto.getText());
            }
        });

        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTexto.setText("");
                etiTexto.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio3().setVisible(true);
    }
}
