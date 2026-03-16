package vista;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Continuara extends JPanel {

	private static final long serialVersionUID = 1L;

	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/imagenes/continuara.png"));
		g.drawImage(icon.getImage(), 0,0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}

}
