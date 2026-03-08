package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FramePrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
	
	//Paneles
	private Inicio panelInicio = new Inicio();
	private Sotano panelSotano = new Sotano();
	private Ajustes panelAjustes = new Ajustes();
	private Habi_Reloj panelReloj = new Habi_Reloj();
	
	//Botones
	private JButton botonStart = new JButton();
	private JButton botonSettings = new JButton();
	private JButton botonVolumenOn = new JButton();
	private JButton botonVolumenOff = new JButton();
	private JButton botonBackAj = new JButton();
	private JButton botonSFXOn = new JButton();
	private JButton botonSFXOff = new JButton();
	private JButton puertaSotano = new JButton();
		
	
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
		panelInicio.setLayout(null);
		add(panelInicio);
		panelInicio.setVisible(true);
		
		//Sótano
		
		panelSotano.setBounds(0,0,1100,800);
		panelSotano.setLayout(null);
		add(panelSotano);
		panelSotano.setVisible(false);
		
		//Ajustes
		panelAjustes.setBounds(0,0,1100,800);
		panelAjustes.setLayout(null);
		add(panelAjustes);
		panelAjustes.setVisible(false);
		
		//Habitación del reloj
		panelReloj.setBounds(0,0,1100,800);
		panelReloj.setLayout(null);
		add(panelReloj);
		panelReloj.setVisible(false);
		
		//Start Game
		
		botonStart.setBounds(350,555,400,100);
		botonStart.setOpaque(false);
		botonStart.setContentAreaFilled(false);
		botonStart.setBorderPainted(false);
		botonStart.setFocusPainted(false);
		panelInicio.add(botonStart);
		botonStart.addActionListener(this);
		
		//Settings
		
		botonSettings.setBounds(400,660,300,80);
		botonSettings.setOpaque(false);
		botonSettings.setContentAreaFilled(false);
		botonSettings.setBorderPainted(false);
		botonSettings.setFocusPainted(false);
		panelInicio.add(botonSettings);
		botonSettings.addActionListener(this);	
		
		//Volume On
		botonVolumenOn.setBounds(548,240,150,65);
		botonVolumenOn.setOpaque(false);
		botonVolumenOn.setContentAreaFilled(false);
		botonVolumenOn.setBorderPainted(false);
		botonVolumenOn.setFocusPainted(false);
		panelAjustes.add(botonVolumenOn);
		botonVolumenOn.addActionListener(this);
		
		//Volume Off
		botonVolumenOff.setBounds(705, 240, 150, 65);
		botonVolumenOff.setOpaque(false);
		botonVolumenOff.setContentAreaFilled(false);
		botonVolumenOff.setBorderPainted(false);
		botonVolumenOff.setFocusPainted(false);
		panelAjustes.add(botonVolumenOff);
		botonVolumenOff.addActionListener(this);
		
		//Back Ajustes
		botonBackAj.setBounds(430,625 ,240 ,70);
		botonBackAj.setOpaque(false);
		botonBackAj.setContentAreaFilled(false);
		botonBackAj.setBorderPainted(false);
		botonBackAj.setFocusPainted(false);
		panelAjustes.add(botonBackAj);
		botonBackAj.addActionListener(this);
		
		//SFX On 
		botonSFXOn.setBounds(548,340,150,65);
		botonSFXOn.setOpaque(false);
		botonSFXOn.setContentAreaFilled(false);
		botonSFXOn.setBorderPainted(false);
		botonSFXOn.setFocusPainted(false);
		panelAjustes.add(botonSFXOn);
		botonSFXOn.addActionListener(this);
		
		//SFX Off
		botonSFXOff.setBounds(705,340,150,65);
		botonSFXOff.setOpaque(false);
		botonSFXOff.setContentAreaFilled(false);
		botonSFXOff.setBorderPainted(false);
		botonSFXOff.setFocusPainted(false);
		panelAjustes.add(botonSFXOff);
		botonSFXOff.addActionListener(this);
		
		//Puerta Sótano
		puertaSotano.setBounds(150,55,100,180);
		puertaSotano.setOpaque(false);
		puertaSotano.setContentAreaFilled(false);
		puertaSotano.setBorderPainted(false);
		puertaSotano.setFocusPainted(false);
		panelSotano.add(puertaSotano);
		puertaSotano.addActionListener(this);
		
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == botonStart) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelReloj.setVisible(false);
			panelSotano.setVisible(true);
		}
		
		if(e.getSource() == botonSettings) {
			panelInicio.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelAjustes.setVisible(true);
		}
		
		if(e.getSource() == botonVolumenOn) {
			
		}
		
		if(e.getSource() == botonVolumenOff) {
			
		}
		
		if(e.getSource() == botonBackAj) {
			panelAjustes.setVisible(false);
			panelInicio.setVisible(true);
		}
		
		if(e.getSource() == botonSFXOn) {
			
		}
		
		if(e.getSource() == botonSFXOff) {
			
		}
		
		
		if(e.getSource() == puertaSotano) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(true);
		}
		
		
	}
	
	
	
}
