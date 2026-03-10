package vista;

import java.awt.Dimension;
import java.awt.Graphics;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import utiles.Musica;

public class Sotano extends JPanel {

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/sotano.png"));
		g.drawImage(icon.getImage(), 0,0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}
	
	public static void introSotano(SotanoOscuro SotanoOscuro, Sotano Sotano, Letras panelLetras) {
		Musica.gotasAgua();
		
		Timer timer = new Timer (1500, e -> {
			Musica.Audio();
			panelLetras.setVisible(true);
		});
		timer.setRepeats(false);
		timer.start();
		
		Timer timer2 = new Timer (3000, e -> {
			Musica.Electricidad();
			panelLetras.setVisible(false);
		});
		timer2.setRepeats(false);
		timer2.start();
		Timer timer3 = new Timer (9000, e ->{
			Musica.Interruptor();
		});
		timer3.setRepeats(false);
		timer3.start();
		Timer timer4 = new Timer (9000, e ->{
			SotanoOscuro.setVisible(false);
			Sotano.setVisible(true);
		});
		timer4.setRepeats(false);
		timer4.start();
		Timer timer5 = new Timer (9200, e ->{
			Musica.respiracion();
		});
		timer5.setRepeats(false);
		timer5.start();
		
	}
}
