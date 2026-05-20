package interfaz;

import modelo.Credencial;
import seguridad.Cifrador;
import servicio.GeneradorContraseña;
import servicio.GestorContraseñas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSwing extends JFrame {

    private JTextField txtSitio;
    private JTextField txtUsuario;
    private JTextField txtContraseña;

    private JTextArea areaCredenciales;

    private JButton btnAgregar;
    private JButton btnGenerar;

    private GestorContraseñas gestor;
    private GeneradorContraseña generador;
    private Cifrador cifrador;

    public MainSwing() {

        gestor = new GestorContraseñas();
        generador = new GeneradorContraseña();
        cifrador = new Cifrador();

        setTitle("CONTREX");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        panel.setLayout(null);

        JLabel lblTitulo =
                new JLabel("CONTREX");

        lblTitulo.setBounds(180, 20, 200, 30);

        lblTitulo.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        panel.add(lblTitulo);

        JLabel lblSitio =
                new JLabel("Sitio Web:");

        lblSitio.setBounds(50, 80, 100, 25);

        panel.add(lblSitio);

        txtSitio = new JTextField();

        txtSitio.setBounds(150, 80, 200, 25);

        panel.add(txtSitio);

        JLabel lblUsuario =
                new JLabel("Usuario:");

        lblUsuario.setBounds(50, 120, 100, 25);

        panel.add(lblUsuario);

        txtUsuario = new JTextField();

        txtUsuario.setBounds(150, 120, 200, 25);

        panel.add(txtUsuario);

        JLabel lblContraseña =
                new JLabel("Contraseña:");

        lblContraseña.setBounds(50, 160, 100, 25);

        panel.add(lblContraseña);

        txtContraseña = new JTextField();

        txtContraseña.setBounds(150, 160, 200, 25);

        panel.add(txtContraseña);

        btnAgregar =
                new JButton("Agregar");

        btnAgregar.setBounds(50, 220, 120, 35);

        panel.add(btnAgregar);

        btnGenerar =
                new JButton("Generar");

        btnGenerar.setBounds(200, 220, 120, 35);

        panel.add(btnGenerar);

        areaCredenciales =
                new JTextArea();

        JScrollPane scroll =
                new JScrollPane(areaCredenciales);

        scroll.setBounds(50, 290, 350, 120);

        panel.add(scroll);

        btnAgregar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String sitio =
                                txtSitio.getText();

                        String usuario =
                                txtUsuario.getText();

                        String contraseña =
                                txtContraseña.getText();

                        String cifrada =
                                cifrador.cifrar(
                                        contraseña
                                );

                        Credencial credencial =
                                new Credencial(
                                        sitio,
                                        usuario,
                                        cifrada
                                );

                        gestor.agregarCredencial(
                                credencial
                        );

                        areaCredenciales.append(
                                credencial.toString()
                                        + "\n"
                        );

                        txtSitio.setText("");
                        txtUsuario.setText("");
                        txtContraseña.setText("");
                    }
                }
        );

        btnGenerar.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String pass =
                                generador.generar(10);

                        txtContraseña.setText(pass);
                    }
                }
        );

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {

        new MainSwing();
    }
}