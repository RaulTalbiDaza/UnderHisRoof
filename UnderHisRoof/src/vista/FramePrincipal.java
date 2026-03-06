package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FramePrincipal extends JFrame implements ActionListener {
	
	//ATRIBUTOS
	
	//Paneles
	private Inicio panelInicio = new Inicio();
	private Sotano panelSotano = new Sotano();
	private Ajustes panelAjustes = new Ajustes();
	
	//Botones
	private JButton botonStart = new JButton();
	private JButton botonSettings = new JButton();
		
	
	//CONSTRUCTORES
	public FramePrincipal() {
		
		setTitle("Under His Roof");
		
		setBounds(100, 100, 1100, 800);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		
		setLayout(null);
		
		//Inicio
		
		panelInicio.setBounds(0,0,1100,800);
		add(panelInicio);
		panelInicio.setVisible(true);
		
		//Sótano
		
		panelSotano.setBounds(0,0,1100,800);
		add(panelSotano);
		panelSotano.setVisible(false);
		
		//Ajustes
		panelAjustes.setBounds(0,0,1100,800);
		add(panelAjustes);
		panelAjustes.setVisible(false);
		
		//Start Game
		
		botonStart.setBounds(350,555,400,100);
		botonStart.setOpaque(false);
		add(botonStart);
		botonStart.addActionListener(this);
		
		//Settings
		
		botonSettings.setBounds(400,660,300,80);
		botonSettings.setOpaque(false);
		add(botonSettings);
		botonSettings.addActionListener(this);	
		
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == botonSettings) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(true);
		}
	}
	
}
