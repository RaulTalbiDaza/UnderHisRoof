package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

public class Inventario extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private InventarioPanel panelInventario = new InventarioPanel();
	
	private JButton botonVolver = new JButton();
	
	
	public Inventario(FramePrincipal parent, boolean modal){
		
		super(parent, modal);
		
		setTitle("Under His Roof");
		
		setBounds(100, 100, 1100, 800);
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		
		setLayout(null);
		
		setIconImage(new ImageIcon(getClass().getResource("/recursos/icono.png")).getImage());
		
		panelInventario.setBounds(0,0,1100,800);
		panelInventario.setLayout(null);
		add(panelInventario);
		panelInventario.setVisible(true);
		
		botonVolver.setBounds(450,640,200,60);
		botonVolver.setOpaque(false);
		botonVolver.setContentAreaFilled(false);
		botonVolver.setBorderPainted(false);
		botonVolver.setFocusPainted(false);
		panelInventario.add(botonVolver);
		botonVolver.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == botonVolver) {
			setVisible(false);
		}
	}
	
}
