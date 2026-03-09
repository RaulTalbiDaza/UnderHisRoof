package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FramePrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
	
	//Paneles
	private Inicio panelInicio = new Inicio();
	private Sotano panelSotano = new Sotano();
	private Ajustes panelAjustes = new Ajustes();
	private HabiReloj panelReloj = new HabiReloj();
	private Pasillo panelPasillo = new Pasillo();
	private Invernadero panelInvernadero = new Invernadero();
	private Atico panelAtico = new Atico();
	private HabiEspejos panelEspejos = new HabiEspejos();
	private Teatro panelTeatro = new Teatro();
	
	//Botones
	private JButton botonStart = new JButton();
	private JButton botonSettings = new JButton();
	private JButton botonVolumenOn = new JButton();
	private JButton botonVolumenOff = new JButton();
	private JButton botonBackAj = new JButton();
	private JButton botonSFXOn = new JButton();
	private JButton botonSFXOff = new JButton();
	private JButton puertaSotano = new JButton();
	private JButton puertaReloj1 = new JButton();
	private JButton puertaReloj2 = new JButton();
	private JButton puertaInv = new JButton();
	private JButton puertaAtico = new JButton();
	private JButton puertaEspejos = new JButton();
	private JButton puertaTeatro = new JButton();
		
	//CONSTRUCTORES
	public FramePrincipal() {
		
		setTitle("Under His Roof");
		
		setBounds(100, 100, 1100, 800);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		
		setLayout(null);
		
		setIconImage(new ImageIcon(getClass().getResource("/recursos/icono.png")).getImage());
		
		
		
		//PANELES
		
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
		
		//Pasillo central
		panelPasillo.setBounds(0,0,1100,800);
		panelPasillo.setLayout(null);
		add(panelPasillo);
		panelPasillo.setVisible(false);
		
		//Invernadero
		panelInvernadero.setBounds(0,0,1100,800);
		panelInvernadero.setLayout(null);
		add(panelInvernadero);
		panelInvernadero.setVisible(false);
		
		//Ático
		panelAtico.setBounds(0,0,1100,800);
		panelAtico.setLayout(null);
		add(panelAtico);
		panelAtico.setVisible(false);
		
		//Habitación de los Espejos
		panelEspejos.setBounds(0,0,1100,800);
		panelEspejos.setLayout(null);
		add(panelEspejos);
		panelEspejos.setVisible(false);
		
		// Teatro
		panelTeatro.setBounds(0,0,1100,800);
		panelTeatro.setLayout(null);
		add(panelTeatro);
		panelTeatro.setVisible(false);
		
		//BOTONES
		
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

		//Puerta Habitación del Reloj 1
		puertaReloj1.setBounds(90,100,180,550);
		puertaReloj1.setOpaque(false);
		puertaReloj1.setContentAreaFilled(false);
		puertaReloj1.setBorderPainted(false);
		puertaReloj1.setFocusPainted(false);
		panelReloj.add(puertaReloj1);
		puertaReloj1.addActionListener(this);
		
		//Puerta Habitación del Reloj 2
		puertaReloj2.setBounds(830,100,180,550);
		puertaReloj2.setOpaque(false);
		puertaReloj2.setContentAreaFilled(false);
		puertaReloj2.setBorderPainted(false);
		puertaReloj2.setFocusPainted(false);
		panelReloj.add(puertaReloj2);
		puertaReloj2.addActionListener(this);
		
		//Puerta Invernadero en Pasillo Central
		puertaInv.setBounds(730,270,170,330);
		puertaInv.setOpaque(false);
		puertaInv.setContentAreaFilled(false);
		puertaInv.setBorderPainted(false);
		puertaInv.setFocusPainted(false);
		panelPasillo.add(puertaInv);
		puertaInv.addActionListener(this);
		
		//Puerta Atico en Pasillo Central
		puertaAtico.setBounds(930,200,130,440);
		puertaAtico.setOpaque(false);
		puertaAtico.setContentAreaFilled(false);
		puertaAtico.setBorderPainted(false);
		puertaAtico.setFocusPainted(false);
		panelPasillo.add(puertaAtico);
		puertaAtico.addActionListener(this);
		
		//Puerta Habitación de los Espejos en Pasillo Central
		puertaEspejos.setBounds(420,240,250,350);
		puertaEspejos.setOpaque(false);
		puertaEspejos.setContentAreaFilled(false);
		puertaEspejos.setBorderPainted(false);
		puertaEspejos.setFocusPainted(false);
		panelPasillo.add(puertaEspejos);
		puertaEspejos.addActionListener(this);
		
		//Puerta Teatro en Pasillo Central
		puertaTeatro.setBounds(190,270,170,330);
		puertaTeatro.setOpaque(false);
		puertaTeatro.setContentAreaFilled(false);
		puertaTeatro.setBorderPainted(false);
		puertaTeatro.setFocusPainted(false);
		panelPasillo.add(puertaTeatro);
		puertaTeatro.addActionListener(this);
		
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == botonStart) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelReloj.setVisible(false);
			panelPasillo.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(false);
			panelSotano.setVisible(true);
		}
		
		if(e.getSource() == botonSettings) {
			panelInicio.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelPasillo.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(false);
			panelAjustes.setVisible(true);
		}
		
		if(e.getSource() == botonVolumenOn) {
			
		}
		
		if(e.getSource() == botonVolumenOff) {
			
		}
		
		if(e.getSource() == botonBackAj) {
			panelAjustes.setVisible(false);
			panelPasillo.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(false);
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
			panelPasillo.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(false);
			panelReloj.setVisible(true);
		}
		
		if (e.getSource() == puertaReloj1 || e.getSource() == puertaReloj2 ) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(false);
			panelPasillo.setVisible(true);
			
		}
		
		if (e.getSource() == puertaInv) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelPasillo.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(false);
			panelInvernadero.setVisible(true);
		}
		
		if (e.getSource() == puertaAtico) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelPasillo.setVisible(false);
			panelEspejos.setVisible(false);
			panelInvernadero.setVisible(false);
			panelTeatro.setVisible(false);
			panelAtico.setVisible(true);
		}
		
		if (e.getSource() == puertaEspejos) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelPasillo.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelTeatro.setVisible(false);
			panelEspejos.setVisible(true);
		}
		
		if (e.getSource() == puertaTeatro) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelPasillo.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(true);
		}

		
	}
	
	
	
}
