package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utiles.InventarioSistema;
import utiles.Item;

public class Inventario extends JDialog implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel fondo;
    private JPanel grid;
    private Pag3 panelPag3 = new Pag3();
    private JButton botonDiario = new JButton();
    private  Pagina1 panelPagina1 = new Pagina1();
    private JButton paginaClose = new JButton();
    private boolean sotanoCompletado = false;
    JButton cerrar2 = new JButton();

    public Inventario(JFrame parent) {

        super(parent, false);
        setSize(1100,800);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // fondo con la imagen
        fondo = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Image img = new ImageIcon(getClass().getResource("/recursos/inventario.png")).getImage();
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };

        fondo.setBounds(0,0,1100,800);
        fondo.setLayout(null);
        add(fondo);

        // panel de los objetos
        grid = new JPanel(new GridLayout(3,3,8,8));
        grid.setOpaque(false);

        grid.setBounds(273, 180, 550, 400);
        fondo.add(grid);
        
       
        panelPagina1.setBounds(0,0,1100,800);
        panelPagina1.setLayout(null);
        add(panelPagina1);
        panelPagina1.setVisible(false);
        
        panelPag3.setBounds(0,0,1100,800);
        panelPag3.setLayout(null);
        add(panelPag3);
        panelPag3.setVisible(false);
        
        
        
        cerrar2.setBounds(450,630,200,70);
        cerrar2.setOpaque(false);
        cerrar2.setContentAreaFilled(false);
		cerrar2.setBorderPainted(false);
		cerrar2.setFocusPainted(false);

        cerrar2.addActionListener(this);
        
        panelPag3.add(cerrar2);

        
        JButton cerrar = new JButton();
        cerrar.setBounds(450,630,200,70);
        cerrar.setOpaque(false);
        cerrar.setContentAreaFilled(false);
		cerrar.setBorderPainted(false);
		cerrar.setFocusPainted(false);

        cerrar.addActionListener(e -> setVisible(false));

        fondo.add(cerrar);
        
       
        botonDiario.setBounds(273,180,183,125);
        botonDiario.setOpaque(false);
        botonDiario.setContentAreaFilled(false);
        botonDiario.setBorderPainted(false);
        botonDiario.setVisible(false);
        botonDiario.addActionListener(this);
        fondo.add(botonDiario);
        
        paginaClose.setBounds(450,610,200,70);
        paginaClose.setOpaque(false);
        paginaClose.setContentAreaFilled(false);
        paginaClose.setBorderPainted(false);
        paginaClose.addActionListener(this);
        panelPagina1.add(paginaClose);
        
    }

    // actualizar inventario
    public void actualizarInventario(){

    	 grid.removeAll();

    	    boolean tieneDiario = false;
    	    int posicionDiario = -1;

    	    // Buscar posición del diario en el inventario
    	    for (int j = 0; j < InventarioSistema.inventario.size(); j++) {
    	        if (InventarioSistema.inventario.get(j).getNombre().equals("Diario")) {
    	            tieneDiario = true;
    	            posicionDiario = j;
    	            break;
    	        }
    	    }

    	    // Calcular coordenadas de la celda del diario y mover el botón
    	    if (tieneDiario && posicionDiario >= 0) {
    	        int columnas = 3;
    	        int anchoCelda = grid.getWidth() / columnas;
    	        int altoCelda = grid.getHeight() / 3;

    	        int fila = posicionDiario / columnas;
    	        int columna = posicionDiario % columnas;

    	        int x = grid.getX() + (columna * anchoCelda);
    	        int y = grid.getY() + (fila * altoCelda);

    	        botonDiario.setBounds(x, y, anchoCelda, altoCelda);
    	        botonDiario.setVisible(true);
    	    } else {
    	        botonDiario.setVisible(false);
    	    }

    	    // Resto del código igual...
    	    for (int i = 0; i < 9; i++) {
    	        JLabel celda = new JLabel();
    	        celda.setOpaque(false);
    	        grid.add(celda);
    	    }

    	    int i = 0;
    	    for (Item item : InventarioSistema.inventario) {
    	        if (i >= 9) break;
    	        ImageIcon icon = new ImageIcon(getClass().getResource(item.getRutaImagen()));
    	        Image img = icon.getImage().getScaledInstance(item.getAnchoImagen(), item.getAltoImagen(), Image.SCALE_SMOOTH);
    	        grid.remove(i);
    	        JLabel label = new JLabel(new ImageIcon(img));
    	        label.setHorizontalAlignment(JLabel.CENTER);
    	        label.setVerticalAlignment(JLabel.CENTER);
    	        grid.add(label, i);
    	        i++;
    	    }

    	    grid.revalidate();
    	    grid.repaint();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == botonDiario) {
		    if (sotanoCompletado) {
		        fondo.setVisible(false);
		        panelPag3.setVisible(true);
		    } else {
		        fondo.setVisible(false);
		        panelPagina1.setVisible(true);
		    }
		}
		if (e.getSource() == paginaClose) {
			panelPagina1.setVisible(false);
			fondo.setVisible(true);
		}
		
		if (e.getSource() == cerrar2) {
			panelPag3.setVisible(false);
			fondo.setVisible(true);
			
		}
	}
	
	public void setSotanoCompletado(boolean valor) {
	    this.sotanoCompletado = valor;
	}
}