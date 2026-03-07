package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FramePrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	//ATRIBUTOS
	
	//Atributos normales
	private float brillo= 0.0f;
	//Paneles
	private Inicio panelInicio = new Inicio();
	private Sotano panelSotano = new Sotano();
	private Ajustes panelAjustes = new Ajustes();
	
	//Botones
	private JButton botonStart = new JButton();
	private JButton botonSettings = new JButton();
	private JButton botonVolumenOn = new JButton();
	private JButton botonVolumenOff = new JButton();
	private JButton botonBackAj = new JButton();
	private JButton botonSFXOn = new JButton();
	private JButton botonSFXOff = new JButton();
	private JButton botonBrPlus = new JButton();
	private JButton botonBrMin = new JButton();
		
	
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
		panelAjustes.setLayout(null);
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
		
		//Volume On
		botonVolumenOn.setBounds(548,198,120,50);
		botonVolumenOn.setOpaque(false);
		botonVolumenOn.setContentAreaFilled(false);
		botonVolumenOn.setBorderPainted(false);
		botonVolumenOn.setFocusPainted(false);
		panelAjustes.add(botonVolumenOn);
		botonVolumenOn.addActionListener(this);
		
		//Volume Off
		botonVolumenOff.setBounds(680, 198, 120, 50);
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
		botonSFXOn.setBounds(548,293,120,50);
		botonSFXOn.setOpaque(false);
		botonSFXOn.setContentAreaFilled(false);
		botonSFXOn.setBorderPainted(false);
		botonSFXOn.setFocusPainted(false);
		panelAjustes.add(botonSFXOn);
		botonSFXOn.addActionListener(this);
		
		//SFX Off
		botonSFXOff.setBounds(680,293,120,50);
		botonSFXOff.setOpaque(false);
		botonSFXOff.setContentAreaFilled(false);
		botonSFXOff.setBorderPainted(false);
		botonSFXOff.setFocusPainted(false);
		panelAjustes.add(botonSFXOff);
		botonSFXOff.addActionListener(this);
		
		//Brightness Plus
		botonBrPlus.setBounds(548,383,120,50);
		botonBrPlus.setOpaque(false);
		botonBrPlus.setContentAreaFilled(false);
		botonBrPlus.setBorderPainted(false);
		botonBrPlus.setFocusPainted(false);
		panelAjustes.add(botonBrPlus);
		botonBrPlus.addActionListener(this);
		
		//Brightness Minus
		botonBrMin.setBounds(680,383,120,50);
		botonBrMin.setOpaque(false);
		botonBrMin.setContentAreaFilled(false);
		botonBrMin.setBorderPainted(false);
		botonBrMin.setFocusPainted(false);
		panelAjustes.add(botonBrMin);
		botonBrMin.addActionListener(this);
		
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == botonSettings) {
			panelInicio.setVisible(false);
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
		
		if(e.getSource() == botonBrPlus) {
			if(brillo < 0.6f){
                brillo += 0.05f;
                repaint();
            }
		}
		
		if(e.getSource() == botonBrMin) {
			if(brillo > 0f){
                brillo -= 0.05f;
                repaint();
            }
		}
		
	}
	
	@Override
    public void paint(Graphics g) {
        super.paint(g);
		if(brillo > 0){
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(new Color(0,0,0,brillo));
            g2.fillRect(0,0,getWidth(),getHeight());
        }
    }
	
}
