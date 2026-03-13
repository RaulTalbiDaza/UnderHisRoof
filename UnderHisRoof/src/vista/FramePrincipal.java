package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

import utiles.InventarioSistema;
import utiles.Item;
import utiles.Musica;

public class FramePrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
	
	private boolean llaveRecogida = false;
	private boolean valvRecogida = false;
	private boolean candadoAbierto = false;
	private boolean alcantarillaAbierta = false;
	private boolean tuercaApretada = false;
	private boolean valvPuesta = false;
	private boolean botonVerde = false;
	private boolean puertaStAb = false;
	
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
	private TableroCon panelTablero = new TableroCon();
	private Llave panelLlave = new Llave();
	private Caja panelCaja = new Caja();
	private CandadoCe panelCandCerr = new CandadoCe();
	private CandadoAb panelCandadoAb = new CandadoAb();
	private CajaAb panelCajaAb = new CajaAb();
	private ValvIncl panelValvIncl = new ValvIncl();
	private AlcanCerr panelAlcanCerr = new AlcanCerr();
	private AlcanAb panelAlcanAb = new AlcanAb();
	private ValvFr panelValvFr = new ValvFr();
	private BotonVerde panelBotonVerde = new BotonVerde();
	private Pagina2 panelPag2 = new Pagina2();
	
	
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
	private JButton botonTablero = new JButton();
	private JButton botonLlave = new JButton();
	private JButton botonCaja = new JButton();
	private JButton botonCandado = new JButton ();
	private JButton abrirCaja = new JButton();
	private JButton cogerValv = new JButton();
	private JButton alcantarilla = new JButton();
	private JButton abrirAlcan = new JButton();
	private JButton ponerValv = new JButton();
	private JButton apretarTuerca = new JButton();
	private JButton apretarBoton = new JButton();
	private JButton cerrarPag2 = new JButton();
	private JButton libroSuelo1 = new JButton();
		
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
        
        //Válvula de frente
        panelValvFr.setBounds(355,340,105,70);
        panelValvFr.setLayout(null);
        add(panelValvFr);
        panelValvFr.setVisible(false);
        
        //Panel con el botón en verde
        panelBotonVerde.setBounds(0,0,1100,800);
        panelBotonVerde.setLayout(null);
        add(panelBotonVerde);
        panelBotonVerde.setVisible(false);
        
        //Panel de la Pagina 2
        panelPag2.setBounds(0,0,1100,800);
        panelPag2.setLayout(null);
        add(panelPag2);
        panelPag2.setVisible(false);
        
        
		
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
		
		//Botón para apretar tuerca
		apretarTuerca.setBounds(385,340,50,60);
		apretarTuerca.setOpaque(false);
		apretarTuerca.setContentAreaFilled(false);
		apretarTuerca.setBorderPainted(false);
		apretarTuerca.setFocusPainted(false);
		panelSotano.add(apretarTuerca);
		apretarTuerca.addActionListener(this);
		
		
		//Botón para poner la válvula
		ponerValv.setBounds(385,340,50,60);
		ponerValv.setOpaque(false);
		ponerValv.setContentAreaFilled(false);
		ponerValv.setBorderPainted(false);
		ponerValv.setFocusPainted(false);
		panelSotano.add(ponerValv);
		ponerValv.addActionListener(this);
		
		//Boton alcantarilla
		apretarBoton.setBounds(470,300,150,150);
		apretarBoton.setOpaque(false);
		apretarBoton.setContentAreaFilled(false);
		apretarBoton.setBorderPainted(false);
		apretarBoton.setFocusPainted(false);
		panelAlcanAb.add(apretarBoton);
		apretarBoton.addActionListener(this);
		
		//Cerrar la pagina 2
		cerrarPag2.setBounds(450,630,200,70);
		cerrarPag2.setOpaque(false);
		cerrarPag2.setContentAreaFilled(false);
		cerrarPag2.setBorderPainted(false);
		cerrarPag2.setFocusPainted(false);
		panelPag2.add(cerrarPag2);
		cerrarPag2.addActionListener(this);
		
		//Libro de al lado de la mesita
		libroSuelo1.setBounds(100,720,90,50);
		libroSuelo1.setOpaque(false);
		libroSuelo1.setContentAreaFilled(false);
		libroSuelo1.setBorderPainted(false);
		libroSuelo1.setFocusPainted(false);
		panelReloj.add(libroSuelo1);
		libroSuelo1.addActionListener(this);
		
		setVisible(true);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource() == botonStart) {
			InventarioSistema.inventario.add(
			        new Item("Diario", "/recursos/portada de diario.png")
			    );
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
			Musica.musicaFondo();
			
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
		    if (!botonVerde) return;
		    
		    if (!puertaStAb) {
		        puertaStAb = true;
		        inventario1.setSotanoCompletado(true);
		        panelInicio.setVisible(false);
		        panelAjustes.setVisible(false);
		        panelSotano.setVisible(false);
		        panelPasillo.setVisible(false);
		        panelInvernadero.setVisible(false);
		        panelAtico.setVisible(false);
		        panelEspejos.setVisible(false);
		        panelTeatro.setVisible(false);
		        panelSotanoOscuro.setVisible(false);
		        panelReloj.setVisible(false);
		        panelPag2.setVisible(true);
		        Musica.reproducirPuerta();
		    } else {
		        panelInicio.setVisible(false);
		        panelAjustes.setVisible(false);
		        panelSotano.setVisible(false);
		        panelPasillo.setVisible(false);
		        panelInvernadero.setVisible(false);
		        panelAtico.setVisible(false);
		        panelEspejos.setVisible(false);
		        panelTeatro.setVisible(false);
		        panelSotanoOscuro.setVisible(false);
		        panelPag2.setVisible(false);
		        panelReloj.setVisible(true);
		        panelReloj.add(panelFlecha);
		        panelFlecha.setVisible(true);
		        panelReloj.add(panelAbrirInven);
		        panelAbrirInven.setVisible(true);
		        Musica.reproducirPuerta();
		    }
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
			 if (panelTablero.isVisible() || panelCaja.isVisible() || panelCandCerr.isVisible() || 
				        panelCajaAb.isVisible() || panelAlcanCerr.isVisible() || panelAlcanAb.isVisible() || 
				        panelBotonVerde.isVisible()) {
				        // Volver al sótano desde subpaneles del sótano
				        panelTablero.setVisible(false);
				        panelCaja.setVisible(false);
				        panelCajaAb.setVisible(false);
				        panelCandadoAb.setVisible(false);
				        panelCandCerr.setVisible(false);
				        panelAlcanCerr.setVisible(false);
				        panelAlcanAb.setVisible(false);
				        panelBotonVerde.setVisible(false);
				        panelSotano.setVisible(true);

				        panelSotano.add(panelAbrirInven);
				        panelAbrirInven.setVisible(true);

				    } else if (panelReloj.isVisible()) {
				        // Volver al sótano desde la habitación del reloj
				        panelReloj.setVisible(false);
				        panelSotano.setVisible(true);

				        panelSotano.add(panelAbrirInven);
				        panelAbrirInven.setVisible(true);

				    } else if (panelPasillo.isVisible()) {
				        // Volver al reloj desde el pasillo
				        panelPasillo.setVisible(false);
				        panelReloj.setVisible(true);

				        panelReloj.add(panelFlecha);
				        panelFlecha.setVisible(true);

				        panelReloj.add(panelAbrirInven);
				        panelAbrirInven.setVisible(true);

				    } else if (panelAtico.isVisible() || panelEspejos.isVisible() || 
				               panelInvernadero.isVisible() || panelTeatro.isVisible()) {
				        // Volver al pasillo desde las habitaciones superiores
				        panelAtico.setVisible(false);
				        panelEspejos.setVisible(false);
				        panelInvernadero.setVisible(false);
				        panelTeatro.setVisible(false);
				        panelPasillo.setVisible(true);

				        panelPasillo.add(panelFlecha);
				        panelFlecha.setVisible(true);

				        panelPasillo.add(panelAbrirInven);
				        panelAbrirInven.setVisible(true);
				    }
		}
		
		
		
		
		
		
		
		
		
		
		if (e.getSource() == botonLlave) {
			llaveRecogida = true;
			Musica.cogerObjeto();
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
			
			
			panelTablero.setVisible(true);
			
			panelTablero.add(panelFlecha);
			panelFlecha.setVisible(true);
			
			panelTablero.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
		}
		
		if (!llaveRecogida) {
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
		 
		
			
		
	
		 if (e.getSource() == cogerValv) {
			 	valvRecogida = true;
			    panelValvIncl.setVisible(false);
			    Musica.cogerObjeto();
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
			    
			    panelCaja.setVisible(false);
			    panelCandCerr.setVisible(false);
			    panelCandadoAb.setVisible(false);
			    panelCajaAb.setVisible(false);

			    if (botonVerde) {
			        
			        panelBotonVerde.setVisible(true);
			        panelBotonVerde.add(panelFlecha);
			        panelFlecha.setVisible(true);
			        panelBotonVerde.add(panelAbrirInven);
			        panelAbrirInven.setVisible(true);
			    } else if (alcantarillaAbierta) {
			        panelAlcanAb.setVisible(true);
			        panelAlcanAb.add(panelFlecha);
			        panelFlecha.setVisible(true);
			        panelAlcanAb.add(panelAbrirInven);
			        panelAbrirInven.setVisible(true);
			    } else {
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
		 
		 if (e.getSource() == apretarTuerca) {
			    // Solo funciona si tiene la llave inglesa
			    if (tieneItem("Llave Inglesa")) {
			        tuercaApretada = true;
			        apretarTuerca.setVisible(false); // oculta el botón tras apretar
			        ponerValv.setVisible(true);
			        eliminarItem("Llave Inglesa");
			        Musica.llaveTuerca();
			    }
		}
		 
		 if (e.getSource() == ponerValv) {
			    if (tuercaApretada && tieneItem("Válvula")) {
			    	valvPuesta = true;
			        ponerValv.setVisible(false);
			        panelSotano.add(panelValvFr);
			        panelValvFr.setVisible(true);
			        eliminarItem("Válvula");
			        Musica.valvulaSound();
			        Musica.silenciarGotas();
			        
			    }
			}
		 
		 if (e.getSource() == apretarBoton) {
			 if(valvPuesta) {
				 botonVerde = true;
				 panelAlcanAb.setVisible(false);
				 panelBotonVerde.setVisible(true);
				 Musica.clicBoton();
				 
				 panelBotonVerde.add(panelFlecha);
				 panelFlecha.setVisible(true);
					
				 panelBotonVerde.add(panelAbrirInven);
				 panelAbrirInven.setVisible(true);
				 
				 Timer timer = new Timer (1000, i -> {
					 Musica.puertaAbCheck();
					
				});
					timer.setRepeats(false);
					timer.start();
				 
				 
				 
				 apretarBoton.setVisible(false);
				 
			 }
		 }
		 
		 if (e.getSource() == cerrarPag2) {
			panelPag2.setVisible(false);
			panelReloj.setVisible(true);
			 
			 
			panelReloj.add(panelFlecha);
			panelFlecha.setVisible(true);
				
			panelReloj.add(panelAbrirInven);
			panelAbrirInven.setVisible(true);
		 }
		 
	}
	
	private boolean tieneItem(String nombre) {
	    for (Item item : InventarioSistema.inventario) {
	        if (item.getNombre().equals(nombre)) {
	            return true;
	        }
	    }
	    return false;
	}
	private void eliminarItem(String nombre) {
	    InventarioSistema.inventario.removeIf(item -> item.getNombre().equals(nombre));
	}
}

