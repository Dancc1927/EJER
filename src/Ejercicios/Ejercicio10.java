package Ejercicios;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio10 extends JFrame {
     JPanel Panel;
    private JLabel[] etiquetas;
    private JTextField txtNumero;
    private JButton btnBorrar;

    public Ejercicio10() {

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        etiquetas = new JLabel[10];
        txtNumero = new JTextField();
        btnBorrar = new JButton("Borrar");
        getContentPane().setBackground(Color.green);
        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 10");

        for (int i = 0; i < 10; i++) {
            etiquetas[i] = new JLabel(String.valueOf(i));
            etiquetas[i].setBounds(50 + i * 30, 30, 30, 30);
            add(etiquetas[i]);

            final int index = i;
            etiquetas[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    txtNumero.setText(txtNumero.getText() + index);
                }
            });
        }

        txtNumero.setBounds(50, 70, 300, 30);
        btnBorrar.setBounds(50, 110, 100, 30);

        add(txtNumero);
        add(btnBorrar);

        btnBorrar.addActionListener(e -> txtNumero.setText(""));
    }

    public static void main(String[] args) {
        new Ejercicio10().setVisible(true);
    }
}
