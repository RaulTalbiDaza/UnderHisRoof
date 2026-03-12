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
	private int contadorDiario = 0;
	private int contadorLlaveIng = 0;
	private int contadorValv = 1;
	private boolean candadoAbierto = false;
	private boolean alcantarillaAbierta = false;
	
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
	private TableroCon panelTablero = new TableroCon();
	private Llave panelLlave = new Llave();
	private Caja panelCaja = new Caja();
	private CandadoCe panelCandCerr = new CandadoCe();
	private CandadoAb panelCandadoAb = new CandadoAb();
	private CajaAb panelCajaAb = new CajaAb();
	private ValvIncl panelValvIncl = new ValvIncl();
	private AlcanCerr panelAlcanCerr = new AlcanCerr();
	private AlcanAb panelAlcanAb = new AlcanAb();
	
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
	private JButton botonTablero = new JButton();
	private JButton botonLlave = new JButton();
	private JButton botonCaja = new JButton();
	private JButton botonCandado = new JButton ();
	private JButton abrirCaja = new JButton();
	private JButton cogerValv = new JButton();
	private JButton alcantarilla = new JButton();
	private JButton abrirAlcan = new JButton();
		
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
		
		//Tablero con la llave
		panelTablero.setBounds(0,0,1100,800);
		panelTablero.setLayout(null);
		add(panelTablero);
		panelTablero.setVisible(false);
		
		//LLave inglesa
		panelLlave.setBounds(220,100,90,398);
		panelLlave.setLayout(null);
		add(panelLlave);
		panelLlave.setVisible(false);
		
		//Panel de las cajas
		panelCaja.setBounds(0,0,1100,800);
		panelCaja.setLayout(null);
		add(panelCaja);
		panelCaja.setVisible(false);
		
		//Panel del candado cerrado
		panelCandCerr.setBounds(0,0,1100,800);
		panelCandCerr.setLayout(null);
		add(panelCandCerr);
		panelCandCerr.setVisible(false);
		
		
		//Panel del candado abierto
		panelCandadoAb.setBounds(0,0,1100,800);
		panelCandadoAb.setLayout(null);
        add(panelCandadoAb);
        panelCandadoAb.setVisible(false);
		
        panelCandCerr.setCodigoListener(() -> {
        	candadoAbierto = true;
			panelCandCerr.setVisible(false);
			panelCandadoAb.setVisible(true);
		});
        
        //Panel caja abierta
        panelCajaAb.setBounds(0,0,1100,800);
        panelCajaAb.setLayout(null);
        add(panelCajaAb);
        panelCajaAb.setVisible(false);
        
        //Panel de la valvula en la caja
        panelValvIncl.setBounds(250,200,600,400);
        panelValvIncl.setLayout(null);
        add(panelValvIncl);
        panelValvIncl.setVisible(false);
        
        //Panel de la alcantarilla cerrada
        panelAlcanCerr.setBounds(0,0,1100,800);
        panelAlcanCerr.setLayout(null);
        add(panelAlcanCerr);
        panelAlcanCerr.setVisible(false);
        
        //Panel de la alcantarilla abierta
        panelAlcanAb.setBounds(0,0,1100,800);
        panelAlcanAb.setLayout(null);
        add(panelAlcanAb);
        panelAlcanAb.setVisible(false);
		
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
		
		//Botón para ver el tablero
		botonTablero.setBounds(600,200,240,150);
		botonTablero.setOpaque(false);
		botonTablero.setContentAreaFilled(false);
		botonTablero.setBorderPainted(false);
		botonTablero.setFocusPainted(false);
		panelSotano.add(botonTablero);
		botonTablero.addActionListener(this);
		
		//Botón para recoger la llave inglesa
		botonLlave.setBounds(0,0,90,398);
		botonLlave.setOpaque(false);
		botonLlave.setContentAreaFilled(false);
		botonLlave.setBorderPainted(false);
		botonLlave.setFocusPainted(false);
		panelLlave.add(botonLlave);
		botonLlave.addActionListener(this);
		
		//Botón para ver la caja
		botonCaja.setBounds(35,480,160,170);
		botonCaja.setOpaque(false);
		botonCaja.setContentAreaFilled(false);
		botonCaja.setBorderPainted(false);
		botonCaja.setFocusPainted(false);
		panelSotano.add(botonCaja);
		botonCaja.addActionListener(this);
		
		//Botón para ver el candado de cerca 
		botonCandado.setBounds(340,430,150,120);
		botonCandado.setOpaque(false);
		botonCandado.setContentAreaFilled(false);
		botonCandado.setBorderPainted(false);
		botonCandado.setFocusPainted(false);
		panelCaja.add(botonCandado);
		botonCandado.addActionListener(this);
		
		//Botón para abrir la caja
		abrirCaja.setBounds(0,0,1100,800);
		abrirCaja.setOpaque(false);
		abrirCaja.setContentAreaFilled(false);
		abrirCaja.setBorderPainted(false);
		abrirCaja.setFocusPainted(false);
		panelCandadoAb.add(abrirCaja);
		abrirCaja.addActionListener(this);
		
		//Botón para recoger la válvula
		cogerValv.setBounds(0,0,658,595);
		cogerValv.setOpaque(false);
		cogerValv.setContentAreaFilled(false);
		cogerValv.setBorderPainted(false);
		cogerValv.setFocusPainted(false);
		panelValvIncl.add(cogerValv);
		cogerValv.addActionListener(this);
		
		//Botón para ver la alcantarilla
		alcantarilla.setBounds(350,580,170,50);
		alcantarilla.setOpaque(false);
		alcantarilla.setContentAreaFilled(false);
		alcantarilla.setBorderPainted(false);
		alcantarilla.setFocusPainted(false);
		panelSotano.add(alcantarilla);
		alcantarilla.addActionListener(this);
		
		//Botón para abrir la alcantarilla
		abrirAlcan.setBounds(160,150, 760, 400);
		abrirAlcan.setOpaque(false);
		abrirAlcan.setContentAreaFilled(false);
		abrirAlcan.setBorderPainted(false);
		abrirAlcan.setFocusPainted(false);
		panelAlcanCerr.add(abrirAlcan);
		abrirAlcan.addActionListener(this);
		
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
			if (panelReloj.isVisible() || panelMesa.isVisible() || panelTablero.isVisible() || panelCaja.isVisible() || panelCandCerr.isVisible() || 
				panelCajaAb.isVisible() || panelAlcanCerr.isVisible() || panelAlcanAb.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelReloj.setVisible(false);
				panelPasillo.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotanoOscuro.setVisible(false);
				panelMesa.setVisible(false);
				panelTablero.setVisible(false);
				panelSotano.setVisible(true);
				panelCajaAb.setVisible(false);
				panelCandadoAb.setVisible(false);
				panelCandCerr.setVisible(false);
				
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
				panelMesa.setVisible(false);
				panelTablero.setVisible(false);

				panelReloj.setVisible(true);
				
				panelReloj.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelReloj.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}else if (panelAtico.isVisible() || panelEspejos.isVisible() || panelInvernadero.isVisible() || panelTeatro.isVisible()) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelSotanoOscuro.setVisible(false);
				panelMesa.setVisible(false);
				panelTablero.setVisible(false);

				panelPasillo.setVisible(true);
				
				panelPasillo.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelPasillo.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
			}
		}
		
		
		
		
		if (contadorDiario < 1) {
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
				panelTablero.setVisible(false);
				panelMesa.setVisible(true);
				
				panelMesa.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelMesa.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
				panelMesa.add(panelPortada);
				panelPortada.setVisible(true);
				
				
			}
			
			if (e.getSource() == abrirInventario) {
				inventario1.actualizarInventario();
				inventario1.setVisible(true);
			
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
				panelTablero.setVisible(false);
				panelMesa.setVisible(true);
				
				panelMesa.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelMesa.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
				
				
			}
			if (e.getSource() == abrirInventario) {
				inventario1.actualizarInventario();
				inventario1.setVisible(true);
			
			}
		}
		
		
		
		if (e.getSource() == botonPortada) {
			contadorDiario ++;
			panelPortada.setVisible(false);
			InventarioSistema.inventario.add(
				    new Item("Diario", "/recursos/portada de diario.png")
				);

				botonPortada.setVisible(false);
			
		}
		
		if (e.getSource() == botonLlave) {
			contadorLlaveIng ++;
			panelLlave.setVisible(false);
			InventarioSistema.inventario.add(
				    new Item("Llave Inglesa", "/recursos/llave.png", 25, 111)
				);
			botonLlave.setVisible(false);
		}
		
		if (e.getSource() == botonTablero) {
			panelInicio.setVisible(false);
			panelAjustes.setVisible(false);
			panelInvernadero.setVisible(false);
			panelAtico.setVisible(false);
			panelEspejos.setVisible(false);
			panelTeatro.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelPasillo.setVisible(false);
			panelMesa.setVisible(false);
			
			panelTablero.setVisible(true);
			
			panelTablero.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelTablero.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
		}
		
		if (contadorLlaveIng < 1) {
			if (e.getSource() == botonTablero) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelPasillo.setVisible(false);
				panelMesa.setVisible(false);
				
				panelTablero.setVisible(true);
				
				panelTablero.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelTablero.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
				panelTablero.add(panelLlave);
				panelLlave.setVisible(true);
				
				
			}
			
			if (e.getSource() == abrirInventario) {
				inventario1.actualizarInventario();
				inventario1.setVisible(true);
			
			}
		}else {
			if (e.getSource() == botonTablero) {
				panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelPasillo.setVisible(false);
				panelMesa.setVisible(false);
				panelTablero.setVisible(true);
				
				
				panelTablero.add(panelFlecha);
				panelFlecha.setVisible(true);
				
				panelTablero.add(panelAbrirInven);
				panelAbrirInven.setVisible(true);
				
				
				
			}
			if (e.getSource() == abrirInventario) {
				inventario1.actualizarInventario();
				inventario1.setVisible(true);
			
			}
		}
		 if (e.getSource() == botonCaja) {
			 panelInicio.setVisible(false);
				panelAjustes.setVisible(false);
				panelInvernadero.setVisible(false);
				panelAtico.setVisible(false);
				panelEspejos.setVisible(false);
				panelTeatro.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				panelPasillo.setVisible(false);
				panelMesa.setVisible(false);
				panelTablero.setVisible(false);
				
				 if (candadoAbierto) {
				        // Si ya abrió el candado, mostrar directamente la caja abierta
				        panelCajaAb.setVisible(true);
				        
				        panelCajaAb.add(panelFlecha);
				        panelFlecha.setVisible(true);
				        
				        panelCajaAb.add(panelAbrirInven);
				        panelAbrirInven.setVisible(true);
				    } else {
				        // Si no, mostrar la caja con el candado cerrado
				        panelCaja.setVisible(true);
				        
				        panelCaja.add(panelFlecha);
				        panelFlecha.setVisible(true);
				        
				        panelCaja.add(panelAbrirInven);
				        panelAbrirInven.setVisible(true);
				    }
				
				
		 }
		 
		 if (e.getSource() == botonCandado) {
			 
			 panelInicio.setVisible(false);
			 panelAjustes.setVisible(false);
			 panelInvernadero.setVisible(false);
			 panelAtico.setVisible(false);
			 panelEspejos.setVisible(false);
			 panelTeatro.setVisible(false);
			 panelSotano.setVisible(false);
			 panelReloj.setVisible(false);
			 panelPasillo.setVisible(false);
			 panelMesa.setVisible(false);
			 panelTablero.setVisible(false);
			 panelCaja.setVisible(false);
			 
			 panelCandCerr.setVisible(true);
			 
			 panelCandCerr.getFondo().add(panelFlecha);
			 panelFlecha.setVisible(true);
				
			 panelCandCerr.getFondo().add(panelAbrirInven);
			 panelAbrirInven.setVisible(true);
				
		 }
		 
		 if (e.getSource() == abrirCaja) {
			 panelInicio.setVisible(false);
			 panelAjustes.setVisible(false);
			 panelInvernadero.setVisible(false);
			 panelAtico.setVisible(false);
			 panelEspejos.setVisible(false);
			 panelTeatro.setVisible(false);
			 panelSotano.setVisible(false);
			 panelReloj.setVisible(false);
			 panelPasillo.setVisible(false);
			 panelMesa.setVisible(false);
			 panelTablero.setVisible(false);
			 panelCaja.setVisible(false);
			 panelCandCerr.setVisible(false);
			 panelCandadoAb.setVisible(false);
			 
			 panelCajaAb.setVisible(true);
			 
			 panelCajaAb.add(panelFlecha);
			 panelFlecha.setVisible(true);
				
			 panelCajaAb.add(panelAbrirInven);
			 panelAbrirInven.setVisible(true);
			 
			 panelCajaAb.add(panelValvIncl);
			 panelValvIncl.setVisible(true);
			 
		 }
		 
		 if (contadorValv < 1) {
				if (e.getSource() == botonCaja) {
					if (!candadoAbierto) {
				        // Si el candado NO está abierto, mostrar el candado cerrado
				        panelInicio.setVisible(false);
				        panelAjustes.setVisible(false);
				        panelInvernadero.setVisible(false);
				        panelAtico.setVisible(false);
				        panelEspejos.setVisible(false);
				        panelTeatro.setVisible(false);
				        panelSotano.setVisible(false);
				        panelReloj.setVisible(false);
				        panelPasillo.setVisible(false);
				        panelMesa.setVisible(false);
				        panelTablero.setVisible(false);
				        panelCaja.setVisible(false);

				        panelCandCerr.setVisible(true);

				        panelCandCerr.getFondo().add(panelFlecha);
				        panelFlecha.setVisible(true);

				        panelCandCerr.getFondo().add(panelAbrirInven);
				        panelAbrirInven.setVisible(true);
				        
				    }else {
				    	 panelInicio.setVisible(false);
						 panelAjustes.setVisible(false);
						 panelInvernadero.setVisible(false);
						 panelAtico.setVisible(false);
						 panelEspejos.setVisible(false);
						 panelTeatro.setVisible(false);
						 panelSotano.setVisible(false);
						 panelReloj.setVisible(false);
						 panelPasillo.setVisible(false);
						 panelMesa.setVisible(false);
						 panelTablero.setVisible(false);
						 panelCaja.setVisible(false);
						 panelCandCerr.setVisible(false);
						 panelCandadoAb.setVisible(false);
						 
						 panelCajaAb.setVisible(true);
						 
						 panelCajaAb.add(panelFlecha);
						 panelFlecha.setVisible(true);
							
						 panelCajaAb.add(panelAbrirInven);
						 panelAbrirInven.setVisible(true);
						 
						 panelCajaAb.add(panelValvIncl);
						 panelValvIncl.setVisible(true);
				    }
				
				if (e.getSource() == abrirInventario) {
					inventario1.actualizarInventario();
					inventario1.setVisible(true);
				
				}
			}else {
				if (e.getSource() == botonCaja) {
					panelInicio.setVisible(false);
					panelAjustes.setVisible(false);
					panelInvernadero.setVisible(false);
					panelAtico.setVisible(false);
					panelEspejos.setVisible(false);
					panelTeatro.setVisible(false);
					panelSotano.setVisible(false);
					panelReloj.setVisible(false);
					panelPasillo.setVisible(false);
					panelTablero.setVisible(false);
					panelMesa.setVisible(false);
					panelCaja.setVisible(false);
					panelCandCerr.setVisible(false);
					panelCandadoAb.setVisible(false);
					panelCajaAb.setVisible(true);
					
					panelCajaAb.add(panelFlecha);
					panelFlecha.setVisible(true);
					
					panelCajaAb.add(panelAbrirInven);
					panelAbrirInven.setVisible(true);
					
					
					
				}
		
		
		
			}
		
	}
		 if (e.getSource() == cogerValv) {
				contadorValv ++;
				panelValvIncl.setVisible(false);
				InventarioSistema.inventario.add(
					    new Item("Válvula", "/recursos/valv_incl.png")
					);
				cogerValv.setVisible(false);
			}
		 if (e.getSource() == alcantarilla) {
			    panelInicio.setVisible(false);
			    panelAjustes.setVisible(false);
			    panelInvernadero.setVisible(false);
			    panelAtico.setVisible(false);
			    panelEspejos.setVisible(false);
			    panelTeatro.setVisible(false);
			    panelSotano.setVisible(false);
			    panelReloj.setVisible(false);
			    panelPasillo.setVisible(false);
			    panelTablero.setVisible(false);
			    panelMesa.setVisible(false);
			    panelCaja.setVisible(false);
			    panelCandCerr.setVisible(false);
			    panelCandadoAb.setVisible(false);
			    panelCajaAb.setVisible(false);

			    if (alcantarillaAbierta) {
			        // Ir directamente a la alcantarilla abierta
			        panelAlcanAb.setVisible(true);
			        panelAlcanAb.add(panelFlecha);
			        panelFlecha.setVisible(true);
			        panelAlcanAb.add(panelAbrirInven);
			        panelAbrirInven.setVisible(true);
			    } else {
			        // Mostrar la alcantarilla cerrada
			        panelAlcanCerr.setVisible(true);
			        panelAlcanCerr.add(panelFlecha);
			        panelFlecha.setVisible(true);
			        panelAlcanCerr.add(panelAbrirInven);
			        panelAbrirInven.setVisible(true);
			    }
			}
		 
		 if (e.getSource() == abrirAlcan) {
			 alcantarillaAbierta = true;
			 panelInicio.setVisible(false);
			 panelAjustes.setVisible(false);
			 panelInvernadero.setVisible(false);
			 panelAtico.setVisible(false);
			 panelEspejos.setVisible(false);
			 panelTeatro.setVisible(false);
			 panelSotano.setVisible(false);
			 panelReloj.setVisible(false);
			 panelPasillo.setVisible(false);
			 panelTablero.setVisible(false);
			 panelMesa.setVisible(false);
			 panelCaja.setVisible(false);
			 panelCandCerr.setVisible(false);
			 panelCandadoAb.setVisible(false);
			 panelCajaAb.setVisible(false);
			 panelAlcanCerr.setVisible(false);
			 
			 panelAlcanAb.setVisible(true);
			 
			 panelAlcanAb.add(panelFlecha);
			 panelFlecha.setVisible(true);
				
			 panelAlcanAb.add(panelAbrirInven);
			 panelAbrirInven.setVisible(true);
			 
		 }
	}
}

