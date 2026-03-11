package vista;

import javax.swing.*;
import java.awt.*;
import utiles.InventarioSistema;
import utiles.Item;

public class Inventario extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel fondo;
    private JPanel grid;

    public Inventario(JFrame parent) {

        super(parent, true);
        setSize(900,700);
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

        fondo.setBounds(0,0,900,700);
        fondo.setLayout(null);
        add(fondo);

        // panel de los objetos
        grid = new JPanel(new GridLayout(3,3,10,0));
        grid.setOpaque(false);

        grid.setBounds(60,150,460,380); // posición aproximada de los huecos
        fondo.add(grid);

        // botón invisible CLOSE
        JButton cerrar = new JButton();
        cerrar.setBounds(360,550,200,70);
        cerrar.setOpaque(false);
        cerrar.setContentAreaFilled(false);
        cerrar.setBorderPainted(false);

        cerrar.addActionListener(e -> setVisible(false));

        fondo.add(cerrar);
    }

    // actualizar inventario
    public void actualizarInventario(){

        grid.removeAll();

        for(Item item : InventarioSistema.inventario){

            ImageIcon icon = new ImageIcon(getClass().getResource(item.getRutaImagen()));

            Image img = icon.getImage().getScaledInstance(120,80,Image.SCALE_SMOOTH);

            JLabel label = new JLabel(new ImageIcon(img));

            grid.add(label);
        }

        grid.revalidate();
        grid.repaint();
    }
}