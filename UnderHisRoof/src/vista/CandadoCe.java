package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CandadoCe extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private String codigoIntroducido = "";
    private final String codigoCorrecto = "842";
    private JLabel displayCodigo;
    private JLabel mensajeLabel;
	
	public CandadoCe() {
        setLayout(null);
        setOpaque(false);

        // Fondo con la imagen del candado
        JPanel fondo = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image img = new ImageIcon(getClass().getResource("/recursos/candado cerrado.png")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        fondo.setLayout(null);
        fondo.setBounds(0, 0, 1100, 800);
        add(fondo);

        // Display que muestra el código introducido - ponlo encima del candado
        displayCodigo = new JLabel("_ _ _", JLabel.CENTER);
        displayCodigo.setFont(new Font("Arial", Font.BOLD, 28));
        displayCodigo.setForeground(new Color(255, 200, 100));
        displayCodigo.setBounds(390, 230, 320, 50);
        fondo.add(displayCodigo);

        // Mensaje de feedback
        mensajeLabel = new JLabel("", JLabel.CENTER);
        mensajeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mensajeLabel.setForeground(Color.RED);
        mensajeLabel.setBounds(350, 680, 400, 40);
        fondo.add(mensajeLabel);

        // Botones invisibles encima de los números del candado
        // Ajusta los bounds según donde estén los números en tu imagen
        int[][] posiciones = {
            {415, 340, 85, 80},  // 1
            {510, 340, 85, 80},  // 2
            {605, 340, 85, 80},  // 3
            {415, 430, 85, 80},  // 4
            {510, 430, 85, 80},  // 5
            {605, 430, 85, 80},  // 6
            {415, 520, 85, 80},  // 7
            {510, 520, 85, 80},  // 8
            {605, 520, 85, 80},  // 9
        };

        String[] numeros = {"1","2","3","4","5","6","7","8","9"};

        for (int i = 0; i < 9; i++) {
            JButton boton = new JButton(numeros[i]); // <- ponle el número visible
            boton.setBounds(posiciones[i][0], posiciones[i][1], posiciones[i][2], posiciones[i][3]);
            boton.setOpaque(false);                    // <- visible
            boton.setContentAreaFilled(false);         // <- visible
            boton.setBorderPainted(false);             // <- visible
            boton.setFocusPainted(false);
            final String numero = numeros[i];
            boton.addActionListener(e -> introducirDigito(numero));
            fondo.add(boton);
        }
    }

    private void introducirDigito(String digito) {
        if (codigoIntroducido.length() >= 3) {
            mostrarMensaje("Máximo 3 dígitos", Color.ORANGE);
            return;
        }
        codigoIntroducido += digito;
        actualizarDisplay();

        // Comprobar automáticamente al llegar a 3 dígitos
        if (codigoIntroducido.length() == 3) {
            comprobarCodigo();
        }
    }

    private void comprobarCodigo() {
        if (codigoIntroducido.equals(codigoCorrecto)) {
            mostrarMensaje("¡Código correcto!", Color.GREEN);
            // Aquí añade lo que pase al acertar, por ejemplo:
            // setVisible(false);
            // panelCandadoAbierto.setVisible(true);
        } else {
            mostrarMensaje("Código incorrecto", Color.RED);
            codigoIntroducido = "";
            actualizarDisplay();
        }
    }

    private void actualizarDisplay() {
        String display = "";
        for (int i = 0; i < 3; i++) {
            if (i < codigoIntroducido.length()) {
                display += codigoIntroducido.charAt(i) + " ";
            } else {
                display += "_ ";
            }
        }
        displayCodigo.setText(display.trim());
    }

    private void mostrarMensaje(String mensaje, Color color) {
        mensajeLabel.setForeground(color);
        mensajeLabel.setText(mensaje);
    }

}
