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
	private boolean candadoAbierto = false;
	private boolean alcantarillaAbierta = false;
	private boolean tuercaApretada = false;
	private boolean valvPuesta = false;
	private boolean botonVerde = false;
	private boolean puertaStAb = false;
	private boolean libroAbierto = false;
	private boolean llaveLibroRecogida = false;
	private boolean relojPuesto = false;
	private String estadoReloj = "normal";
	
	//Paneles
	private Inicio panelInicio = new Inicio();
	private Sotano panelSotano = new Sotano();
	private Ajustes panelAjustes = new Ajustes();
	private HabiReloj panelReloj = new HabiReloj();
	private Atico panelAtico = new Atico();
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
	private PasarPag panelPasarPag = new PasarPag();
	private Pag3 panelPag3 =new Pag3();
	private LibroSuelo panelLibroSuelo = new LibroSuelo();
	private LibroAb panelLibroAb = new LibroAb();
	private LlaveCajon panelLlaveCajon = new LlaveCajon();
	private Cajon panelCajon = new  Cajon();
	private Reloj panelRelojBol = new Reloj();
	private RelojRojo panelRelojRojo = new RelojRojo();
	private RelojVerde panelRelojVerde = new RelojVerde();
	
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
	private JButton puertaReloj = new JButton();
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
	private JButton libroSuelo = new JButton();
	private JButton pasarPag = new JButton();
	private JButton abrirLibro = new JButton();
	private JButton cogerLlaveLibro = new JButton();
	private JButton botonCajon = new JButton();
	private JButton botonReloj = new JButton();
	private JButton ponerReloj = new JButton();
	private JButton botonHabRel = new JButton();
		
	//CONSTRUCTORES
	public FramePrincipal() {
		
		setTitle("Under His Roof");
		
		setBounds(100, 100, 1100, 800);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setResizable(false);
		
		setLayout(null);
		
		setIconImage(new ImageIcon(getClass().getResource("/recursos/imagenes/icono.png")).getImage());
		
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
		
		
		//Ático
		panelAtico.setBounds(0,0,1100,800);
		panelAtico.setLayout(null);
		add(panelAtico);
		panelAtico.setVisible(false);
		
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
        
        //Panel de la flecha para pasar de página
        panelPasarPag.setBounds(950,350,150,100);
        panelPasarPag.setLayout(null);
        add(panelPasarPag);
        panelPasarPag.setVisible(false);
        
        //Panel para la pagina 3
        panelPag3.setBounds(0,0,1100,800);
        panelPag3.setLayout(null);
        add(panelPag3);
        panelPag3.setVisible(false);
        
        //Panel del libro del suelo
        panelLibroSuelo.setBounds(0,0,1100,800);
        panelLibroSuelo.setLayout(null);
        add(panelLibroSuelo);
        panelLibroSuelo.setVisible(false);
        
        //Panel del libro abierto
        panelLibroAb.setBounds(0,0,1100,800);
        panelLibroAb.setLayout(null);
        add(panelLibroAb);
        panelLibroAb.setVisible(false);
        
        //Panel de la llave que está en el libro
        panelLlaveCajon.setBounds(370,300,100,123);
        panelLlaveCajon.setLayout(null);
        add(panelLlaveCajon);
        panelLlaveCajon.setVisible(false);
        
        //Panel de la mesita
        panelCajon.setBounds(0,0,1100,800);
        panelCajon.setLayout(null);
        add(panelCajon);
        panelCajon.setVisible(false);
        
        //Panel del reloj del cajón
        panelRelojBol.setBounds(600,310,100,100);
        panelRelojBol.setLayout(null);
        add(panelRelojBol);
        panelRelojBol.setVisible(false);
        
        //Panel de la habitación del reloj con el botón en rojo
        panelRelojRojo.setBounds(0,0,1100,800);
        panelRelojRojo.setLayout(null);
        add(panelRelojRojo);
        panelRelojRojo.setVisible(false);
        
        //Panel de la habitación del reloj con el botón en verde
        panelRelojVerde.setBounds(0,0,1100,800);
        panelRelojVerde.setLayout(null);
        add(panelRelojVerde);
        panelRelojVerde.setVisible(false);
        
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

		//Puerta Habitación del Reloj 2
		puertaReloj.setBounds(830,100,180,550);
		puertaReloj.setOpaque(false);
		puertaReloj.setContentAreaFilled(false);
		puertaReloj.setBorderPainted(false);
		puertaReloj.setFocusPainted(false);
		panelRelojVerde.add(puertaReloj);
		puertaReloj.addActionListener(this);
		
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
		libroSuelo.setBounds(100,720,90,50);
		libroSuelo.setOpaque(false);
		libroSuelo.setContentAreaFilled(false);
		libroSuelo.setBorderPainted(false);
		libroSuelo.setFocusPainted(false);
		panelReloj.add(libroSuelo);
		libroSuelo.addActionListener(this);
		
		//Botón para pasar de página
		pasarPag.setBounds(0,0,150,100);
		pasarPag.setOpaque(false);
		pasarPag.setContentAreaFilled(false);
		pasarPag.setBorderPainted(false);
		pasarPag.setFocusPainted(false);
		panelPasarPag.add(pasarPag);
		pasarPag.addActionListener(this);
		
		//Boton para abrir el libro del suelo
		abrirLibro.setBounds(300,250,450,350);
		abrirLibro.setOpaque(false);
		abrirLibro.setContentAreaFilled(false);
		abrirLibro.setBorderPainted(false);
		abrirLibro.setFocusPainted(false);
		panelLibroSuelo.add(abrirLibro);
		abrirLibro.addActionListener(this);
		
		//Boton para recoger la llave del libro
		cogerLlaveLibro.setBounds(0,0,100,123);
		cogerLlaveLibro.setOpaque(false);
		cogerLlaveLibro.setContentAreaFilled(false);
		cogerLlaveLibro.setBorderPainted(false);
		cogerLlaveLibro.setFocusPainted(false);
		panelLlaveCajon.add(cogerLlaveLibro);
		cogerLlaveLibro.addActionListener(this);
		
		//Botón para abrir el cajón de la mesita
		botonCajon.setBounds(100,620,200,100);
		botonCajon.setOpaque(false);
		botonCajon.setContentAreaFilled(false);
		botonCajon.setBorderPainted(false);
		botonCajon.setFocusPainted(false);
		panelReloj.add(botonCajon);
		botonCajon.addActionListener(this);
		
		//Boton para recoger el reloj
		botonReloj.setBounds(0,0,100,100);
		botonReloj.setOpaque(false);
		botonReloj.setContentAreaFilled(false);
		botonReloj.setBorderPainted(false);
		botonReloj.setFocusPainted(false);
		panelRelojBol.add(botonReloj);
		botonReloj.addActionListener(this);
		
		//Botón para poner el reloj en el hueco
		ponerReloj.setBounds(500,490,100,100);
		ponerReloj.setOpaque(false);
		ponerReloj.setContentAreaFilled(false);
		ponerReloj.setBorderPainted(false);
		ponerReloj.setFocusPainted(false);
		panelReloj.add(ponerReloj);
		ponerReloj.setVisible(false);
		ponerReloj.addActionListener(this);
		
		//Botón para abrir la puerta de la habitación del reloj
		botonHabRel.setBounds(500,590,100,100);
		botonHabRel.setOpaque(false);
		botonHabRel.setContentAreaFilled(false);
		botonHabRel.setBorderPainted(false);
		botonHabRel.setFocusPainted(false);
		ponerReloj.setVisible(false);
		ponerReloj.setEnabled(false);
		add(botonHabRel);
		botonHabRel.setVisible(false);
		botonHabRel.addActionListener(this);
		
		
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
			panelAtico.setVisible(false);
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
			panelAtico.setVisible(false);
			panelSotanoOscuro.setVisible(false);
			panelAjustes.setVisible(true);
		}
		
		if(e.getSource() == botonVolumenOn) {
			
		}
		
		if(e.getSource() == botonVolumenOff) {
			
		}
		
		if(e.getSource() == botonBackAj) {
			panelAjustes.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			panelAtico.setVisible(false);
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
		        panelAtico.setVisible(false);
		        panelSotanoOscuro.setVisible(false);
		        panelReloj.setVisible(false);
		        panelPag2.setVisible(true);
		        
		        panelPag2.add(panelPasarPag);
		        panelPasarPag.setVisible(true);
		        Musica.reproducirPuerta();
		    } else {
		        panelInicio.setVisible(false);
		        panelAjustes.setVisible(false);
		        panelSotano.setVisible(false);
		        panelAtico.setVisible(false);
		        panelSotanoOscuro.setVisible(false);
		        panelPag2.setVisible(false);

		        if (estadoReloj.equals("verde")) {
		        	botonHabRel.setVisible(false);
		            panelRelojVerde.setVisible(true);
		            panelRelojVerde.add(panelFlecha);
		            panelFlecha.setVisible(true);
		            panelRelojVerde.add(panelAbrirInven);
		            panelAbrirInven.setVisible(true);
		        } else if (estadoReloj.equals("rojo")) {
		        	botonHabRel.setVisible(true);
		            panelRelojRojo.setVisible(true);
		            panelRelojRojo.add(panelFlecha);
		            panelFlecha.setVisible(true);
		            panelRelojRojo.add(panelAbrirInven);
		            panelAbrirInven.setVisible(true);
		            Musica.ticTac();
		        } else if(estadoReloj.equals("normal")){
		        	botonHabRel.setVisible(false);
		            panelReloj.setVisible(true);
		            panelReloj.add(panelFlecha);
		            panelFlecha.setVisible(true);
		            panelReloj.add(panelAbrirInven);
		            panelAbrirInven.setVisible(true);
		            Musica.ticTac();
		        }
		        Musica.reproducirPuerta();
		        
		    }
		}
		
		
		if (e.getSource() == puertaReloj) {
		    panelRelojVerde.setVisible(false);
		    panelInicio.setVisible(false);
		    panelAjustes.setVisible(false);
		    panelSotano.setVisible(false);
		    panelReloj.setVisible(false);
		    panelSotanoOscuro.setVisible(false);

		    panelAtico.setVisible(true);
		    
		    panelAtico.add(panelFlecha);
		    panelFlecha.setVisible(true);
		    
		    panelAtico.add(panelAbrirInven);
		    panelAbrirInven.setVisible(true);
		    
		    Musica.silenciarTicTac();
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
		        

		    } else if (panelReloj.isVisible() || panelRelojRojo.isVisible() || panelRelojVerde.isVisible()) {
		        // Volver al sótano desde la habitación del reloj
		        panelReloj.setVisible(false);
		        panelRelojRojo.setVisible(false);
		        panelRelojVerde.setVisible(false);
		        panelSotano.setVisible(true);
		        panelSotano.add(panelAbrirInven);
		        panelAbrirInven.setVisible(true);
		        Musica.silenciarTicTac();

		    } else if (panelLibroSuelo.isVisible() || panelLibroAb.isVisible() || panelAtico.isVisible()) {
		    	ponerReloj.setVisible(false);
		        panelLibroSuelo.setVisible(false);
		        panelLibroAb.setVisible(false);
		        ponerReloj.setVisible(false);
		        ponerReloj.setEnabled(false);
		        panelAtico.setVisible(false);
		        
		        if (estadoReloj.equals("verde")) {
		            panelRelojVerde.setVisible(true);
		            panelRelojVerde.add(panelFlecha);
		            panelFlecha.setVisible(true);
		            panelRelojVerde.add(panelAbrirInven);
		            panelAbrirInven.setVisible(true);
		        } else if (estadoReloj.equals("rojo")) {
		            panelRelojRojo.setVisible(true);
		            panelRelojRojo.add(panelFlecha);
		            panelFlecha.setVisible(true);
		            panelRelojRojo.add(panelAbrirInven);
		            panelAbrirInven.setVisible(true);
		        } else {
		            panelReloj.setVisible(true);
		            panelReloj.add(panelFlecha);
		            panelFlecha.setVisible(true);
		            panelReloj.add(panelAbrirInven);
		            panelAbrirInven.setVisible(true);
		        }

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
			panelAtico.setVisible(false);
			panelSotano.setVisible(false);
			panelReloj.setVisible(false);
			
			
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
				panelAtico.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				
				
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
				panelAtico.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				
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
				panelAtico.setVisible(false);
				panelSotano.setVisible(false);
				panelReloj.setVisible(false);
				
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
			 panelAtico.setVisible(false);
			 panelSotano.setVisible(false);
			 panelReloj.setVisible(false);
			 
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
			 panelAtico.setVisible(false);
			 panelSotano.setVisible(false);
			 panelReloj.setVisible(false);
			 
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
			    panelAtico.setVisible(false);
			    panelSotano.setVisible(false);
			    panelReloj.setVisible(false);
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
			 panelAtico.setVisible(false);
			 panelSotano.setVisible(false);
			 panelReloj.setVisible(false);
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
			Musica.ticTac();
		 }
		 
		 if (e.getSource() == libroSuelo) {
			    panelReloj.setVisible(false);
			    panelPag3.setVisible(false);

			    if (libroAbierto) {
			        // Ya estaba abierto, ir directo al libro abierto
			        panelLibroSuelo.setVisible(false);
			        panelLibroAb.setVisible(true);
			        panelLibroAb.add(panelFlecha);
			        panelFlecha.setVisible(true);
			        panelLibroAb.add(panelAbrirInven);
			        panelAbrirInven.setVisible(true);

			        // Solo mostrar la llave si no ha sido recogida
			        if (!llaveLibroRecogida) {
			            panelLibroAb.add(panelLlaveCajon);
			            panelLlaveCajon.setVisible(true);
			        }
			    } else {
			        panelLibroSuelo.setVisible(true);
			        panelLibroSuelo.add(panelFlecha);
			        panelFlecha.setVisible(true);
			        panelLibroSuelo.add(panelAbrirInven);
			        panelAbrirInven.setVisible(true);
			    }
			}
		 
		 if (e.getSource() == pasarPag) {
			 panelPag2.setVisible(false);
			 panelPag3.setVisible(true);
			 
			 panelPag3.add(cerrarPag2);
			 cerrarPag2.setVisible(true);
		 }
		 
		 if(e.getSource() == abrirLibro) {
			    libroAbierto = true;
			    panelLibroSuelo.setVisible(false);
			    panelLibroAb.setVisible(true);
			    
			    panelLibroAb.add(panelFlecha);
			    panelFlecha.setVisible(true);
			    
			    panelLibroAb.add(panelAbrirInven);
			    panelAbrirInven.setVisible(true);

			    if (!llaveLibroRecogida) {
			        panelLibroAb.add(panelLlaveCajon);
			        panelLlaveCajon.setVisible(true);
			    }
			}
		 
		 if (e.getSource() == cogerLlaveLibro) {
			 llaveLibroRecogida = true;
			 panelLlaveCajon.setVisible(false);
			 cogerLlaveLibro.setVisible(false);
			    Musica.cogerObjeto();
			    InventarioSistema.inventario.add(
			        new Item("Llave Cajón", "/recursos/llave-cajon.png", 50,62)
			    );
		 }
		 
		 
		 if (e.getSource() == botonCajon) {
			 if(tieneItem("Llave Cajón")) {
				 panelReloj.setVisible(false);
				 panelLibroSuelo.setVisible(false);
				 panelLibroAb.setVisible(false);
				 panelCajon.setVisible(true);
				 
				    
				 panelCajon.add(panelAbrirInven);
				 panelAbrirInven.setVisible(true);
				 
				 panelCajon.add(panelRelojBol);
				 panelRelojBol.setVisible(true);
				 
				 Musica.secuenciaCajon();
				 
				 
				 eliminarItem("Llave Cajón");
			 }
			 
			 
		 }
		 
		 if (e.getSource() == botonReloj) {
			    panelCajon.setVisible(false);
			    botonReloj.setVisible(false);
			    panelReloj.setVisible(true);
			    Musica.cogerObjeto();
			    
			    InventarioSistema.inventario.add(
			        new Item("Reloj", "/recursos/reloj.png", 50, 50)
			    );
			    panelReloj.add(panelFlecha);
			    panelFlecha.setVisible(true);
			    panelReloj.add(panelAbrirInven);
			    panelAbrirInven.setVisible(true);
			    
			    if (!relojPuesto) {
			    	ponerReloj.setVisible(true);
			    	ponerReloj.setEnabled(true);
			    	setComponentZOrder(ponerReloj, 0);
			    }
			}
		 
		 if (e.getSource() == ponerReloj) {
			 botonHabRel.setVisible(true);
			    if (tieneItem("Reloj") && !relojPuesto) {
			        relojPuesto = true;
			        ponerReloj.setVisible(false);
			        ponerReloj.setEnabled(false);
			        estadoReloj = "rojo";
			        panelReloj.setVisible(false); 
			        panelCajon.setVisible(false);
			        panelLibroSuelo.setVisible(false);
			        panelLibroAb.setVisible(false);
			        

			        panelRelojRojo.setVisible(true);
			        panelRelojBol.setBounds(500,470,100,100);
			        panelRelojRojo.add(panelRelojBol);
			        panelRelojBol.setVisible(true);

			        panelRelojRojo.add(panelFlecha);
			        panelFlecha.setVisible(true);

			        panelRelojRojo.add(panelAbrirInven);
			        panelAbrirInven.setVisible(true);
			        if (relojPuesto) ponerReloj.setVisible(false);

			        eliminarItem("Reloj");
			    }
			    Musica.ponerReloj();
			}
		 
		 if (e.getSource() == botonHabRel) {
			 estadoReloj = "verde";
			 ponerReloj.setVisible(false);
			 ponerReloj.setEnabled(false);
			 panelRelojRojo.setVisible(false);
			 panelReloj.setVisible(false);
			 botonHabRel.setVisible(false);
			 panelRelojVerde.setVisible(true);
			 
			 panelRelojVerde.add(panelRelojBol);
			 panelRelojBol.setVisible(true);
			 
			 panelRelojVerde.add(panelFlecha);
			 panelFlecha.setVisible(true);
						
			 panelRelojVerde.add(panelAbrirInven);
			 panelAbrirInven.setVisible(true);
			 
			 Musica.silenciarTicTac();
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

