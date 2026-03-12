package vista;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Pagina1 extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JButton botonClose = new JButton();
	
	

	@Override
	public void paint(Graphics g) {
		Dimension dimension = this.getSize();
		ImageIcon icon = new ImageIcon(getClass().getResource("/recursos/pag1.png"));
		g.drawImage(icon.getImage(), 0,0, dimension.width, dimension.height, null);
		setOpaque(false);
		super.paintChildren(g);
	}

}
