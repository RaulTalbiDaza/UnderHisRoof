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
    private JButton botonDiario = new JButton();
    private  Pagina1 panelPagina1 = new Pagina1();
    private JButton paginaClose = new JButton();

    public Inventario(JFrame parent) {

        super(parent, true);
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
        grid.setBorder(BorderFactory.createLineBorder(Color.RED, 2));

        grid.setBounds(273, 180, 550, 400);
        fondo.add(grid);
        
       
        panelPagina1.setBounds(0,0,1100,800);
        panelPagina1.setLayout(null);
        add(panelPagina1);
        panelPagina1.setVisible(false);

        
        JButton cerrar = new JButton();
        cerrar.setBounds(450,630,200,70);
        cerrar.setOpaque(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setBorderPainted(false);

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
        botonDiario.setOpaque(false);
        botonDiario.setContentAreaFilled(false);
        botonDiario.setBorderPainted(false);
        paginaClose.addActionListener(this);
        panelPagina1.add(paginaClose);
        
    }

    // actualizar inventario
    public void actualizarInventario(){

        grid.removeAll();
        
        boolean tieneDiario = false;
        for (Item item : InventarioSistema.inventario) {
            if (item.getNombre().equals("Diario")) {
                tieneDiario = true;
                break;
            }
        }
        botonDiario.setVisible(tieneDiario);
        
        for (int i = 0; i < 9; i++) {
            JLabel celda = new JLabel();
            celda.setOpaque(false); // transparente para ver la imagen de fondo
            grid.add(celda);
        }

        // Ahora poner los items encima de las celdas correspondientes
        int i = 0;
        for (Item item : InventarioSistema.inventario) {
            if (i >= 9) break;
            
            ImageIcon icon = new ImageIcon(getClass().getResource(item.getRutaImagen()));
            Image img = icon.getImage().getScaledInstance(120, 80, Image.SCALE_SMOOTH);
            
            // Reemplazar la celda vacía con el item
            grid.remove(i);
            JLabel label = new JLabel(new ImageIcon(img));
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setVerticalAlignment(JLabel.CENTER);
            grid.add(label, i); // añadir en la posición exacta
            i++;
        }

        grid.revalidate();
        grid.repaint();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == botonDiario) {
			fondo.setVisible(false);
			panelPagina1.setVisible(true);
		}
		if (e.getSource() == paginaClose) {
			panelPagina1.setVisible(false);
			fondo.setVisible(true);
		}
	}
}