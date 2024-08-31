package Ejercicios;

// Ejercicio 4: Desactivar componentes Gráficos
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio4 extends JFrame {
     JPanel Panel;
    private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;

    public Ejercicio4() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        txtNombre = new JTextField();
        txtCiudad = new JTextField();
        txtFrase = new JLabel();
        btnAceptar = new JButton("Aceptar");
        btnDesactivar = new JButton("Desactivar");
        btnActivar = new JButton("Activar");
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 4");

        txtNombre.setBounds(50, 30, 150, 30);
        txtCiudad.setBounds(50, 70, 150, 30);
        txtFrase.setBounds(50, 110, 300, 30);
        btnAceptar.setBounds(50, 150, 100, 30);
        btnDesactivar.setBounds(160, 150, 100, 30);
        btnActivar.setBounds(270, 150, 100, 30);

        add(txtNombre);
        add(txtCiudad);
        add(txtFrase);
        add(btnAceptar);
        add(btnDesactivar);
        add(btnActivar);

        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String ciudad = txtCiudad.getText();
                txtFrase.setText("Usted se llama " + nombre + " y vive en " + ciudad + ".");
            }
        });

        btnDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(false);
                txtCiudad.setEnabled(false);
            }
        });

        btnActivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setEnabled(true);
                txtCiudad.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio4().setVisible(true);
    }
}
