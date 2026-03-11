package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import utiles.InventarioSistema;
import utiles.Item;
import utiles.Musica;

public class FramePrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
	private int contador = 0;
	
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
	private FlechaAtras panelFlecha = new FlechaAtras();
	private AbrirInventario panelAbrirInven = new AbrirInventario();
	private SotanoOscuro panelSotanoOscuro = new SotanoOscuro();
	private Letras panelLetras = new Letras();
	private MesaSotano panelMesa = new MesaSotano();
	private PortadaLibro panelPortada = new PortadaLibro();
	
	//JDialog
	Inventario inventario1 = new Inventario(this);
	
	
	
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
	private JButton flechaAtras = new JButton();
	private JButton abrirInventario = new JButton();
	private JButton botonMesa = new JButton();
	private JButton botonPortada = new JButton();
		
	//CONSTRUCTORES
	public FramePrincipal() {
		
		setTitle("Under His Roof");
		
		setBounds(100, 100, 1100, 800);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		
		setLayout(null);
		
		setIconImage(new ImageIcon(getClass().getResource("/recursos/icono.png")).getImage());
		
		Musica.musicaFondo();
		
		
		
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
		
		//Flecha Atrás
		panelFlecha.setBounds(0,0,150,100);
		panelFlecha.setLayout(null);
		panelFlecha.setVisible(false);
		
		//Abrir inventario
		panelAbrirInven.setBounds(950,0,150,100);
		panelAbrirInven.setLayout(null);
		panelAbrirInven.setVisible(false);
		
		//Sotano Oscuro
		panelSotanoOscuro.setBounds(0,0,1100,800);
		panelSotanoOscuro.setLayout(null);
		add(panelSotanoOscuro);
		panelSotanoOscuro.setVisible(false);
		
		//Texto
		panelLetras.setBounds(374,450,352,100);
		panelSotanoOscuro.add(panelLetras);
		panelLetras.setVisible(false);
		
		//Mesa sin el diario
		panelMesa.setBounds(0,0,1100,800);
		panelMesa.setLayout(null);
		add(panelMesa);
		panelMesa.setVisible(false);
		
		//Portada del libro
		panelPortada.setBounds(170,147,760,506);
		panelPortada.setLayout(null);
		add(panelPortada);
		panelPortada.setVisible(false);
		
		
		
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
		
		//Botón flecha atrás
		flechaAtras.setBounds(32,25,100,40);
		flechaAtras.setOpaque(false);
		flechaAtras.setContentAreaFilled(false);
		flechaAtras.setBorderPainted(false);
		flechaAtras.setFocusPainted(false);
		panelFlecha.add(flechaAtras);
		flechaAtras.addActionListener(this);
		
		//Botón para abrir el inventario
		abrirInventario.setBounds(32,15,80,55);
		abrirInventario.setOpaque(false);
		abrirInventario.setContentAreaFilled(false);
		abrirInventario.setBorderPainted(false);
		abrirInventario.setFocusPainted(false);
		panelAbrirInven.add(abrirInventario);
		abrirInventario.addActionListener(this);
		
		//Botón mesa sótano
		botonMesa.setBounds(770,370,80,40);
		botonMesa.setOpaque(false);
		botonMesa.setContentAreaFilled(false);
		botonMesa.setBorderPainted(false);
		botonMesa.setFocusPainted(false);
		panelSotano.add(botonMesa);
		botonMesa.addActionListener(this);
		
		//Botón portada Diario
		botonPortada.setBounds(200,40,420,400);
		botonPortada.setOpaque(false);
		botonPortada.setContentAreaFilled(false);
		botonPortada.setBorderPainted(false);
		botonPortada.setFocusPainted(false);
		panelPortada.add(botonPortada);
		botonPortada.addActionListener(this);
		
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
			panelSotano.setVisible(false);
			panelSotanoOscuro.setVisible(true);
			
			panelSotano.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
			
			Sotano.introSotano(panelSotanoOscuro, panelSotano, panelLetras);
			
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
			panelSotanoOscuro.setVisible(false);
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
			panelSotanoOscuro.setVisible(false);

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
			panelSotanoOscuro.setVisible(false);

			panelReloj.setVisible(true);
			
			panelReloj.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelReloj.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
			
			Musica.reproducirPuerta();
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
			panelSotanoOscuro.setVisible(false);

			panelPasillo.setVisible(true);
			
			panelPasillo.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelPasillo.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
			
			Musica.reproducirPuerta();
			
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
			panelSotanoOscuro.setVisible(false);

			panelInvernadero.setVisible(true);
			
			panelInvernadero.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelInvernadero.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
			
			Musica.reproducirPuerta();
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
			panelSotanoOscuro.setVisible(false);

			panelAtico.setVisible(true);
			
			panelAtico.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelAtico.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
			
			Musica.reproducirPuerta();
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
			panelSotanoOscuro.setVisible(false);

			panelEspejos.setVisible(true);
			
			panelEspejos.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelEspejos.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
			
			Musica.reproducirPuerta();
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
			panelSotanoOscuro.setVisible(false);

			panelTeatro.setVisible(true);
			
			panelTeatro.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelTeatro.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
			
			Musica.reproducirPuerta();
		}
		
		if (e.getSource() == flechaAtras) {
			if (panelReloj.isVisible() || panelMesa.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelReloj.setVisible(false);
				panelPasillo.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotanoOscuro.setVisible(false);
				panelSotano.setVisible(true);
				
				panelSotano.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}else if (panelPasillo.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelPasillo.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelSotanoOscuro.setVisible(false);

				panelReloj.setVisible(true);
				
				panelReloj.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelReloj.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}else if (panelAtico.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelSotanoOscuro.setVisible(false);

				panelPasillo.setVisible(true);
				
				panelPasillo.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelPasillo.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}else if(panelEspejos.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelSotanoOscuro.setVisible(false);

				panelPasillo.setVisible(true);
				
				panelPasillo.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelPasillo.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}else if (panelInvernadero.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelSotanoOscuro.setVisible(false);

				panelPasillo.setVisible(true);
				
				panelPasillo.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelPasillo.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}else if (panelTeatro.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelSotanoOscuro.setVisible(false);

				panelPasillo.setVisible(true);
				
				panelPasillo.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelPasillo.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}
		}
		
		if (e.getSource() == abrirInventario) {
			inventario1.actualizarInventario();

			inventario1.setVisible(true);
		}
		
		
		if (contador < 1) {
			if (e.getSource() == botonMesa) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelPasillo.setVisible(false);
				panelMesa.setVisible(true);
				
				panelMesa.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelMesa.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
				panelMesa.add(panelPortada);
				panelPortada.setVisible(true);
			}
		}else {
			if (e.getSource() == botonMesa) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelPasillo.setVisible(false);
				panelMesa.setVisible(true);
				
				panelMesa.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelMesa.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
			}
		}
		
		
		if (e.getSource() == botonPortada) {
			contador ++;
			panelPortada.setVisible(false);
			InventarioSistema.inventario.add(
				    new Item("Diario", "/recursos/portada de diario.png")
				);

				botonPortada.setVisible(false);
			
		}
		
		
		
	}	
}
