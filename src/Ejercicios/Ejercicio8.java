package Ejercicios;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio8 extends JFrame {
    JPanel Panel;
    private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
    private JButton btnCalcular;

    public Ejercicio8() {

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        getContentPane().setBackground(Color.GREEN);

        txtPrimerTrimestre = new JTextField();
        txtSegundoTrimestre = new JTextField();
        txtTercerTrimestre = new JTextField();
        etiNotaFinal = new JLabel("Nota Final: ");
        etiResultado = new JLabel("Resultado: ");
        btnCalcular = new JButton("Calcular");

        setLayout(null);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 8");

        txtPrimerTrimestre.setBounds(50, 30, 100, 30);
        txtSegundoTrimestre.setBounds(50, 70, 100, 30);
        txtTercerTrimestre.setBounds(50, 110, 100, 30);
        etiNotaFinal.setBounds(50, 150, 300, 30);
        etiResultado.setBounds(50, 190, 300, 30);
        btnCalcular.setBounds(50, 230, 100, 30);

        add(txtPrimerTrimestre);
        add(txtSegundoTrimestre);
        add(txtTercerTrimestre);
        add(etiNotaFinal);
        add(etiResultado);
        add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double primerTrimestre = Double.parseDouble(txtPrimerTrimestre.getText());
                    double segundoTrimestre = Double.parseDouble(txtSegundoTrimestre.getText());
                    double tercerTrimestre = Double.parseDouble(txtTercerTrimestre.getText());

                    double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3;
                    etiNotaFinal.setText("Nota Final: " + notaFinal);

                    if (notaFinal < 5) {
                        etiNotaFinal.setForeground(Color.RED);
                        etiResultado.setForeground(Color.RED);
                        etiResultado.setText("SUSPENSO");
                    } else {
                        etiNotaFinal.setForeground(Color.BLACK);
                        etiResultado.setForeground(Color.BLACK);
                        etiResultado.setText("APROBADO");
                    }
                } catch (NumberFormatException ex) {

                }
            }
        });
    }

    public static void main(String[] args) {
        new Ejercicio8().setVisible(true);
    }
}
